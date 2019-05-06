// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/rules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link rulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface rulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitialization(rulesParser.ArrayInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#simpleArrayInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rValueliteral}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValueliteral(rulesParser.RValueliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rValueExpressionLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValueExpressionLabel(rulesParser.RValueExpressionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInitializationLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializationLabel(rulesParser.ArrayInitializationLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rValueFunctionCallLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValueFunctionCallLabel(rulesParser.RValueFunctionCallLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lValueArrayIndex}
	 * labeled alternative in {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueArrayIndex(rulesParser.LValueArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lValueIdentifier}
	 * labeled alternative in {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValueIdentifier(rulesParser.LValueIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(rulesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeContentVariableDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeContentVariableDefinition(rulesParser.CodeContentVariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeContentFunctionDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeContentFunctionDefinition(rulesParser.CodeContentFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code codeContentStructDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeContentStructDefinition(rulesParser.CodeContentStructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticCharLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticCharLiteral(rulesParser.ArithmeticCharLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticDoubleLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticDoubleLiteral(rulesParser.ArithmeticDoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBoolLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBoolLiteral(rulesParser.ArithmeticBoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(rulesParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticStringLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticStringLiteral(rulesParser.ArithmeticStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticIntLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticIntLiteral(rulesParser.ArithmeticIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#boolExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpression(rulesParser.BoolExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(rulesParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlockLabel(rulesParser.ForBlockLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlockLabel(rulesParser.WhileBlockLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicBlockLabel(rulesParser.LogicBlockLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pureBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureBlockLabel(rulesParser.PureBlockLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structDefinitionLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinitionLabel(rulesParser.StructDefinitionLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#pureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureBlock(rulesParser.PureBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementLabel(rulesParser.ReturnStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentLabel(rulesParser.AssignmentLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDefinitionLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitionLabel(rulesParser.VariableDefinitionLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rValueLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValueLabel(rulesParser.RValueLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(rulesParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#statementOrBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementOrBlock(rulesParser.StatementOrBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(rulesParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#blockBodyCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockBodyCode(rulesParser.BlockBodyCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#functionDefinitionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#functionParameterDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(rulesParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(rulesParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#logicBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicBlock(rulesParser.LogicBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(rulesParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#elseIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfBlock(rulesParser.ElseIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(rulesParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(rulesParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(rulesParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#initOrStepCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitOrStepCondition(rulesParser.InitOrStepConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#terminateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminateCondition(rulesParser.TerminateConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(rulesParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(rulesParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#ordinaryVariableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#ordinaryArrayDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#simpleVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVariableDeclaration(rulesParser.SimpleVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(rulesParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#structFieldStatementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(rulesParser.StructDefinitionContext ctx);
}