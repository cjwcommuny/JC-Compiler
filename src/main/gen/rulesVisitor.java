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
	 * Visit a parse tree produced by {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValue(rulesParser.RValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLValue(rulesParser.LValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(rulesParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(rulesParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeContent(rulesParser.CodeContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(rulesParser.ArithmeticExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link rulesParser#functionBodyCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBodyCode(rulesParser.FunctionBodyCodeContext ctx);
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
}