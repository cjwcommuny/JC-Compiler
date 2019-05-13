package ast;

import ast.node.*;
import ast.node.definition.*;
import ast.node.reference.*;
import ast.node.structrue.*;
import ast.node.value.InfixExpressionNode;
import ast.node.value.UnaryExpressionNode;
import ast.node.value.ValueNode;
import common.CommonInfrastructure;
import error.exception.LoopControlException;
import error.exception.SymbolNotResolvedException;
import error.exception.TypeMismatchException;
import jdk.nashorn.internal.ir.WhileNode;
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
import symbol.Scope;
import symbol.ScopeHandler;
import symbol.ScopeType;
import symbol.SymbolTableGenerator;
import type.TypeCheckerAndInference;
import type.typetype.*;

import java.util.List;

public class AstGenerator extends rulesBaseVisitor<AstGeneratorResult> {
    private ScopeHandler scopeHandler = new ScopeHandler();
    private CommonTokenStream commonTokenStream;
    private SymbolTableGenerator symbolTableGenerator = new SymbolTableGenerator(scopeHandler, this);

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
        for (rulesParser.NamespaceDefinitionContext context: ctx.namespaceDefinition()) {
            AstGeneratorResult visitResult = visit(context);
            thisNode.addChildren(visitResult.getNodes());
        }
        scopeHandler.exitScope();
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        String namespaceName = ctx.IDENTIFIER().getText();
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
            thisNode.addChildren(visitResult.getNodes());
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
        AstGeneratorResult declarationVisitResult = visit(ctx.variableDeclaration());
        VariableDefinitionNode declarationNode = (VariableDefinitionNode) declarationVisitResult.getNode();
        VariableNameNode variableNameNode = (VariableNameNode) declarationNode.getChild(0);
        ParserRuleContext declarationContext = declarationVisitResult.getContext();

        Type type = variableNameNode.getType();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(variableNameNode.getName(), restrictNames);
        ScopeType scopeType = scopeHandler.getScopeType();
        VariableDefinitionNode thisNode;
        if (scopeType == ScopeType.ANONYMOUS || scopeType == ScopeType.FUNCTION) {
            thisNode = DefinitionNodeBuilder.generateVariableDefinitionNodeNotBuf(type,
                    scopeHandler.getRestrictCurrentScope());
        } else {
            //get node from buffer
            thisNode = DefinitionNodeBuilder.generateVariableDefinitionNode(fullRestrictName,
                    type,
                    scopeHandler.getRestrictCurrentScope());
        }
        thisNode.addChild(variableNameNode);
        AstGeneratorResult visitResult = visit(ctx.rValue());
        Node rightSideNode = visitResult.getNodes().get(0);
        Type rightSideType = ((HasType) rightSideNode).getType();
        if (!TypeCheckerAndInference.checkAssignment(type, rightSideType)) {
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

    /**
     * handle token
     * */
    @Override
    public AstGeneratorResult visitTerminal(TerminalNode thisNode) {
        String symbol = thisNode.getSymbol().getText();
        switch (thisNode.getSymbol().getType()) {
            case rulesLexer.INT_LITERAL: {
                LiteralNode<Integer> node = new LiteralNode<>(TypeBuilder.generateIntType(),
                        Integer.valueOf(symbol));
                return new AstGeneratorResult(node);
            }
            case rulesLexer.DOUBLE_LITERAL: {
                LiteralNode<Double> node = new LiteralNode<>(TypeBuilder.generateDoubleType(),
                        Double.parseDouble(symbol));
                return new AstGeneratorResult(node);
            }
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
                //TODO
            }
                return null;
            case rulesLexer.IDENTIFIER: {
                DefinitionNode defNode = scopeHandler.getNode(symbol);
                if (defNode == null) {
                    int[] errorPosition = getTokenPosition((ParserRuleContext) thisNode.getParent(),
                            thisNode.getSymbol());
                    throw new SymbolNotResolvedException(errorPosition, symbol);
                }
                RefNode refNode = RefNodeBuilder.generateProperReNode(symbol, defNode);
                return new AstGeneratorResult(refNode);
            }
            default:
                return null;//TODO: ERROR
        }
    }

