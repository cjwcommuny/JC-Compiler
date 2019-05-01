// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/rules.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TEST_SYMBOL=1, LEFT_CURLY_BRACE=2, RIGHT_CURLY_BRACE=3, LEFT_BRACKET=4, 
		RIGHT_BRACKET=5, LEFT_PARENTHESES=6, RIGHT_PARENTHESES=7, SEMICOLON=8, 
		COMMA=9, DOT=10, ASSIGN_SYMBOL=11, EQUAL_SYMBOL=12, LOGIC_OR=13, LOGIC_AND=14, 
		LOGIC_NOT=15, ADD=16, SUB=17, MUL=18, DIV=19, XOR=20, AND=21, OR=22, NOT=23, 
		DOUBLE_LITERAL=24, INT_LITERAL=25, CHAR_LITERAL=26, STRING_LITERAL=27, 
		BOOL_LITERAL=28, NAMESPACE_SYMBOL=29, FUNCTION_DEFINITION_SYMBOL=30, CLASS_DEFINITION_SYMNOL=31, 
		IF_SYMBOL=32, WHILE_SYMBOL=33, ELSE_SYMBOL=34, ELSE_IF_SYMBOL=35, RETURN_SYMBOL=36, 
		CONTINUE_SYMBOL=37, FOR_SYMBOL=38, BREAK_SYMBOL=39, IDENTIFIER=40, WHITE_SPACE=41, 
		LINE_COMMENT=42, COMMENT=43;
	public static final int
		RULE_arrayInitialization = 0, RULE_simpleArrayInitialization = 1, RULE_rValueList = 2, 
		RULE_rValue = 3, RULE_lValue = 4, RULE_expression = 5, RULE_namespaceDefinition = 6, 
		RULE_program = 7, RULE_code = 8, RULE_codeContent = 9, RULE_arithmeticExpression = 10, 
		RULE_assignment = 11, RULE_block = 12, RULE_pureBlock = 13, RULE_statementWithoutSemicolon = 14, 
		RULE_statementList = 15, RULE_statementOrBlock = 16, RULE_statement = 17, 
		RULE_blockBodyCode = 18, RULE_returnStatement = 19, RULE_functionDefinitionBlock = 20, 
		RULE_functionParameterDefinition = 21, RULE_parameterList = 22, RULE_functionBody = 23, 
		RULE_logicBlock = 24, RULE_ifBlock = 25, RULE_elseIfBlock = 26, RULE_elseBlock = 27, 
		RULE_forBlock = 28, RULE_forCondition = 29, RULE_initOrStepCondition = 30, 
		RULE_terminateCondition = 31, RULE_whileBlock = 32, RULE_variableDefinition = 33, 
		RULE_ordinaryVariableDefinition = 34, RULE_ordinaryArrayDefinition = 35, 
		RULE_variableDeclaration = 36, RULE_simpleVariableDeclaration = 37, RULE_arrayDeclaration = 38, 
		RULE_functionCall = 39, RULE_structFieldStatementList = 40, RULE_structDefinition = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"arrayInitialization", "simpleArrayInitialization", "rValueList", "rValue", 
			"lValue", "expression", "namespaceDefinition", "program", "code", "codeContent", 
			"arithmeticExpression", "assignment", "block", "pureBlock", "statementWithoutSemicolon", 
			"statementList", "statementOrBlock", "statement", "blockBodyCode", "returnStatement", 
			"functionDefinitionBlock", "functionParameterDefinition", "parameterList", 
			"functionBody", "logicBlock", "ifBlock", "elseIfBlock", "elseBlock", 
			"forBlock", "forCondition", "initOrStepCondition", "terminateCondition", 
			"whileBlock", "variableDefinition", "ordinaryVariableDefinition", "ordinaryArrayDefinition", 
			"variableDeclaration", "simpleVariableDeclaration", "arrayDeclaration", 
			"functionCall", "structFieldStatementList", "structDefinition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
			"'.'", "'='", "'=='", "'||'", "'&&'", "'!'", "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'&'", "'|'", "'~'", null, null, null, null, null, "'namespace'", 
			"'def'", "'struct'", "'if'", "'while'", "'else'", "'elif'", "'return'", 
			"'continue'", "'for'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", 
			"COMMA", "DOT", "ASSIGN_SYMBOL", "EQUAL_SYMBOL", "LOGIC_OR", "LOGIC_AND", 
			"LOGIC_NOT", "ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "DOUBLE_LITERAL", 
			"INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
			"FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", "IF_SYMBOL", 
			"WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
			"FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", "LINE_COMMENT", 
			"COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public TerminalNode COMMA() { return getToken(rulesParser.COMMA, 0); }
		public ArrayInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterArrayInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitArrayInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitArrayInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializationContext arrayInitialization() throws RecognitionException {
		ArrayInitializationContext _localctx = new ArrayInitializationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arrayInitialization);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				simpleArrayInitialization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(LEFT_CURLY_BRACE);
				{
				setState(86);
				simpleArrayInitialization();
				setState(87);
				match(COMMA);
				}
				setState(89);
				simpleArrayInitialization();
				setState(90);
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
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public RValueListContext rValueList() {
			return getRuleContext(RValueListContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public SimpleArrayInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleArrayInitialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterSimpleArrayInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitSimpleArrayInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitSimpleArrayInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleArrayInitializationContext simpleArrayInitialization() throws RecognitionException {
		SimpleArrayInitializationContext _localctx = new SimpleArrayInitializationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_simpleArrayInitialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LEFT_CURLY_BRACE);
			setState(95);
			rValueList();
			setState(96);
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

	public static class RValueListContext extends ParserRuleContext {
		public List<RValueContext> rValue() {
			return getRuleContexts(RValueContext.class);
		}
		public RValueContext rValue(int i) {
			return getRuleContext(RValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(rulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(rulesParser.COMMA, i);
		}
		public RValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterRValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitRValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitRValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RValueListContext rValueList() throws RecognitionException {
		RValueListContext _localctx = new RValueListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					rValue();
					setState(99);
					match(COMMA);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterRValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitRValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitRValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RValueContext rValue() throws RecognitionException {
		RValueContext _localctx = new RValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rValue);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(DOUBLE_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(BOOL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(114);
				arrayInitialization();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
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
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public LValueContext lValue() {
			return getRuleContext(LValueContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(rulesParser.LEFT_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(rulesParser.RIGHT_BRACKET, 0); }
		public LValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitLValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValueContext lValue() throws RecognitionException {
		return lValue(0);
	}

	private LValueContext lValue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LValueContext _localctx = new LValueContext(_ctx, _parentState);
		LValueContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_lValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lValue);
					setState(121);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(122);
					match(LEFT_BRACKET);
					setState(123);
					expression();
					setState(124);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(130);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				arithmeticExpression(0);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public NamespaceDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaceDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterNamespaceDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitNamespaceDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitNamespaceDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceDefinitionContext namespaceDefinition() throws RecognitionException {
		NamespaceDefinitionContext _localctx = new NamespaceDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_namespaceDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(NAMESPACE_SYMBOL);
			setState(136);
			match(IDENTIFIER);
			setState(137);
			match(LEFT_CURLY_BRACE);
			setState(138);
			code();
			setState(139);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_program);
		int _la;
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case FUNCTION_DEFINITION_SYMBOL:
			case CLASS_DEFINITION_SYMNOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				code();
				}
				break;
			case NAMESPACE_SYMBOL:
				enterOuterAlt(_localctx, 2);
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

	public static class CodeContext extends ParserRuleContext {
		public List<CodeContentContext> codeContent() {
			return getRuleContexts(CodeContentContext.class);
		}
		public CodeContentContext codeContent(int i) {
			return getRuleContext(CodeContentContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_code);
		int _la;
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case RIGHT_CURLY_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case FUNCTION_DEFINITION_SYMBOL:
			case CLASS_DEFINITION_SYMNOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					codeContent();
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION_DEFINITION_SYMBOL) | (1L << CLASS_DEFINITION_SYMNOL) | (1L << IDENTIFIER))) != 0) );
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

	public static class CodeContentContext extends ParserRuleContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(rulesParser.SEMICOLON, 0); }
		public FunctionDefinitionBlockContext functionDefinitionBlock() {
			return getRuleContext(FunctionDefinitionBlockContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public CodeContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterCodeContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitCodeContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitCodeContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContentContext codeContent() throws RecognitionException {
		CodeContentContext _localctx = new CodeContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codeContent);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				variableDefinition();
				setState(158);
				match(SEMICOLON);
				}
				break;
			case FUNCTION_DEFINITION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				functionDefinitionBlock();
				}
				break;
			case CLASS_DEFINITION_SYMNOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(165);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(166);
				match(INT_LITERAL);
				}
				break;
			case 3:
				{
				setState(167);
				match(DOUBLE_LITERAL);
				}
				break;
			case 4:
				{
				setState(168);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				{
				setState(169);
				match(CHAR_LITERAL);
				}
				break;
			case 6:
				{
				setState(170);
				match(BOOL_LITERAL);
				}
				break;
			case 7:
				{
				setState(171);
				functionCall();
				}
				break;
			case 8:
				{
				setState(172);
				match(SUB);
				setState(173);
				arithmeticExpression(6);
				}
				break;
			case 9:
				{
				setState(174);
				match(NOT);
				setState(175);
				arithmeticExpression(2);
				}
				break;
			case 10:
				{
				setState(176);
				match(LEFT_PARENTHESES);
				setState(177);
				arithmeticExpression(0);
				setState(178);
				match(RIGHT_PARENTHESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(203);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(182);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(183);
						match(ADD);
						setState(184);
						arithmeticExpression(11);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(185);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(186);
						match(SUB);
						setState(187);
						arithmeticExpression(10);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(188);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(189);
						match(MUL);
						setState(190);
						arithmeticExpression(9);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(191);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(192);
						match(DIV);
						setState(193);
						arithmeticExpression(8);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(194);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(195);
						match(XOR);
						setState(196);
						arithmeticExpression(6);
						}
						break;
					case 6:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(197);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(198);
						match(OR);
						setState(199);
						arithmeticExpression(5);
						}
						break;
					case 7:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(200);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(201);
						match(AND);
						setState(202);
						arithmeticExpression(4);
						}
						break;
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			lValue(0);
			setState(209);
			match(ASSIGN_SYMBOL);
			setState(210);
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_block);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				forBlock();
				}
				break;
			case WHILE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				whileBlock();
				}
				break;
			case IF_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				logicBlock();
				}
				break;
			case LEFT_CURLY_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				pureBlock();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterPureBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitPureBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitPureBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PureBlockContext pureBlock() throws RecognitionException {
		PureBlockContext _localctx = new PureBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pureBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(LEFT_CURLY_BRACE);
			setState(219);
			blockBodyCode();
			setState(220);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStatementWithoutSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStatementWithoutSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStatementWithoutSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutSemicolonContext statementWithoutSemicolon() throws RecognitionException {
		StatementWithoutSemicolonContext _localctx = new StatementWithoutSemicolonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementWithoutSemicolon);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				variableDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementList);
		try {
			setState(232);
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
			case IF_SYMBOL:
			case WHILE_SYMBOL:
			case RETURN_SYMBOL:
			case FOR_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				statementOrBlock();
				setState(230);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStatementOrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStatementOrBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStatementOrBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementOrBlockContext statementOrBlock() throws RecognitionException {
		StatementOrBlockContext _localctx = new StatementOrBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementOrBlock);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			statementWithoutSemicolon();
			setState(239);
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
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public BlockBodyCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockBodyCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterBlockBodyCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitBlockBodyCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitBlockBodyCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockBodyCodeContext blockBodyCode() throws RecognitionException {
		BlockBodyCodeContext _localctx = new BlockBodyCodeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockBodyCode);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_CURLY_BRACE:
			case RIGHT_CURLY_BRACE:
			case LEFT_PARENTHESES:
			case SUB:
			case NOT:
			case DOUBLE_LITERAL:
			case INT_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case IF_SYMBOL:
			case WHILE_SYMBOL:
			case RETURN_SYMBOL:
			case FOR_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				statementList();
				}
				break;
			case CLASS_DEFINITION_SYMNOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN_SYMBOL() { return getToken(rulesParser.RETURN_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_returnStatement);
		try {
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(RETURN_SYMBOL);
				setState(246);
				rValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterFunctionDefinitionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitFunctionDefinitionBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitFunctionDefinitionBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionBlockContext functionDefinitionBlock() throws RecognitionException {
		FunctionDefinitionBlockContext _localctx = new FunctionDefinitionBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDefinitionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(FUNCTION_DEFINITION_SYMBOL);
			setState(251);
			match(IDENTIFIER);
			setState(252);
			match(IDENTIFIER);
			setState(253);
			functionParameterDefinition();
			setState(254);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterFunctionParameterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitFunctionParameterDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitFunctionParameterDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionParameterDefinitionContext functionParameterDefinition() throws RecognitionException {
		FunctionParameterDefinitionContext _localctx = new FunctionParameterDefinitionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functionParameterDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(LEFT_PARENTHESES);
			setState(257);
			parameterList();
			setState(258);
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
		public List<TerminalNode> COMMA() { return getTokens(rulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(rulesParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterList);
		try {
			int _alt;
			setState(270);
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
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(261);
						variableDeclaration();
						setState(262);
						match(COMMA);
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(269);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LEFT_CURLY_BRACE);
			setState(273);
			blockBodyCode();
			setState(274);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLogicBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLogicBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitLogicBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicBlockContext logicBlock() throws RecognitionException {
		LogicBlockContext _localctx = new LogicBlockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			ifBlock();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_SYMBOL) {
				{
				{
				setState(277);
				elseIfBlock();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_SYMBOL) {
				{
				setState(283);
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
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(IF_SYMBOL);
			setState(287);
			match(LEFT_PARENTHESES);
			setState(288);
			rValue();
			setState(289);
			match(RIGHT_PARENTHESES);
			setState(290);
			match(LEFT_CURLY_BRACE);
			setState(291);
			blockBodyCode();
			setState(292);
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
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public ElseIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterElseIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitElseIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitElseIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfBlockContext elseIfBlock() throws RecognitionException {
		ElseIfBlockContext _localctx = new ElseIfBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ELSE_IF_SYMBOL);
			setState(295);
			match(LEFT_PARENTHESES);
			setState(296);
			rValue();
			setState(297);
			match(RIGHT_PARENTHESES);
			setState(298);
			match(LEFT_CURLY_BRACE);
			setState(299);
			blockBodyCode();
			setState(300);
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
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(ELSE_SYMBOL);
			setState(303);
			match(LEFT_CURLY_BRACE);
			setState(304);
			blockBodyCode();
			setState(305);
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
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(FOR_SYMBOL);
			setState(308);
			match(LEFT_PARENTHESES);
			setState(309);
			forCondition();
			setState(310);
			match(RIGHT_PARENTHESES);
			setState(311);
			match(LEFT_CURLY_BRACE);
			setState(312);
			blockBodyCode();
			setState(313);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(rulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(rulesParser.SEMICOLON, i);
		}
		public TerminateConditionContext terminateCondition() {
			return getRuleContext(TerminateConditionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			initOrStepCondition();
			setState(316);
			match(SEMICOLON);
			setState(317);
			terminateCondition();
			setState(318);
			match(SEMICOLON);
			setState(319);
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
		public List<TerminalNode> COMMA() { return getTokens(rulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(rulesParser.COMMA, i);
		}
		public InitOrStepConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initOrStepCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterInitOrStepCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitInitOrStepCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitInitOrStepCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitOrStepConditionContext initOrStepCondition() throws RecognitionException {
		InitOrStepConditionContext _localctx = new InitOrStepConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initOrStepCondition);
		try {
			int _alt;
			setState(331);
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
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						statementWithoutSemicolon();
						setState(323);
						match(COMMA);
						}
						} 
					}
					setState(329);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(330);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterTerminateCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitTerminateCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitTerminateCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminateConditionContext terminateCondition() throws RecognitionException {
		TerminateConditionContext _localctx = new TerminateConditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_terminateCondition);
		try {
			setState(335);
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
				setState(334);
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
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public BlockBodyCodeContext blockBodyCode() {
			return getRuleContext(BlockBodyCodeContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public WhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBlockContext whileBlock() throws RecognitionException {
		WhileBlockContext _localctx = new WhileBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(WHILE_SYMBOL);
			setState(338);
			match(LEFT_PARENTHESES);
			setState(339);
			rValue();
			setState(340);
			match(RIGHT_PARENTHESES);
			setState(341);
			match(LEFT_CURLY_BRACE);
			setState(342);
			blockBodyCode();
			setState(343);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDefinition);
		try {
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				ordinaryVariableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				ordinaryArrayDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterOrdinaryVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitOrdinaryVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitOrdinaryVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryVariableDefinitionContext ordinaryVariableDefinition() throws RecognitionException {
		OrdinaryVariableDefinitionContext _localctx = new OrdinaryVariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ordinaryVariableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			simpleVariableDeclaration();
			setState(351);
			match(ASSIGN_SYMBOL);
			setState(352);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterOrdinaryArrayDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitOrdinaryArrayDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitOrdinaryArrayDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryArrayDefinitionContext ordinaryArrayDefinition() throws RecognitionException {
		OrdinaryArrayDefinitionContext _localctx = new OrdinaryArrayDefinitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ordinaryArrayDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			arrayDeclaration();
			setState(355);
			match(ASSIGN_SYMBOL);
			setState(356);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaration);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				simpleVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterSimpleVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitSimpleVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitSimpleVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleVariableDeclarationContext simpleVariableDeclaration() throws RecognitionException {
		SimpleVariableDeclarationContext _localctx = new SimpleVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_simpleVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(IDENTIFIER);
			setState(363);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(IDENTIFIER);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(366);
				match(LEFT_BRACKET);
				setState(367);
				match(RIGHT_BRACKET);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
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
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public RValueListContext rValueList() {
			return getRuleContext(RValueListContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(IDENTIFIER);
			setState(376);
			match(LEFT_PARENTHESES);
			setState(377);
			rValueList();
			setState(378);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(rulesParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(rulesParser.SEMICOLON, i);
		}
		public StructFieldStatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFieldStatementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStructFieldStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStructFieldStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStructFieldStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFieldStatementListContext structFieldStatementList() throws RecognitionException {
		StructFieldStatementListContext _localctx = new StructFieldStatementListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structFieldStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(380);
				variableDefinition();
				setState(381);
				match(SEMICOLON);
				}
				}
				setState(387);
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
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public StructFieldStatementListContext structFieldStatementList() {
			return getRuleContext(StructFieldStatementListContext.class,0);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStructDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(CLASS_DEFINITION_SYMNOL);
			setState(389);
			match(IDENTIFIER);
			setState(390);
			match(LEFT_CURLY_BRACE);
			setState(391);
			structFieldStatementList();
			setState(392);
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
		case 4:
			return lValue_sempred((LValueContext)_localctx, predIndex);
		case 10:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2_\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7"+
		"\4h\n\4\f\4\16\4k\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5w\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084\13\6\3"+
		"\7\3\7\5\7\u0088\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\6\t\u0092\n\t\r\t"+
		"\16\t\u0093\5\t\u0096\n\t\3\n\3\n\6\n\u009a\n\n\r\n\16\n\u009b\5\n\u009e"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b7\n\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00ce\n\f\f\f\16\f\u00d1\13\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5"+
		"\16\u00db\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00e5\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00eb\n\21\3\22\3\22\5\22\u00ef\n\22\3\23\3"+
		"\23\3\23\3\24\3\24\5\24\u00f6\n\24\3\25\3\25\3\25\5\25\u00fb\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30"+
		"\u010b\n\30\f\30\16\30\u010e\13\30\3\30\5\30\u0111\n\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\7\32\u0119\n\32\f\32\16\32\u011c\13\32\3\32\5\32\u011f"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u0148\n \f \16"+
		" \u014b\13 \3 \5 \u014e\n \3!\3!\5!\u0152\n!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3#\3#\3#\5#\u015f\n#\3$\3$\3$\3$\3%\3%\3%\3%\3&\3&\5&\u016b\n&"+
		"\3\'\3\'\3\'\3(\3(\3(\7(\u0173\n(\f(\16(\u0176\13(\3(\3(\3)\3)\3)\3)\3"+
		")\3*\3*\3*\7*\u0182\n*\f*\16*\u0185\13*\3+\3+\3+\3+\3+\3+\3+\2\4\n\26"+
		",\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRT\2\2\2\u0199\2^\3\2\2\2\4`\3\2\2\2\6i\3\2\2\2\bv\3\2\2\2\nx\3\2"+
		"\2\2\f\u0087\3\2\2\2\16\u0089\3\2\2\2\20\u0095\3\2\2\2\22\u009d\3\2\2"+
		"\2\24\u00a4\3\2\2\2\26\u00b6\3\2\2\2\30\u00d2\3\2\2\2\32\u00da\3\2\2\2"+
		"\34\u00dc\3\2\2\2\36\u00e4\3\2\2\2 \u00ea\3\2\2\2\"\u00ee\3\2\2\2$\u00f0"+
		"\3\2\2\2&\u00f5\3\2\2\2(\u00fa\3\2\2\2*\u00fc\3\2\2\2,\u0102\3\2\2\2."+
		"\u0110\3\2\2\2\60\u0112\3\2\2\2\62\u0116\3\2\2\2\64\u0120\3\2\2\2\66\u0128"+
		"\3\2\2\28\u0130\3\2\2\2:\u0135\3\2\2\2<\u013d\3\2\2\2>\u014d\3\2\2\2@"+
		"\u0151\3\2\2\2B\u0153\3\2\2\2D\u015e\3\2\2\2F\u0160\3\2\2\2H\u0164\3\2"+
		"\2\2J\u016a\3\2\2\2L\u016c\3\2\2\2N\u016f\3\2\2\2P\u0179\3\2\2\2R\u0183"+
		"\3\2\2\2T\u0186\3\2\2\2V_\5\4\3\2WX\7\4\2\2XY\5\4\3\2YZ\7\13\2\2Z[\3\2"+
		"\2\2[\\\5\4\3\2\\]\7\5\2\2]_\3\2\2\2^V\3\2\2\2^W\3\2\2\2_\3\3\2\2\2`a"+
		"\7\4\2\2ab\5\6\4\2bc\7\5\2\2c\5\3\2\2\2de\5\b\5\2ef\7\13\2\2fh\3\2\2\2"+
		"gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\5\b\5\2"+
		"m\7\3\2\2\2nw\7\33\2\2ow\7\32\2\2pw\7\34\2\2qw\7\35\2\2rw\7\36\2\2sw\5"+
		"\f\7\2tw\5\2\2\2uw\5P)\2vn\3\2\2\2vo\3\2\2\2vp\3\2\2\2vq\3\2\2\2vr\3\2"+
		"\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\t\3\2\2\2xy\b\6\1\2yz\7*\2\2z\u0082"+
		"\3\2\2\2{|\f\3\2\2|}\7\6\2\2}~\5\f\7\2~\177\7\7\2\2\177\u0081\3\2\2\2"+
		"\u0080{\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\13\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\7*\2\2\u0086\u0088"+
		"\5\26\f\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\r\3\2\2\2\u0089"+
		"\u008a\7\37\2\2\u008a\u008b\7*\2\2\u008b\u008c\7\4\2\2\u008c\u008d\5\22"+
		"\n\2\u008d\u008e\7\5\2\2\u008e\17\3\2\2\2\u008f\u0096\5\22\n\2\u0090\u0092"+
		"\5\16\b\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0091"+
		"\3\2\2\2\u0096\21\3\2\2\2\u0097\u009e\3\2\2\2\u0098\u009a\5\24\13\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0099\3\2\2\2\u009e"+
		"\23\3\2\2\2\u009f\u00a0\5D#\2\u00a0\u00a1\7\n\2\2\u00a1\u00a5\3\2\2\2"+
		"\u00a2\u00a5\5*\26\2\u00a3\u00a5\5T+\2\u00a4\u009f\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00a7\b\f\1\2\u00a7"+
		"\u00b7\7*\2\2\u00a8\u00b7\7\33\2\2\u00a9\u00b7\7\32\2\2\u00aa\u00b7\7"+
		"\35\2\2\u00ab\u00b7\7\34\2\2\u00ac\u00b7\7\36\2\2\u00ad\u00b7\5P)\2\u00ae"+
		"\u00af\7\23\2\2\u00af\u00b7\5\26\f\b\u00b0\u00b1\7\31\2\2\u00b1\u00b7"+
		"\5\26\f\4\u00b2\u00b3\7\b\2\2\u00b3\u00b4\5\26\f\2\u00b4\u00b5\7\t\2\2"+
		"\u00b5\u00b7\3\2\2\2\u00b6\u00a6\3\2\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00a9"+
		"\3\2\2\2\u00b6\u00aa\3\2\2\2\u00b6\u00ab\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6"+
		"\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b2\3\2"+
		"\2\2\u00b7\u00cf\3\2\2\2\u00b8\u00b9\f\f\2\2\u00b9\u00ba\7\22\2\2\u00ba"+
		"\u00ce\5\26\f\r\u00bb\u00bc\f\13\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00ce"+
		"\5\26\f\f\u00be\u00bf\f\n\2\2\u00bf\u00c0\7\24\2\2\u00c0\u00ce\5\26\f"+
		"\13\u00c1\u00c2\f\t\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00ce\5\26\f\n\u00c4"+
		"\u00c5\f\7\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00ce\5\26\f\b\u00c7\u00c8\f"+
		"\6\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00ce\5\26\f\7\u00ca\u00cb\f\5\2\2\u00cb"+
		"\u00cc\7\27\2\2\u00cc\u00ce\5\26\f\6\u00cd\u00b8\3\2\2\2\u00cd\u00bb\3"+
		"\2\2\2\u00cd\u00be\3\2\2\2\u00cd\u00c1\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd"+
		"\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\27\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3"+
		"\5\n\6\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\5\b\5\2\u00d5\31\3\2\2\2\u00d6"+
		"\u00db\5:\36\2\u00d7\u00db\5B\"\2\u00d8\u00db\5\62\32\2\u00d9\u00db\5"+
		"\34\17\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\33\3\2\2\2\u00dc\u00dd\7\4\2\2\u00dd\u00de\5&\24"+
		"\2\u00de\u00df\7\5\2\2\u00df\35\3\2\2\2\u00e0\u00e5\5(\25\2\u00e1\u00e5"+
		"\5\30\r\2\u00e2\u00e5\5D#\2\u00e3\u00e5\5\b\5\2\u00e4\u00e0\3\2\2\2\u00e4"+
		"\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\37\3\2\2"+
		"\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\5\"\22\2\u00e8\u00e9\5 \21\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb!\3\2\2\2"+
		"\u00ec\u00ef\5\32\16\2\u00ed\u00ef\5$\23\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef#\3\2\2\2\u00f0\u00f1\5\36\20\2\u00f1\u00f2\7\n\2\2\u00f2"+
		"%\3\2\2\2\u00f3\u00f6\5 \21\2\u00f4\u00f6\5T+\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\'\3\2\2\2\u00f7\u00f8\7&\2\2\u00f8\u00fb\5\b\5\2"+
		"\u00f9\u00fb\7&\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb)\3\2"+
		"\2\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\7*\2\2\u00fe\u00ff\7*\2\2\u00ff\u0100"+
		"\5,\27\2\u0100\u0101\5\60\31\2\u0101+\3\2\2\2\u0102\u0103\7\b\2\2\u0103"+
		"\u0104\5.\30\2\u0104\u0105\7\t\2\2\u0105-\3\2\2\2\u0106\u0111\3\2\2\2"+
		"\u0107\u0108\5J&\2\u0108\u0109\7\13\2\2\u0109\u010b\3\2\2\2\u010a\u0107"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\5J&\2\u0110\u0106\3\2\2"+
		"\2\u0110\u010c\3\2\2\2\u0111/\3\2\2\2\u0112\u0113\7\4\2\2\u0113\u0114"+
		"\5&\24\2\u0114\u0115\7\5\2\2\u0115\61\3\2\2\2\u0116\u011a\5\64\33\2\u0117"+
		"\u0119\5\66\34\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3"+
		"\2\2\2\u011a\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d"+
		"\u011f\58\35\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\63\3\2\2"+
		"\2\u0120\u0121\7\"\2\2\u0121\u0122\7\b\2\2\u0122\u0123\5\b\5\2\u0123\u0124"+
		"\7\t\2\2\u0124\u0125\7\4\2\2\u0125\u0126\5&\24\2\u0126\u0127\7\5\2\2\u0127"+
		"\65\3\2\2\2\u0128\u0129\7%\2\2\u0129\u012a\7\b\2\2\u012a\u012b\5\b\5\2"+
		"\u012b\u012c\7\t\2\2\u012c\u012d\7\4\2\2\u012d\u012e\5&\24\2\u012e\u012f"+
		"\7\5\2\2\u012f\67\3\2\2\2\u0130\u0131\7$\2\2\u0131\u0132\7\4\2\2\u0132"+
		"\u0133\5&\24\2\u0133\u0134\7\5\2\2\u01349\3\2\2\2\u0135\u0136\7(\2\2\u0136"+
		"\u0137\7\b\2\2\u0137\u0138\5<\37\2\u0138\u0139\7\t\2\2\u0139\u013a\7\4"+
		"\2\2\u013a\u013b\5&\24\2\u013b\u013c\7\5\2\2\u013c;\3\2\2\2\u013d\u013e"+
		"\5> \2\u013e\u013f\7\n\2\2\u013f\u0140\5@!\2\u0140\u0141\7\n\2\2\u0141"+
		"\u0142\5> \2\u0142=\3\2\2\2\u0143\u014e\3\2\2\2\u0144\u0145\5\36\20\2"+
		"\u0145\u0146\7\13\2\2\u0146\u0148\3\2\2\2\u0147\u0144\3\2\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014e\5\36\20\2\u014d\u0143\3\2\2\2\u014d\u0149\3"+
		"\2\2\2\u014e?\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u0152\5\b\5\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0150\3\2\2\2\u0152A\3\2\2\2\u0153\u0154\7#\2\2\u0154\u0155"+
		"\7\b\2\2\u0155\u0156\5\b\5\2\u0156\u0157\7\t\2\2\u0157\u0158\7\4\2\2\u0158"+
		"\u0159\5&\24\2\u0159\u015a\7\5\2\2\u015aC\3\2\2\2\u015b\u015f\5F$\2\u015c"+
		"\u015f\5H%\2\u015d\u015f\5J&\2\u015e\u015b\3\2\2\2\u015e\u015c\3\2\2\2"+
		"\u015e\u015d\3\2\2\2\u015fE\3\2\2\2\u0160\u0161\5L\'\2\u0161\u0162\7\r"+
		"\2\2\u0162\u0163\5\b\5\2\u0163G\3\2\2\2\u0164\u0165\5N(\2\u0165\u0166"+
		"\7\r\2\2\u0166\u0167\5\b\5\2\u0167I\3\2\2\2\u0168\u016b\5L\'\2\u0169\u016b"+
		"\5N(\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2\2\2\u016bK\3\2\2\2\u016c\u016d"+
		"\7*\2\2\u016d\u016e\7*\2\2\u016eM\3\2\2\2\u016f\u0174\7*\2\2\u0170\u0171"+
		"\7\6\2\2\u0171\u0173\7\7\2\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0178\7*\2\2\u0178O\3\2\2\2\u0179\u017a\7*\2\2\u017a\u017b"+
		"\7\b\2\2\u017b\u017c\5\6\4\2\u017c\u017d\7\t\2\2\u017dQ\3\2\2\2\u017e"+
		"\u017f\5D#\2\u017f\u0180\7\n\2\2\u0180\u0182\3\2\2\2\u0181\u017e\3\2\2"+
		"\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184S"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7!\2\2\u0187\u0188\7*\2\2\u0188"+
		"\u0189\7\4\2\2\u0189\u018a\5R*\2\u018a\u018b\7\5\2\2\u018bU\3\2\2\2 ^"+
		"iv\u0082\u0087\u0093\u0095\u009b\u009d\u00a4\u00b6\u00cd\u00cf\u00da\u00e4"+
		"\u00ea\u00ee\u00f5\u00fa\u010c\u0110\u011a\u011e\u0149\u014d\u0151\u015e"+
		"\u016a\u0174\u0183";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}