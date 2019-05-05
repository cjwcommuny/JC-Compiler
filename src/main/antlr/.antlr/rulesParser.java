// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/rules.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEST_SYMBOL=1, LEFT_CURLY_BRACE=2, RIGHT_CURLY_BRACE=3, LEFT_BRACKET=4, 
		RIGHT_BRACKET=5, LEFT_PARENTHESES=6, RIGHT_PARENTHESES=7, SEMICOLON=8, 
		COMMA=9, DOT=10, ASSIGN_SYMBOL=11, LOGIC_OR=12, LOGIC_AND=13, LOGIC_NOT=14, 
		ADD=15, SUB=16, MUL=17, DIV=18, XOR=19, AND=20, OR=21, NOT=22, LESS_THAN=23, 
		LESS_OR_EQUAL_THAN=24, GREATER_THAN=25, GREATER_OR_EQUAL_THAN=26, EQUAL_SYMBOL=27, 
		DOUBLE_LITERAL=28, INT_LITERAL=29, CHAR_LITERAL=30, STRING_LITERAL=31, 
		BOOL_LITERAL=32, NAMESPACE_SYMBOL=33, FUNCTION_DEFINITION_SYMBOL=34, CLASS_DEFINITION_SYMNOL=35, 
		IF_SYMBOL=36, WHILE_SYMBOL=37, ELSE_SYMBOL=38, ELSE_IF_SYMBOL=39, RETURN_SYMBOL=40, 
		CONTINUE_SYMBOL=41, FOR_SYMBOL=42, BREAK_SYMBOL=43, IDENTIFIER=44, WHITE_SPACE=45, 
		LINE_COMMENT=46, COMMENT=47;
	public static final int
		RULE_arrayInitialization = 0, RULE_simpleArrayInitialization = 1, RULE_rValue = 2, 
		RULE_lValue = 3, RULE_expression = 4, RULE_namespaceDefinition = 5, RULE_program = 6, 
		RULE_codeContent = 7, RULE_arithmeticExpression = 8, RULE_boolExpression = 9, 
		RULE_assignment = 10, RULE_block = 11, RULE_pureBlock = 12, RULE_statementWithoutSemicolon = 13, 
		RULE_statementList = 14, RULE_statementOrBlock = 15, RULE_statement = 16, 
		RULE_blockBodyCode = 17, RULE_returnStatement = 18, RULE_functionDefinitionBlock = 19, 
		RULE_functionParameterDefinition = 20, RULE_parameterList = 21, RULE_functionBody = 22, 
		RULE_logicBlock = 23, RULE_ifBlock = 24, RULE_elseIfBlock = 25, RULE_elseBlock = 26, 
		RULE_forBlock = 27, RULE_forCondition = 28, RULE_initOrStepCondition = 29, 
		RULE_terminateCondition = 30, RULE_whileBlock = 31, RULE_variableDefinition = 32, 
		RULE_ordinaryVariableDefinition = 33, RULE_ordinaryArrayDefinition = 34, 
		RULE_variableDeclaration = 35, RULE_simpleVariableDeclaration = 36, RULE_arrayDeclaration = 37, 
		RULE_functionCall = 38, RULE_structFieldStatementList = 39, RULE_structDefinition = 40;
	public static final String[] ruleNames = {
		"arrayInitialization", "simpleArrayInitialization", "rValue", "lValue", 
		"expression", "namespaceDefinition", "program", "codeContent", "arithmeticExpression", 
		"boolExpression", "assignment", "block", "pureBlock", "statementWithoutSemicolon", 
		"statementList", "statementOrBlock", "statement", "blockBodyCode", "returnStatement", 
		"functionDefinitionBlock", "functionParameterDefinition", "parameterList", 
		"functionBody", "logicBlock", "ifBlock", "elseIfBlock", "elseBlock", "forBlock", 
		"forCondition", "initOrStepCondition", "terminateCondition", "whileBlock", 
		"variableDefinition", "ordinaryVariableDefinition", "ordinaryArrayDefinition", 
		"variableDeclaration", "simpleVariableDeclaration", "arrayDeclaration", 
		"functionCall", "structFieldStatementList", "structDefinition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TEST'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
		"'.'", "'='", "'||'", "'&&'", "'!'", "'+'", "'-'", "'*'", "'/'", "'^'", 
		"'&'", "'|'", "'~'", "'<'", "'<='", "'>'", "'>='", "'=='", null, null, 
		null, null, null, "'namespace'", "'def'", "'struct'", "'if'", "'while'", 
		"'else'", "'elif'", "'return'", "'continue'", "'for'", "'break'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", 
		"COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", 
		"ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "LESS_THAN", "LESS_OR_EQUAL_THAN", 
		"GREATER_THAN", "GREATER_OR_EQUAL_THAN", "EQUAL_SYMBOL", "DOUBLE_LITERAL", 
		"INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
		"FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", "IF_SYMBOL", 
		"WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
		"FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", "LINE_COMMENT", 
		"COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ArrayInitializationContext extends ParserRuleContext {
		public List<SimpleArrayInitializationContext> simpleArrayInitialization() {
			return getRuleContexts(SimpleArrayInitializationContext.class);
		}
		public SimpleArrayInitializationContext simpleArrayInitialization(int i) {
			return getRuleContext(SimpleArrayInitializationContext.class,i);
		}
		public ArrayInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialization; }
	}

	public final ArrayInitializationContext arrayInitialization() throws RecognitionException {
		ArrayInitializationContext _localctx = new ArrayInitializationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arrayInitialization);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				simpleArrayInitialization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LEFT_CURLY_BRACE);
				{
				setState(84);
				simpleArrayInitialization();
				setState(85);
				match(COMMA);
				}
				setState(87);
				simpleArrayInitialization();
				setState(88);
				match(RIGHT_CURLY_BRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleArrayInitializationContext extends ParserRuleContext {
		public List<RValueContext> rValue() {
			return getRuleContexts(RValueContext.class);
		}
		public RValueContext rValue(int i) {
			return getRuleContext(RValueContext.class,i);
		}
		public SimpleArrayInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleArrayInitialization; }
	}

	public final SimpleArrayInitializationContext simpleArrayInitialization() throws RecognitionException {
		SimpleArrayInitializationContext _localctx = new SimpleArrayInitializationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simpleArrayInitialization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(LEFT_CURLY_BRACE);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(93);
					rValue();
					setState(94);
					match(COMMA);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(101);
			rValue();
			setState(102);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RValueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(rulesParser.INT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(rulesParser.DOUBLE_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(rulesParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(rulesParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(rulesParser.BOOL_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializationContext arrayInitialization() {
			return getRuleContext(ArrayInitializationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public RValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rValue; }
	}

	public final RValueContext rValue() throws RecognitionException {
		RValueContext _localctx = new RValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rValue);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(DOUBLE_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				match(BOOL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(110);
				arrayInitialization();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(111);
				functionCall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LValueContext extends ParserRuleContext {
		public LValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lValue; }
	 
		public LValueContext() { }
		public void copyFrom(LValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LValueArrayIndexContext extends LValueContext {
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(rulesParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(rulesParser.RIGHT_BRACKET, 0); }
		public LValueArrayIndexContext(LValueContext ctx) { copyFrom(ctx); }
	}
	public static class LValueIdentifierContext extends LValueContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public LValueIdentifierContext(LValueContext ctx) { copyFrom(ctx); }
	}

	public final LValueContext lValue() throws RecognitionException {
		return lValue(0);
	}

	private LValueContext lValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LValueContext _localctx = new LValueContext(_ctx, _parentState);
		LValueContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_lValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LValueIdentifierContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(115);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LValueArrayIndexContext(new LValueContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lValue);
					setState(117);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(118);
					match(LEFT_BRACKET);
					setState(119);
					expression();
					setState(120);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public BoolExpressionContext boolExpression() {
			return getRuleContext(BoolExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				arithmeticExpression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				boolExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceDefinitionContext extends ParserRuleContext {
		public TerminalNode NAMESPACE_SYMBOL() { return getToken(rulesParser.NAMESPACE_SYMBOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public List<CodeContentContext> codeContent() {
			return getRuleContexts(CodeContentContext.class);
		}
		public CodeContentContext codeContent(int i) {
			return getRuleContext(CodeContentContext.class,i);
		}
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(NAMESPACE_SYMBOL);
			setState(133);
			match(IDENTIFIER);
			setState(134);
			match(LEFT_CURLY_BRACE);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				codeContent();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION_DEFINITION_SYMBOL) | (1L << CLASS_DEFINITION_SYMNOL) | (1L << IDENTIFIER))) != 0) );
			setState(140);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<NamespaceDefinitionContext> namespaceDefinition() {
			return getRuleContexts(NamespaceDefinitionContext.class);
		}
		public NamespaceDefinitionContext namespaceDefinition(int i) {
			return getRuleContext(NamespaceDefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				namespaceDefinition();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAMESPACE_SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContentContext extends ParserRuleContext {
		public CodeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeContent; }
	 
		public CodeContentContext() { }
		public void copyFrom(CodeContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CodeContentFunctionDefinitionContext extends CodeContentContext {
		public FunctionDefinitionBlockContext functionDefinitionBlock() {
			return getRuleContext(FunctionDefinitionBlockContext.class,0);
		}
		public CodeContentFunctionDefinitionContext(CodeContentContext ctx) { copyFrom(ctx); }
	}
	public static class CodeContentStructDefinitionContext extends CodeContentContext {
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public CodeContentStructDefinitionContext(CodeContentContext ctx) { copyFrom(ctx); }
	}
	public static class CodeContentVariableDefinitionContext extends CodeContentContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(rulesParser.SEMICOLON, 0); }
		public CodeContentVariableDefinitionContext(CodeContentContext ctx) { copyFrom(ctx); }
	}

	public final CodeContentContext codeContent() throws RecognitionException {
		CodeContentContext _localctx = new CodeContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_codeContent);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new CodeContentVariableDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				variableDefinition();
				setState(148);
				match(SEMICOLON);
				}
				break;
			case FUNCTION_DEFINITION_SYMBOL:
				_localctx = new CodeContentFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				functionDefinitionBlock();
				}
				break;
			case CLASS_DEFINITION_SYMNOL:
				_localctx = new CodeContentStructDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				structDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public TerminalNode INT_LITERAL() { return getToken(rulesParser.INT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(rulesParser.DOUBLE_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(rulesParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(rulesParser.CHAR_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(rulesParser.BOOL_LITERAL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SUB() { return getToken(rulesParser.SUB, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(rulesParser.NOT, 0); }
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public TerminalNode ADD() { return getToken(rulesParser.ADD, 0); }
		public TerminalNode MUL() { return getToken(rulesParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rulesParser.DIV, 0); }
		public TerminalNode XOR() { return getToken(rulesParser.XOR, 0); }
		public TerminalNode OR() { return getToken(rulesParser.OR, 0); }
		public TerminalNode AND() { return getToken(rulesParser.AND, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(155);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(156);
				match(INT_LITERAL);
				}
				break;
			case 3:
				{
				setState(157);
				match(DOUBLE_LITERAL);
				}
				break;
			case 4:
				{
				setState(158);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				{
				setState(159);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				{
				setState(160);
				match(BOOL_LITERAL);
				}
				break;
			case 7:
				{
				setState(161);
				functionCall();
				}
				break;
			case 8:
				{
				setState(162);
				match(SUB);
				setState(163);
				arithmeticExpression(6);
				}
				break;
			case 9:
				{
				setState(164);
				match(NOT);
				setState(165);
				arithmeticExpression(2);
				}
				break;
			case 10:
				{
				setState(166);
				match(LEFT_PARENTHESES);
				setState(167);
				arithmeticExpression(0);
				setState(168);
				match(RIGHT_PARENTHESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(172);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(173);
						match(ADD);
						setState(174);
						arithmeticExpression(11);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(175);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(176);
						match(SUB);
						setState(177);
						arithmeticExpression(10);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(178);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(179);
						match(MUL);
						setState(180);
						arithmeticExpression(9);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(181);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(182);
						match(DIV);
						setState(183);
						arithmeticExpression(8);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(184);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(185);
						match(XOR);
						setState(186);
						arithmeticExpression(6);
						}
						break;
					case 6:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(187);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(188);
						match(OR);
						setState(189);
						arithmeticExpression(5);
						}
						break;
					case 7:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						match(AND);
						setState(192);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public TerminalNode INT_LITERAL() { return getToken(rulesParser.INT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(rulesParser.DOUBLE_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(rulesParser.CHAR_LITERAL, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<BoolExpressionContext> boolExpression() {
			return getRuleContexts(BoolExpressionContext.class);
		}
		public BoolExpressionContext boolExpression(int i) {
			return getRuleContext(BoolExpressionContext.class,i);
		}
		public TerminalNode LESS_THAN() { return getToken(rulesParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(rulesParser.GREATER_THAN, 0); }
		public TerminalNode LESS_OR_EQUAL_THAN() { return getToken(rulesParser.LESS_OR_EQUAL_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL_THAN() { return getToken(rulesParser.GREATER_OR_EQUAL_THAN, 0); }
		public TerminalNode EQUAL_SYMBOL() { return getToken(rulesParser.EQUAL_SYMBOL, 0); }
		public BoolExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpression; }
	}

	public final BoolExpressionContext boolExpression() throws RecognitionException {
		return boolExpression(0);
	}

	private BoolExpressionContext boolExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpressionContext _localctx = new BoolExpressionContext(_ctx, _parentState);
		BoolExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(199);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(200);
				match(INT_LITERAL);
				}
				break;
			case 3:
				{
				setState(201);
				match(DOUBLE_LITERAL);
				}
				break;
			case 4:
				{
				setState(202);
				match(CHAR_LITERAL);
				}
				break;
			case 5:
				{
				setState(203);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(221);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new BoolExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(206);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(207);
						match(LESS_THAN);
						setState(208);
						boolExpression(6);
						}
						break;
					case 2:
						{
						_localctx = new BoolExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(209);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(210);
						match(GREATER_THAN);
						setState(211);
						boolExpression(5);
						}
						break;
					case 3:
						{
						_localctx = new BoolExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(212);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(213);
						match(LESS_OR_EQUAL_THAN);
						setState(214);
						boolExpression(4);
						}
						break;
					case 4:
						{
						_localctx = new BoolExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(215);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(216);
						match(GREATER_OR_EQUAL_THAN);
						setState(217);
						boolExpression(3);
						}
						break;
					case 5:
						{
						_localctx = new BoolExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpression);
						setState(218);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(219);
						match(EQUAL_SYMBOL);
						setState(220);
						boolExpression(2);
						}
						break;
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public TerminalNode ASSIGN_SYMBOL() { return getToken(rulesParser.ASSIGN_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			lValue(0);
			setState(227);
			match(ASSIGN_SYMBOL);
			setState(228);
			rValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public WhileBlockContext whileBlock() {
			return getRuleContext(WhileBlockContext.class,0);
		}
		public LogicBlockContext logicBlock() {
			return getRuleContext(LogicBlockContext.class,0);
		}
		public PureBlockContext pureBlock() {
			return getRuleContext(PureBlockContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				forBlock();
				}
				break;
			case WHILE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				whileBlock();
				}
				break;
			case IF_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				logicBlock();
				}
				break;
			case LEFT_CURLY_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				pureBlock();
				}
				break;
			case CLASS_DEFINITION_SYMNOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				structDefinition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PureBlockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public PureBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureBlock; }
	}

	public final PureBlockContext pureBlock() throws RecognitionException {
		PureBlockContext _localctx = new PureBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pureBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(LEFT_CURLY_BRACE);
			setState(238);
			blockBodyCode();
			setState(239);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutSemicolonContext extends ParserRuleContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public StatementWithoutSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutSemicolon; }
	}

	public final StatementWithoutSemicolonContext statementWithoutSemicolon() throws RecognitionException {
		StatementWithoutSemicolonContext _localctx = new StatementWithoutSemicolonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statementWithoutSemicolon);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				variableDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				rValue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public StatementOrBlockContext statementOrBlock() {
			return getRuleContext(StatementOrBlockContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementList);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT_CURLY_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LEFT_CURLY_BRACE:
			case LEFT_PARENTHESES:
			case SUB:
			case NOT:
			case DOUBLE_LITERAL:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case CLASS_DEFINITION_SYMNOL:
			case IF_SYMBOL:
			case WHILE_SYMBOL:
			case RETURN_SYMBOL:
			case FOR_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				statementOrBlock();
				setState(249);
				statementList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementOrBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementOrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementOrBlock; }
	}

	public final StatementOrBlockContext statementOrBlock() throws RecognitionException {
		StatementOrBlockContext _localctx = new StatementOrBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementOrBlock);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementWithoutSemicolonContext statementWithoutSemicolon() {
			return getRuleContext(StatementWithoutSemicolonContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(rulesParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			statementWithoutSemicolon();
			setState(258);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockBodyCodeContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockBodyCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBodyCode; }
	}

	public final BlockBodyCodeContext blockBodyCode() throws RecognitionException {
		BlockBodyCodeContext _localctx = new BlockBodyCodeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockBodyCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			statementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN_SYMBOL() { return getToken(rulesParser.RETURN_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(RETURN_SYMBOL);
				setState(263);
				rValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(RETURN_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionBlockContext extends ParserRuleContext {
		public TerminalNode FUNCTION_DEFINITION_SYMBOL() { return getToken(rulesParser.FUNCTION_DEFINITION_SYMBOL, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
		}
		public FunctionParameterDefinitionContext functionParameterDefinition() {
			return getRuleContext(FunctionParameterDefinitionContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FunctionDefinitionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinitionBlock; }
	}

	public final FunctionDefinitionBlockContext functionDefinitionBlock() throws RecognitionException {
		FunctionDefinitionBlockContext _localctx = new FunctionDefinitionBlockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionDefinitionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(FUNCTION_DEFINITION_SYMBOL);
			setState(268);
			match(IDENTIFIER);
			setState(269);
			match(IDENTIFIER);
			setState(270);
			functionParameterDefinition();
			setState(271);
			functionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionParameterDefinitionContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public FunctionParameterDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionParameterDefinition; }
	}

	public final FunctionParameterDefinitionContext functionParameterDefinition() throws RecognitionException {
		FunctionParameterDefinitionContext _localctx = new FunctionParameterDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionParameterDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(LEFT_PARENTHESES);
			setState(274);
			parameterList();
			setState(275);
			match(RIGHT_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterList);
		try {
			int _alt;
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT_PARENTHESES:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(278);
						variableDeclaration();
						setState(279);
						match(COMMA);
						}
						} 
					}
					setState(285);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(286);
				variableDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LEFT_CURLY_BRACE);
			setState(290);
			blockBodyCode();
			setState(291);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicBlockContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public List<ElseIfBlockContext> elseIfBlock() {
			return getRuleContexts(ElseIfBlockContext.class);
		}
		public ElseIfBlockContext elseIfBlock(int i) {
			return getRuleContext(ElseIfBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public LogicBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicBlock; }
	}

	public final LogicBlockContext logicBlock() throws RecognitionException {
		LogicBlockContext _localctx = new LogicBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logicBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			ifBlock();
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_SYMBOL) {
				{
				{
				setState(294);
				elseIfBlock();
				}
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_SYMBOL) {
				{
				setState(300);
				elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF_SYMBOL() { return getToken(rulesParser.IF_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IF_SYMBOL);
			setState(304);
			match(LEFT_PARENTHESES);
			setState(305);
			rValue();
			setState(306);
			match(RIGHT_PARENTHESES);
			setState(307);
			match(LEFT_CURLY_BRACE);
			setState(308);
			blockBodyCode();
			setState(309);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfBlockContext extends ParserRuleContext {
		public TerminalNode ELSE_IF_SYMBOL() { return getToken(rulesParser.ELSE_IF_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(ELSE_IF_SYMBOL);
			setState(312);
			match(LEFT_PARENTHESES);
			setState(313);
			rValue();
			setState(314);
			match(RIGHT_PARENTHESES);
			setState(315);
			match(LEFT_CURLY_BRACE);
			setState(316);
			blockBodyCode();
			setState(317);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE_SYMBOL() { return getToken(rulesParser.ELSE_SYMBOL, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ELSE_SYMBOL);
			setState(320);
			match(LEFT_CURLY_BRACE);
			setState(321);
			blockBodyCode();
			setState(322);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForBlockContext extends ParserRuleContext {
		public TerminalNode FOR_SYMBOL() { return getToken(rulesParser.FOR_SYMBOL, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(FOR_SYMBOL);
			setState(325);
			match(LEFT_PARENTHESES);
			setState(326);
			forCondition();
			setState(327);
			match(RIGHT_PARENTHESES);
			setState(328);
			match(LEFT_CURLY_BRACE);
			setState(329);
			blockBodyCode();
			setState(330);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public List<InitOrStepConditionContext> initOrStepCondition() {
			return getRuleContexts(InitOrStepConditionContext.class);
		}
		public InitOrStepConditionContext initOrStepCondition(int i) {
			return getRuleContext(InitOrStepConditionContext.class,i);
		}
		public TerminateConditionContext terminateCondition() {
			return getRuleContext(TerminateConditionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			initOrStepCondition();
			setState(333);
			match(SEMICOLON);
			setState(334);
			terminateCondition();
			setState(335);
			match(SEMICOLON);
			setState(336);
			initOrStepCondition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitOrStepConditionContext extends ParserRuleContext {
		public List<StatementWithoutSemicolonContext> statementWithoutSemicolon() {
			return getRuleContexts(StatementWithoutSemicolonContext.class);
		}
		public StatementWithoutSemicolonContext statementWithoutSemicolon(int i) {
			return getRuleContext(StatementWithoutSemicolonContext.class,i);
		}
		public InitOrStepConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initOrStepCondition; }
	}

	public final InitOrStepConditionContext initOrStepCondition() throws RecognitionException {
		InitOrStepConditionContext _localctx = new InitOrStepConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initOrStepCondition);
		try {
			int _alt;
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RIGHT_PARENTHESES:
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LEFT_CURLY_BRACE:
			case LEFT_PARENTHESES:
			case SUB:
			case NOT:
			case DOUBLE_LITERAL:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case RETURN_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(339);
						statementWithoutSemicolon();
						setState(340);
						match(COMMA);
						}
						} 
					}
					setState(346);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(347);
				statementWithoutSemicolon();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminateConditionContext extends ParserRuleContext {
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public TerminateConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminateCondition; }
	}

	public final TerminateConditionContext terminateCondition() throws RecognitionException {
		TerminateConditionContext _localctx = new TerminateConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_terminateCondition);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case LEFT_CURLY_BRACE:
			case LEFT_PARENTHESES:
			case SUB:
			case NOT:
			case DOUBLE_LITERAL:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				rValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileBlockContext extends ParserRuleContext {
		public TerminalNode WHILE_SYMBOL() { return getToken(rulesParser.WHILE_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(WHILE_SYMBOL);
			setState(355);
			match(LEFT_PARENTHESES);
			setState(356);
			rValue();
			setState(357);
			match(RIGHT_PARENTHESES);
			setState(358);
			match(LEFT_CURLY_BRACE);
			setState(359);
			blockBodyCode();
			setState(360);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDefinitionContext extends ParserRuleContext {
		public OrdinaryVariableDefinitionContext ordinaryVariableDefinition() {
			return getRuleContext(OrdinaryVariableDefinitionContext.class,0);
		}
		public OrdinaryArrayDefinitionContext ordinaryArrayDefinition() {
			return getRuleContext(OrdinaryArrayDefinitionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDefinition);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				ordinaryVariableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				ordinaryArrayDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				variableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryVariableDefinitionContext extends ParserRuleContext {
		public SimpleVariableDeclarationContext simpleVariableDeclaration() {
			return getRuleContext(SimpleVariableDeclarationContext.class,0);
		}
		public TerminalNode ASSIGN_SYMBOL() { return getToken(rulesParser.ASSIGN_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public OrdinaryVariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryVariableDefinition; }
	}

	public final OrdinaryVariableDefinitionContext ordinaryVariableDefinition() throws RecognitionException {
		OrdinaryVariableDefinitionContext _localctx = new OrdinaryVariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ordinaryVariableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			simpleVariableDeclaration();
			setState(368);
			match(ASSIGN_SYMBOL);
			setState(369);
			rValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdinaryArrayDefinitionContext extends ParserRuleContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public TerminalNode ASSIGN_SYMBOL() { return getToken(rulesParser.ASSIGN_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public OrdinaryArrayDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryArrayDefinition; }
	}

	public final OrdinaryArrayDefinitionContext ordinaryArrayDefinition() throws RecognitionException {
		OrdinaryArrayDefinitionContext _localctx = new OrdinaryArrayDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ordinaryArrayDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			arrayDeclaration();
			setState(372);
			match(ASSIGN_SYMBOL);
			setState(373);
			rValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public SimpleVariableDeclarationContext simpleVariableDeclaration() {
			return getRuleContext(SimpleVariableDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclaration);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				simpleVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				arrayDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleVariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
		}
		public SimpleVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleVariableDeclaration; }
	}

	public final SimpleVariableDeclarationContext simpleVariableDeclaration() throws RecognitionException {
		SimpleVariableDeclarationContext _localctx = new SimpleVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simpleVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(IDENTIFIER);
			setState(380);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(rulesParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(rulesParser.LEFT_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(rulesParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(rulesParser.RIGHT_BRACKET, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENTIFIER);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(383);
				match(LEFT_BRACKET);
				setState(384);
				match(RIGHT_BRACKET);
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public List<RValueContext> rValue() {
			return getRuleContexts(RValueContext.class);
		}
		public RValueContext rValue(int i) {
			return getRuleContext(RValueContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(IDENTIFIER);
			setState(393);
			match(LEFT_PARENTHESES);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << SUB) | (1L << NOT) | (1L << DOUBLE_LITERAL) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(394);
						rValue();
						setState(395);
						match(COMMA);
						}
						} 
					}
					setState(401);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(402);
				rValue();
				}
			}

			setState(405);
			match(RIGHT_PARENTHESES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructFieldStatementListContext extends ParserRuleContext {
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public StructFieldStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldStatementList; }
	}

	public final StructFieldStatementListContext structFieldStatementList() throws RecognitionException {
		StructFieldStatementListContext _localctx = new StructFieldStatementListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structFieldStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(407);
				variableDefinition();
				setState(408);
				match(SEMICOLON);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public TerminalNode CLASS_DEFINITION_SYMNOL() { return getToken(rulesParser.CLASS_DEFINITION_SYMNOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public StructFieldStatementListContext structFieldStatementList() {
			return getRuleContext(StructFieldStatementListContext.class,0);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(CLASS_DEFINITION_SYMNOL);
			setState(416);
			match(IDENTIFIER);
			setState(417);
			match(LEFT_CURLY_BRACE);
			setState(418);
			structFieldStatementList();
			setState(419);
			match(RIGHT_CURLY_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return lValue_sempred((LValueContext)_localctx, predIndex);
		case 8:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		case 9:
			return boolExpression_sempred((BoolExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lValue_sempred(LValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean boolExpression_sempred(BoolExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2]\n\2\3\3\3\3\3\3\3\3\7\3c\n\3\f\3\16\3f\13"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\6\3\6\3\6\5\6\u0085"+
		"\n\6\3\7\3\7\3\7\3\7\6\7\u008b\n\7\r\7\16\7\u008c\3\7\3\7\3\b\6\b\u0092"+
		"\n\b\r\b\16\b\u0093\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ad\n\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00c4\n\n\f\n\16\n\u00c7\13\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00cf\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00e0\n\13\f\13\16\13\u00e3\13\13\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00ee\n\r\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\5\17\u00f8\n\17\3\20\3\20\3\20\3\20\5\20\u00fe\n\20\3\21\3"+
		"\21\5\21\u0102\n\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u010c"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\7\27\u011c\n\27\f\27\16\27\u011f\13\27\3\27\5\27\u0122\n\27\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\7\31\u012a\n\31\f\31\16\31\u012d\13\31\3\31"+
		"\5\31\u0130\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\7\37\u0159\n\37\f\37\16\37\u015c\13\37\3\37\5\37\u015f\n\37\3 \3 \5 "+
		"\u0163\n \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u0170\n\"\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3%\3%\5%\u017c\n%\3&\3&\3&\3\'\3\'\3\'\7\'\u0184\n\'\f\'"+
		"\16\'\u0187\13\'\3\'\3\'\3(\3(\3(\3(\3(\7(\u0190\n(\f(\16(\u0193\13(\3"+
		"(\5(\u0196\n(\3(\3(\3)\3)\3)\7)\u019d\n)\f)\16)\u01a0\13)\3*\3*\3*\3*"+
		"\3*\3*\3*\2\5\b\22\24+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPR\2\2\2\u01bf\2\\\3\2\2\2\4^\3\2\2\2\6r\3\2"+
		"\2\2\bt\3\2\2\2\n\u0084\3\2\2\2\f\u0086\3\2\2\2\16\u0091\3\2\2\2\20\u009a"+
		"\3\2\2\2\22\u00ac\3\2\2\2\24\u00ce\3\2\2\2\26\u00e4\3\2\2\2\30\u00ed\3"+
		"\2\2\2\32\u00ef\3\2\2\2\34\u00f7\3\2\2\2\36\u00fd\3\2\2\2 \u0101\3\2\2"+
		"\2\"\u0103\3\2\2\2$\u0106\3\2\2\2&\u010b\3\2\2\2(\u010d\3\2\2\2*\u0113"+
		"\3\2\2\2,\u0121\3\2\2\2.\u0123\3\2\2\2\60\u0127\3\2\2\2\62\u0131\3\2\2"+
		"\2\64\u0139\3\2\2\2\66\u0141\3\2\2\28\u0146\3\2\2\2:\u014e\3\2\2\2<\u015e"+
		"\3\2\2\2>\u0162\3\2\2\2@\u0164\3\2\2\2B\u016f\3\2\2\2D\u0171\3\2\2\2F"+
		"\u0175\3\2\2\2H\u017b\3\2\2\2J\u017d\3\2\2\2L\u0180\3\2\2\2N\u018a\3\2"+
		"\2\2P\u019e\3\2\2\2R\u01a1\3\2\2\2T]\5\4\3\2UV\7\4\2\2VW\5\4\3\2WX\7\13"+
		"\2\2XY\3\2\2\2YZ\5\4\3\2Z[\7\5\2\2[]\3\2\2\2\\T\3\2\2\2\\U\3\2\2\2]\3"+
		"\3\2\2\2^d\7\4\2\2_`\5\6\4\2`a\7\13\2\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\5\6\4\2hi\7\5\2\2i\5\3\2\2"+
		"\2js\7\37\2\2ks\7\36\2\2ls\7 \2\2ms\7!\2\2ns\7\"\2\2os\5\n\6\2ps\5\2\2"+
		"\2qs\5N(\2rj\3\2\2\2rk\3\2\2\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2"+
		"rp\3\2\2\2rq\3\2\2\2s\7\3\2\2\2tu\b\5\1\2uv\7.\2\2v~\3\2\2\2wx\f\3\2\2"+
		"xy\7\6\2\2yz\5\n\6\2z{\7\7\2\2{}\3\2\2\2|w\3\2\2\2}\u0080\3\2\2\2~|\3"+
		"\2\2\2~\177\3\2\2\2\177\t\3\2\2\2\u0080~\3\2\2\2\u0081\u0085\7.\2\2\u0082"+
		"\u0085\5\22\n\2\u0083\u0085\5\24\13\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\13\3\2\2\2\u0086\u0087\7#\2\2\u0087"+
		"\u0088\7.\2\2\u0088\u008a\7\4\2\2\u0089\u008b\5\20\t\2\u008a\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7\5\2\2\u008f\r\3\2\2\2\u0090\u0092\5\f\7\2"+
		"\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094"+
		"\3\2\2\2\u0094\17\3\2\2\2\u0095\u0096\5B\"\2\u0096\u0097\7\n\2\2\u0097"+
		"\u009b\3\2\2\2\u0098\u009b\5(\25\2\u0099\u009b\5R*\2\u009a\u0095\3\2\2"+
		"\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\21\3\2\2\2\u009c\u009d"+
		"\b\n\1\2\u009d\u00ad\7.\2\2\u009e\u00ad\7\37\2\2\u009f\u00ad\7\36\2\2"+
		"\u00a0\u00ad\7!\2\2\u00a1\u00ad\7 \2\2\u00a2\u00ad\7\"\2\2\u00a3\u00ad"+
		"\5N(\2\u00a4\u00a5\7\22\2\2\u00a5\u00ad\5\22\n\b\u00a6\u00a7\7\30\2\2"+
		"\u00a7\u00ad\5\22\n\4\u00a8\u00a9\7\b\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab"+
		"\7\t\2\2\u00ab\u00ad\3\2\2\2\u00ac\u009c\3\2\2\2\u00ac\u009e\3\2\2\2\u00ac"+
		"\u009f\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ac\u00a2\3\2"+
		"\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac"+
		"\u00a8\3\2\2\2\u00ad\u00c5\3\2\2\2\u00ae\u00af\f\f\2\2\u00af\u00b0\7\21"+
		"\2\2\u00b0\u00c4\5\22\n\r\u00b1\u00b2\f\13\2\2\u00b2\u00b3\7\22\2\2\u00b3"+
		"\u00c4\5\22\n\f\u00b4\u00b5\f\n\2\2\u00b5\u00b6\7\23\2\2\u00b6\u00c4\5"+
		"\22\n\13\u00b7\u00b8\f\t\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00c4\5\22\n\n"+
		"\u00ba\u00bb\f\7\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00c4\5\22\n\b\u00bd\u00be"+
		"\f\6\2\2\u00be\u00bf\7\27\2\2\u00bf\u00c4\5\22\n\7\u00c0\u00c1\f\5\2\2"+
		"\u00c1\u00c2\7\26\2\2\u00c2\u00c4\5\22\n\6\u00c3\u00ae\3\2\2\2\u00c3\u00b1"+
		"\3\2\2\2\u00c3\u00b4\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00ba\3\2\2\2\u00c3"+
		"\u00bd\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\23\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9"+
		"\b\13\1\2\u00c9\u00cf\7.\2\2\u00ca\u00cf\7\37\2\2\u00cb\u00cf\7\36\2\2"+
		"\u00cc\u00cf\7 \2\2\u00cd\u00cf\5N(\2\u00ce\u00c8\3\2\2\2\u00ce\u00ca"+
		"\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00e1\3\2\2\2\u00d0\u00d1\f\7\2\2\u00d1\u00d2\7\31\2\2\u00d2\u00e0\5"+
		"\24\13\b\u00d3\u00d4\f\6\2\2\u00d4\u00d5\7\33\2\2\u00d5\u00e0\5\24\13"+
		"\7\u00d6\u00d7\f\5\2\2\u00d7\u00d8\7\32\2\2\u00d8\u00e0\5\24\13\6\u00d9"+
		"\u00da\f\4\2\2\u00da\u00db\7\34\2\2\u00db\u00e0\5\24\13\5\u00dc\u00dd"+
		"\f\3\2\2\u00dd\u00de\7\35\2\2\u00de\u00e0\5\24\13\4\u00df\u00d0\3\2\2"+
		"\2\u00df\u00d3\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc"+
		"\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\25\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\5\b\5\2\u00e5\u00e6\7\r\2"+
		"\2\u00e6\u00e7\5\6\4\2\u00e7\27\3\2\2\2\u00e8\u00ee\58\35\2\u00e9\u00ee"+
		"\5@!\2\u00ea\u00ee\5\60\31\2\u00eb\u00ee\5\32\16\2\u00ec\u00ee\5R*\2\u00ed"+
		"\u00e8\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ec\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00f0\7\4\2\2\u00f0\u00f1"+
		"\5$\23\2\u00f1\u00f2\7\5\2\2\u00f2\33\3\2\2\2\u00f3\u00f8\5&\24\2\u00f4"+
		"\u00f8\5\26\f\2\u00f5\u00f8\5B\"\2\u00f6\u00f8\5\6\4\2\u00f7\u00f3\3\2"+
		"\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8"+
		"\35\3\2\2\2\u00f9\u00fe\3\2\2\2\u00fa\u00fb\5 \21\2\u00fb\u00fc\5\36\20"+
		"\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fa\3\2\2\2\u00fe\37"+
		"\3\2\2\2\u00ff\u0102\5\30\r\2\u0100\u0102\5\"\22\2\u0101\u00ff\3\2\2\2"+
		"\u0101\u0100\3\2\2\2\u0102!\3\2\2\2\u0103\u0104\5\34\17\2\u0104\u0105"+
		"\7\n\2\2\u0105#\3\2\2\2\u0106\u0107\5\36\20\2\u0107%\3\2\2\2\u0108\u0109"+
		"\7*\2\2\u0109\u010c\5\6\4\2\u010a\u010c\7*\2\2\u010b\u0108\3\2\2\2\u010b"+
		"\u010a\3\2\2\2\u010c\'\3\2\2\2\u010d\u010e\7$\2\2\u010e\u010f\7.\2\2\u010f"+
		"\u0110\7.\2\2\u0110\u0111\5*\26\2\u0111\u0112\5.\30\2\u0112)\3\2\2\2\u0113"+
		"\u0114\7\b\2\2\u0114\u0115\5,\27\2\u0115\u0116\7\t\2\2\u0116+\3\2\2\2"+
		"\u0117\u0122\3\2\2\2\u0118\u0119\5H%\2\u0119\u011a\7\13\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\5H"+
		"%\2\u0121\u0117\3\2\2\2\u0121\u011d\3\2\2\2\u0122-\3\2\2\2\u0123\u0124"+
		"\7\4\2\2\u0124\u0125\5$\23\2\u0125\u0126\7\5\2\2\u0126/\3\2\2\2\u0127"+
		"\u012b\5\62\32\2\u0128\u012a\5\64\33\2\u0129\u0128\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u0130\5\66\34\2\u012f\u012e\3\2\2\2\u012f\u0130\3"+
		"\2\2\2\u0130\61\3\2\2\2\u0131\u0132\7&\2\2\u0132\u0133\7\b\2\2\u0133\u0134"+
		"\5\6\4\2\u0134\u0135\7\t\2\2\u0135\u0136\7\4\2\2\u0136\u0137\5$\23\2\u0137"+
		"\u0138\7\5\2\2\u0138\63\3\2\2\2\u0139\u013a\7)\2\2\u013a\u013b\7\b\2\2"+
		"\u013b\u013c\5\6\4\2\u013c\u013d\7\t\2\2\u013d\u013e\7\4\2\2\u013e\u013f"+
		"\5$\23\2\u013f\u0140\7\5\2\2\u0140\65\3\2\2\2\u0141\u0142\7(\2\2\u0142"+
		"\u0143\7\4\2\2\u0143\u0144\5$\23\2\u0144\u0145\7\5\2\2\u0145\67\3\2\2"+
		"\2\u0146\u0147\7,\2\2\u0147\u0148\7\b\2\2\u0148\u0149\5:\36\2\u0149\u014a"+
		"\7\t\2\2\u014a\u014b\7\4\2\2\u014b\u014c\5$\23\2\u014c\u014d\7\5\2\2\u014d"+
		"9\3\2\2\2\u014e\u014f\5<\37\2\u014f\u0150\7\n\2\2\u0150\u0151\5> \2\u0151"+
		"\u0152\7\n\2\2\u0152\u0153\5<\37\2\u0153;\3\2\2\2\u0154\u015f\3\2\2\2"+
		"\u0155\u0156\5\34\17\2\u0156\u0157\7\13\2\2\u0157\u0159\3\2\2\2\u0158"+
		"\u0155\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015f\5\34\17\2\u015e"+
		"\u0154\3\2\2\2\u015e\u015a\3\2\2\2\u015f=\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u0163\5\6\4\2\u0162\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163?\3"+
		"\2\2\2\u0164\u0165\7\'\2\2\u0165\u0166\7\b\2\2\u0166\u0167\5\6\4\2\u0167"+
		"\u0168\7\t\2\2\u0168\u0169\7\4\2\2\u0169\u016a\5$\23\2\u016a\u016b\7\5"+
		"\2\2\u016bA\3\2\2\2\u016c\u0170\5D#\2\u016d\u0170\5F$\2\u016e\u0170\5"+
		"H%\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"C\3\2\2\2\u0171\u0172\5J&\2\u0172\u0173\7\r\2\2\u0173\u0174\5\6\4\2\u0174"+
		"E\3\2\2\2\u0175\u0176\5L\'\2\u0176\u0177\7\r\2\2\u0177\u0178\5\6\4\2\u0178"+
		"G\3\2\2\2\u0179\u017c\5J&\2\u017a\u017c\5L\'\2\u017b\u0179\3\2\2\2\u017b"+
		"\u017a\3\2\2\2\u017cI\3\2\2\2\u017d\u017e\7.\2\2\u017e\u017f\7.\2\2\u017f"+
		"K\3\2\2\2\u0180\u0185\7.\2\2\u0181\u0182\7\6\2\2\u0182\u0184\7\7\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\7.\2\2\u0189"+
		"M\3\2\2\2\u018a\u018b\7.\2\2\u018b\u0195\7\b\2\2\u018c\u018d\5\6\4\2\u018d"+
		"\u018e\7\13\2\2\u018e\u0190\3\2\2\2\u018f\u018c\3\2\2\2\u0190\u0193\3"+
		"\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193"+
		"\u0191\3\2\2\2\u0194\u0196\5\6\4\2\u0195\u0191\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7\t\2\2\u0198O\3\2\2\2\u0199\u019a"+
		"\5B\"\2\u019a\u019b\7\n\2\2\u019b\u019d\3\2\2\2\u019c\u0199\3\2\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fQ\3\2\2\2"+
		"\u01a0\u019e\3\2\2\2\u01a1\u01a2\7%\2\2\u01a2\u01a3\7.\2\2\u01a3\u01a4"+
		"\7\4\2\2\u01a4\u01a5\5P)\2\u01a5\u01a6\7\5\2\2\u01a6S\3\2\2\2\"\\dr~\u0084"+
		"\u008c\u0093\u009a\u00ac\u00c3\u00c5\u00ce\u00df\u00e1\u00ed\u00f7\u00fd"+
		"\u0101\u010b\u011d\u0121\u012b\u012f\u015a\u015e\u0162\u016f\u017b\u0185"+
		"\u0191\u0195\u019e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}