    @Override
    public AstGeneratorResult visitInfixExpression(rulesParser.InfixExpressionContext ctx) {
        String operationStr = ctx.getChild(1).getText();
        Operation operation = new InfixOperation(operationStr);
        ValueNode leftNode = (ValueNode) visit(ctx.getChild(0)).getNode();
        ValueNode rightNode = (ValueNode) visit(ctx.getChild(2)).getNode();
        Type resultType = TypeCheckerAndInference.checkInfixComputation(operation,
                leftNode.getType(),
                rightNode.getType());
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
        Type resultType = TypeCheckerAndInference.checkUnaryComputation(operation, valueNode.getType());
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

        ParameterListNode parametersNode = (ParameterListNode) visit(ctx.getChild(3)).getNode();
        List<Type> parameterTypes = parametersNode.getTypes();
        FunctionType functionType = TypeBuilder.generateFunctionType(returnTypeStr,
                restrictNames,
                parameterTypes);
        String fullRestrictName = CommonInfrastructure.constructDefaultFullRestrictName(functionName, restrictNames);
        FunctionDefinitionNode thisNode = DefinitionNodeBuilder.generateFunctionDefinitionNode(fullRestrictName, functionType, scopeHandler.getRestrictParentScope());
        scopeHandler.setNodeToCurrentScope(thisNode);
        FunctionNameNode functionNameNode = new FunctionNameNode(functionName, null, functionType);
        thisNode.addChild(functionNameNode);
        thisNode.addChild(parametersNode);
        StatementListNode statements = (StatementListNode) visit(ctx.getChild(4)).getNode();
        thisNode.addChild(statements);
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
            scopeHandler.putSymbol(definitionNode.getName(), definitionNode);
            thisNode.addChild(definitionNode);
        }
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public AstGeneratorResult visitOrdinaryVariableDeclaration(rulesParser.OrdinaryVariableDeclarationContext ctx) {
        String typeName = ctx.IDENTIFIER(0).getText();
        Type type;
        if (BaseType.isBaseType(typeName)) {
            type = TypeBuilder.generateBaseType(typeName);
        } else {
            //object type
            DefinitionNode definitionNode = scopeHandler.getNode(typeName);
            if (definitionNode == null) {
                int[] errorPosition = getTokenPosition(ctx, ctx.IDENTIFIER(0).getSymbol());
                throw new SymbolNotResolvedException(errorPosition, typeName);
            }
            type = definitionNode.getType();
        }
        String variableName = ctx.IDENTIFIER(1).getText();
        List<String> restrictNames = scopeHandler.getRestrictNames();
        VariableNameNode nameNode = new VariableNameNode(variableName, null, type);
        VariableDefinitionNode thisNode = DefinitionNodeBuilder.generateVariableDefinitionNodeNotBuf(nameNode.getType(), scopeHandler.getRestrictCurrentScope());
        thisNode.addChild(nameNode);
        return new AstGeneratorResult(thisNode, ctx);
    }

    @Override
    public AstGeneratorResult visitStatementList(rulesParser.StatementListContext ctx) {
        StatementListNode statementListNode = new StatementListNode();
        for (int i = 0; i < ctx.getChildCount(); ++i) {
            ParseTree parseTree = ctx.getChild(i);
            Node node = visit(parseTree).getNode();
            statementListNode.addChild(node);
        }
        return new AstGeneratorResult(statementListNode);
    }

    @Override
    public AstGeneratorResult visitStatement(rulesParser.StatementContext ctx) {
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
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        StructFieldListNode fieldsNode = new StructFieldListNode();
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            AstGeneratorResult visitResult = visit(context);
            VariableDefinitionNode definitionNode = (VariableDefinitionNode) visitResult.getNode();
            fieldsNode.addChild(definitionNode);
            scopeHandler.putSymbol(definitionNode.getName(), definitionNode);
        }
        return new AstGeneratorResult(fieldsNode);
    }

    @Override
    public AstGeneratorResult visitStructReference(rulesParser.StructReferenceContext ctx) {
        RefNode leftNode = (RefNode) visit(ctx.getChild(0)).getNode();
        Type leftType = leftNode.getType();
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
        Type resultType = TypeCheckerAndInference.checkFunctionParameter(functionType, argumentListNode.getTypes());
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
        boolean result = TypeCheckerAndInference.checkAssignment(leftType, rightType);
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
        return visit(ctx.getChild(0));
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
        boolean isConditionValid = TypeCheckerAndInference.checkConditionValue(conditionType);
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
        boolean isConditionValid = TypeCheckerAndInference.checkConditionValue(conditionType);
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
        if (!TypeCheckerAndInference.checkConditionValue(conditionType)) {
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
        Node loopBlockNode = scopeHandler.getClosestLoopBlockScope().getCorrespondingNode();
        if (loopBlockNode == null) {
            int[] errPosition = getTokenPosition(ctx, ctx.BREAK_SYMBOL().getSymbol());
            throw new LoopControlException(errPosition);
        }
        BreakNode thisNode = new BreakNode(loopBlockNode);
        return new AstGeneratorResult(thisNode);
    }

    @Override
    public AstGeneratorResult visitContinueStatement(rulesParser.ContinueStatementContext ctx) {
        Node loopBlockNode = scopeHandler.getClosestLoopBlockScope().getCorrespondingNode();
        if (loopBlockNode == null) {
            int[] errPosition = getTokenPosition(ctx, ctx.CONTINUE_SYMBOL().getSymbol());
            throw new LoopControlException(errPosition);
        }
        ContinueNode thisNode = new ContinueNode(loopBlockNode);
        return new AstGeneratorResult(thisNode);
    }
}
