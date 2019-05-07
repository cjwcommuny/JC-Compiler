import ast.node.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import symbol.SymbolTable;
import type.Type;
import type.TypeChecker;
import value.Value;

import java.util.HashMap;
import java.util.Map;

public class AstGenerator extends rulesBaseVisitor<Node> {
    private SymbolTableGenerator symbolTableGenerator = new SymbolTableGenerator();
    private TypeInference typeInference = new TypeInference();

    private SymbolTable<String, ParserRuleContext> symbolTable = new SymbolTable<>();
    private Map<ParserRuleContext, Node> contextMap = new HashMap<>();

    public SymbolTable<String, ParserRuleContext> getSymbolTable() {
        return symbolTable;
    }

    public Map<ParserRuleContext, Node> getContextMap() {
        return contextMap;
    }

    @Override
    public Node visitCompoundArrayInitialization(rulesParser.CompoundArrayInitializationContext ctx) {
        Node arrayInit = new ArrayInitNode();
        for (rulesParser.ArrayInitializationContext context: ctx.arrayInitialization()) {
            arrayInit.addChild(visit(context));
        }
        return arrayInit;
    }

    @Override
    public Node visitBlock(rulesParser.BlockContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitPureBlock(rulesParser.PureBlockContext ctx) {
        return visit(ctx.blockBodyCode());
    }

    @Override
    public Node visitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx) {
        Node node = new ArrayInitNode();
        for (rulesParser.RValueContext context: ctx.rValue()) {
            node.addChild(visit(context));
        }
        return node;
    }

    @Override
    public Node visitLiteral(rulesParser.LiteralContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitLValueArrayIndex(rulesParser.LValueArrayIndexContext ctx) {
        ValueNode lValueNode = (ValueNode) visit(ctx.lValue());
        ValueNode expressionNode = (ValueNode) visit(ctx.expression());
        String arrayType = lValueNode.getType();
        String indexType = expressionNode.getType();
        String resultType = TypeChecker.checkArrayIndex(arrayType, indexType);
        if (resultType == null) {
            //TODO: type mismatch
        }
        Node arrayIndexNode = new ArrayIndexNode(null, resultType);
        arrayIndexNode.addChild(lValueNode);
        arrayIndexNode.addChild(expressionNode);
        return arrayIndexNode;
    }

    @Override
    public Node visitLValueIdentifier(rulesParser.LValueIdentifierContext ctx) {
        return visit(ctx.IDENTIFIER());
    }


    @Override
    public Node visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        symbolTable.enterScope(symbolTableGenerator.visit(ctx).getTable());
        Node namespaceNode = new NamespaceNode(ctx.IDENTIFIER().getText());
        contextMap.put(ctx, namespaceNode);
        for (rulesParser.CodeContentContext context: ctx.codeContent()) {
            namespaceNode.addChild(visit(context));
        }
        symbolTable.exitScope();
        return namespaceNode;
    }

