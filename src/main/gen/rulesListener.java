// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/rules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesParser}.
 */
public interface rulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterRValue(rulesParser.RValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitRValue(rulesParser.RValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValue(rulesParser.LValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValue(rulesParser.LValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(rulesParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(rulesParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(rulesParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(rulesParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(rulesParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void enterCodeContent(rulesParser.CodeContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void exitCodeContent(rulesParser.CodeContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(rulesParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(rulesParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(rulesParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(rulesParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(rulesParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(rulesParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#pureBlock}.
	 * @param ctx the parse tree
	 */
	void enterPureBlock(rulesParser.PureBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#pureBlock}.
	 * @param ctx the parse tree
	 */
	void exitPureBlock(rulesParser.PureBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutSemicolon(rulesParser.StatementWithoutSemicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutSemicolon(rulesParser.StatementWithoutSemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(rulesParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(rulesParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#statementOrBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementOrBlock(rulesParser.StatementOrBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#statementOrBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementOrBlock(rulesParser.StatementOrBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(rulesParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(rulesParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionBodyCode}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBodyCode(rulesParser.FunctionBodyCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionBodyCode}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBodyCode(rulesParser.FunctionBodyCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(rulesParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionDefinitionBlock}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinitionBlock(rulesParser.FunctionDefinitionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionParameterDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionParameterDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameterDefinition(rulesParser.FunctionParameterDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(rulesParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(rulesParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(rulesParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(rulesParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(rulesParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(rulesParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#ordinaryVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#ordinaryVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryVariableDefinition(rulesParser.OrdinaryVariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(rulesParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(rulesParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#simpleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVariableDeclaration(rulesParser.SimpleVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#simpleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVariableDeclaration(rulesParser.SimpleVariableDeclarationContext ctx);
}