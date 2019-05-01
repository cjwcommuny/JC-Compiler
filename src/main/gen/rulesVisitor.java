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
	 * Visit a parse tree produced by {@link rulesParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(rulesParser.AssignmentContext ctx);
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
}