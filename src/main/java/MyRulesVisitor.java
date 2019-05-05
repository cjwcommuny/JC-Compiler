import ast.*;

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
    public Node visitRValue(rulesParser.RValueContext ctx) {
        return visit(ctx.children.get(0));
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
    public Node visitProgram(rulesParser.ProgramContext ctx) {
        Node node = new ProgramNode();
        for (rulesParser.NamespaceDefinitionContext context: ctx.namespaceDefinition()) {
            node.addChild(visit(context));
        }
        return node;
    }

    @Override
    public Node visitCodeContentVariableDefinition(rulesParser.CodeContentVariableDefinitionContext ctx) {
        return super.visitCodeContentVariableDefinition(ctx);
    }

    @Override
    public Node visitCodeContentFunctionDefinition(rulesParser.CodeContentFunctionDefinitionContext ctx) {
        return super.visitCodeContentFunctionDefinition(ctx);
    }

    @Override
    public Node visitCodeContentStructDefinition(rulesParser.CodeContentStructDefinitionContext ctx) {
        return super.visitCodeContentStructDefinition(ctx);
    }

    @Override
    public Node visitArithmeticExpression(rulesParser.ArithmeticExpressionContext ctx) {
        return super.visitArithmeticExpression(ctx);
    }

    @Override
    public Node visitBoolExpression(rulesParser.BoolExpressionContext ctx) {
        return super.visitBoolExpression(ctx);
    }

    @Override
    public Node visitAssignment(rulesParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public Node visitBlock(rulesParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Node visitPureBlock(rulesParser.PureBlockContext ctx) {
        return super.visitPureBlock(ctx);
    }

    @Override
    public Node visitStatementWithoutSemicolon(rulesParser.StatementWithoutSemicolonContext ctx) {
        return super.visitStatementWithoutSemicolon(ctx);
    }

    @Override
    public Node visitStatementList(rulesParser.StatementListContext ctx) {
        return super.visitStatementList(ctx);
    }

    @Override
    public Node visitStatementOrBlock(rulesParser.StatementOrBlockContext ctx) {
        return super.visitStatementOrBlock(ctx);
    }

    @Override
    public Node visitStatement(rulesParser.StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Node visitBlockBodyCode(rulesParser.BlockBodyCodeContext ctx) {
        return super.visitBlockBodyCode(ctx);
    }

    @Override
    public Node visitReturnStatement(rulesParser.ReturnStatementContext ctx) {
        return super.visitReturnStatement(ctx);
    }

    @Override
    public Node visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx) {
        return super.visitFunctionDefinitionBlock(ctx);
    }

    @Override
    public Node visitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx) {
        return super.visitFunctionParameterDefinition(ctx);
    }

    @Override
    public Node visitParameterList(rulesParser.ParameterListContext ctx) {
        return super.visitParameterList(ctx);
    }

    @Override
    public Node visitFunctionBody(rulesParser.FunctionBodyContext ctx) {
        return super.visitFunctionBody(ctx);
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
