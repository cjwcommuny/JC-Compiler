package ast;

import ast.node.*;
import ast.node.definition.*;
import ast.node.reference.*;
import ast.node.structrue.*;
import ast.node.value.InfixExpressionNode;
import ast.node.value.UnaryExpressionNode;
import ast.node.value.ValueNode;
import common.CommonInfrastructure;
import error.exception.*;
import operation.InfixOperation;
import operation.Operation;
import operation.UnaryOperation;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.rulesBaseVisitor;
import parser.rulesLexer;
import parser.rulesParser;
import symbol.*;
import type.TypeChecker;
import type.typetype.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AstGenerator extends rulesBaseVisitor<AstGeneratorResult> {
    private ScopeHandler scopeHandler = new ScopeHandler();
    private CommonTokenStream commonTokenStream;
    private SymbolTableGenerator symbolTableGenerator = new SymbolTableGenerator(scopeHandler, this);

    private String simpleClassName; // only one namespace one file
    private List<FunctionDefinitionNode> functionNodes = new LinkedList<>();
    private List<StructureDefinitionNode> structNodes= new LinkedList<>();
    private List<VariableDefinitionNode> fieldNodes = new LinkedList<>();

    public String getSimpleClassName() {
        return simpleClassName;
    }

    public List<FunctionDefinitionNode> getFunctionNodes() {
        return functionNodes;
    }

    public List<StructureDefinitionNode> getStructNodes() {
        return structNodes;
    }

    public List<VariableDefinitionNode> getFieldNodes() {
        return fieldNodes;
    }

    public AstGenerator(CommonTokenStream commonTokenStream) {
        this.commonTokenStream = commonTokenStream;
    }

    @Override
    public AstGeneratorResult visitProgram(rulesParser.ProgramContext ctx) {
        scopeHandler.enterScope(
                new VisitLater(ctx, symbolTableGenerator),
                "Global",
                false,
                ScopeType.GLOBAL);
        ProgramNode thisNode = new ProgramNode(scopeHandler.getCurrentScope());
        thisNode.addChildren(visit(ctx.namespaceDefinition()).getNodes());
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        String namespaceName = ctx.IDENTIFIER().getText();
        this.simpleClassName = namespaceName;
        scopeHandler.enterScope(
                new VisitLater(ctx, symbolTableGenerator),
                namespaceName,
                true,
                ScopeType.NAMESPACE);
        NamespaceNode thisNode = DefinitionNodeBuilder.generateNamespaceNode(namespaceName, scopeHandler.getCurrentScope(), scopeHandler.getRestrictParentScope());
        scopeHandler.setNodeToCurrentScope(thisNode);
        thisNode.setThisScope(scopeHandler.getCurrentScope());
        for (rulesParser.CodeContentContext context: ctx.codeContent()) {
            AstGeneratorResult visitResult = visit(context);
            Node node = visitResult.getNode();
            if (node instanceof VariableDefinitionNode) {
                this.fieldNodes.add((VariableDefinitionNode) node);
            }
            thisNode.addChild(node);
        }
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitCodeContent(rulesParser.CodeContentContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitVariableDefinition(rulesParser.VariableDefinitionContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx) {
        AstGeneratorResult declarationVisitResult = visit(ctx.ordinaryVariableDeclaration());
        VariableDefinitionNode declarationNode = (VariableDefinitionNode) declarationVisitResult.getNode();
        VariableNameNode variableNameNode = (VariableNameNode) declarationNode.getVariableNameNode();
        ParserRuleContext declarationContext = declarationVisitResult.getContext();

        Type type = variableNameNode.getType();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(variableNameNode.getName(), restrictNames);
        ScopeType scopeType = scopeHandler.getScopeType();
        VariableDefinitionNode thisNode;
        if (scopeType == ScopeType.ANONYMOUS || scopeType == ScopeType.FUNCTION) {
            thisNode = DefinitionNodeBuilder.generateVariableDefinitionNodeNotBuf(type,
                    scopeHandler.getCurrentFunctionOrStructOrNamespaceScope());
        } else {
            //get node from buffer
            thisNode = DefinitionNodeBuilder.generateVariableDefinitionNode(fullRestrictName,
                    type,
                    scopeHandler.getCurrentScope());
        }
        thisNode.setLocalIndex(declarationNode.getLocalIndex());
        thisNode.addChild(variableNameNode);
        AstGeneratorResult visitResult = visit(ctx.rValue());
        Node rightSideNode = visitResult.getNodes().get(0);
        Type rightSideType = ((HasType) rightSideNode).getType();
        if (!TypeChecker.checkAssignment(type, rightSideType)) {
            Token assignToken = ctx.ASSIGN_SYMBOL().getSymbol();
            int[] tokenPosition = getTokenPosition(ctx, assignToken);
            throw new TypeMismatchException(tokenPosition, type, rightSideType);
        }
        thisNode.addChild(rightSideNode);
        return new AstGeneratorResult(thisNode, declarationContext);
    }

    @Override
    public AstGeneratorResult visitRValue(rulesParser.RValueContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitLiteral(rulesParser.LiteralContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitInt_literal(rulesParser.Int_literalContext ctx) {
        String symbol = ctx.getText();
        LiteralNode<Integer> node = new LiteralNode<>(TypeBuilder.generateIntType(),
                Integer.valueOf(symbol));
        return new AstGeneratorResult(node);
    }

    @Override
    public AstGeneratorResult visitDouble_literal(rulesParser.Double_literalContext ctx) {
        String symbol = ctx.getText();
        LiteralNode<Double> node = new LiteralNode<>(TypeBuilder.generateDoubleType(),
                Double.parseDouble(symbol));
        return new AstGeneratorResult(node);
    }

    /**
     * handle token
     * */
    @Override
    public AstGeneratorResult visitTerminal(TerminalNode thisNode) {
        String symbol = thisNode.getSymbol().getText();
        switch (thisNode.getSymbol().getType()) {
            case rulesLexer.BOOL_LITERAL: {
                LiteralNode<Boolean> node = new LiteralNode<>(TypeBuilder.generateBoolType(),
                        Boolean.parseBoolean(symbol));
                return new AstGeneratorResult(node);
            }
            case rulesLexer.CHAR_LITERAL: {
                LiteralNode<Character> node = new LiteralNode<>(TypeBuilder.generateCharType(),
                        symbol.charAt(1)); //symbol is like 'c'
                return new AstGeneratorResult(node);
            }
            case rulesLexer.STRING_LITERAL: {
                ObjectType type = TypeBuilder.generateObjectType(InitSymbolImporter.getStringTypeName(), InitSymbolImporter.getStringRestrictNames());
                LiteralNode<String> node = new LiteralNode<>(type, symbol.substring(1, symbol.length() - 1));
                return new AstGeneratorResult(node);
            }
            case rulesLexer.IDENTIFIER: {
                DefinitionNode defNode = scopeHandler.getNode(symbol);
                if (defNode == null) {
                    int[] errorPosition = getTokenPosition((ParserRuleContext) thisNode.getParent(),
                            thisNode.getSymbol());
                    throw new SymbolNotResolvedException(errorPosition, symbol);
                }
                RefNode refNode = RefNodeBuilder.generateProperRefNode(symbol, defNode);
                return new AstGeneratorResult(refNode);
            }
            default:
                return null;//TODO: ERROR
        }
    }

    @Override
    public AstGeneratorResult visitInfixExpression(rulesParser.InfixExpressionContext ctx) {
        return generateInfix(ctx);
    }

    private AstGeneratorResult generateInfix(ParserRuleContext ctx) {
        String operationStr = ctx.getChild(1).getText();
        Operation operation = new InfixOperation(operationStr);
        Node leftNode = visit(ctx.getChild(0)).getNode();
        Node rightNode = visit(ctx.getChild(2)).getNode();
        Type resultType = TypeChecker.checkInfixComputation(operation,
                ((HasType) leftNode).getType(),
                ((HasType) rightNode).getType());
        InfixExpressionNode thisNode = new InfixExpressionNode(operation, resultType);
        thisNode.addChild(leftNode);
        thisNode.addChild(rightNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitUnaryExpression(rulesParser.UnaryExpressionContext ctx) {
        String operationStr = ctx.getChild(0).getText();
        Operation operation = new UnaryOperation(operationStr);
        ValueNode valueNode = (ValueNode) visit(ctx.getChild(1)).getNode();
        Type resultType = TypeChecker.checkUnaryComputation(operation, valueNode.getType());
        UnaryExpressionNode thisNode = new UnaryExpressionNode(operation, resultType);
        thisNode.addChild(valueNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        String returnTypeStr = ctx.getChild(1).getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String functionName = ctx.getChild(2).getText();
        scopeHandler.enterScope(new VisitLater(ctx, symbolTableGenerator),
                functionName,
                false,
                ScopeType.FUNCTION);
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(functionName, restrictNames);
        FunctionDefinitionNode thisNode = DefinitionNodeBuilder.generateFunctionDefinitionNode(fullRestrictName, null, scopeHandler.getRestrictParentScope());
        scopeHandler.setNodeToCurrentScope(thisNode);
        ParameterListNode parametersNode = (ParameterListNode) visit(ctx.getChild(3)).getNode();
        List<Type> parameterTypes = parametersNode.getTypes();
        FunctionType functionType = TypeBuilder.generateFunctionType(returnTypeStr,
                restrictNames,
                parameterTypes);
        thisNode.setType(functionType);
        FunctionNameNode functionNameNode = new FunctionNameNode(functionName, null, functionType);
        thisNode.addChild(functionNameNode);
        thisNode.addChild(parametersNode);
//        thisNode.addParameterToLocalTypeList();
        StatementListNode statements = (StatementListNode) visit(ctx.getChild(4)).getNode();
        thisNode.addChild(statements);
        this.functionNodes.add(thisNode);
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx) {
        return visit(ctx.parameterList());
    }

    @Override
    public AstGeneratorResult visitFunctionBody(rulesParser.FunctionBodyContext ctx) {
        return visit(ctx.blockBodyCode());
    }

    @Override
    public AstGeneratorResult visitParameterList(rulesParser.ParameterListContext ctx) {
        ParameterListNode thisNode = new ParameterListNode();
        for (rulesParser.VariableDeclarationContext child: ctx.variableDeclaration()) {
            //convert to definition node
            AstGeneratorResult astGeneratorResult = visit(child);
            VariableDefinitionNode definitionNode = (VariableDefinitionNode) astGeneratorResult.getNode();
//            VariableDefinitionNode definitionNode =
//                    DefinitionNodeBuilder.generateVariableDefinitionNodeNotBuf(definitionNode.getType(),
//                        scopeHandler.getRestrictParentScope());
            scopeHandler.putSymbol(definitionNode.getVariableName(), definitionNode);
            thisNode.addChild(definitionNode);
        }
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        AstGeneratorResult result = visit(ctx.getChild(0));
        return result;
    }

    @Override
    public AstGeneratorResult visitOrdinaryVariableDeclaration(rulesParser.OrdinaryVariableDeclarationContext ctx) {
        String typeName = ctx.IDENTIFIER(0).getText();
        Type type = generateTypeForDeclaration(typeName, ctx, ctx.IDENTIFIER(0).getSymbol());
        String variableName = ctx.IDENTIFIER(1).getText();
        if (!scopeHandler.getCurrentScope().isRestrictDescriptiveScope()
                && scopeHandler.existInCurrentScope(variableName)) {
            int[] errPosition = getTokenPosition(ctx, ctx.IDENTIFIER(1).getSymbol());
            throw new NameDuplicateException(errPosition, variableName);
        }
        VariableNameNode nameNode = new VariableNameNode(variableName, null, type);
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(variableName, restrictNames);
        VariableDefinitionNode thisNode;
        if (scopeHandler.getCurrentScope().getCorrespondingNode() instanceof FunctionDefinitionNode) {
            thisNode = DefinitionNodeBuilder.generateVariableDefinitionNodeNotBuf(nameNode.getType(), scopeHandler.getCurrentFunctionOrStructOrNamespaceScope());
        } else {
            thisNode = DefinitionNodeBuilder.generateVariableDefinitionNode(fullRestrictName, nameNode.getType(), scopeHandler.getCurrentFunctionOrStructOrNamespaceScope());
        }
        if (!thisNode.hasNameNode()) {
            thisNode.addChild(nameNode);
        }
        Node parentNode = thisNode.getParentScope().getCorrespondingNode();
        if (parentNode instanceof FunctionDefinitionNode) {
            thisNode.setLocalIndex(((FunctionDefinitionNode) parentNode)
                    .addLocalVariableTypeAndReturnIndex(type));
        }
        return new AstGeneratorResult(thisNode, ctx);
    }

    @Override
    public AstGeneratorResult visitStatementList(rulesParser.StatementListContext ctx) {
        StatementListNode statementListNode = new StatementListNode();
        for (rulesParser.BlockOrStatementContext context: ctx.blockOrStatement()) {
            AstGeneratorResult result = visit(context);
            Node node = result.getNode();
            statementListNode.addChild(node);
        }
        return new AstGeneratorResult(statementListNode);
    }

    @Override
    public AstGeneratorResult visitBlockOrStatement(rulesParser.BlockOrStatementContext ctx) {
        if (ctx.block() != null) {
            return visit(ctx.block());
        } else {
            return visit(ctx.statementNode());
        }
    }

    @Override
    public AstGeneratorResult visitReturnInStatement(rulesParser.ReturnInStatementContext ctx) {
        return visit(ctx.returnStatement());
    }



    @Override
    public AstGeneratorResult visitStatementNode(rulesParser.StatementNodeContext ctx) {
        return visit(ctx.statementWithoutSemicolon());
    }

    @Override
    public AstGeneratorResult visitVariableDefinitionInStatement(rulesParser.VariableDefinitionInStatementContext ctx) {
        AstGeneratorResult result = visit(ctx.variableDefinition());
        VariableDefinitionNode node = (VariableDefinitionNode) result.getNode();//TODO: 区别对待函数中的定义
        scopeHandler.putSymbol(node.getVariableName(), node); //put symbol
        return result;
    }

    public int[] getTokenPosition(ParserRuleContext ctx, Token token) {
        Interval sourceInterval = ctx.getSourceInterval();
        Token firstToken = commonTokenStream.get(sourceInterval.a);
        int lineRowNumber = firstToken.getLine();
        int columnColumnNumber = token.getCharPositionInLine();
        return new int[]{lineRowNumber, columnColumnNumber};
    }

    @Override
    public AstGeneratorResult visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        String structName = ctx.IDENTIFIER().getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        ObjectType type = TypeBuilder.generateObjectType(structName, restrictNames);
        scopeHandler.enterScope(new VisitLater(ctx, symbolTableGenerator),
                structName,
                true, ScopeType.STRUCT);
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(structName, restrictNames);
        StructureDefinitionNode thisNode = DefinitionNodeBuilder.generateStructureDefinitionNode(fullRestrictName, type, scopeHandler.getCurrentScope(), scopeHandler.getRestrictParentScope());
        scopeHandler.setNodeToCurrentScope(thisNode);
        StructFieldListNode fieldDefinitionNode = (StructFieldListNode)
                visit(ctx.structFieldStatementList()).getNode();
        scopeHandler.exitScope();
        thisNode.addChild(fieldDefinitionNode);
        this.structNodes.add(thisNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        StructFieldListNode fieldsNode = new StructFieldListNode();
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            AstGeneratorResult visitResult = visit(context);
            VariableDefinitionNode definitionNode = (VariableDefinitionNode) visitResult.getNode();
            fieldsNode.addChild(definitionNode);
            scopeHandler.putSymbol(definitionNode.getVariableName(), definitionNode);
        }
        return new AstGeneratorResult(fieldsNode);
    }

    @Override
    public AstGeneratorResult visitStructReference(rulesParser.StructReferenceContext ctx) {
        Node leftNode =  visit(ctx.getChild(0)).getNode();
        Type leftType = ((HasType) leftNode).getType();
        String rightIdentifierName = ctx.getChild(ctx.getChildCount() - 1).getText();

        if (!(leftType instanceof ObjectType)) {
            int[] errorLocation = getTokenPosition(ctx, ctx.start);
            throw new TypeMismatchException(errorLocation, leftType, "Object Type");
        }
        DefinitionNode node = scopeHandler.getNode(leftType.getSimpleName());
        if (node == null) {
            int[] errorLocation = getTokenPosition(ctx, ctx.start);
            throw new SymbolNotResolvedException(errorLocation, leftType.getSimpleName());
        }

        Scope structScope = node.getParentScope();
        if (structScope == null) {
            int[] errorLocation = getTokenPosition(ctx, ctx.start);
            throw new SymbolNotResolvedException(errorLocation, leftType.visualInfo());
        }
        VariableDefinitionNode fieldDefinitionNode = (VariableDefinitionNode) ((StructureDefinitionNode) node).getThisScope().get(rightIdentifierName);
        if (fieldDefinitionNode == null) {
            int[] errorLocation = getTokenPosition(ctx, ctx.IDENTIFIER(ctx.IDENTIFIER().size() - 1).getSymbol());
            throw new SymbolNotResolvedException(errorLocation, rightIdentifierName);
        }
        StructRefNode thisNode = new StructRefNode(fieldDefinitionNode.getType(), fieldDefinitionNode);
        thisNode.addChild(leftNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitFunctionCall(rulesParser.FunctionCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        FunctionDefinitionNode refNode = (FunctionDefinitionNode) scopeHandler.getNode(functionName);
        if (refNode == null) {
            int[] errPosition = getTokenPosition(ctx, ctx.IDENTIFIER().getSymbol());
            throw new SymbolNotResolvedException(errPosition, functionName);
        }
        FunctionType functionType = (FunctionType) refNode.getType();
        FunctionNameNode functionNameNode = new FunctionNameNode(functionName,
                refNode,
                functionType);
        ArgumentListNode argumentListNode = new ArgumentListNode();
        for (rulesParser.RValueContext context: ctx.rValue()) {
            Node node = visit(context).getNode();
            argumentListNode.addChild(node);
        }
        Type resultType = TypeChecker.checkFunctionParameter(functionType, argumentListNode.getTypes());
        if (resultType == null) {
            int[] errPosition = getTokenPosition(ctx, ctx.IDENTIFIER().getSymbol());
            throw new TypeMismatchException(errPosition, functionName);
        }
        FunctionCallNode thisNode = new FunctionCallNode(resultType);
        thisNode.addChild(functionNameNode);
        thisNode.addChild(argumentListNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitAssignment(rulesParser.AssignmentContext ctx) {
        AssignmentNode thisNode = new AssignmentNode();
        Node leftNode = visit(ctx.lValue()).getNode();
        Node rightNode = visit(ctx.rValue()).getNode();
        Type leftType = ((HasType) leftNode).getType();
        Type rightType = ((HasType) rightNode).getType();
        boolean result = TypeChecker.checkAssignment(leftType, rightType);
        if (!result) {
            int[] errPosition = getTokenPosition(ctx, ctx.ASSIGN_SYMBOL().getSymbol());
            throw new TypeMismatchException(errPosition, leftType, rightType);
        }
        thisNode.addChild(leftNode);
        thisNode.addChild(rightNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitBlock(rulesParser.BlockContext ctx) {
        AstGeneratorResult result = visit(ctx.getChild(0));
        return result;
    }

    @Override
    public AstGeneratorResult visitLogicBlock(rulesParser.LogicBlockContext ctx) {
        LogicBlockNode thisNode = new LogicBlockNode();
        for (ParseTree parseTree: ctx.children) {
            Node node = visit(parseTree).getNode();
            thisNode.addChild(node);
        }
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitIfBlock(rulesParser.IfBlockContext ctx) {
        Node conditionNode = visit(ctx.rValue()).getNode();
        Type conditionType = ((HasType) conditionNode).getType();
        boolean isConditionValid = TypeChecker.checkConditionValue(conditionType);
        if (!isConditionValid) {
            int[] errPosition = getTokenPosition(ctx, ctx.IF_SYMBOL().getSymbol());
            throw new TypeMismatchException(errPosition, conditionType, "bool");
        }
        scopeHandler.enterScope(VisitLater.newEmptyVisitLater(),
                "if-block" ,
                false,
                ScopeType.ANONYMOUS);
        IfNode thisNode = new IfNode();
        scopeHandler.setNodeToCurrentScope(thisNode);
        Node blockBodyNode = visit(ctx.blockBodyCode()).getNode();
        scopeHandler.exitScope();
        thisNode.addChild(conditionNode);
        thisNode.addChild(blockBodyNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitElseIfBlock(rulesParser.ElseIfBlockContext ctx) {
        Node conditionNode = visit(ctx.rValue()).getNode();
        Type conditionType = ((HasType) conditionNode).getType();
        boolean isConditionValid = TypeChecker.checkConditionValue(conditionType);
        if (!isConditionValid) {
            int[] errPosition = getTokenPosition(ctx, ctx.ELSE_IF_SYMBOL().getSymbol());
            throw new TypeMismatchException(errPosition, conditionType, "bool");
        }
        scopeHandler.enterScope(VisitLater.newEmptyVisitLater(),
                "elif-block",
                false,
                ScopeType.ANONYMOUS);
        ElseIfNode thisNode = new ElseIfNode();
        scopeHandler.setNodeToCurrentScope(thisNode);
        Node blockBodyNode = visit(ctx.blockBodyCode()).getNode();
        scopeHandler.exitScope();

        thisNode.addChild(conditionNode);
        thisNode.addChild(blockBodyNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitElseBlock(rulesParser.ElseBlockContext ctx) {
        ElseNode thisNode = new ElseNode();
        scopeHandler.enterScope(VisitLater.newEmptyVisitLater(),
                "else-block",
                false,
                ScopeType.ANONYMOUS);
        scopeHandler.setNodeToCurrentScope(thisNode);
        Node blockBodyNode = visit(ctx.blockBodyCode()).getNode();
        scopeHandler.exitScope();
        thisNode.addChild(blockBodyNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitWhileBlock(rulesParser.WhileBlockContext ctx) {
        Node conditionNode = visit(ctx.rValue()).getNode();
        Type conditionType = ((HasType) conditionNode).getType();
        if (!TypeChecker.checkConditionValue(conditionType)) {
            int[] errPosition = getTokenPosition(ctx, ctx.WHILE_SYMBOL().getSymbol());
            throw new TypeMismatchException(errPosition, conditionType, new BoolType());
        }
        WhileBlockNode thisNode = new WhileBlockNode();
        scopeHandler.enterScope(VisitLater.newEmptyVisitLater(),
                "while-block",
                false,
                ScopeType.ANONYMOUS);
        scopeHandler.setNodeToCurrentScope(thisNode);
        Node blockBodyNode = visit(ctx.blockBodyCode()).getNode();
        scopeHandler.exitScope();
        thisNode.addChild(conditionNode);
        thisNode.addChild(blockBodyNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitBreakStatement(rulesParser.BreakStatementContext ctx) {
        Scope loopBlockScope = scopeHandler.getClosestLoopBlockScope();
        if (loopBlockScope == null) {
            int[] errPosition = getTokenPosition(ctx, ctx.BREAK_SYMBOL().getSymbol());
            throw new LoopControlException(errPosition);
        }
        Node loopBlockNode = loopBlockScope.getCorrespondingNode();
        BreakNode thisNode = new BreakNode(loopBlockNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitContinueStatement(rulesParser.ContinueStatementContext ctx) {
        Scope loopBlockScope = scopeHandler.getClosestLoopBlockScope();
        if (loopBlockScope == null) {
            int[] errPosition = getTokenPosition(ctx, ctx.CONTINUE_SYMBOL().getSymbol());
            throw new LoopControlException(errPosition);
        }
        Node loopBlockNode = loopBlockScope.getCorrespondingNode();
        ContinueNode thisNode = new ContinueNode(loopBlockNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitForBlock(rulesParser.ForBlockContext ctx) {
        scopeHandler.enterScope(VisitLater.newEmptyVisitLater(), "for-block", false, ScopeType.ANONYMOUS);
        ForBlockNode thisNode = new ForBlockNode();
        scopeHandler.setNodeToCurrentScope(thisNode);
        Node initConditionNode = visit(ctx.initOrStepCondition(0)).getNode();
        Node terminateConditionNode = visit(ctx.terminateCondition()).getNode();
        Type terminateConditionType = ((HasType) terminateConditionNode).getType();
        if (!TypeChecker.checkConditionValue(terminateConditionType)) {
            int[] errPosition = getTokenPosition(ctx, ctx.SEMICOLON(0).getSymbol());
            throw new TypeMismatchException(errPosition, terminateConditionType, new BoolType());
        }
        Node stepConditionNode = visit(ctx.initOrStepCondition(1)).getNode();
        Node blockBodyNode = visit(ctx.blockBodyCode()).getNode();
        thisNode.addChild(initConditionNode);
        thisNode.addChild(terminateConditionNode);
        thisNode.addChild(stepConditionNode);
        thisNode.addChild(blockBodyNode);
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitInitOrStepCondition(rulesParser.InitOrStepConditionContext ctx) {
        StatementListNode thisNode = new StatementListNode();
        for (rulesParser.StatementWithoutSemicolonContext context: ctx.statementWithoutSemicolon()) {
            thisNode.addChild(visit(context).getNode());
        }
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitReturnStatement(rulesParser.ReturnStatementContext ctx) {
        ReturnNode thisNode = new ReturnNode();
        Scope functionScope = scopeHandler.getClosestFunctionScope();
        int[] errPosition = getTokenPosition(ctx, ctx.RETURN_SYMBOL().getSymbol());
        if (functionScope == null) {
            throw new SyntaxErrorException(errPosition, "wrong return statement position");
        }
        Type expectReturnType = ((FunctionDefinitionNode) functionScope.getCorrespondingNode()).getReturnType();
        if (ctx.getChildCount() == 2) {
            //has return value
            Node rValueNode = visit(ctx.rValue()).getNode();
            Type realReturnType = ((HasType) rValueNode).getType();
            if (!TypeChecker.areEquivalentType(realReturnType, expectReturnType)) {
                throw new TypeMismatchException(errPosition, realReturnType, expectReturnType);
            }
            thisNode.addChild(rValueNode);
        } else {
            //return nothing
            if (!(expectReturnType instanceof VoidType)) {
                throw new TypeMismatchException(errPosition, new VoidType(), expectReturnType);
            }
        }
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx) {
        String componentTypeName = ctx.IDENTIFIER(0).getText();
        Type componentType = generateTypeForDeclaration(componentTypeName, ctx, ctx.IDENTIFIER(0).getSymbol());
        int dimension = 1; //only support 1-dimension array
        String variableName = ctx.IDENTIFIER(1).getText();
        if (!scopeHandler.getCurrentScope().isRestrictDescriptiveScope()
                && scopeHandler.existInCurrentScope(variableName)) {
            int[] errPosition = getTokenPosition(ctx, ctx.IDENTIFIER(1).getSymbol());
            throw new NameDuplicateException(errPosition, variableName);
        }
        ArrayType arrayType = TypeBuilder.generateArrayType(componentType, dimension);
        VariableNameNode nameNode = new VariableNameNode(variableName, null, arrayType);
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(variableName, restrictNames);
        ArrayDefinitionNode thisNode;
        if (scopeHandler.getCurrentScope().getCorrespondingNode() instanceof FunctionDefinitionNode) {
            thisNode = DefinitionNodeBuilder.generateArrayDefinitionNodeNotBuf(nameNode.getType(), scopeHandler.getCurrentFunctionOrStructOrNamespaceScope());
        } else {
            thisNode = DefinitionNodeBuilder.generateArrayDefinitionNode(fullRestrictName, nameNode.getType(), scopeHandler.getCurrentFunctionOrStructOrNamespaceScope());
        }
        if (!thisNode.hasNameNode()) {
            thisNode.addChild(nameNode);
        }

        Node parentNode = thisNode.getParentScope().getCorrespondingNode();
        if (parentNode instanceof FunctionDefinitionNode) {
            thisNode.setLocalIndex(((FunctionDefinitionNode) parentNode)
                    .addLocalVariableTypeAndReturnIndex(arrayType));
        }
        return new AstGeneratorResult(thisNode, ctx);
    }

    private Type generateTypeForDeclaration(String typeName, ParserRuleContext ctx, Token errToken) {
        Type type;
        if (BaseType.isBaseType(typeName)) {
            type = TypeBuilder.generateBaseType(typeName);
        } else {
            //object type
            DefinitionNode definitionNode = scopeHandler.getNode(typeName);
            if (definitionNode == null) {
                int[] errorPosition = getTokenPosition(ctx, errToken);
                throw new SymbolNotResolvedException(errorPosition, typeName);
            }
            type = definitionNode.getType();
        }
        return type;
    }

    @Override
    public AstGeneratorResult visitArrayDefinition(rulesParser.ArrayDefinitionContext ctx) {
        AstGeneratorResult visitDeclarationResult = visit(ctx.arrayDeclaration());
        ArrayDefinitionNode arrayDefinitionNode = (ArrayDefinitionNode) visitDeclarationResult.getNode();
        VariableNameNode variableNameNode = arrayDefinitionNode.getVariableNameNode();
        ParserRuleContext declarationContext = visitDeclarationResult.getContext();

        ArrayType arrayType = (ArrayType) variableNameNode.getType();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(variableNameNode.getName(), restrictNames);
        ScopeType scopeType = scopeHandler.getScopeType();
        ArrayDefinitionNode thisNode;
        if (scopeType == ScopeType.ANONYMOUS || scopeType == ScopeType.FUNCTION) {
            thisNode = DefinitionNodeBuilder.generateArrayDefinitionNodeNotBuf(arrayType,
                    scopeHandler.getCurrentFunctionOrStructOrNamespaceScope());
        } else {
            //get node from buffer
            thisNode = DefinitionNodeBuilder.generateArrayDefinitionNode(fullRestrictName,
                    arrayType,
                    scopeHandler.getCurrentScope());
        }
        thisNode.setLocalIndex(arrayDefinitionNode.getLocalIndex());
        thisNode.addChild(variableNameNode);
        AstGeneratorResult visitResult = visit(ctx.rValue());
        Node rightSideNode = visitResult.getNode();
        Type rightSideType = ((HasType) rightSideNode).getType();
        if (!TypeChecker.checkAssignment(arrayType, rightSideType)) {
            Token assignToken = ctx.ASSIGN_SYMBOL().getSymbol();
            int[] tokenPosition = getTokenPosition(ctx, assignToken);
            throw new TypeMismatchException(tokenPosition, arrayType, rightSideType);
        }
        thisNode.addChild(rightSideNode);
        return new AstGeneratorResult(thisNode, declarationContext);
    }

    @Override
    public AstGeneratorResult visitNewArray(rulesParser.NewArrayContext ctx) {
        int arrLen = ((LiteralNode<Integer>) visit(ctx.int_literal()).getNode()).getValue();
        int dimension = 1;
        String componentTypeStr = ctx.IDENTIFIER().getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        Type componentType;
        if (BaseType.isBaseType(componentTypeStr)) {
            componentType = TypeBuilder.generateBaseType(componentTypeStr);
        } else {
            DefinitionNode definitionNode = scopeHandler.getNode(componentTypeStr);
            if (definitionNode == null) {
                int[] errPosition = getTokenPosition(ctx, ctx.IDENTIFIER().getSymbol());
                throw new SymbolNotResolvedException(errPosition, componentTypeStr);
            }
            componentType = definitionNode.getType();
        }
        Type arrayType = TypeBuilder.generateArrayType(componentType, dimension);
        ArrayInitNode thisNode = new ArrayInitNode(true, arrLen, arrayType);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx) {
        List<Node> initNodes = new LinkedList<>();
        for (rulesParser.RValueContext context: ctx.rValue()) {
            initNodes.add(visit(context).getNode());
        }
        Type resultType = TypeChecker.checkArrayInit(initNodes);
        if (resultType == null) {
            int[] errPosition = getTokenPosition(ctx, ctx.LEFT_CURLY_BRACE().getSymbol());
            throw new TypeMismatchException(errPosition, "array");
        }
        ArrayInitNode thisNode = new ArrayInitNode(initNodes.size(), resultType);
        thisNode.addChildren(initNodes);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitArrayIndex(rulesParser.ArrayIndexContext ctx) {
        Node arrayNode = visit(ctx.getChild(0)).getNode();
        if (!(((HasType) arrayNode).getType() instanceof ArrayType)) {
            int[] errPosition = getTokenPosition(ctx, ctx.LEFT_BRACKET().getSymbol());
            throw new TypeMismatchException(errPosition, ((HasType) arrayNode).getType(), "array type");
        }

        Node indexNode = (Node) visit(ctx.expression()).getNode();
        if (!((HasType) indexNode).getType().equals(TypeBuilder.generateIntType())) {
            int[] errPosition = getTokenPosition(ctx, ctx.LEFT_BRACKET().getSymbol());
            throw new TypeMismatchException(errPosition, ((HasType) indexNode).getType(), "int");
        }

        ArrayIndexNode thisNode = new ArrayIndexNode(
                ((ArrayType) ((HasType) arrayNode).getType()).getComponentType()
        );
        thisNode.addChild(arrayNode);
        thisNode.addChild(indexNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitInfixTerms(rulesParser.InfixTermsContext ctx) {
        return generateInfix(ctx);
    }

    @Override
    public AstGeneratorResult visitExpressionInParentheses(rulesParser.ExpressionInParenthesesContext ctx) {
        return visit(ctx.expression());
    }
}
