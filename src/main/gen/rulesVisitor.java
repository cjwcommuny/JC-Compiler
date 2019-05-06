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
	 * Visit a parse tree produced by the {@code simpleArrayInitialization}
	 * labeled alternative in {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundArrayInitialization}
	 * labeled alternative in {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundArrayInitialization(rulesParser.CompoundArrayInitializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(rulesParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValue(rulesParser.RValueContext ctx);
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
	 * Visit a parse tree produced by {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeContent(rulesParser.CodeContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralLabel(rulesParser.LiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(rulesParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(rulesParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(rulesParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#pureBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureBlock(rulesParser.PureBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWithoutSemicolon(rulesParser.StatementWithoutSemicolonContext ctx);
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
	 * Visit a parse tree produced by the {@code emptyInitOrStepConsition}
	 * labeled alternative in {@link rulesParser#initOrStepCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyInitOrStepConsition(rulesParser.EmptyInitOrStepConsitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonEmptyInitOrStepCondition}
	 * labeled alternative in {@link rulesParser#initOrStepCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyInitOrStepCondition(rulesParser.NonEmptyInitOrStepConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyTerminateCondition}
	 * labeled alternative in {@link rulesParser#terminateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyTerminateCondition(rulesParser.EmptyTerminateConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonEmptyTerminateCondition}
	 * labeled alternative in {@link rulesParser#terminateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyTerminateCondition(rulesParser.NonEmptyTerminateConditionContext ctx);
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