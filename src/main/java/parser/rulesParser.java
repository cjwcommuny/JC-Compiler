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
		RULE_statementWithoutSemicolon = 11, RULE_breakStatement = 12, RULE_continueStatement = 13, 
		RULE_statementList = 14, RULE_blockOrStatement = 15, RULE_statementNode = 16, 
		RULE_blockBodyCode = 17, RULE_returnStatement = 18, RULE_functionDefinitionBlock = 19, 
		RULE_functionParameterDefinition = 20, RULE_parameterList = 21, RULE_functionBody = 22, 
		RULE_logicBlock = 23, RULE_ifBlock = 24, RULE_elseIfBlock = 25, RULE_elseBlock = 26, 
		RULE_forBlock = 27, RULE_initOrStepCondition = 28, RULE_terminateCondition = 29, 
		RULE_whileBlock = 30, RULE_variableDefinition = 31, RULE_ordinaryVariableDefinition = 32, 
		RULE_variableDeclaration = 33, RULE_ordinaryVariableDeclaration = 34, 
		RULE_arrayDeclaration = 35, RULE_functionCall = 36, RULE_structFieldStatementList = 37, 
		RULE_structDefinition = 38, RULE_structReference = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"arrayInitialization", "literal", "rValue", "lValue", "namespaceDefinition", 
			"program", "codeContent", "expression", "assignment", "block", "pureBlock", 
			"statementWithoutSemicolon", "breakStatement", "continueStatement", "statementList", 
			"blockOrStatement", "statementNode", "blockBodyCode", "returnStatement", 
			"functionDefinitionBlock", "functionParameterDefinition", "parameterList", 
			"functionBody", "logicBlock", "ifBlock", "elseIfBlock", "elseBlock", 
			"forBlock", "initOrStepCondition", "terminateCondition", "whileBlock", 
			"variableDefinition", "ordinaryVariableDefinition", "variableDeclaration", 
			"ordinaryVariableDeclaration", "arrayDeclaration", "functionCall", "structFieldStatementList", 
			"structDefinition", "structReference"
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SimpleArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(LEFT_CURLY_BRACE);
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						rValue();
						setState(82);
						match(COMMA);
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(89);
				rValue();
				setState(90);
				match(RIGHT_CURLY_BRACE);
				}
				break;
			case 2:
				_localctx = new CompoundArrayInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
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
						arrayInitialization();
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
				arrayInitialization();
				setState(102);
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
			setState(106);
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
		public StructReferenceContext structReference() {
			return getRuleContext(StructReferenceContext.class,0);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				arrayInitialization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				structReference(0);
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
		public StructReferenceContext structReference() {
			return getRuleContext(StructReferenceContext.class,0);
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
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new LValueIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(115);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new ReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				structReference(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
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
					setState(119);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(120);
					match(LEFT_BRACKET);
					setState(121);
					expression(0);
					setState(122);
					match(RIGHT_BRACKET);
					}
					} 
				}
				setState(128);
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
			setState(129);
			match(NAMESPACE_SYMBOL);
			setState(130);
			match(IDENTIFIER);
			setState(131);
			match(LEFT_CURLY_BRACE);
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				codeContent();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FUNCTION_DEFINITION_SYMBOL) | (1L << CLASS_DEFINITION_SYMNOL) | (1L << IDENTIFIER))) != 0) );
			setState(137);
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
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				namespaceDefinition();
				}
				}
				setState(142); 
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				variableDefinition();
				setState(145);
				match(SEMICOLON);
				}
				break;
			case FUNCTION_DEFINITION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				functionDefinitionBlock();
				}
				break;
			case CLASS_DEFINITION_SYMNOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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
		public TerminalNode LOGIC_OR() { return getToken(rulesParser.LOGIC_OR, 0); }
		public TerminalNode LOGIC_AND() { return getToken(rulesParser.LOGIC_AND, 0); }
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
		public TerminalNode LOGIC_NOT() { return getToken(rulesParser.LOGIC_NOT, 0); }
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(152);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				_localctx = new LiteralLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				literal();
				}
				break;
			case 3:
				{
				_localctx = new FunctionCallLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(SUB);
				setState(156);
				expression(14);
				}
				break;
			case 5:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(NOT);
				setState(158);
				expression(10);
				}
				break;
			case 6:
				{
				_localctx = new InfixExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(LEFT_PARENTHESES);
				setState(160);
				expression(0);
				setState(161);
				match(RIGHT_PARENTHESES);
				}
				break;
			case 7:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(LOGIC_NOT);
				setState(164);
				expression(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(168);
						match(ADD);
						setState(169);
						expression(19);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(171);
						match(SUB);
						setState(172);
						expression(18);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(174);
						match(MUL);
						setState(175);
						expression(17);
						}
						break;
					case 4:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(177);
						match(DIV);
						setState(178);
						expression(16);
						}
						break;
					case 5:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(180);
						match(XOR);
						setState(181);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(182);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(183);
						match(OR);
						setState(184);
						expression(13);
						}
						break;
					case 7:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(185);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(186);
						match(AND);
						setState(187);
						expression(12);
						}
						break;
					case 8:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(188);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(189);
						match(LESS_THAN);
						setState(190);
						expression(9);
						}
						break;
					case 9:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(192);
						match(GREATER_THAN);
						setState(193);
						expression(8);
						}
						break;
					case 10:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(195);
						match(LESS_OR_EQUAL_THAN);
						setState(196);
						expression(7);
						}
						break;
					case 11:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(197);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(198);
						match(GREATER_OR_EQUAL_THAN);
						setState(199);
						expression(6);
						}
						break;
					case 12:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						match(EQUAL_SYMBOL);
						setState(202);
						expression(5);
						}
						break;
					case 13:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						match(LOGIC_OR);
						setState(205);
						expression(3);
						}
						break;
					case 14:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(207);
						match(LOGIC_AND);
						setState(208);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(213);
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
			setState(214);
			lValue(0);
			setState(215);
			match(ASSIGN_SYMBOL);
			setState(216);
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
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				forBlock();
				}
				break;
			case WHILE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				whileBlock();
				}
				break;
			case IF_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				logicBlock();
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
			setState(223);
			match(LEFT_CURLY_BRACE);
			setState(224);
			blockBodyCode();
			setState(225);
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
		public StatementWithoutSemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutSemicolon; }
	 
		public StatementWithoutSemicolonContext() { }
		public void copyFrom(StatementWithoutSemicolonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakStatementLabelContext extends StatementWithoutSemicolonContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public BreakStatementLabelContext(StatementWithoutSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterBreakStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitBreakStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitBreakStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ContinueStatementLabelContext extends StatementWithoutSemicolonContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ContinueStatementLabelContext(StatementWithoutSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterContinueStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitContinueStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitContinueStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentInStatementContext extends StatementWithoutSemicolonContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentInStatementContext(StatementWithoutSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterAssignmentInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitAssignmentInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitAssignmentInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RValueInStatementContext extends StatementWithoutSemicolonContext {
		public RValueContext rValue() {
			return getRuleContext(RValueContext.class,0);
		}
		public RValueInStatementContext(StatementWithoutSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterRValueInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitRValueInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitRValueInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnInStatementContext extends StatementWithoutSemicolonContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnInStatementContext(StatementWithoutSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterReturnInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitReturnInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitReturnInStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDefinitionInStatementContext extends StatementWithoutSemicolonContext {
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public VariableDefinitionInStatementContext(StatementWithoutSemicolonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterVariableDefinitionInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitVariableDefinitionInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitVariableDefinitionInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithoutSemicolonContext statementWithoutSemicolon() throws RecognitionException {
		StatementWithoutSemicolonContext _localctx = new StatementWithoutSemicolonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statementWithoutSemicolon);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ReturnInStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				returnStatement();
				}
				break;
			case 2:
				_localctx = new BreakStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				breakStatement();
				}
				break;
			case 3:
				_localctx = new ContinueStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				continueStatement();
				}
				break;
			case 4:
				_localctx = new AssignmentInStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				assignment();
				}
				break;
			case 5:
				_localctx = new VariableDefinitionInStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				variableDefinition();
				}
				break;
			case 6:
				_localctx = new RValueInStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK_SYMBOL() { return getToken(rulesParser.BREAK_SYMBOL, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(BREAK_SYMBOL);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE_SYMBOL() { return getToken(rulesParser.CONTINUE_SYMBOL, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(CONTINUE_SYMBOL);
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
		public List<BlockOrStatementContext> blockOrStatement() {
			return getRuleContexts(BlockOrStatementContext.class);
		}
		public BlockOrStatementContext blockOrStatement(int i) {
			return getRuleContext(BlockOrStatementContext.class,i);
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
		enterRule(_localctx, 28, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << LOGIC_NOT) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << IF_SYMBOL) | (1L << WHILE_SYMBOL) | (1L << RETURN_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << FOR_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(239);
				blockOrStatement();
				}
				}
				setState(244);
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

	public static class BlockOrStatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementNodeContext statementNode() {
			return getRuleContext(StatementNodeContext.class,0);
		}
		public BlockOrStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOrStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterBlockOrStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitBlockOrStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitBlockOrStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOrStatementContext blockOrStatement() throws RecognitionException {
		BlockOrStatementContext _localctx = new BlockOrStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blockOrStatement);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF_SYMBOL:
			case WHILE_SYMBOL:
			case FOR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				block();
				}
				break;
			case LEFT_CURLY_BRACE:
			case LEFT_PARENTHESES:
			case LOGIC_NOT:
			case SUB:
			case NOT:
			case INT_LITERAL:
			case DOUBLE_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case BOOL_LITERAL:
			case RETURN_SYMBOL:
			case CONTINUE_SYMBOL:
			case BREAK_SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				statementNode();
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

	public static class StatementNodeContext extends ParserRuleContext {
		public StatementWithoutSemicolonContext statementWithoutSemicolon() {
			return getRuleContext(StatementWithoutSemicolonContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(rulesParser.SEMICOLON, 0); }
		public StatementNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStatementNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStatementNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStatementNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNodeContext statementNode() throws RecognitionException {
		StatementNodeContext _localctx = new StatementNodeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			statementWithoutSemicolon();
			setState(250);
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
		enterRule(_localctx, 34, RULE_blockBodyCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(RETURN_SYMBOL);
				setState(255);
				rValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
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
		enterRule(_localctx, 38, RULE_functionDefinitionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(FUNCTION_DEFINITION_SYMBOL);
			setState(260);
			match(IDENTIFIER);
			setState(261);
			match(IDENTIFIER);
			setState(262);
			functionParameterDefinition();
			setState(263);
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
		enterRule(_localctx, 40, RULE_functionParameterDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LEFT_PARENTHESES);
			setState(266);
			parameterList();
			setState(267);
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
		enterRule(_localctx, 42, RULE_parameterList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						variableDeclaration();
						setState(270);
						match(COMMA);
						}
						} 
					}
					setState(276);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(277);
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
		enterRule(_localctx, 44, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(LEFT_CURLY_BRACE);
			setState(281);
			blockBodyCode();
			setState(282);
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
		enterRule(_localctx, 46, RULE_logicBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			ifBlock();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_SYMBOL) {
				{
				{
				setState(285);
				elseIfBlock();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE_SYMBOL) {
				{
				setState(291);
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
		enterRule(_localctx, 48, RULE_ifBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(IF_SYMBOL);
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
		enterRule(_localctx, 50, RULE_elseIfBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(ELSE_IF_SYMBOL);
			setState(303);
			match(LEFT_PARENTHESES);
			setState(304);
			rValue();
			setState(305);
			match(RIGHT_PARENTHESES);
			setState(306);
			match(LEFT_CURLY_BRACE);
			setState(307);
			blockBodyCode();
			setState(308);
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
		enterRule(_localctx, 52, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ELSE_SYMBOL);
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
		enterRule(_localctx, 54, RULE_forBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FOR_SYMBOL);
			setState(316);
			match(LEFT_PARENTHESES);
			setState(317);
			initOrStepCondition();
			setState(318);
			match(SEMICOLON);
			setState(319);
			terminateCondition();
			setState(320);
			match(SEMICOLON);
			setState(321);
			initOrStepCondition();
			setState(322);
			match(RIGHT_PARENTHESES);
			setState(323);
			match(LEFT_CURLY_BRACE);
			setState(324);
			blockBodyCode();
			setState(325);
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
		enterRule(_localctx, 56, RULE_initOrStepCondition);
		int _la;
		try {
			int _alt;
			setState(339);
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
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << LOGIC_NOT) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << RETURN_SYMBOL) | (1L << CONTINUE_SYMBOL) | (1L << BREAK_SYMBOL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(333);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(328);
							statementWithoutSemicolon();
							setState(329);
							match(COMMA);
							}
							} 
						}
						setState(335);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(336);
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
		enterRule(_localctx, 58, RULE_terminateCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << LOGIC_NOT) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(341);
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
		enterRule(_localctx, 60, RULE_whileBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(WHILE_SYMBOL);
			setState(345);
			match(LEFT_PARENTHESES);
			setState(346);
			rValue();
			setState(347);
			match(RIGHT_PARENTHESES);
			setState(348);
			match(LEFT_CURLY_BRACE);
			setState(349);
			blockBodyCode();
			setState(350);
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
		enterRule(_localctx, 62, RULE_variableDefinition);
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				ordinaryVariableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
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
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
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
		enterRule(_localctx, 64, RULE_ordinaryVariableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			variableDeclaration();
			setState(357);
			match(ASSIGN_SYMBOL);
			setState(358);
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
		public OrdinaryVariableDeclarationContext ordinaryVariableDeclaration() {
			return getRuleContext(OrdinaryVariableDeclarationContext.class,0);
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
		enterRule(_localctx, 66, RULE_variableDeclaration);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				ordinaryVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
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

	public static class OrdinaryVariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
		}
		public OrdinaryVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinaryVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterOrdinaryVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitOrdinaryVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitOrdinaryVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinaryVariableDeclarationContext ordinaryVariableDeclaration() throws RecognitionException {
		OrdinaryVariableDeclarationContext _localctx = new OrdinaryVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ordinaryVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(IDENTIFIER);
			setState(365);
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
		enterRule(_localctx, 70, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IDENTIFIER);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_BRACKET) {
				{
				{
				setState(368);
				match(LEFT_BRACKET);
				setState(369);
				match(RIGHT_BRACKET);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
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
		enterRule(_localctx, 72, RULE_functionCall);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(IDENTIFIER);
			setState(378);
			match(LEFT_PARENTHESES);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEFT_CURLY_BRACE) | (1L << LEFT_PARENTHESES) | (1L << LOGIC_NOT) | (1L << SUB) | (1L << NOT) | (1L << INT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379);
						rValue();
						setState(380);
						match(COMMA);
						}
						} 
					}
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(387);
				rValue();
				}
			}

			setState(390);
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
		enterRule(_localctx, 74, RULE_structFieldStatementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(392);
				variableDefinition();
				setState(393);
				match(SEMICOLON);
				}
				}
				setState(399);
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
		enterRule(_localctx, 76, RULE_structDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(CLASS_DEFINITION_SYMNOL);
			setState(401);
			match(IDENTIFIER);
			setState(402);
			match(LEFT_CURLY_BRACE);
			setState(403);
			structFieldStatementList();
			setState(404);
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

	public static class StructReferenceContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(rulesParser.DOT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(rulesParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(rulesParser.IDENTIFIER, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StructReferenceContext structReference() {
			return getRuleContext(StructReferenceContext.class,0);
		}
		public StructReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).enterStructReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rulesListener ) ((rulesListener)listener).exitStructReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof rulesVisitor ) return ((rulesVisitor<? extends T>)visitor).visitStructReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructReferenceContext structReference() throws RecognitionException {
		return structReference(0);
	}

	private StructReferenceContext structReference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructReferenceContext _localctx = new StructReferenceContext(_ctx, _parentState);
		StructReferenceContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_structReference, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(407);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(408);
				functionCall();
				}
				break;
			}
			setState(411);
			match(DOT);
			setState(412);
			match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(419);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructReferenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structReference);
					setState(414);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(415);
					match(DOT);
					setState(416);
					match(IDENTIFIER);
					}
					} 
				}
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return lValue_sempred((LValueContext)_localctx, predIndex);
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 39:
			return structReference_sempred((StructReferenceContext)_localctx, predIndex);
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
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structReference_sempred(StructReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u01a9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16"+
		"\2f\13\2\3\2\3\2\3\2\5\2k\n\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4s\n\4\3\5\3\5"+
		"\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\3\5\7\5\177\n\5\f\5\16\5\u0082\13\5\3\6"+
		"\3\6\3\6\3\6\6\6\u0088\n\6\r\6\16\6\u0089\3\6\3\6\3\7\6\7\u008f\n\7\r"+
		"\7\16\7\u0090\3\b\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u00d4\n\t\f\t\16\t\u00d7\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u00e0\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r"+
		"\3\16\3\16\3\17\3\17\3\20\7\20\u00f3\n\20\f\20\16\20\u00f6\13\20\3\21"+
		"\3\21\5\21\u00fa\n\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\5\24\u0104"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\7\27\u0113\n\27\f\27\16\27\u0116\13\27\3\27\5\27\u0119\n\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\7\31\u0121\n\31\f\31\16\31\u0124\13\31\3\31\5\31"+
		"\u0127\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u014e\n\36"+
		"\f\36\16\36\u0151\13\36\3\36\5\36\u0154\n\36\5\36\u0156\n\36\3\37\5\37"+
		"\u0159\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\5!\u0165\n!\3\"\3\"\3\"\3\""+
		"\3#\3#\5#\u016d\n#\3$\3$\3$\3%\3%\3%\7%\u0175\n%\f%\16%\u0178\13%\3%\3"+
		"%\3&\3&\3&\3&\3&\7&\u0181\n&\f&\16&\u0184\13&\3&\5&\u0187\n&\3&\3&\3\'"+
		"\3\'\3\'\7\'\u018e\n\'\f\'\16\'\u0191\13\'\3(\3(\3(\3(\3(\3(\3)\3)\3)"+
		"\5)\u019c\n)\3)\3)\3)\3)\3)\3)\7)\u01a4\n)\f)\16)\u01a7\13)\3)\2\5\b\20"+
		"P*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNP\2\3\3\2\36\"\2\u01ba\2j\3\2\2\2\4l\3\2\2\2\6r\3\2\2\2\bw\3\2\2"+
		"\2\n\u0083\3\2\2\2\f\u008e\3\2\2\2\16\u0097\3\2\2\2\20\u00a7\3\2\2\2\22"+
		"\u00d8\3\2\2\2\24\u00df\3\2\2\2\26\u00e1\3\2\2\2\30\u00eb\3\2\2\2\32\u00ed"+
		"\3\2\2\2\34\u00ef\3\2\2\2\36\u00f4\3\2\2\2 \u00f9\3\2\2\2\"\u00fb\3\2"+
		"\2\2$\u00fe\3\2\2\2&\u0103\3\2\2\2(\u0105\3\2\2\2*\u010b\3\2\2\2,\u0118"+
		"\3\2\2\2.\u011a\3\2\2\2\60\u011e\3\2\2\2\62\u0128\3\2\2\2\64\u0130\3\2"+
		"\2\2\66\u0138\3\2\2\28\u013d\3\2\2\2:\u0155\3\2\2\2<\u0158\3\2\2\2>\u015a"+
		"\3\2\2\2@\u0164\3\2\2\2B\u0166\3\2\2\2D\u016c\3\2\2\2F\u016e\3\2\2\2H"+
		"\u0171\3\2\2\2J\u017b\3\2\2\2L\u018f\3\2\2\2N\u0192\3\2\2\2P\u0198\3\2"+
		"\2\2RX\7\4\2\2ST\5\6\4\2TU\7\13\2\2UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\5\6\4\2\\]\7\5\2\2]k\3\2\2\2^"+
		"d\7\4\2\2_`\5\2\2\2`a\7\13\2\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\5\2\2\2hi\7\5\2\2ik\3\2\2\2jR\3\2\2\2"+
		"j^\3\2\2\2k\3\3\2\2\2lm\t\2\2\2m\5\3\2\2\2ns\5\20\t\2os\5\2\2\2ps\5J&"+
		"\2qs\5P)\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\7\3\2\2\2tu\b\5\1"+
		"\2ux\7.\2\2vx\5P)\2wt\3\2\2\2wv\3\2\2\2x\u0080\3\2\2\2yz\f\4\2\2z{\7\6"+
		"\2\2{|\5\20\t\2|}\7\7\2\2}\177\3\2\2\2~y\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\t\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\7#\2\2\u0084\u0085\7.\2\2\u0085\u0087\7\4\2\2\u0086\u0088\5\16"+
		"\b\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\5\2\2\u008c\13\3\2\2"+
		"\2\u008d\u008f\5\n\6\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\r\3\2\2\2\u0092\u0093\5@!\2\u0093\u0094"+
		"\7\n\2\2\u0094\u0098\3\2\2\2\u0095\u0098\5(\25\2\u0096\u0098\5N(\2\u0097"+
		"\u0092\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\17\3\2\2"+
		"\2\u0099\u009a\b\t\1\2\u009a\u00a8\7.\2\2\u009b\u00a8\5\4\3\2\u009c\u00a8"+
		"\5J&\2\u009d\u009e\7\22\2\2\u009e\u00a8\5\20\t\20\u009f\u00a0\7\30\2\2"+
		"\u00a0\u00a8\5\20\t\f\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4"+
		"\7\t\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00a8\5\20\t\5"+
		"\u00a7\u0099\3\2\2\2\u00a7\u009b\3\2\2\2\u00a7\u009c\3\2\2\2\u00a7\u009d"+
		"\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00d5\3\2\2\2\u00a9\u00aa\f\24\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00d4\5"+
		"\20\t\25\u00ac\u00ad\f\23\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00d4\5\20\t"+
		"\24\u00af\u00b0\f\22\2\2\u00b0\u00b1\7\23\2\2\u00b1\u00d4\5\20\t\23\u00b2"+
		"\u00b3\f\21\2\2\u00b3\u00b4\7\24\2\2\u00b4\u00d4\5\20\t\22\u00b5\u00b6"+
		"\f\17\2\2\u00b6\u00b7\7\25\2\2\u00b7\u00d4\5\20\t\20\u00b8\u00b9\f\16"+
		"\2\2\u00b9\u00ba\7\27\2\2\u00ba\u00d4\5\20\t\17\u00bb\u00bc\f\r\2\2\u00bc"+
		"\u00bd\7\26\2\2\u00bd\u00d4\5\20\t\16\u00be\u00bf\f\n\2\2\u00bf\u00c0"+
		"\7\31\2\2\u00c0\u00d4\5\20\t\13\u00c1\u00c2\f\t\2\2\u00c2\u00c3\7\33\2"+
		"\2\u00c3\u00d4\5\20\t\n\u00c4\u00c5\f\b\2\2\u00c5\u00c6\7\32\2\2\u00c6"+
		"\u00d4\5\20\t\t\u00c7\u00c8\f\7\2\2\u00c8\u00c9\7\34\2\2\u00c9\u00d4\5"+
		"\20\t\b\u00ca\u00cb\f\6\2\2\u00cb\u00cc\7\35\2\2\u00cc\u00d4\5\20\t\7"+
		"\u00cd\u00ce\f\4\2\2\u00ce\u00cf\7\16\2\2\u00cf\u00d4\5\20\t\5\u00d0\u00d1"+
		"\f\3\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d4\5\20\t\4\u00d3\u00a9\3\2\2\2"+
		"\u00d3\u00ac\3\2\2\2\u00d3\u00af\3\2\2\2\u00d3\u00b2\3\2\2\2\u00d3\u00b5"+
		"\3\2\2\2\u00d3\u00b8\3\2\2\2\u00d3\u00bb\3\2\2\2\u00d3\u00be\3\2\2\2\u00d3"+
		"\u00c1\3\2\2\2\u00d3\u00c4\3\2\2\2\u00d3\u00c7\3\2\2\2\u00d3\u00ca\3\2"+
		"\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\21\3\2\2\2\u00d7\u00d5\3\2\2"+
		"\2\u00d8\u00d9\5\b\5\2\u00d9\u00da\7\r\2\2\u00da\u00db\5\6\4\2\u00db\23"+
		"\3\2\2\2\u00dc\u00e0\58\35\2\u00dd\u00e0\5> \2\u00de\u00e0\5\60\31\2\u00df"+
		"\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\25\3\2\2"+
		"\2\u00e1\u00e2\7\4\2\2\u00e2\u00e3\5$\23\2\u00e3\u00e4\7\5\2\2\u00e4\27"+
		"\3\2\2\2\u00e5\u00ec\5&\24\2\u00e6\u00ec\5\32\16\2\u00e7\u00ec\5\34\17"+
		"\2\u00e8\u00ec\5\22\n\2\u00e9\u00ec\5@!\2\u00ea\u00ec\5\6\4\2\u00eb\u00e5"+
		"\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00ee\7-\2\2"+
		"\u00ee\33\3\2\2\2\u00ef\u00f0\7+\2\2\u00f0\35\3\2\2\2\u00f1\u00f3\5 \21"+
		"\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\37\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\5\24\13\2\u00f8"+
		"\u00fa\5\"\22\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa!\3\2\2\2"+
		"\u00fb\u00fc\5\30\r\2\u00fc\u00fd\7\n\2\2\u00fd#\3\2\2\2\u00fe\u00ff\5"+
		"\36\20\2\u00ff%\3\2\2\2\u0100\u0101\7*\2\2\u0101\u0104\5\6\4\2\u0102\u0104"+
		"\7*\2\2\u0103\u0100\3\2\2\2\u0103\u0102\3\2\2\2\u0104\'\3\2\2\2\u0105"+
		"\u0106\7$\2\2\u0106\u0107\7.\2\2\u0107\u0108\7.\2\2\u0108\u0109\5*\26"+
		"\2\u0109\u010a\5.\30\2\u010a)\3\2\2\2\u010b\u010c\7\b\2\2\u010c\u010d"+
		"\5,\27\2\u010d\u010e\7\t\2\2\u010e+\3\2\2\2\u010f\u0110\5D#\2\u0110\u0111"+
		"\7\13\2\2\u0111\u0113\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0116\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u0119\5D#\2\u0118\u0114\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"-\3\2\2\2\u011a\u011b\7\4\2\2\u011b\u011c\5$\23\2\u011c\u011d\7\5\2\2"+
		"\u011d/\3\2\2\2\u011e\u0122\5\62\32\2\u011f\u0121\5\64\33\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\5\66\34\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\61\3\2\2\2\u0128\u0129\7&\2\2\u0129\u012a"+
		"\7\b\2\2\u012a\u012b\5\6\4\2\u012b\u012c\7\t\2\2\u012c\u012d\7\4\2\2\u012d"+
		"\u012e\5$\23\2\u012e\u012f\7\5\2\2\u012f\63\3\2\2\2\u0130\u0131\7)\2\2"+
		"\u0131\u0132\7\b\2\2\u0132\u0133\5\6\4\2\u0133\u0134\7\t\2\2\u0134\u0135"+
		"\7\4\2\2\u0135\u0136\5$\23\2\u0136\u0137\7\5\2\2\u0137\65\3\2\2\2\u0138"+
		"\u0139\7(\2\2\u0139\u013a\7\4\2\2\u013a\u013b\5$\23\2\u013b\u013c\7\5"+
		"\2\2\u013c\67\3\2\2\2\u013d\u013e\7,\2\2\u013e\u013f\7\b\2\2\u013f\u0140"+
		"\5:\36\2\u0140\u0141\7\n\2\2\u0141\u0142\5<\37\2\u0142\u0143\7\n\2\2\u0143"+
		"\u0144\5:\36\2\u0144\u0145\7\t\2\2\u0145\u0146\7\4\2\2\u0146\u0147\5$"+
		"\23\2\u0147\u0148\7\5\2\2\u01489\3\2\2\2\u0149\u0156\3\2\2\2\u014a\u014b"+
		"\5\30\r\2\u014b\u014c\7\13\2\2\u014c\u014e\3\2\2\2\u014d\u014a\3\2\2\2"+
		"\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152"+
		"\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\5\30\r\2\u0153\u014f\3\2\2\2"+
		"\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0149\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0156;\3\2\2\2\u0157\u0159\5\6\4\2\u0158\u0157\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159=\3\2\2\2\u015a\u015b\7\'\2\2\u015b\u015c\7\b\2\2"+
		"\u015c\u015d\5\6\4\2\u015d\u015e\7\t\2\2\u015e\u015f\7\4\2\2\u015f\u0160"+
		"\5$\23\2\u0160\u0161\7\5\2\2\u0161?\3\2\2\2\u0162\u0165\5B\"\2\u0163\u0165"+
		"\5D#\2\u0164\u0162\3\2\2\2\u0164\u0163\3\2\2\2\u0165A\3\2\2\2\u0166\u0167"+
		"\5D#\2\u0167\u0168\7\r\2\2\u0168\u0169\5\6\4\2\u0169C\3\2\2\2\u016a\u016d"+
		"\5F$\2\u016b\u016d\5H%\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"E\3\2\2\2\u016e\u016f\7.\2\2\u016f\u0170\7.\2\2\u0170G\3\2\2\2\u0171\u0176"+
		"\7.\2\2\u0172\u0173\7\6\2\2\u0173\u0175\7\7\2\2\u0174\u0172\3\2\2\2\u0175"+
		"\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2"+
		"\2\2\u0178\u0176\3\2\2\2\u0179\u017a\7.\2\2\u017aI\3\2\2\2\u017b\u017c"+
		"\7.\2\2\u017c\u0186\7\b\2\2\u017d\u017e\5\6\4\2\u017e\u017f\7\13\2\2\u017f"+
		"\u0181\3\2\2\2\u0180\u017d\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0187\5\6\4\2\u0186\u0182\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2"+
		"\2\2\u0188\u0189\7\t\2\2\u0189K\3\2\2\2\u018a\u018b\5@!\2\u018b\u018c"+
		"\7\n\2\2\u018c\u018e\3\2\2\2\u018d\u018a\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190M\3\2\2\2\u0191\u018f\3\2\2\2"+
		"\u0192\u0193\7%\2\2\u0193\u0194\7.\2\2\u0194\u0195\7\4\2\2\u0195\u0196"+
		"\5L\'\2\u0196\u0197\7\5\2\2\u0197O\3\2\2\2\u0198\u019b\b)\1\2\u0199\u019c"+
		"\7.\2\2\u019a\u019c\5J&\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d\u019e\7\f\2\2\u019e\u019f\7.\2\2\u019f\u01a5\3\2"+
		"\2\2\u01a0\u01a1\f\4\2\2\u01a1\u01a2\7\f\2\2\u01a2\u01a4\7.\2\2\u01a3"+
		"\u01a0\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6Q\3\2\2\2\u01a7\u01a5\3\2\2\2#Xdjrw\u0080\u0089\u0090\u0097"+
		"\u00a7\u00d3\u00d5\u00df\u00eb\u00f4\u00f9\u0103\u0114\u0118\u0122\u0126"+
		"\u014f\u0153\u0155\u0158\u0164\u016c\u0176\u0182\u0186\u018f\u019b\u01a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}