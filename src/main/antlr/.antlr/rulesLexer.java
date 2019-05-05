// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/rules.g4 by ANTLR 4.7.1
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRACKET", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0139\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\5\35\u00a1\n\35\3\35\7\35"+
		"\u00a4\n\35\f\35\16\35\u00a7\13\35\3\35\5\35\u00aa\n\35\3\35\6\35\u00ad"+
		"\n\35\r\35\16\35\u00ae\3\36\5\36\u00b2\n\36\3\36\6\36\u00b5\n\36\r\36"+
		"\16\36\u00b6\3\37\3\37\3\37\3\37\3 \3 \7 \u00bf\n \f \16 \u00c2\13 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u00cf\n!\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\7-\u0115\n-\f-"+
		"\16-\u0118\13-\3.\6.\u011b\n.\r.\16.\u011c\3.\3.\3/\3/\3/\3/\7/\u0125"+
		"\n/\f/\16/\u0128\13/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0130\n\60\f\60\16"+
		"\60\u0133\13\60\3\60\3\60\3\60\3\60\3\60\3\u0131\2\61\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\n\4\2--//\3\2\62;\4\2C\\c|\7\2\13\13\""+
		"\"\62;C\\c|\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\2\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5f\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2"+
		"\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2"+
		"\2\2\33}\3\2\2\2\35\u0080\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2#\u0086"+
		"\3\2\2\2%\u0088\3\2\2\2\'\u008a\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2"+
		"-\u0090\3\2\2\2/\u0092\3\2\2\2\61\u0094\3\2\2\2\63\u0097\3\2\2\2\65\u0099"+
		"\3\2\2\2\67\u009c\3\2\2\29\u00a0\3\2\2\2;\u00b1\3\2\2\2=\u00b8\3\2\2\2"+
		"?\u00bc\3\2\2\2A\u00ce\3\2\2\2C\u00d0\3\2\2\2E\u00da\3\2\2\2G\u00de\3"+
		"\2\2\2I\u00e5\3\2\2\2K\u00e8\3\2\2\2M\u00ee\3\2\2\2O\u00f3\3\2\2\2Q\u00f8"+
		"\3\2\2\2S\u00ff\3\2\2\2U\u0108\3\2\2\2W\u010c\3\2\2\2Y\u0112\3\2\2\2["+
		"\u011a\3\2\2\2]\u0120\3\2\2\2_\u012b\3\2\2\2ab\7V\2\2bc\7G\2\2cd\7U\2"+
		"\2de\7V\2\2e\4\3\2\2\2fg\7}\2\2g\6\3\2\2\2hi\7\177\2\2i\b\3\2\2\2jk\7"+
		"]\2\2k\n\3\2\2\2lm\7_\2\2m\f\3\2\2\2no\7*\2\2o\16\3\2\2\2pq\7+\2\2q\20"+
		"\3\2\2\2rs\7=\2\2s\22\3\2\2\2tu\7.\2\2u\24\3\2\2\2vw\7\60\2\2w\26\3\2"+
		"\2\2xy\7?\2\2y\30\3\2\2\2z{\7~\2\2{|\7~\2\2|\32\3\2\2\2}~\7(\2\2~\177"+
		"\7(\2\2\177\34\3\2\2\2\u0080\u0081\7#\2\2\u0081\36\3\2\2\2\u0082\u0083"+
		"\7-\2\2\u0083 \3\2\2\2\u0084\u0085\7/\2\2\u0085\"\3\2\2\2\u0086\u0087"+
		"\7,\2\2\u0087$\3\2\2\2\u0088\u0089\7\61\2\2\u0089&\3\2\2\2\u008a\u008b"+
		"\7`\2\2\u008b(\3\2\2\2\u008c\u008d\7(\2\2\u008d*\3\2\2\2\u008e\u008f\7"+
		"~\2\2\u008f,\3\2\2\2\u0090\u0091\7\u0080\2\2\u0091.\3\2\2\2\u0092\u0093"+
		"\7>\2\2\u0093\60\3\2\2\2\u0094\u0095\7>\2\2\u0095\u0096\7?\2\2\u0096\62"+
		"\3\2\2\2\u0097\u0098\7@\2\2\u0098\64\3\2\2\2\u0099\u009a\7@\2\2\u009a"+
		"\u009b\7?\2\2\u009b\66\3\2\2\2\u009c\u009d\7?\2\2\u009d\u009e\7?\2\2\u009e"+
		"8\3\2\2\2\u009f\u00a1\t\2\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u00a5\3\2\2\2\u00a2\u00a4\t\3\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00aa\7\60\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00ad\t\3\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af:\3\2\2\2"+
		"\u00b0\u00b2\t\2\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4"+
		"\3\2\2\2\u00b3\u00b5\t\3\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7)\2\2\u00b9"+
		"\u00ba\t\4\2\2\u00ba\u00bb\7)\2\2\u00bb>\3\2\2\2\u00bc\u00c0\7$\2\2\u00bd"+
		"\u00bf\t\5\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7$\2\2\u00c4@\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7"+
		"\u00c8\7w\2\2\u00c8\u00cf\7g\2\2\u00c9\u00ca\7h\2\2\u00ca\u00cb\7c\2\2"+
		"\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00cf\7g\2\2\u00ce\u00c5"+
		"\3\2\2\2\u00ce\u00c9\3\2\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2"+
		"\7c\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5"+
		"\u00d6\7r\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7g\2\2"+
		"\u00d9D\3\2\2\2\u00da\u00db\7f\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7h\2"+
		"\2\u00ddF\3\2\2\2\u00de\u00df\7u\2\2\u00df\u00e0\7v\2\2\u00e0\u00e1\7"+
		"t\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7v\2\2\u00e4H"+
		"\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7h\2\2\u00e7J\3\2\2\2\u00e8\u00e9"+
		"\7y\2\2\u00e9\u00ea\7j\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7n\2\2\u00ec"+
		"\u00ed\7g\2\2\u00edL\3\2\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7n\2\2\u00f0"+
		"\u00f1\7u\2\2\u00f1\u00f2\7g\2\2\u00f2N\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7n\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7h\2\2\u00f7P\3\2\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7w\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd\u00fe\7p\2\2\u00feR\3\2\2\2\u00ff\u0100\7e\2"+
		"\2\u0100\u0101\7q\2\2\u0101\u0102\7p\2\2\u0102\u0103\7v\2\2\u0103\u0104"+
		"\7k\2\2\u0104\u0105\7p\2\2\u0105\u0106\7w\2\2\u0106\u0107\7g\2\2\u0107"+
		"T\3\2\2\2\u0108\u0109\7h\2\2\u0109\u010a\7q\2\2\u010a\u010b\7t\2\2\u010b"+
		"V\3\2\2\2\u010c\u010d\7d\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2\u010f"+
		"\u0110\7c\2\2\u0110\u0111\7m\2\2\u0111X\3\2\2\2\u0112\u0116\t\6\2\2\u0113"+
		"\u0115\t\7\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117Z\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b"+
		"\t\b\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\b.\2\2\u011f\\\3\2\2\2"+
		"\u0120\u0121\7\61\2\2\u0121\u0122\7\61\2\2\u0122\u0126\3\2\2\2\u0123\u0125"+
		"\n\t\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\b/"+
		"\2\2\u012a^\3\2\2\2\u012b\u012c\7\61\2\2\u012c\u012d\7,\2\2\u012d\u0131"+
		"\3\2\2\2\u012e\u0130\13\2\2\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0135\7,\2\2\u0135\u0136\7\61\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\b\60\2\2\u0138`\3\2\2\2\17\2\u00a0\u00a5\u00a9\u00ae\u00b1\u00b6"+
		"\u00c0\u00ce\u0116\u011c\u0126\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}