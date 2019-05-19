// Generated from rules.g4 by ANTLR 4.7.2

package parser;

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
	 * Visit a parse tree produced by the {@code reference}
	 * labeled alternative in {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(rulesParser.ReferenceContext ctx);
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
	 * Visit a parse tree produced by the {@code returnInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInStatement(rulesParser.ReturnInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatementLabel(rulesParser.BreakStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatementLabel(rulesParser.ContinueStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentInStatement(rulesParser.AssignmentInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDefinitionInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitionInStatement(rulesParser.VariableDefinitionInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rValueInStatement}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRValueInStatement(rulesParser.RValueInStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(rulesParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(rulesParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(rulesParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#blockOrStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOrStatement(rulesParser.BlockOrStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#statementNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementNode(rulesParser.StatementNodeContext ctx);
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
	 * Visit a parse tree produced by {@link rulesParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(rulesParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#ordinaryVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinaryVariableDeclaration(rulesParser.OrdinaryVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#arrayDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDefinition(rulesParser.ArrayDefinitionContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link rulesParser#structReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructReference(rulesParser.StructReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(rulesParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(rulesParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(rulesParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link rulesParser#double_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_literal(rulesParser.Double_literalContext ctx);
}