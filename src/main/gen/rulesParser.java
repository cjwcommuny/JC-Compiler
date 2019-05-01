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
		TEST_SYMBOL=1, LEFT_CURLY_BRACE=2, RIGHT_CURLY_BRACE=3, LEFT_BRAKET=4, 
		RIGHT_BRAKET=5, LEFT_PARENTHESES=6, RIGHT_PARENTHESES=7, SEMICOLON=8, 
		COMMA=9, DOT=10, ASSIGN_SYMBOL=11, EQUAL_SYMBOL=12, LOGIC_OR=13, LOGIC_AND=14, 
		LOGIC_NOT=15, ADD=16, SUB=17, MUL=18, DIV=19, XOR=20, AND=21, OR=22, NOT=23, 
		DOUBLE_LITERAL=24, INT_LITERAL=25, CHAR_LITERAL=26, STRING_LITERAL=27, 
		BOOL_LITERAL=28, NAMESPACE_SYMBOL=29, FUNCTION_DEFINITION_SYMBOL=30, IF_SYMBOL=31, 
		WHILE_SYMBOL=32, ELSE_SYMBOL=33, ELSE_IF_SYMBOL=34, RETURN_SYMBOL=35, 
		CONTINUE_SYMBOL=36, FOR_SYMBOL=37, BREAK_SYMBOL=38, IDENTIFIER=39, WHITE_SPACE=40, 
		NEW_LINE_SYMBOL=41;
	public static final int
		RULE_rValue = 0, RULE_lValue = 1, RULE_program = 2, RULE_code = 3, RULE_codeContent = 4, 
		RULE_assignment = 5, RULE_variableDefinition = 6, RULE_ordinaryVariableDefinition = 7, 
		RULE_variableDeclaration = 8, RULE_simpleVariableDeclaration = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"rValue", "lValue", "program", "code", "codeContent", "assignment", "variableDefinition", 
			"ordinaryVariableDefinition", "variableDeclaration", "simpleVariableDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
			"'.'", "'='", "'=='", "'||'", "'&&'", "'!'", "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'&'", "'|'", "'~'", null, null, null, null, null, "'namespace'", 
			"'def'", "'if'", "'while'", "'else'", "'elif'", "'return'", "'continue'", 
			"'for'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRAKET", 
			"RIGHT_BRAKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", 
			"COMMA", "DOT", "ASSIGN_SYMBOL", "EQUAL_SYMBOL", "LOGIC_OR", "LOGIC_AND", 
			"LOGIC_NOT", "ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "DOUBLE_LITERAL", 
			"INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
			"FUNCTION_DEFINITION_SYMBOL", "IF_SYMBOL", "WHILE_SYMBOL", "ELSE_SYMBOL", 
			"ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", "FOR_SYMBOL", "BREAK_SYMBOL", 
			"IDENTIFIER", "WHITE_SPACE", "NEW_LINE_SYMBOL"
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

	public static class RValueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(rulesParser.INT_LITERAL, 0); }
		public TerminalNode DOUBLE_LITERAL() { return getToken(rulesParser.DOUBLE_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(rulesParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(rulesParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(rulesParser.BOOL_LITERAL, 0); }
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
		enterRule(_localctx, 0, RULE_rValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE_LITERAL) | (1L << INT_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << BOOL_LITERAL))) != 0)) ) {
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

	public static class LValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
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
		LValueContext _localctx = new LValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
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

	public static class ProgramContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode NAMESPACE_SYMBOL() { return getToken(rulesParser.NAMESPACE_SYMBOL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(rulesParser.IDENTIFIER, 0); }
		public TerminalNode LEFT_CURLY_BRACE() { return getToken(rulesParser.LEFT_CURLY_BRACE, 0); }
		public TerminalNode RIGHT_CURLY_BRACE() { return getToken(rulesParser.RIGHT_CURLY_BRACE, 0); }
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
		enterRule(_localctx, 4, RULE_program);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				code();
				}
				break;
			case NAMESPACE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(NAMESPACE_SYMBOL);
				setState(26);
				match(IDENTIFIER);
				setState(27);
				match(LEFT_CURLY_BRACE);
				setState(28);
				code();
				setState(29);
				match(RIGHT_CURLY_BRACE);
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
		enterRule(_localctx, 6, RULE_code);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case RIGHT_CURLY_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					codeContent();
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
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
		enterRule(_localctx, 8, RULE_codeContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			variableDefinition();
			setState(42);
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			lValue();
			setState(45);
			match(ASSIGN_SYMBOL);
			setState(46);
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
		enterRule(_localctx, 12, RULE_variableDefinition);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				ordinaryVariableDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
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
		enterRule(_localctx, 14, RULE_ordinaryVariableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			simpleVariableDeclaration();
			setState(53);
			match(ASSIGN_SYMBOL);
			setState(54);
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
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			simpleVariableDeclaration();
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
		enterRule(_localctx, 18, RULE_simpleVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(IDENTIFIER);
			setState(59);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+@\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\"\n\4\3\5\3\5\6\5&\n\5\r"+
		"\5\16\5\'\5\5*\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\65\n\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24"+
		"\2\3\3\2\32\36\29\2\26\3\2\2\2\4\30\3\2\2\2\6!\3\2\2\2\b)\3\2\2\2\n+\3"+
		"\2\2\2\f.\3\2\2\2\16\64\3\2\2\2\20\66\3\2\2\2\22:\3\2\2\2\24<\3\2\2\2"+
		"\26\27\t\2\2\2\27\3\3\2\2\2\30\31\7)\2\2\31\5\3\2\2\2\32\"\5\b\5\2\33"+
		"\34\7\37\2\2\34\35\7)\2\2\35\36\7\4\2\2\36\37\5\b\5\2\37 \7\5\2\2 \"\3"+
		"\2\2\2!\32\3\2\2\2!\33\3\2\2\2\"\7\3\2\2\2#*\3\2\2\2$&\5\n\6\2%$\3\2\2"+
		"\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)#\3\2\2\2)%\3\2\2\2*\t\3"+
		"\2\2\2+,\5\16\b\2,-\7\n\2\2-\13\3\2\2\2./\5\4\3\2/\60\7\r\2\2\60\61\5"+
		"\2\2\2\61\r\3\2\2\2\62\65\5\20\t\2\63\65\5\22\n\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\17\3\2\2\2\66\67\5\24\13\2\678\7\r\2\289\5\2\2\29\21\3\2\2"+
		"\2:;\5\24\13\2;\23\3\2\2\2<=\7)\2\2=>\7)\2\2>\25\3\2\2\2\6!\')\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}