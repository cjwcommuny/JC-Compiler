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
		TEST_SYMBOL=1, LEFT_CURLY_BRACE=2, RIGHT_CURLY_BRACE=3, LEFT_BRAKET=4, 
		RIGHT_BRAKET=5, LEFT_PARENTHESES=6, RIGHT_PARENTHESES=7, SEMICOLON=8, 
		COMMA=9, DOT=10, ASSIGN_SYMBOL=11, EQUAL_SYMBOL=12, LOGIC_OR=13, LOGIC_AND=14, 
		LOGIC_NOT=15, ADD=16, SUB=17, MUL=18, DIV=19, XOR=20, AND=21, OR=22, NOT=23, 
		DOUBLE_LITERAL=24, INT_LITERAL=25, CHAR_LITERAL=26, STRING_LITERAL=27, 
		BOOL_LITERAL=28, NAMESPACE_SYMBOL=29, FUNCTION_DEFINITION_SYMBOL=30, IF_SYMBOL=31, 
		WHILE_SYMBOL=32, ELSE_SYMBOL=33, ELSE_IF_SYMBOL=34, RETURN_SYMBOL=35, 
		CONTINUE_SYMBOL=36, FOR_SYMBOL=37, BREAK_SYMBOL=38, INT_SYMBOL=39, DOUBLE_SYMBOL=40, 
		CHAR_SYMBOL=41, STRING_SYMBOL=42, BOOL_SYMBOL=43, FUNCTION_NAME=44, TYPE_NAME=45, 
		VARIABLE_NAME=46, IDENTIFIER=47, WHITE_SPACE=48, NEW_LINE_SYMBOL=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRAKET", 
			"RIGHT_BRAKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", 
			"COMMA", "DOT", "ASSIGN_SYMBOL", "EQUAL_SYMBOL", "LOGIC_OR", "LOGIC_AND", 
			"LOGIC_NOT", "ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "DOUBLE_LITERAL", 
			"INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
			"FUNCTION_DEFINITION_SYMBOL", "IF_SYMBOL", "WHILE_SYMBOL", "ELSE_SYMBOL", 
			"ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", "FOR_SYMBOL", "BREAK_SYMBOL", 
			"INT_SYMBOL", "DOUBLE_SYMBOL", "CHAR_SYMBOL", "STRING_SYMBOL", "BOOL_SYMBOL", 
			"FUNCTION_NAME", "TYPE_NAME", "VARIABLE_NAME", "IDENTIFIER", "WHITE_SPACE", 
			"NEW_LINE_SYMBOL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
			"'.'", "'='", "'=='", "'||'", "'&&'", "'!'", "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'&'", "'|'", "'~'", null, null, null, null, null, "'namespace'", 
			"'def'", "'if'", "'while'", "'else'", "'elif'", "'return'", "'continue'", 
			"'for'", "'break'", "'int'", "'double'", "'char'", "'string'", "'bool'"
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
			"INT_SYMBOL", "DOUBLE_SYMBOL", "CHAR_SYMBOL", "STRING_SYMBOL", "BOOL_SYMBOL", 
			"FUNCTION_NAME", "TYPE_NAME", "VARIABLE_NAME", "IDENTIFIER", "WHITE_SPACE", 
			"NEW_LINE_SYMBOL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0143\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\5\31\u009b\n\31\3\31\7\31\u009e\n\31\f\31\16\31\u00a1"+
		"\13\31\3\31\5\31\u00a4\n\31\3\31\6\31\u00a7\n\31\r\31\16\31\u00a8\3\32"+
		"\5\32\u00ac\n\32\3\32\6\32\u00af\n\32\r\32\16\32\u00b0\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\7\34\u00b9\n\34\f\34\16\34\u00bc\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00c9\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,"+
		"\3,\3,\3,\3-\3-\7-\u0124\n-\f-\16-\u0127\13-\3.\3.\7.\u012b\n.\f.\16."+
		"\u012e\13.\3/\3/\7/\u0132\n/\f/\16/\u0135\13/\3\60\3\60\5\60\u0139\n\60"+
		"\3\61\6\61\u013c\n\61\r\61\16\61\u013d\3\61\3\61\3\62\3\62\2\2\63\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\n\4\2--//\3\2\62;\4"+
		"\2C\\c|\7\2\13\13\"\"\62;C\\c|\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f"+
		"\17\17\"\"\4\2\f\f\17\17\2\u014f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5j\3\2\2\2"+
		"\7l\3\2\2\2\tn\3\2\2\2\13p\3\2\2\2\rr\3\2\2\2\17t\3\2\2\2\21v\3\2\2\2"+
		"\23x\3\2\2\2\25z\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2\33\u0081\3\2\2\2\35\u0084"+
		"\3\2\2\2\37\u0087\3\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2"+
		"\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2/\u0097\3"+
		"\2\2\2\61\u009a\3\2\2\2\63\u00ab\3\2\2\2\65\u00b2\3\2\2\2\67\u00b6\3\2"+
		"\2\29\u00c8\3\2\2\2;\u00ca\3\2\2\2=\u00d4\3\2\2\2?\u00d8\3\2\2\2A\u00db"+
		"\3\2\2\2C\u00e1\3\2\2\2E\u00e6\3\2\2\2G\u00eb\3\2\2\2I\u00f2\3\2\2\2K"+
		"\u00fb\3\2\2\2M\u00ff\3\2\2\2O\u0105\3\2\2\2Q\u0109\3\2\2\2S\u0110\3\2"+
		"\2\2U\u0115\3\2\2\2W\u011c\3\2\2\2Y\u0121\3\2\2\2[\u0128\3\2\2\2]\u012f"+
		"\3\2\2\2_\u0138\3\2\2\2a\u013b\3\2\2\2c\u0141\3\2\2\2ef\7V\2\2fg\7G\2"+
		"\2gh\7U\2\2hi\7V\2\2i\4\3\2\2\2jk\7}\2\2k\6\3\2\2\2lm\7\177\2\2m\b\3\2"+
		"\2\2no\7]\2\2o\n\3\2\2\2pq\7_\2\2q\f\3\2\2\2rs\7*\2\2s\16\3\2\2\2tu\7"+
		"+\2\2u\20\3\2\2\2vw\7=\2\2w\22\3\2\2\2xy\7.\2\2y\24\3\2\2\2z{\7\60\2\2"+
		"{\26\3\2\2\2|}\7?\2\2}\30\3\2\2\2~\177\7?\2\2\177\u0080\7?\2\2\u0080\32"+
		"\3\2\2\2\u0081\u0082\7~\2\2\u0082\u0083\7~\2\2\u0083\34\3\2\2\2\u0084"+
		"\u0085\7(\2\2\u0085\u0086\7(\2\2\u0086\36\3\2\2\2\u0087\u0088\7#\2\2\u0088"+
		" \3\2\2\2\u0089\u008a\7-\2\2\u008a\"\3\2\2\2\u008b\u008c\7/\2\2\u008c"+
		"$\3\2\2\2\u008d\u008e\7,\2\2\u008e&\3\2\2\2\u008f\u0090\7\61\2\2\u0090"+
		"(\3\2\2\2\u0091\u0092\7`\2\2\u0092*\3\2\2\2\u0093\u0094\7(\2\2\u0094,"+
		"\3\2\2\2\u0095\u0096\7~\2\2\u0096.\3\2\2\2\u0097\u0098\7\u0080\2\2\u0098"+
		"\60\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2"+
		"\2\u009b\u009f\3\2\2\2\u009c\u009e\t\3\2\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a4\7\60\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3"+
		"\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\62\3\2\2"+
		"\2\u00aa\u00ac\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae"+
		"\3\2\2\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7)\2\2"+
		"\u00b3\u00b4\t\4\2\2\u00b4\u00b5\7)\2\2\u00b5\66\3\2\2\2\u00b6\u00ba\7"+
		"$\2\2\u00b7\u00b9\t\5\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bd\u00be\7$\2\2\u00be8\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c9\7g\2\2\u00c3\u00c4\7h\2\2\u00c4"+
		"\u00c5\7c\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c9\7g\2\2"+
		"\u00c8\u00bf\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7"+
		"p\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7o\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7u\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7e\2\2\u00d2"+
		"\u00d3\7g\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7h\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7h\2\2\u00da"+
		"@\3\2\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7j\2\2\u00dd\u00de\7k\2\2\u00de"+
		"\u00df\7n\2\2\u00df\u00e0\7g\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7n\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5D\3\2\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7h\2\2"+
		"\u00eaF\3\2\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7v\2"+
		"\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7p\2\2\u00f1H\3\2"+
		"\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6"+
		"\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7w\2\2\u00f9"+
		"\u00fa\7g\2\2\u00faJ\3\2\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7q\2\2\u00fd"+
		"\u00fe\7t\2\2\u00feL\3\2\2\2\u00ff\u0100\7d\2\2\u0100\u0101\7t\2\2\u0101"+
		"\u0102\7g\2\2\u0102\u0103\7c\2\2\u0103\u0104\7m\2\2\u0104N\3\2\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2\u0108P\3\2\2\2\u0109"+
		"\u010a\7f\2\2\u010a\u010b\7q\2\2\u010b\u010c\7w\2\2\u010c\u010d\7d\2\2"+
		"\u010d\u010e\7n\2\2\u010e\u010f\7g\2\2\u010fR\3\2\2\2\u0110\u0111\7e\2"+
		"\2\u0111\u0112\7j\2\2\u0112\u0113\7c\2\2\u0113\u0114\7t\2\2\u0114T\3\2"+
		"\2\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7t\2\2\u0118\u0119"+
		"\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7i\2\2\u011bV\3\2\2\2\u011c\u011d"+
		"\7d\2\2\u011d\u011e\7q\2\2\u011e\u011f\7q\2\2\u011f\u0120\7n\2\2\u0120"+
		"X\3\2\2\2\u0121\u0125\t\6\2\2\u0122\u0124\t\7\2\2\u0123\u0122\3\2\2\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126Z\3"+
		"\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\t\6\2\2\u0129\u012b\t\7\2\2\u012a"+
		"\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\\\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0133\t\6\2\2\u0130\u0132"+
		"\t\7\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134^\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0139\5Y-\2\u0137"+
		"\u0139\5]/\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139`\3\2\2\2\u013a"+
		"\u013c\t\b\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\61\2\2\u0140"+
		"b\3\2\2\2\u0141\u0142\t\t\2\2\u0142d\3\2\2\2\20\2\u009a\u009f\u00a3\u00a8"+
		"\u00ab\u00b0\u00ba\u00c8\u0125\u012c\u0133\u0138\u013d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}