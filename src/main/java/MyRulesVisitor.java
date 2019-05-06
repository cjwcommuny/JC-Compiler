import ast.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

public class MyRulesVisitor extends rulesBaseVisitor<Node> {
    @Override
    public Node visitArrayInitialization(rulesParser.ArrayInitializationContext ctx) {
        return super.visitArrayInitialization(ctx);//TODO
    }

    @Override
    public Node visitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx) {
        return super.visitSimpleArrayInitialization(ctx);//TODO
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

    @Override
    public Node visitFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx) {
        return super.visitFunctionCallLabel(ctx);//TODO
    }



    @Override
    public Node visitUnaryExpression(rulesParser.UnaryExpressionContext ctx) {
        return super.visitUnaryExpression(ctx);
    }

    @Override
    public Node visitTerminal(TerminalNode node) {
        String symbol = node.getSymbol().getText();
        switch (node.getSymbol().getType()) {
            case rulesLexer.INT_LITERAL:
                return new IntNode(Integer.valueOf(symbol));
            case rulesLexer.DOUBLE_LITERAL:
                return new DoubleNode(Double.parseDouble(symbol));
            default:
                return null;//TODO: ERROR
        }
    }


    @Override
    public Node visitAssignment(rulesParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
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
        return super.visitReturnStatement(ctx);
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
        return super.visitLogicBlock(ctx);
    }

    @Override
    public Node visitIfBlock(rulesParser.IfBlockContext ctx) {
        return super.visitIfBlock(ctx);
    }

    @Override
    public Node visitElseIfBlock(rulesParser.ElseIfBlockContext ctx) {
        return super.visitElseIfBlock(ctx);
    }

    @Override
    public Node visitElseBlock(rulesParser.ElseBlockContext ctx) {
        return super.visitElseBlock(ctx);
    }

    @Override
    public Node visitForBlock(rulesParser.ForBlockContext ctx) {
        return super.visitForBlock(ctx);
    }

    @Override
    public Node visitForCondition(rulesParser.ForConditionContext ctx) {
        return super.visitForCondition(ctx);
    }

    @Override
    public Node visitInitOrStepCondition(rulesParser.InitOrStepConditionContext ctx) {
        return super.visitInitOrStepCondition(ctx);
    }

    @Override
    public Node visitTerminateCondition(rulesParser.TerminateConditionContext ctx) {
        return super.visitTerminateCondition(ctx);
    }

    @Override
    public Node visitWhileBlock(rulesParser.WhileBlockContext ctx) {
        return super.visitWhileBlock(ctx);
    }

    @Override
    public Node visitVariableDefinition(rulesParser.VariableDefinitionContext ctx) {
        return super.visitVariableDefinition(ctx);
    }

    @Override
    public Node visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx) {
        return super.visitOrdinaryVariableDefinition(ctx);
    }

    @Override
    public Node visitOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx) {
        return super.visitOrdinaryArrayDefinition(ctx);
    }

    @Override
    public Node visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx) {
        return super.visitVariableDeclaration(ctx);
    }

    @Override
    public Node visitSimpleVariableDeclaration(rulesParser.SimpleVariableDeclarationContext ctx) {
        return super.visitSimpleVariableDeclaration(ctx);
    }

    @Override
    public Node visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx) {
        return super.visitArrayDeclaration(ctx);
    }

    @Override
    public Node visitFunctionCall(rulesParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Node visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx) {
        return super.visitStructFieldStatementList(ctx);
    }

    @Override
    public Node visitStructDefinition(rulesParser.StructDefinitionContext ctx) {
        return super.visitStructDefinition(ctx);
    }
}
