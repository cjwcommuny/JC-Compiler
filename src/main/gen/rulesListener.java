// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/rules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rulesParser}.
 */
public interface rulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitialization(rulesParser.ArrayInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#arrayInitialization}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitialization(rulesParser.ArrayInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#simpleArrayInitialization}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#simpleArrayInitialization}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArrayInitialization(rulesParser.SimpleArrayInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(rulesParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(rulesParser.LiteralContext ctx);
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
	 * Enter a parse tree produced by the {@code lValueArrayIndex}
	 * labeled alternative in {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValueArrayIndex(rulesParser.LValueArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lValueArrayIndex}
	 * labeled alternative in {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValueArrayIndex(rulesParser.LValueArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lValueIdentifier}
	 * labeled alternative in {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void enterLValueIdentifier(rulesParser.LValueIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lValueIdentifier}
	 * labeled alternative in {@link rulesParser#lValue}.
	 * @param ctx the parse tree
	 */
	void exitLValueIdentifier(rulesParser.LValueIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#namespaceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceDefinition(rulesParser.NamespaceDefinitionContext ctx);
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
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralLabel(rulesParser.LiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalLabel}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralLabel(rulesParser.LiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(rulesParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(rulesParser.UnaryExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link rulesParser#blockBodyCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockBodyCode(rulesParser.BlockBodyCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#blockBodyCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockBodyCode(rulesParser.BlockBodyCodeContext ctx);
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
	 * Enter a parse tree produced by {@link rulesParser#logicBlock}.
	 * @param ctx the parse tree
	 */
	void enterLogicBlock(rulesParser.LogicBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#logicBlock}.
	 * @param ctx the parse tree
	 */
	void exitLogicBlock(rulesParser.LogicBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(rulesParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(rulesParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseIfBlock(rulesParser.ElseIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#elseIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseIfBlock(rulesParser.ElseIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(rulesParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(rulesParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(rulesParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(rulesParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(rulesParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(rulesParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#initOrStepCondition}.
	 * @param ctx the parse tree
	 */
	void enterInitOrStepCondition(rulesParser.InitOrStepConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#initOrStepCondition}.
	 * @param ctx the parse tree
	 */
	void exitInitOrStepCondition(rulesParser.InitOrStepConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#terminateCondition}.
	 * @param ctx the parse tree
	 */
	void enterTerminateCondition(rulesParser.TerminateConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#terminateCondition}.
	 * @param ctx the parse tree
	 */
	void exitTerminateCondition(rulesParser.TerminateConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(rulesParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(rulesParser.WhileBlockContext ctx);
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
	 * Enter a parse tree produced by {@link rulesParser#ordinaryArrayDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#ordinaryArrayDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOrdinaryArrayDefinition(rulesParser.OrdinaryArrayDefinitionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link rulesParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(rulesParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(rulesParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(rulesParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(rulesParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#structFieldStatementList}.
	 * @param ctx the parse tree
	 */
	void enterStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#structFieldStatementList}.
	 * @param ctx the parse tree
	 */
	void exitStructFieldStatementList(rulesParser.StructFieldStatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(rulesParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(rulesParser.StructDefinitionContext ctx);
}