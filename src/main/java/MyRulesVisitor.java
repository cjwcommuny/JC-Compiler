import ast.Node;

public class MyRulesVisitor extends rulesBaseVisitor<Node> {
    @Override
    public Node visitArrayInitialization(rulesParser.ArrayInitializationContext ctx) {
        return super.visitArrayInitialization(ctx);
    }

    @Override
    public Node visitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx) {
        return super.visitSimpleArrayInitialization(ctx);
    }

    @Override
    public Node visitRValueList(rulesParser.RValueListContext ctx) {
        return super.visitRValueList(ctx);
    }

    @Override
    public Node visitRValue(rulesParser.RValueContext ctx) {
        return super.visitRValue(ctx);
    }

    @Override
    public Node visitLValue(rulesParser.LValueContext ctx) {
        return super.visitLValue(ctx);
    }

    @Override
    public Node visitExpression(rulesParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Node visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx) {
        return super.visitNamespaceDefinition(ctx);
    }

    @Override
    public Node visitProgram(rulesParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Node visitCode(rulesParser.CodeContext ctx) {
        return super.visitCode(ctx);
    }

    @Override
    public Node visitCodeContent(rulesParser.CodeContentContext ctx) {
        return super.visitCodeContent(ctx);
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
