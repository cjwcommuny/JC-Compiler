import ast.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyRulesVisitor extends rulesBaseVisitor<Node> {
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
        Node arrayIndexNode = new ArrayIndexNode();
        arrayIndexNode.addChild(visit(ctx.lValue()));
        arrayIndexNode.addChild(visit(ctx.expression()));
        return arrayIndexNode;
    }

    @Override
    public Node visitLValueIdentifier(rulesParser.LValueIdentifierContext ctx) {
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }


    @Override
    public Node visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        Node namespaceNode = new NamespaceNode(ctx.IDENTIFIER().getText());
        for (rulesParser.CodeContentContext context: ctx.codeContent()) {
            namespaceNode.addChild(visit(context));
        }
        return namespaceNode;
    }

    @Override
    public Node visitCodeContent(rulesParser.CodeContentContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Node visitProgram(rulesParser.ProgramContext ctx) {
        Node node = new ProgramNode();
        for (rulesParser.NamespaceDefinitionContext context: ctx.namespaceDefinition()) {
            node.addChild(visit(context));
        }
        return node;
    }

    @Override
    public Node visitInfixExpression(rulesParser.InfixExpressionContext ctx) {
        Node infixExpression = new InfixExpressionNode(ctx.getChild(1).getText());
        infixExpression.addChild(visit(ctx.getChild(0)));
        infixExpression.addChild(visit(ctx.getChild(2)));
        return infixExpression;
    }

    @Override
    public Node visitIdentifier(rulesParser.IdentifierContext ctx) {
        return new IdentifierNode(ctx.IDENTIFIER().getText());
    }

//    @Override
//    public Node visitFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx) {
//        return super.visitFunctionCallLabel(ctx);//TODO
//    }



    @Override
    public Node visitUnaryExpression(rulesParser.UnaryExpressionContext ctx) {
        Node node = new UnaryExpressionNode(ctx.getChild(0).getText());
        node.addChild(visit(ctx.getChild(1)));
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
            case rulesLexer.IDENTIFIER:
                return new IdentifierNode(symbol);
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
        Node functionDefinition = new FunctionDefinitionNode();
        functionDefinition.addChild(new IdentifierNode(ctx.IDENTIFIER(0).getText())); //return type
        functionDefinition.addChild(new IdentifierNode(ctx.IDENTIFIER(1).getText())); //function name
        functionDefinition.addChild(visit(ctx.functionParameterDefinition()));
        functionDefinition.addChild(visit(ctx.functionBody()));
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
        variableDefinition.addChild(visit(ctx.IDENTIFIER(0)));
        variableDefinition.addChild(visit(ctx.IDENTIFIER(1)));
        variableDefinition.addChild(visit(ctx.rValue()));
        return variableDefinition;
    }

    @Override
    public Node visitOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx) {
        int dimension = ctx.LEFT_BRACKET().size();
        Node node = new ArrayDefinitionNode(dimension);
        node.addChild(visit(ctx.IDENTIFIER(0)));
        node.addChild(visit(ctx.IDENTIFIER(1)));
        node.addChild(visit(ctx.rValue()));
        return node;
    }

    @Override
    public Node visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        Node node = new VariableDefinitionNode();
        node.addChild(visit(ctx.IDENTIFIER(0)));
        node.addChild(visit(ctx.IDENTIFIER(1)));
        node.addChild(new DefaultValueNode());
        return node;
    }


    @Override
    public Node visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx) {
        int dimension = ctx.LEFT_BRACKET().size();
        Node node = new ArrayDefinitionNode(dimension);
        node.addChild(visit(ctx.IDENTIFIER(0)));
        node.addChild(visit(ctx.IDENTIFIER(1)));
        node.addChild(new DefaultValueNode());
        return node;
    }

    @Override
    public Node visitFunctionCall(rulesParser.FunctionCallContext ctx) {
        Node node = new FunctionCallNode();
        node.addChild(visit(ctx.IDENTIFIER()));
        for (rulesParser.RValueContext context: ctx.rValue()) {
            node.addChild(visit(context));
        }
        return node;
    }

    @Override
    public Node visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        Node node = new StructureFieldDefinitionNode();
        for (rulesParser.VariableDefinitionContext context: ctx.variableDefinition()) {
            node.addChild(visit(context));
        }
        return node;
    }

    @Override
    public Node visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        Node node = new StructureDefinitionNode();
        node.addChild(visit(ctx.IDENTIFIER()));
        node.addChild(visit(ctx.structFieldStatementList()));
        return node;
    }
}
