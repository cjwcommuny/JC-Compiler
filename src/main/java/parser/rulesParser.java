// Generated from rules.g4 by ANTLR 4.7.2

package parser;

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
		COMMA=9, DOT=10, ASSIGN_SYMBOL=11, LOGIC_OR=12, LOGIC_AND=13, LOGIC_NOT=14, 
		ADD=15, SUB=16, MUL=17, DIV=18, XOR=19, AND=20, OR=21, NOT=22, LESS_THAN=23, 
		LESS_OR_EQUAL_THAN=24, GREATER_THAN=25, GREATER_OR_EQUAL_THAN=26, EQUAL_SYMBOL=27, 
		INT_LITERAL=28, DOUBLE_LITERAL=29, CHAR_LITERAL=30, STRING_LITERAL=31, 
		BOOL_LITERAL=32, NAMESPACE_SYMBOL=33, FUNCTION_DEFINITION_SYMBOL=34, CLASS_DEFINITION_SYMNOL=35, 
		IF_SYMBOL=36, WHILE_SYMBOL=37, ELSE_SYMBOL=38, ELSE_IF_SYMBOL=39, RETURN_SYMBOL=40, 
		CONTINUE_SYMBOL=41, FOR_SYMBOL=42, BREAK_SYMBOL=43, IDENTIFIER=44, WHITE_SPACE=45, 
		LINE_COMMENT=46, COMMENT=47;
	public static final int
		RULE_arrayInitialization = 0, RULE_literal = 1, RULE_rValue = 2, RULE_lValue = 3, 
		RULE_namespaceDefinition = 4, RULE_program = 5, RULE_codeContent = 6, 
		RULE_expression = 7, RULE_assignment = 8, RULE_block = 9, RULE_pureBlock = 10, 
		RULE_statementWithoutSemicolon = 11, RULE_statementList = 12, RULE_statementOrBlock = 13, 
		RULE_statement = 14, RULE_blockBodyCode = 15, RULE_returnStatement = 16, 
		RULE_functionDefinitionBlock = 17, RULE_functionParameterDefinition = 18, 
		RULE_parameterList = 19, RULE_functionBody = 20, RULE_logicBlock = 21, 
		RULE_ifBlock = 22, RULE_elseIfBlock = 23, RULE_elseBlock = 24, RULE_forBlock = 25, 
		RULE_initOrStepCondition = 26, RULE_terminateCondition = 27, RULE_whileBlock = 28, 
		RULE_variableDefinition = 29, RULE_ordinaryVariableDefinition = 30, RULE_ordinaryArrayDefinition = 31, 
		RULE_variableDeclaration = 32, RULE_arrayDeclaration = 33, RULE_functionCall = 34, 
		RULE_structFieldStatementList = 35, RULE_structDefinition = 36, RULE_identifierReference = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"arrayInitialization", "literal", "rValue", "lValue", "namespaceDefinition", 
			"program", "codeContent", "expression", "assignment", "block", "pureBlock", 
			"statementWithoutSemicolon", "statementList", "statementOrBlock", "statement", 
			"blockBodyCode", "returnStatement", "functionDefinitionBlock", "functionParameterDefinition", 
			"parameterList", "functionBody", "logicBlock", "ifBlock", "elseIfBlock", 
			"elseBlock", "forBlock", "initOrStepCondition", "terminateCondition", 
			"whileBlock", "variableDefinition", "ordinaryVariableDefinition", "ordinaryArrayDefinition", 
			"variableDeclaration", "arrayDeclaration", "functionCall", "structFieldStatementList", 
			"structDefinition", "identifierReference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
			"'.'", "'='", "'||'", "'&&'", "'!'", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'&'", "'|'", "'~'", "'<'", "'<='", "'>'", "'>='", "'=='", null, null, 
			null, null, null, "'namespace'", "'def'", "'struct'", "'if'", "'while'", 
			"'else'", "'elif'", "'return'", "'continue'", "'for'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", 
			"COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", 
			"ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "LESS_THAN", "LESS_OR_EQUAL_THAN", 
			"GREATER_THAN", "GREATER_OR_EQUAL_THAN", "EQUAL_SYMBOL", "INT_LITERAL", 
			"DOUBLE_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
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


	    //added component of generated class

	public rulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ArrayInitializationContext extends ParserRuleContext {
		public ArrayInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitialization; }
	 
		public ArrayInitializationContext() { }
		public void copyFrom(ArrayInitializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompoundArrayInitializationContext extends ArrayInitializationContext {
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public List<ArrayInitializationContext> arrayInitialization() {
			return getRuleContexts(ArrayInitializationContext.class);
		}
		public ArrayInitializationContext arrayInitialization(int i) {
			return getRuleContext(ArrayInitializationContext.class,i);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(rulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(rulesParser.COMMA, i);
		}
		public CompoundArrayInitializationContext(ArrayInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterCompoundArrayInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitCompoundArrayInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitCompoundArrayInitialization(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleArrayInitializationContext extends ArrayInitializationContext {
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public List<RValueContext> rValue() {
			return getRuleContexts(RValueContext.class);
		}
		public RValueContext rValue(int i) {
			return getRuleContext(RValueContext.class,i);
		}
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(rulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(rulesParser.COMMA, i);
		}
		public SimpleArrayInitializationContext(ArrayInitializationContext ctx) { copyFrom(ctx); }
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

	public final ArrayInitializationContext arrayInitialization() throws RecognitionException {
		ArrayInitializationContext _localctx = new ArrayInitializationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arrayInitialization);
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SimpleArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(LEFT_CURLY_BRACE);
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						rValue();
						setState(78);
						match(COMMA);
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(85);
				rValue();
				setState(86);
				match(RIGHT_CURLY_BRACE);
				}
				break;
			case 2:
				_localctx = new CompoundArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(LEFT_CURLY_BRACE);
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(89);
						arrayInitialization();
						setState(90);
						match(COMMA);
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(97);
				arrayInitialization();
				setState(98);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(rulesParser.INT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(rulesParser.DOUBLE_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(rulesParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(rulesParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(rulesParser.BOOL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializationContext arrayInitialization() {
			return getRuleContext(ArrayInitializationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
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
		enterRule(_localctx, 4, RULE_rValue);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				arrayInitialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				identifierReference();
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
	public static class ReferenceContext extends LValueContext {
		public IdentifierReferenceContext identifierReference() {
			return getRuleContext(IdentifierReferenceContext.class,0);
		}
		public ReferenceContext(LValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLValueArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLValueArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitLValueArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LValueIdentifierContext extends LValueContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public LValueIdentifierContext(LValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLValueIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLValueIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitLValueIdentifier(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_lValue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new LValueIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(111);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new ReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				identifierReference();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LValueArrayIndexContext(new LValueContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lValue);
					setState(115);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(116);
					match(LEFT_BRACKET);
					setState(117);
					expression(0);
					setState(118);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 8, RULE_namespaceDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(NAMESPACE_SYMBOL);
			setState(126);
			match(IDENTIFIER);
			setState(127);
			match(LEFT_CURLY_BRACE);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				codeContent();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION_DEFINITION_SYMBOL) | (1L << CLASS_DEFINITION_SYMNOL) | (1L << IDENTIFIER))) != 0) );
			setState(133);
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
		enterRule(_localctx, 10, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				namespaceDefinition();
				}
				}
				setState(138); 
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
		enterRule(_localctx, 12, RULE_codeContent);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				variableDefinition();
				setState(141);
				match(SEMICOLON);
				}
				break;
			case FUNCTION_DEFINITION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				functionDefinitionBlock();
				}
				break;
			case CLASS_DEFINITION_SYMNOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentifierContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public IdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallLabelContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterFunctionCallLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitFunctionCallLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitFunctionCallLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralLabelContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixExpressionContext extends ExpressionContext {
		public TerminalNode LEFT_PARENTHESES() { return getToken(rulesParser.LEFT_PARENTHESES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
		public TerminalNode ADD() { return getToken(rulesParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(rulesParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(rulesParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(rulesParser.DIV, 0); }
		public TerminalNode XOR() { return getToken(rulesParser.XOR, 0); }
		public TerminalNode OR() { return getToken(rulesParser.OR, 0); }
		public TerminalNode AND() { return getToken(rulesParser.AND, 0); }
		public TerminalNode LESS_THAN() { return getToken(rulesParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(rulesParser.GREATER_THAN, 0); }
		public TerminalNode LESS_OR_EQUAL_THAN() { return getToken(rulesParser.LESS_OR_EQUAL_THAN, 0); }
		public TerminalNode GREATER_OR_EQUAL_THAN() { return getToken(rulesParser.GREATER_OR_EQUAL_THAN, 0); }
		public TerminalNode EQUAL_SYMBOL() { return getToken(rulesParser.EQUAL_SYMBOL, 0); }
		public InfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterInfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitInfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitInfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public TerminalNode SUB() { return getToken(rulesParser.SUB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(rulesParser.NOT, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new LiteralLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(SUB);
				setState(152);
				expression(11);
				}
				break;
			case 5:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(NOT);
				setState(154);
				expression(7);
				}
				break;
			case 6:
				{
				_localctx = new InfixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(LEFT_PARENTHESES);
				setState(156);
				expression(0);
				setState(157);
				match(RIGHT_PARENTHESES);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(162);
						match(ADD);
						setState(163);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(165);
						match(SUB);
						setState(166);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(168);
						match(MUL);
						setState(169);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(171);
						match(DIV);
						setState(172);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(174);
						match(XOR);
						setState(175);
						expression(11);
						}
						break;
					case 6:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(177);
						match(OR);
						setState(178);
						expression(10);
						}
						break;
					case 7:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(180);
						match(AND);
						setState(181);
						expression(9);
						}
						break;
					case 8:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(183);
						match(LESS_THAN);
						setState(184);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(186);
						match(GREATER_THAN);
						setState(187);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(189);
						match(LESS_OR_EQUAL_THAN);
						setState(190);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(192);
						match(GREATER_OR_EQUAL_THAN);
						setState(193);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(195);
						match(EQUAL_SYMBOL);
						setState(196);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			lValue(0);
			setState(203);
			match(ASSIGN_SYMBOL);
			setState(204);
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
		enterRule(_localctx, 18, RULE_block);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				forBlock();
				}
				break;
			case WHILE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				whileBlock();
				}
				break;
			case IF_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				logicBlock();
				}
				break;
			case LEFT_CURLY_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				pureBlock();
				}
				break;
			case CLASS_DEFINITION_SYMNOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(210);
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
		enterRule(_localctx, 20, RULE_pureBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(LEFT_CURLY_BRACE);
			setState(214);
			blockBodyCode();
			setState(215);
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
		enterRule(_localctx, 22, RULE_statementWithoutSemicolon);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				returnStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				variableDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
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
		public List<StatementOrBlockContext> statementOrBlock() {
			return getRuleContexts(StatementOrBlockContext.class);
		}
		public StatementOrBlockContext statementOrBlock(int i) {
			return getRuleContext(StatementOrBlockContext.class,i);
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
		enterRule(_localctx, 24, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << CLASS_DEFINITION_SYMNOL) | (1L << IF_SYMBOL) | (1L << WHILE_SYMBOL) | (1L << RETURN_SYMBOL) | (1L << FOR_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(223);
				statementOrBlock();
				}
				}
				setState(228);
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
		enterRule(_localctx, 26, RULE_statementOrBlock);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			statementWithoutSemicolon();
			setState(234);
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
		enterRule(_localctx, 30, RULE_blockBodyCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(RETURN_SYMBOL);
				setState(239);
				rValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
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
		enterRule(_localctx, 34, RULE_functionDefinitionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(FUNCTION_DEFINITION_SYMBOL);
			setState(244);
			match(IDENTIFIER);
			setState(245);
			match(IDENTIFIER);
			setState(246);
			functionParameterDefinition();
			setState(247);
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
		enterRule(_localctx, 36, RULE_functionParameterDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(LEFT_PARENTHESES);
			setState(250);
			parameterList();
			setState(251);
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
		enterRule(_localctx, 38, RULE_parameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(253);
						variableDeclaration();
						setState(254);
						match(COMMA);
						}
						} 
					}
					setState(260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(261);
				variableDeclaration();
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
		enterRule(_localctx, 40, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(LEFT_CURLY_BRACE);
			setState(265);
			blockBodyCode();
			setState(266);
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
		enterRule(_localctx, 42, RULE_logicBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			ifBlock();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_SYMBOL) {
				{
				{
				setState(269);
				elseIfBlock();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_SYMBOL) {
				{
				setState(275);
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
		enterRule(_localctx, 44, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(IF_SYMBOL);
			setState(279);
			match(LEFT_PARENTHESES);
			setState(280);
			rValue();
			setState(281);
			match(RIGHT_PARENTHESES);
			setState(282);
			match(LEFT_CURLY_BRACE);
			setState(283);
			blockBodyCode();
			setState(284);
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
		enterRule(_localctx, 46, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ELSE_IF_SYMBOL);
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
		enterRule(_localctx, 48, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ELSE_SYMBOL);
			setState(295);
			match(LEFT_CURLY_BRACE);
			setState(296);
			blockBodyCode();
			setState(297);
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
		enterRule(_localctx, 50, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(FOR_SYMBOL);
			setState(300);
			match(LEFT_PARENTHESES);
			setState(301);
			initOrStepCondition();
			setState(302);
			match(SEMICOLON);
			setState(303);
			terminateCondition();
			setState(304);
			match(SEMICOLON);
			setState(305);
			initOrStepCondition();
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
		enterRule(_localctx, 52, RULE_initOrStepCondition);
		int _la;
		try {
			int _alt;
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << RETURN_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(312);
							statementWithoutSemicolon();
							setState(313);
							match(COMMA);
							}
							} 
						}
						setState(319);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(320);
					statementWithoutSemicolon();
					}
				}

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
		enterRule(_localctx, 54, RULE_terminateCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(325);
				rValue();
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
		enterRule(_localctx, 56, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(WHILE_SYMBOL);
			setState(329);
			match(LEFT_PARENTHESES);
			setState(330);
			rValue();
			setState(331);
			match(RIGHT_PARENTHESES);
			setState(332);
			match(LEFT_CURLY_BRACE);
			setState(333);
			blockBodyCode();
			setState(334);
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
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
		enterRule(_localctx, 58, RULE_variableDefinition);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				ordinaryVariableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				ordinaryArrayDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
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

	public static class OrdinaryVariableDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
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
		enterRule(_localctx, 60, RULE_ordinaryVariableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(IDENTIFIER);
			setState(343);
			match(IDENTIFIER);
			setState(344);
			match(ASSIGN_SYMBOL);
			setState(345);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN_SYMBOL() { return getToken(rulesParser.ASSIGN_SYMBOL, 0); }
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public List<TerminalNode> LEFT_BRACKET() { return getTokens(rulesParser.LEFT_BRACKET); }
		public TerminalNode LEFT_BRACKET(int i) {
			return getToken(rulesParser.LEFT_BRACKET, i);
		}
		public List<TerminalNode> RIGHT_BRACKET() { return getTokens(rulesParser.RIGHT_BRACKET); }
		public TerminalNode RIGHT_BRACKET(int i) {
			return getToken(rulesParser.RIGHT_BRACKET, i);
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
		enterRule(_localctx, 62, RULE_ordinaryArrayDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IDENTIFIER);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(348);
				match(LEFT_BRACKET);
				setState(349);
				match(RIGHT_BRACKET);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(IDENTIFIER);
			setState(356);
			match(ASSIGN_SYMBOL);
			setState(357);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
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
		enterRule(_localctx, 64, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(IDENTIFIER);
			setState(360);
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
		enterRule(_localctx, 66, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(IDENTIFIER);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(363);
				match(LEFT_BRACKET);
				setState(364);
				match(RIGHT_BRACKET);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
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
		public TerminalNode RIGHT_PARENTHESES() { return getToken(rulesParser.RIGHT_PARENTHESES, 0); }
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
		enterRule(_localctx, 68, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(IDENTIFIER);
			setState(373);
			match(LEFT_PARENTHESES);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(374);
						rValue();
						setState(375);
						match(COMMA);
						}
						} 
					}
					setState(381);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(382);
				rValue();
				}
			}

			setState(385);
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
		enterRule(_localctx, 70, RULE_structFieldStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(387);
				variableDefinition();
				setState(388);
				match(SEMICOLON);
				}
				}
				setState(394);
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
		enterRule(_localctx, 72, RULE_structDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(CLASS_DEFINITION_SYMNOL);
			setState(396);
			match(IDENTIFIER);
			setState(397);
			match(LEFT_CURLY_BRACE);
			setState(398);
			structFieldStatementList();
			setState(399);
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

	public static class IdentifierReferenceContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(rulesParser.DOT, 0); }
		public IdentifierReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterIdentifierReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitIdentifierReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitIdentifierReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierReferenceContext identifierReference() throws RecognitionException {
		IdentifierReferenceContext _localctx = new IdentifierReferenceContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifierReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(IDENTIFIER);
			setState(402);
			match(DOT);
			setState(403);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return lValue_sempred((LValueContext)_localctx, predIndex);
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean lValue_sempred(LValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0198\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\7\2S\n\2\f"+
		"\2\16\2V\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\2"+
		"\3\2\3\2\5\2g\n\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4o\n\4\3\5\3\5\3\5\5\5t\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\6\3\6\3\6\3\6\6\6\u0084"+
		"\n\6\r\6\16\6\u0085\3\6\3\6\3\7\6\7\u008b\n\7\r\7\16\7\u008c\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0094\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00a2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u00c8\n\t\f\t\16\t\u00cb\13\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\5\r\u00e0\n\r\3\16\7\16\u00e3\n\16\f\16\16\16\u00e6\13\16\3\17\3"+
		"\17\5\17\u00ea\n\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u00f4"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\7\25\u0103\n\25\f\25\16\25\u0106\13\25\3\25\5\25\u0109\n\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\7\27\u0111\n\27\f\27\16\27\u0114\13\27\3\27\5\27"+
		"\u0117\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u013e\n\34"+
		"\f\34\16\34\u0141\13\34\3\34\5\34\u0144\n\34\5\34\u0146\n\34\3\35\5\35"+
		"\u0149\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\5\37\u0157\n\37\3 \3 \3 \3 \3 \3!\3!\3!\7!\u0161\n!\f!\16!\u0164\13!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\7#\u0170\n#\f#\16#\u0173\13#\3#\3#\3"+
		"$\3$\3$\3$\3$\7$\u017c\n$\f$\16$\u017f\13$\3$\5$\u0182\n$\3$\3$\3%\3%"+
		"\3%\7%\u0189\n%\f%\16%\u018c\13%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'"+
		"\2\4\b\20(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJL\2\3\3\2\36\"\2\u01a8\2f\3\2\2\2\4h\3\2\2\2\6n\3\2\2\2\bs\3"+
		"\2\2\2\n\177\3\2\2\2\f\u008a\3\2\2\2\16\u0093\3\2\2\2\20\u00a1\3\2\2\2"+
		"\22\u00cc\3\2\2\2\24\u00d5\3\2\2\2\26\u00d7\3\2\2\2\30\u00df\3\2\2\2\32"+
		"\u00e4\3\2\2\2\34\u00e9\3\2\2\2\36\u00eb\3\2\2\2 \u00ee\3\2\2\2\"\u00f3"+
		"\3\2\2\2$\u00f5\3\2\2\2&\u00fb\3\2\2\2(\u0108\3\2\2\2*\u010a\3\2\2\2,"+
		"\u010e\3\2\2\2.\u0118\3\2\2\2\60\u0120\3\2\2\2\62\u0128\3\2\2\2\64\u012d"+
		"\3\2\2\2\66\u0145\3\2\2\28\u0148\3\2\2\2:\u014a\3\2\2\2<\u0156\3\2\2\2"+
		">\u0158\3\2\2\2@\u015d\3\2\2\2B\u0169\3\2\2\2D\u016c\3\2\2\2F\u0176\3"+
		"\2\2\2H\u018a\3\2\2\2J\u018d\3\2\2\2L\u0193\3\2\2\2NT\7\4\2\2OP\5\6\4"+
		"\2PQ\7\13\2\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2"+
		"\2\2VT\3\2\2\2WX\5\6\4\2XY\7\5\2\2Yg\3\2\2\2Z`\7\4\2\2[\\\5\2\2\2\\]\7"+
		"\13\2\2]_\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`"+
		"\3\2\2\2cd\5\2\2\2de\7\5\2\2eg\3\2\2\2fN\3\2\2\2fZ\3\2\2\2g\3\3\2\2\2"+
		"hi\t\2\2\2i\5\3\2\2\2jo\5\20\t\2ko\5\2\2\2lo\5F$\2mo\5L\'\2nj\3\2\2\2"+
		"nk\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\7\3\2\2\2pq\b\5\1\2qt\7.\2\2rt\5L\'\2"+
		"sp\3\2\2\2sr\3\2\2\2t|\3\2\2\2uv\f\4\2\2vw\7\6\2\2wx\5\20\t\2xy\7\7\2"+
		"\2y{\3\2\2\2zu\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\t\3\2\2\2~|\3\2"+
		"\2\2\177\u0080\7#\2\2\u0080\u0081\7.\2\2\u0081\u0083\7\4\2\2\u0082\u0084"+
		"\5\16\b\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\5\2\2\u0088\13"+
		"\3\2\2\2\u0089\u008b\5\n\6\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\r\3\2\2\2\u008e\u008f\5<\37\2"+
		"\u008f\u0090\7\n\2\2\u0090\u0094\3\2\2\2\u0091\u0094\5$\23\2\u0092\u0094"+
		"\5J&\2\u0093\u008e\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\17\3\2\2\2\u0095\u0096\b\t\1\2\u0096\u00a2\7.\2\2\u0097\u00a2\5\4\3\2"+
		"\u0098\u00a2\5F$\2\u0099\u009a\7\22\2\2\u009a\u00a2\5\20\t\r\u009b\u009c"+
		"\7\30\2\2\u009c\u00a2\5\20\t\t\u009d\u009e\7\b\2\2\u009e\u009f\5\20\t"+
		"\2\u009f\u00a0\7\t\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u0097"+
		"\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1"+
		"\u009d\3\2\2\2\u00a2\u00c9\3\2\2\2\u00a3\u00a4\f\21\2\2\u00a4\u00a5\7"+
		"\21\2\2\u00a5\u00c8\5\20\t\22\u00a6\u00a7\f\20\2\2\u00a7\u00a8\7\22\2"+
		"\2\u00a8\u00c8\5\20\t\21\u00a9\u00aa\f\17\2\2\u00aa\u00ab\7\23\2\2\u00ab"+
		"\u00c8\5\20\t\20\u00ac\u00ad\f\16\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00c8"+
		"\5\20\t\17\u00af\u00b0\f\f\2\2\u00b0\u00b1\7\25\2\2\u00b1\u00c8\5\20\t"+
		"\r\u00b2\u00b3\f\13\2\2\u00b3\u00b4\7\27\2\2\u00b4\u00c8\5\20\t\f\u00b5"+
		"\u00b6\f\n\2\2\u00b6\u00b7\7\26\2\2\u00b7\u00c8\5\20\t\13\u00b8\u00b9"+
		"\f\7\2\2\u00b9\u00ba\7\31\2\2\u00ba\u00c8\5\20\t\b\u00bb\u00bc\f\6\2\2"+
		"\u00bc\u00bd\7\33\2\2\u00bd\u00c8\5\20\t\7\u00be\u00bf\f\5\2\2\u00bf\u00c0"+
		"\7\32\2\2\u00c0\u00c8\5\20\t\6\u00c1\u00c2\f\4\2\2\u00c2\u00c3\7\34\2"+
		"\2\u00c3\u00c8\5\20\t\5\u00c4\u00c5\f\3\2\2\u00c5\u00c6\7\35\2\2\u00c6"+
		"\u00c8\5\20\t\4\u00c7\u00a3\3\2\2\2\u00c7\u00a6\3\2\2\2\u00c7\u00a9\3"+
		"\2\2\2\u00c7\u00ac\3\2\2\2\u00c7\u00af\3\2\2\2\u00c7\u00b2\3\2\2\2\u00c7"+
		"\u00b5\3\2\2\2\u00c7\u00b8\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7\u00be\3\2"+
		"\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\21\3\2\2\2\u00cb\u00c9\3\2\2"+
		"\2\u00cc\u00cd\5\b\5\2\u00cd\u00ce\7\r\2\2\u00ce\u00cf\5\6\4\2\u00cf\23"+
		"\3\2\2\2\u00d0\u00d6\5\64\33\2\u00d1\u00d6\5:\36\2\u00d2\u00d6\5,\27\2"+
		"\u00d3\u00d6\5\26\f\2\u00d4\u00d6\5J&\2\u00d5\u00d0\3\2\2\2\u00d5\u00d1"+
		"\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\25\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\5 \21\2\u00d9\u00da\7\5\2"+
		"\2\u00da\27\3\2\2\2\u00db\u00e0\5\"\22\2\u00dc\u00e0\5\22\n\2\u00dd\u00e0"+
		"\5<\37\2\u00de\u00e0\5\6\4\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\31\3\2\2\2\u00e1\u00e3\5\34\17"+
		"\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5"+
		"\3\2\2\2\u00e5\33\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\5\24\13\2\u00e8"+
		"\u00ea\5\36\20\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\35\3\2"+
		"\2\2\u00eb\u00ec\5\30\r\2\u00ec\u00ed\7\n\2\2\u00ed\37\3\2\2\2\u00ee\u00ef"+
		"\5\32\16\2\u00ef!\3\2\2\2\u00f0\u00f1\7*\2\2\u00f1\u00f4\5\6\4\2\u00f2"+
		"\u00f4\7*\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4#\3\2\2\2\u00f5"+
		"\u00f6\7$\2\2\u00f6\u00f7\7.\2\2\u00f7\u00f8\7.\2\2\u00f8\u00f9\5&\24"+
		"\2\u00f9\u00fa\5*\26\2\u00fa%\3\2\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd"+
		"\5(\25\2\u00fd\u00fe\7\t\2\2\u00fe\'\3\2\2\2\u00ff\u0100\5B\"\2\u0100"+
		"\u0101\7\13\2\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0109\5B\"\2\u0108\u0104\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109)\3\2\2\2\u010a\u010b\7\4\2\2\u010b\u010c\5 \21\2\u010c\u010d"+
		"\7\5\2\2\u010d+\3\2\2\2\u010e\u0112\5.\30\2\u010f\u0111\5\60\31\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0117\5\62\32\2\u0116"+
		"\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117-\3\2\2\2\u0118\u0119\7&\2\2\u0119"+
		"\u011a\7\b\2\2\u011a\u011b\5\6\4\2\u011b\u011c\7\t\2\2\u011c\u011d\7\4"+
		"\2\2\u011d\u011e\5 \21\2\u011e\u011f\7\5\2\2\u011f/\3\2\2\2\u0120\u0121"+
		"\7)\2\2\u0121\u0122\7\b\2\2\u0122\u0123\5\6\4\2\u0123\u0124\7\t\2\2\u0124"+
		"\u0125\7\4\2\2\u0125\u0126\5 \21\2\u0126\u0127\7\5\2\2\u0127\61\3\2\2"+
		"\2\u0128\u0129\7(\2\2\u0129\u012a\7\4\2\2\u012a\u012b\5 \21\2\u012b\u012c"+
		"\7\5\2\2\u012c\63\3\2\2\2\u012d\u012e\7,\2\2\u012e\u012f\7\b\2\2\u012f"+
		"\u0130\5\66\34\2\u0130\u0131\7\n\2\2\u0131\u0132\58\35\2\u0132\u0133\7"+
		"\n\2\2\u0133\u0134\5\66\34\2\u0134\u0135\7\t\2\2\u0135\u0136\7\4\2\2\u0136"+
		"\u0137\5 \21\2\u0137\u0138\7\5\2\2\u0138\65\3\2\2\2\u0139\u0146\3\2\2"+
		"\2\u013a\u013b\5\30\r\2\u013b\u013c\7\13\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u013a\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144\5\30\r\2\u0143"+
		"\u013f\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0139\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0146\67\3\2\2\2\u0147\u0149\5\6\4\2\u0148\u0147"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u01499\3\2\2\2\u014a\u014b\7\'\2\2\u014b"+
		"\u014c\7\b\2\2\u014c\u014d\5\6\4\2\u014d\u014e\7\t\2\2\u014e\u014f\7\4"+
		"\2\2\u014f\u0150\5 \21\2\u0150\u0151\7\5\2\2\u0151;\3\2\2\2\u0152\u0157"+
		"\5> \2\u0153\u0157\5@!\2\u0154\u0157\5B\"\2\u0155\u0157\5D#\2\u0156\u0152"+
		"\3\2\2\2\u0156\u0153\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157"+
		"=\3\2\2\2\u0158\u0159\7.\2\2\u0159\u015a\7.\2\2\u015a\u015b\7\r\2\2\u015b"+
		"\u015c\5\6\4\2\u015c?\3\2\2\2\u015d\u0162\7.\2\2\u015e\u015f\7\6\2\2\u015f"+
		"\u0161\7\7\2\2\u0160\u015e\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165"+
		"\u0166\7.\2\2\u0166\u0167\7\r\2\2\u0167\u0168\5\6\4\2\u0168A\3\2\2\2\u0169"+
		"\u016a\7.\2\2\u016a\u016b\7.\2\2\u016bC\3\2\2\2\u016c\u0171\7.\2\2\u016d"+
		"\u016e\7\6\2\2\u016e\u0170\7\7\2\2\u016f\u016d\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\7.\2\2\u0175E\3\2\2\2\u0176\u0177\7.\2\2\u0177"+
		"\u0181\7\b\2\2\u0178\u0179\5\6\4\2\u0179\u017a\7\13\2\2\u017a\u017c\3"+
		"\2\2\2\u017b\u0178\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0182\5\6"+
		"\4\2\u0181\u017d\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0184\7\t\2\2\u0184G\3\2\2\2\u0185\u0186\5<\37\2\u0186\u0187\7\n\2\2"+
		"\u0187\u0189\3\2\2\2\u0188\u0185\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018a\u018b\3\2\2\2\u018bI\3\2\2\2\u018c\u018a\3\2\2\2\u018d"+
		"\u018e\7%\2\2\u018e\u018f\7.\2\2\u018f\u0190\7\4\2\2\u0190\u0191\5H%\2"+
		"\u0191\u0192\7\5\2\2\u0192K\3\2\2\2\u0193\u0194\7.\2\2\u0194\u0195\7\f"+
		"\2\2\u0195\u0196\7.\2\2\u0196M\3\2\2\2!T`fns|\u0085\u008c\u0093\u00a1"+
		"\u00c7\u00c9\u00d5\u00df\u00e4\u00e9\u00f3\u0104\u0108\u0112\u0116\u013f"+
		"\u0143\u0145\u0148\u0156\u0162\u0171\u017d\u0181\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}