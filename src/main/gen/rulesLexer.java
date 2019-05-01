// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/rules.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRACKET", 
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


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0127\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\5\31\u008f\n\31\3\31\7\31\u0092\n\31"+
		"\f\31\16\31\u0095\13\31\3\31\5\31\u0098\n\31\3\31\6\31\u009b\n\31\r\31"+
		"\16\31\u009c\3\32\5\32\u00a0\n\32\3\32\6\32\u00a3\n\32\r\32\16\32\u00a4"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\7\34\u00ad\n\34\f\34\16\34\u00b0\13\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00bd\n\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\7)\u0103\n)\f)\16)\u0106\13)\3*\6*"+
		"\u0109\n*\r*\16*\u010a\3*\3*\3+\3+\3+\3+\7+\u0113\n+\f+\16+\u0116\13+"+
		"\3+\3+\3,\3,\3,\3,\7,\u011e\n,\f,\16,\u0121\13,\3,\3,\3,\3,\3,\3\u011f"+
		"\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\n\4\2--//\3\2\62;\4\2C\\c|\7\2"+
		"\13\13\"\"\62;C\\c|\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\2\u0132\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5^\3\2\2\2\7`\3\2"+
		"\2\2\tb\3\2\2\2\13d\3\2\2\2\rf\3\2\2\2\17h\3\2\2\2\21j\3\2\2\2\23l\3\2"+
		"\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33u\3\2\2\2\35x\3\2\2\2\37{\3"+
		"\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085\3"+
		"\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u008b\3\2\2\2\61\u008e\3\2\2\2\63"+
		"\u009f\3\2\2\2\65\u00a6\3\2\2\2\67\u00aa\3\2\2\29\u00bc\3\2\2\2;\u00be"+
		"\3\2\2\2=\u00c8\3\2\2\2?\u00cc\3\2\2\2A\u00d3\3\2\2\2C\u00d6\3\2\2\2E"+
		"\u00dc\3\2\2\2G\u00e1\3\2\2\2I\u00e6\3\2\2\2K\u00ed\3\2\2\2M\u00f6\3\2"+
		"\2\2O\u00fa\3\2\2\2Q\u0100\3\2\2\2S\u0108\3\2\2\2U\u010e\3\2\2\2W\u0119"+
		"\3\2\2\2YZ\7V\2\2Z[\7G\2\2[\\\7U\2\2\\]\7V\2\2]\4\3\2\2\2^_\7}\2\2_\6"+
		"\3\2\2\2`a\7\177\2\2a\b\3\2\2\2bc\7]\2\2c\n\3\2\2\2de\7_\2\2e\f\3\2\2"+
		"\2fg\7*\2\2g\16\3\2\2\2hi\7+\2\2i\20\3\2\2\2jk\7=\2\2k\22\3\2\2\2lm\7"+
		".\2\2m\24\3\2\2\2no\7\60\2\2o\26\3\2\2\2pq\7?\2\2q\30\3\2\2\2rs\7?\2\2"+
		"st\7?\2\2t\32\3\2\2\2uv\7~\2\2vw\7~\2\2w\34\3\2\2\2xy\7(\2\2yz\7(\2\2"+
		"z\36\3\2\2\2{|\7#\2\2| \3\2\2\2}~\7-\2\2~\"\3\2\2\2\177\u0080\7/\2\2\u0080"+
		"$\3\2\2\2\u0081\u0082\7,\2\2\u0082&\3\2\2\2\u0083\u0084\7\61\2\2\u0084"+
		"(\3\2\2\2\u0085\u0086\7`\2\2\u0086*\3\2\2\2\u0087\u0088\7(\2\2\u0088,"+
		"\3\2\2\2\u0089\u008a\7~\2\2\u008a.\3\2\2\2\u008b\u008c\7\u0080\2\2\u008c"+
		"\60\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2"+
		"\2\u008f\u0093\3\2\2\2\u0090\u0092\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0095"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0098\7\60\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\t\3\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\62\3\2\2"+
		"\2\u009e\u00a0\t\2\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7)\2\2"+
		"\u00a7\u00a8\t\4\2\2\u00a8\u00a9\7)\2\2\u00a9\66\3\2\2\2\u00aa\u00ae\7"+
		"$\2\2\u00ab\u00ad\t\5\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\7$\2\2\u00b28\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5"+
		"\7t\2\2\u00b5\u00b6\7w\2\2\u00b6\u00bd\7g\2\2\u00b7\u00b8\7h\2\2\u00b8"+
		"\u00b9\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bd\7g\2\2"+
		"\u00bc\u00b3\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd:\3\2\2\2\u00be\u00bf\7"+
		"p\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7o\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7u\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7e\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7f\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb>\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7v\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7e\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2@\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7h\2\2\u00d5B\3\2\2\2\u00d6"+
		"\u00d7\7y\2\2\u00d7\u00d8\7j\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7n\2\2"+
		"\u00da\u00db\7g\2\2\u00dbD\3\2\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7n\2"+
		"\2\u00de\u00df\7u\2\2\u00df\u00e0\7g\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7"+
		"g\2\2\u00e2\u00e3\7n\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7h\2\2\u00e5H"+
		"\3\2\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u00ea\7w\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7p\2\2\u00ecJ\3\2\2\2\u00ed"+
		"\u00ee\7e\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7v\2\2"+
		"\u00f1\u00f2\7k\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7w\2\2\u00f4\u00f5"+
		"\7g\2\2\u00f5L\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9"+
		"\7t\2\2\u00f9N\3\2\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd"+
		"\7g\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7m\2\2\u00ffP\3\2\2\2\u0100\u0104"+
		"\t\6\2\2\u0101\u0103\t\7\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105R\3\2\2\2\u0106\u0104\3\2\2\2"+
		"\u0107\u0109\t\b\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b*\2\2\u010d"+
		"T\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110\7\61\2\2\u0110\u0114\3\2\2"+
		"\2\u0111\u0113\n\t\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117"+
		"\u0118\b+\2\2\u0118V\3\2\2\2\u0119\u011a\7\61\2\2\u011a\u011b\7,\2\2\u011b"+
		"\u011f\3\2\2\2\u011c\u011e\13\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7,\2\2\u0123\u0124\7\61\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\b,\2\2\u0126X\3\2\2\2\17\2\u008e\u0093\u0097\u009c\u009f"+
		"\u00a4\u00ae\u00bc\u0104\u010a\u0114\u011f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}