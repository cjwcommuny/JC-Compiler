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