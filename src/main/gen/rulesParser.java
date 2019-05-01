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
		LEFT_CURLY_BRACE=1, RIGHT_CURLY_BRACE=2, LEFT_BRAKET=3, RIGHT_BRAKET=4, 
		LEFT_PARENTHESES=5, RIGHT_PARENTHESES=6, SEMICOLON=7, COMMA=8, DOT=9, 
		ASSIGN_SYMBOL=10, EQUAL_SYMBOL=11, LOGIC_OR=12, LOGIC_AND=13, LOGIC_NOT=14, 
		DOUBLE_LITERAL=15, INT_LITERAL=16, CHAR_LITERAL=17, STRING_LITERAL=18, 
		BOOL_LITERAL=19, ADD=20, SUB=21, MUL=22, DIV=23, XOR=24, AND=25, OR=26, 
		NOT=27, FUNCTION_NAME=28, TYPE_NAME=29, VARIABLE_NAME=30, IDENTIFIER=31, 
		NAMESPACE_SYMBOL=32, FUNCTION_DEFINITION_SYMBOL=33, IF_SYMBOL=34, WHILE_SYMBOL=35, 
		ELSE_SYMBOL=36, ELSE_IF_SYMBOL=37, RETURN_SYMBOL=38, CONTINUE_SYMBOL=39, 
		FOR_SYMBOL=40, BREAK_SYMBOL=41, INT_SYMBOL=42, DOUBLE_SYMBOL=43, CHAR_SYMBOL=44, 
		STRING_SYMBOL=45, BOOL_SYMBOL=46, WHITE_SPACE=47, NEW_LINE_SYMBOL=48;
	public static final int
		RULE_program = 0, RULE_code = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", "'.'", 
			"'='", "'=='", "'||'", "'&&'", "'!'", null, null, null, null, null, "'+'", 
			"'-'", "'*'", "'/'", "'^'", "'&'", "'|'", "'~'", null, null, null, null, 
			"'namespace'", "'def'", "'if'", "'while'", "'else'", "'elif'", "'return'", 
			"'continue'", "'for'", "'break'", "'int'", "'double'", "'char'", "'string'", 
			"'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRAKET", "RIGHT_BRAKET", 
			"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", "COMMA", "DOT", 
			"ASSIGN_SYMBOL", "EQUAL_SYMBOL", "LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", 
			"DOUBLE_LITERAL", "INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", 
			"ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "FUNCTION_NAME", 
			"TYPE_NAME", "VARIABLE_NAME", "IDENTIFIER", "NAMESPACE_SYMBOL", "FUNCTION_DEFINITION_SYMBOL", 
			"IF_SYMBOL", "WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", 
			"CONTINUE_SYMBOL", "FOR_SYMBOL", "BREAK_SYMBOL", "INT_SYMBOL", "DOUBLE_SYMBOL", 
			"CHAR_SYMBOL", "STRING_SYMBOL", "BOOL_SYMBOL", "WHITE_SPACE", "NEW_LINE_SYMBOL"
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

	public static class ProgramContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode NAMESPACE_SYMBOL() { return getToken(rulesParser.NAMESPACE_SYMBOL, 0); }
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
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(11);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				code();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(6);
				match(NAMESPACE_SYMBOL);
				setState(7);
				match(LEFT_CURLY_BRACE);
				setState(8);
				code();
				setState(9);
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

	public static class CodeContext extends ParserRuleContext {
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
		enterRule(_localctx, 2, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\22\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\16\n\2\3\3\3\3\3\3\2\2\4\2\4\2\2"+
		"\2\21\2\r\3\2\2\2\4\17\3\2\2\2\6\16\3\2\2\2\7\16\5\4\3\2\b\t\7\"\2\2\t"+
		"\n\7\3\2\2\n\13\5\4\3\2\13\f\7\4\2\2\f\16\3\2\2\2\r\6\3\2\2\2\r\7\3\2"+
		"\2\2\r\b\3\2\2\2\16\3\3\2\2\2\17\20\3\2\2\2\20\5\3\2\2\2\3\r";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}