    @Override
    public Node visitCodeContent(rulesParser.CodeContentContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitProgram(rulesParser.ProgramContext ctx) {
        symbolTable.enterScope(symbolTableGenerator.visit(ctx).getTable());
        Node node = new ProgramNode();
        for (rulesParser.NamespaceDefinitionContext context: ctx.namespaceDefinition()) {
            node.addChild(visit(context));
        }
        symbolTable.exitScope();
        return node;
    }

    @Override
    public Node visitInfixExpression(rulesParser.InfixExpressionContext ctx) {
        ValueNode node1 = (ValueNode) visit(ctx.getChild(0));
        ValueNode node2 = (ValueNode) visit(ctx.getChild(2));
        String operation = ctx.getChild(1).getText();
        String resultType = TypeChecker.checkInfixComputation(operation,
                node1.getType(),
                node2.getType());
        if (resultType == null) {
            //TODO: type not match error
        }
        Node node = new InfixExpressionNode(operation, null, resultType);//TODO: type check
        node.addChild(node1);
        node.addChild(node2);
        return node;
    }

    @Override
    public Node visitIdentifier(rulesParser.IdentifierContext ctx) {
        //only used as lValue, not definition
        String name = ctx.IDENTIFIER().getText();
        ParserRuleContext referenceContext = symbolTable.search(name);
        if (referenceContext == null) {
            //TODO: symbol not resolved
        }
        ValueNode referenceNode = (ValueNode) contextMap.get(referenceContext);
        return new IdentifierNode(name, referenceNode, referenceNode.getType());
    }


    @Override
    public Node visitUnaryExpression(rulesParser.UnaryExpressionContext ctx) {
        String operation = ctx.getChild(0).getText();
        ValueNode child = (ValueNode) visit(ctx.getChild(1));
        String resultType = TypeChecker.checkUnaryComputation(operation, child.getType());
        if (resultType == null) {
            //TODO: type not match
        }
        Node node = new UnaryExpressionNode(operation, null, resultType);
        node.addChild(child);
        return node;
    }

    /**
     * handle token
     * */
    @Override
    public Node visitTerminal(TerminalNode node) {
        String symbol = node.getSymbol().getText();
        switch (node.getSymbol().getType()) {
            case rulesLexer.INT_LITERAL:
                return new IntNode(Integer.valueOf(symbol));
            case rulesLexer.DOUBLE_LITERAL:
                return new DoubleNode(Double.parseDouble(symbol));
            case rulesLexer.BOOL_LITERAL:
                return new BoolNode(Boolean.parseBoolean(symbol));
            case rulesLexer.CHAR_LITERAL:
                return new CharNode(symbol.charAt(0));
            case rulesLexer.STRING_LITERAL:
                return new StringNode(symbol);
//            case rulesLexer.IDENTIFIER:
//                return new IdentifierNode(symbol);
            default:
                return null;//TODO: ERROR
        }
    }


    @Override
    public Node visitAssignment(rulesParser.AssignmentContext ctx) {
        Node node = new AssignmentNode();
        node.addChild(visit(ctx.lValue()));
        node.addChild(visit(ctx.rValue()));
        return node;
    }


    @Override
    public Node visitStatementList(rulesParser.StatementListContext ctx) {
        Node statementList = new StatementListNode();
        for (ParserRuleContext context: ctx.statementOrBlock()) {
            statementList.addChild(visit(context));
        }
        return statementList;
    }

    @Override
    public Node visitStatementOrBlock(rulesParser.StatementOrBlockContext ctx) {
        if (ctx.block() != null) {
            return visit(ctx.block());
        } else {
            return visit(ctx.statement());
        }
    }

    @Override
    public Node visitStatementWithoutSemicolon(rulesParser.StatementWithoutSemicolonContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitRValue(rulesParser.RValueContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitStatement(rulesParser.StatementContext ctx) {
        return visit(ctx.statementWithoutSemicolon());
    }

    @Override
    public Node visitBlockBodyCode(rulesParser.BlockBodyCodeContext ctx) {
        return visit(ctx.statementList());
    }

    @Override
    public Node visitReturnStatement(rulesParser.ReturnStatementContext ctx) {
        Node returnNode = new ReturnNode();
        if (ctx.getChildCount() == 1) {
            return returnNode;
        } else {
            returnNode.addChild(visit(ctx.rValue()));
            return returnNode;
        }
    }

    @Override
    public Node visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        symbolTable.enterScope(symbolTableGenerator.visit(ctx).getTable());

        Node functionDefinition = new FunctionDefinitionNode();
        contextMap.put(ctx, functionDefinition);
        functionDefinition.addChild(new IdentifierNode(ctx.IDENTIFIER(0).getText())); //return type
        functionDefinition.addChild(new IdentifierNode(ctx.IDENTIFIER(1).getText())); //function name
        functionDefinition.addChild(visit(ctx.functionParameterDefinition()));
        functionDefinition.addChild(visit(ctx.functionBody()));

        symbolTable.exitScope();
        return functionDefinition;
    }

    @Override
    public Node visitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx) {
        return visit(ctx.parameterList());
    }

    @Override
    public Node visitParameterList(rulesParser.ParameterListContext ctx) {
        Node parameterDefinition = new ParameterDefinitionNode();
        for (rulesParser.VariableDeclarationContext context: ctx.variableDeclaration()) {
            parameterDefinition.addChild(visit(context));
        }
        return parameterDefinition;
    }

    @Override
    public Node visitFunctionBody(rulesParser.FunctionBodyContext ctx) {
        return visit(ctx.blockBodyCode());
    }

    @Override
    public Node visitLogicBlock(rulesParser.LogicBlockContext ctx) {
        Node logicBlock = new LogicBlockNode();
        for (ParseTree child: ctx.children) {
            logicBlock.addChild(visit(child));
        }
        return logicBlock;
    }

    @Override
    public Node visitIfBlock(rulesParser.IfBlockContext ctx) {
        Node ifBlock = new IfNode();
        ifBlock.addChild(visit(ctx.rValue()));
        ifBlock.addChild(visit(ctx.blockBodyCode()));
        return ifBlock;
    }

    @Override
    public Node visitElseIfBlock(rulesParser.ElseIfBlockContext ctx) {
        Node elseIfBlock = new ElseIfNode();
        elseIfBlock.addChild(visit(ctx.rValue()));
        elseIfBlock.addChild(visit(ctx.blockBodyCode()));
        return elseIfBlock;
    }

    @Override
    public Node visitElseBlock(rulesParser.ElseBlockContext ctx) {
        Node elseNode = new ElseNode();
        elseNode.addChild(visit(ctx.blockBodyCode()));
        return elseNode;
    }

    @Override
    public Node visitForBlock(rulesParser.ForBlockContext ctx) {
        Node forBlock = new ForBlockNode();
        forBlock.addChild(visit(ctx.initOrStepCondition(0)));
        forBlock.addChild(visit(ctx.terminateCondition()));
        forBlock.addChild(visit(ctx.initOrStepCondition(1)));
        return forBlock;
    }

    @Override
    public Node visitEmptyInitOrStepConsition(rulesParser.EmptyInitOrStepConsitionContext ctx) {
        return new EmptyPlaceholderNode();
    }

    @Override
    public Node visitNonEmptyInitOrStepCondition(rulesParser.NonEmptyInitOrStepConditionContext ctx) {
        Node statementList = new StatementListNode();
        for (rulesParser.StatementWithoutSemicolonContext context: ctx.statementWithoutSemicolon()) {
            statementList.addChild(visit(context));
        }
        return statementList;
    }

    @Override
    public Node visitEmptyTerminateCondition(rulesParser.EmptyTerminateConditionContext ctx) {
        return new EmptyPlaceholderNode();
    }

    @Override
    public Node visitNonEmptyTerminateCondition(rulesParser.NonEmptyTerminateConditionContext ctx) {
        return visit(ctx.rValue());
    }

    @Override
    public Node visitWhileBlock(rulesParser.WhileBlockContext ctx) {
        Node node = new WhileBlockNode();
        node.addChild(visit(ctx.rValue()));
        node.addChild(visit(ctx.blockBodyCode()));
        return node;
    }

    @Override
    public Node visitVariableDefinition(rulesParser.VariableDefinitionContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx) {
        Node variableDefinition = new VariableDefinitionNode();
        contextMap.put(ctx, variableDefinition);
        String typeName = ctx.IDENTIFIER(0).getText();
        variableDefinition.addChild(new TypeNode(typeName));
        variableDefinition.addChild(new VariableNameNode(ctx.IDENTIFIER(1).getText(), null, typeName));
        variableDefinition.addChild(visit(ctx.rValue()));
        return variableDefinition;
    }

    @Override
    public Node visitOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx) {
        int dimension = ctx.LEFT_BRACKET().size();
        Node node = new ArrayDefinitionNode(dimension);
        contextMap.put(ctx, node);
        String typeName = ctx.IDENTIFIER(0).getText();
        node.addChild(new TypeNode(typeName));
        node.addChild(new ArrayNameNode(ctx.IDENTIFIER(1).getText(),
                null,
                Type.generateArrayType(typeName, dimension)));
        node.addChild(visit(ctx.rValue()));
        return node;
    }

