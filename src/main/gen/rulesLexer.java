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
		LEFT_CURLY_BRACE=1, RIGHT_CURLY_BRACE=2, LEFT_BRAKET=3, RIGHT_BRAKET=4, 
		LEFT_PARENTHESES=5, RIGHT_PARENTHESES=6, SEMICOLON=7, COMMA=8, DOT=9, 
		ASSIGN_SYMBOL=10, EQUAL_SYMBOL=11, LOGIC_OR=12, LOGIC_AND=13, LOGIC_NOT=14, 
		DOUBLE_LITERAL=15, INT_LITERAL=16, CHAR_LITERAL=17, STRING_LITERAL=18, 
		BOOL_LITERAL=19, ADD=20, SUB=21, MUL=22, DIV=23, XOR=24, AND=25, OR=26, 
		NOT=27, FUNCTION_NAME=28, TYPE_NAME=29, VARIABLE_NAME=30, IDENTIFIER=31, 
		NAMESPACE=32, FUNCTION_DEFINITION_SYMBOL=33, IF_SYMBOL=34, WHILE_SYMBOL=35, 
		ELSE_SYMBOL=36, ELSE_IF_SYMBOL=37, RETURN_SYMBOL=38, CONTINUE_SYMBOL=39, 
		FOR_SYMBOL=40, BREAK_SYMBOL=41, INT_SYMBOL=42, DOUBLE_SYMBOL=43, CHAR_SYMBOL=44, 
		STRING_SYMBOL=45, BOOL_SYMBOL=46, WHITE_SPACE=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRAKET", "RIGHT_BRAKET", 
			"LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", "COMMA", "DOT", 
			"ASSIGN_SYMBOL", "EQUAL_SYMBOL", "LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", 
			"DOUBLE_LITERAL", "INT_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "BOOL_LITERAL", 
			"ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "FUNCTION_NAME", 
			"TYPE_NAME", "VARIABLE_NAME", "IDENTIFIER", "NAMESPACE", "FUNCTION_DEFINITION_SYMBOL", 
			"IF_SYMBOL", "WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", 
			"CONTINUE_SYMBOL", "FOR_SYMBOL", "BREAK_SYMBOL", "INT_SYMBOL", "DOUBLE_SYMBOL", 
			"CHAR_SYMBOL", "STRING_SYMBOL", "BOOL_SYMBOL", "WHITE_SPACE"
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
			"TYPE_NAME", "VARIABLE_NAME", "IDENTIFIER", "NAMESPACE", "FUNCTION_DEFINITION_SYMBOL", 
			"IF_SYMBOL", "WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", 
			"CONTINUE_SYMBOL", "FOR_SYMBOL", "BREAK_SYMBOL", "INT_SYMBOL", "DOUBLE_SYMBOL", 
			"CHAR_SYMBOL", "STRING_SYMBOL", "BOOL_SYMBOL", "WHITE_SPACE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0138\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\20\5\20\u0082\n\20\3\20\7\20\u0085\n\20"+
		"\f\20\16\20\u0088\13\20\3\20\5\20\u008b\n\20\3\20\6\20\u008e\n\20\r\20"+
		"\16\20\u008f\3\21\5\21\u0093\n\21\3\21\6\21\u0096\n\21\r\21\16\21\u0097"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00a0\n\23\f\23\16\23\u00a3\13\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b0\n\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\7\35\u00c4\n\35\f\35\16\35\u00c7\13\35\3\36\3\36"+
		"\7\36\u00cb\n\36\f\36\16\36\u00ce\13\36\3\37\3\37\7\37\u00d2\n\37\f\37"+
		"\16\37\u00d5\13\37\3 \3 \5 \u00d9\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\6\60\u0133\n\60\r\60\16\60\u0134"+
		"\3\60\3\60\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\t\4\2"+
		"--//\3\2\62;\4\2C\\c|\7\2\13\13\"\"\62;C\\c|\6\2&&C\\aac|\7\2&&\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\2\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2"+
		"\13i\3\2\2\2\rk\3\2\2\2\17m\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25s\3\2\2"+
		"\2\27u\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35~\3\2\2\2\37\u0081\3\2\2\2!\u0092"+
		"\3\2\2\2#\u0099\3\2\2\2%\u009d\3\2\2\2\'\u00af\3\2\2\2)\u00b1\3\2\2\2"+
		"+\u00b3\3\2\2\2-\u00b5\3\2\2\2/\u00b7\3\2\2\2\61\u00b9\3\2\2\2\63\u00bb"+
		"\3\2\2\2\65\u00bd\3\2\2\2\67\u00bf\3\2\2\29\u00c1\3\2\2\2;\u00c8\3\2\2"+
		"\2=\u00cf\3\2\2\2?\u00d8\3\2\2\2A\u00da\3\2\2\2C\u00e4\3\2\2\2E\u00e8"+
		"\3\2\2\2G\u00eb\3\2\2\2I\u00f1\3\2\2\2K\u00f6\3\2\2\2M\u00fb\3\2\2\2O"+
		"\u0102\3\2\2\2Q\u010b\3\2\2\2S\u010f\3\2\2\2U\u0115\3\2\2\2W\u0119\3\2"+
		"\2\2Y\u0120\3\2\2\2[\u0125\3\2\2\2]\u012c\3\2\2\2_\u0132\3\2\2\2ab\7}"+
		"\2\2b\4\3\2\2\2cd\7\177\2\2d\6\3\2\2\2ef\7]\2\2f\b\3\2\2\2gh\7_\2\2h\n"+
		"\3\2\2\2ij\7*\2\2j\f\3\2\2\2kl\7+\2\2l\16\3\2\2\2mn\7=\2\2n\20\3\2\2\2"+
		"op\7.\2\2p\22\3\2\2\2qr\7\60\2\2r\24\3\2\2\2st\7?\2\2t\26\3\2\2\2uv\7"+
		"?\2\2vw\7?\2\2w\30\3\2\2\2xy\7~\2\2yz\7~\2\2z\32\3\2\2\2{|\7(\2\2|}\7"+
		"(\2\2}\34\3\2\2\2~\177\7#\2\2\177\36\3\2\2\2\u0080\u0082\t\2\2\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0086\3\2\2\2\u0083\u0085\t\3"+
		"\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7\60"+
		"\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008e\t\3\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090 \3\2\2\2\u0091\u0093\t\2\2\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0096\t\3\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\"\3\2\2\2\u0099\u009a\7)\2\2\u009a\u009b\t\4\2\2\u009b\u009c"+
		"\7)\2\2\u009c$\3\2\2\2\u009d\u00a1\7$\2\2\u009e\u00a0\t\5\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7$\2\2\u00a5&\3\2\2\2\u00a6"+
		"\u00a7\7v\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7w\2\2\u00a9\u00b0\7g\2\2"+
		"\u00aa\u00ab\7h\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae"+
		"\7u\2\2\u00ae\u00b0\7g\2\2\u00af\u00a6\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0"+
		"(\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2*\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4,"+
		"\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6.\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8"+
		"\60\3\2\2\2\u00b9\u00ba\7`\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc"+
		"\64\3\2\2\2\u00bd\u00be\7~\2\2\u00be\66\3\2\2\2\u00bf\u00c0\7\u0080\2"+
		"\2\u00c08\3\2\2\2\u00c1\u00c5\t\6\2\2\u00c2\u00c4\t\7\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		":\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cc\t\6\2\2\u00c9\u00cb\t\7\2\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd<\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d3\t\6\2\2\u00d0"+
		"\u00d2\t\7\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4>\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9"+
		"\59\35\2\u00d7\u00d9\5=\37\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"@\3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7o\2\2\u00dd"+
		"\u00de\7g\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1\u00e2\7e\2\2\u00e2\u00e3\7g\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7f\2"+
		"\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7h\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7"+
		"k\2\2\u00e9\u00ea\7h\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7y\2\2\u00ec\u00ed"+
		"\7j\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0"+
		"H\3\2\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7u\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7n\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7h\2\2\u00faL\3\2\2\2\u00fb\u00fc\7t\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7w\2\2\u00ff\u0100\7t\2\2"+
		"\u0100\u0101\7p\2\2\u0101N\3\2\2\2\u0102\u0103\7e\2\2\u0103\u0104\7q\2"+
		"\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2\u0106\u0107\7k\2\2\u0107\u0108"+
		"\7p\2\2\u0108\u0109\7w\2\2\u0109\u010a\7g\2\2\u010aP\3\2\2\2\u010b\u010c"+
		"\7h\2\2\u010c\u010d\7q\2\2\u010d\u010e\7t\2\2\u010eR\3\2\2\2\u010f\u0110"+
		"\7d\2\2\u0110\u0111\7t\2\2\u0111\u0112\7g\2\2\u0112\u0113\7c\2\2\u0113"+
		"\u0114\7m\2\2\u0114T\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117"+
		"\u0118\7v\2\2\u0118V\3\2\2\2\u0119\u011a\7f\2\2\u011a\u011b\7q\2\2\u011b"+
		"\u011c\7w\2\2\u011c\u011d\7d\2\2\u011d\u011e\7n\2\2\u011e\u011f\7g\2\2"+
		"\u011fX\3\2\2\2\u0120\u0121\7e\2\2\u0121\u0122\7j\2\2\u0122\u0123\7c\2"+
		"\2\u0123\u0124\7t\2\2\u0124Z\3\2\2\2\u0125\u0126\7u\2\2\u0126\u0127\7"+
		"v\2\2\u0127\u0128\7t\2\2\u0128\u0129\7k\2\2\u0129\u012a\7p\2\2\u012a\u012b"+
		"\7i\2\2\u012b\\\3\2\2\2\u012c\u012d\7d\2\2\u012d\u012e\7q\2\2\u012e\u012f"+
		"\7q\2\2\u012f\u0130\7n\2\2\u0130^\3\2\2\2\u0131\u0133\t\b\2\2\u0132\u0131"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\b\60\2\2\u0137`\3\2\2\2\20\2\u0081\u0086\u008a"+
		"\u008f\u0092\u0097\u00a1\u00af\u00c5\u00cc\u00d3\u00d8\u0134\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}