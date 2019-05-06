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
	 * Enter a parse tree produced by the {@code rValueliteral}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterRValueliteral(rulesParser.RValueliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rValueliteral}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitRValueliteral(rulesParser.RValueliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rValueExpressionLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterRValueExpressionLabel(rulesParser.RValueExpressionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rValueExpressionLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitRValueExpressionLabel(rulesParser.RValueExpressionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInitializationLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializationLabel(rulesParser.ArrayInitializationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInitializationLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializationLabel(rulesParser.ArrayInitializationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rValueFunctionCallLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void enterRValueFunctionCallLabel(rulesParser.RValueFunctionCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rValueFunctionCallLabel}
	 * labeled alternative in {@link rulesParser#rValue}.
	 * @param ctx the parse tree
	 */
	void exitRValueFunctionCallLabel(rulesParser.RValueFunctionCallLabelContext ctx);
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
	 * Enter a parse tree produced by the {@code codeContentVariableDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void enterCodeContentVariableDefinition(rulesParser.CodeContentVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeContentVariableDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void exitCodeContentVariableDefinition(rulesParser.CodeContentVariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeContentFunctionDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void enterCodeContentFunctionDefinition(rulesParser.CodeContentFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeContentFunctionDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void exitCodeContentFunctionDefinition(rulesParser.CodeContentFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeContentStructDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void enterCodeContentStructDefinition(rulesParser.CodeContentStructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeContentStructDefinition}
	 * labeled alternative in {@link rulesParser#codeContent}.
	 * @param ctx the parse tree
	 */
	void exitCodeContentStructDefinition(rulesParser.CodeContentStructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticCharLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticCharLiteral(rulesParser.ArithmeticCharLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticCharLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticCharLiteral(rulesParser.ArithmeticCharLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifier}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(rulesParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticDoubleLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticDoubleLiteral(rulesParser.ArithmeticDoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticDoubleLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticDoubleLiteral(rulesParser.ArithmeticDoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallLabel}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallLabel(rulesParser.FunctionCallLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(rulesParser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBoolLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBoolLiteral(rulesParser.ArithmeticBoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBoolLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBoolLiteral(rulesParser.ArithmeticBoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(rulesParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(rulesParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticStringLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticStringLiteral(rulesParser.ArithmeticStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticStringLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticStringLiteral(rulesParser.ArithmeticStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticIntLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticIntLiteral(rulesParser.ArithmeticIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticIntLiteral}
	 * labeled alternative in {@link rulesParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticIntLiteral(rulesParser.ArithmeticIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link rulesParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(rulesParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rulesParser#boolExpression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(rulesParser.BoolExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code forBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterForBlockLabel(rulesParser.ForBlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitForBlockLabel(rulesParser.ForBlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlockLabel(rulesParser.WhileBlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlockLabel(rulesParser.WhileBlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterLogicBlockLabel(rulesParser.LogicBlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitLogicBlockLabel(rulesParser.LogicBlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pureBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterPureBlockLabel(rulesParser.PureBlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pureBlockLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitPureBlockLabel(rulesParser.PureBlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structDefinitionLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinitionLabel(rulesParser.StructDefinitionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structDefinitionLabel}
	 * labeled alternative in {@link rulesParser#block}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinitionLabel(rulesParser.StructDefinitionLabelContext ctx);
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
	 * Enter a parse tree produced by the {@code returnStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementLabel(rulesParser.ReturnStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementLabel(rulesParser.ReturnStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentLabel(rulesParser.AssignmentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentLabel(rulesParser.AssignmentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDefinitionLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionLabel(rulesParser.VariableDefinitionLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDefinitionLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionLabel(rulesParser.VariableDefinitionLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rValueLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void enterRValueLabel(rulesParser.RValueLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rValueLabel}
	 * labeled alternative in {@link rulesParser#statementWithoutSemicolon}.
	 * @param ctx the parse tree
	 */
	void exitRValueLabel(rulesParser.RValueLabelContext ctx);
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