    @Override
    public Node visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        Node node = new VariableDefinitionNode();
        contextMap.put(ctx, node);
        String typeName = ctx.IDENTIFIER(0).getText();
        node.addChild(new TypeNode(typeName));
        node.addChild(new VariableNameNode(ctx.IDENTIFIER(1).getText(), null, typeName));
        node.addChild(new DefaultValueNode());
        return node;
    }


    @Override
    public Node visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx) {
        int dimension = ctx.LEFT_BRACKET().size();
        Node node = new ArrayDefinitionNode(dimension);
        contextMap.put(ctx, node);
        String typeName = ctx.IDENTIFIER(0).getText();
        node.addChild(new TypeNode(typeName));
        node.addChild(new ArrayNameNode(ctx.IDENTIFIER(1).getText(),
                null,
                Type.generateArrayType(typeName, dimension)));
        node.addChild(new DefaultValueNode());
        return node;
    }

    @Override
    public Node visitFunctionCall(rulesParser.FunctionCallContext ctx) {
        Node node = new FunctionCallNode();
        node.addChild(new FunctionNameNode(ctx.IDENTIFIER().getText()));
        for (rulesParser.RValueContext context: ctx.rValue()) {
            node.addChild(visit(context));
        }
        return node;
    }

    @Override
    public Node visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        Node node = new StructureFieldDefinitionNode();
        contextMap.put(ctx, node);
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            node.addChild(visit(context));
        }
        return node;
    }

    @Override
    public Node visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        symbolTable.enterScope(symbolTableGenerator.visit(ctx).getTable());

        Node node = new StructureDefinitionNode();
        contextMap.put(ctx, node);
        node.addChild(new TypeNode(ctx.IDENTIFIER().getText()));
        node.addChild(visit(ctx.structFieldStatementList()));

        symbolTable.exitScope();
        return node;
    }
}
