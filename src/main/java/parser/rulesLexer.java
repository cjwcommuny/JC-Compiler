// Generated from rules.g4 by ANTLR 4.7.2

package parser;

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
		T__0=1, T__1=2, TEST_SYMBOL=3, LEFT_CURLY_BRACE=4, RIGHT_CURLY_BRACE=5, 
		LEFT_BRACKET=6, RIGHT_BRACKET=7, LEFT_PARENTHESES=8, RIGHT_PARENTHESES=9, 
		SEMICOLON=10, COMMA=11, DOT=12, ASSIGN_SYMBOL=13, LOGIC_OR=14, LOGIC_AND=15, 
		LOGIC_NOT=16, LESS_THAN=17, LESS_OR_EQUAL_THAN=18, GREATER_THAN=19, GREATER_OR_EQUAL_THAN=20, 
		EQUAL_SYMBOL=21, STRING_LITERAL=22, BOOL_LITERAL=23, NAMESPACE_SYMBOL=24, 
		FUNCTION_DEFINITION_SYMBOL=25, CLASS_DEFINITION_SYMNOL=26, IF_SYMBOL=27, 
		WHILE_SYMBOL=28, ELSE_SYMBOL=29, ELSE_IF_SYMBOL=30, RETURN_SYMBOL=31, 
		CONTINUE_SYMBOL=32, FOR_SYMBOL=33, BREAK_SYMBOL=34, IDENTIFIER=35, WHITE_SPACE=36, 
		LINE_COMMENT=37, COMMENT=38, MUL=39, DIV=40, XOR=41, AND=42, OR=43, NOT=44, 
		CHAR_LITERAL=45, DIGIT=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", 
			"SEMICOLON", "COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", 
			"LOGIC_NOT", "LESS_THAN", "LESS_OR_EQUAL_THAN", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", 
			"EQUAL_SYMBOL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
			"FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", "IF_SYMBOL", 
			"WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
			"FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", "LINE_COMMENT", 
			"COMMENT", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "CHAR_LITERAL", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'TEST'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
			"';'", "','", "'.'", "'='", "'||'", "'&&'", "'!'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", null, null, "'namespace'", "'def'", "'struct'", "'if'", 
			"'while'", "'else'", "'elif'", "'return'", "'continue'", "'for'", "'break'", 
			null, null, null, null, "'*'", "'/'", "'^'", "'&'", "'|'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", 
			"SEMICOLON", "COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", 
			"LOGIC_NOT", "LESS_THAN", "LESS_OR_EQUAL_THAN", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", 
			"EQUAL_SYMBOL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
			"FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", "IF_SYMBOL", 
			"WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
			"FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", "LINE_COMMENT", 
			"COMMENT", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "CHAR_LITERAL", "DIGIT"
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


	    //added component of generated class


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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0120\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\7\27\u0094\n\27\f\27"+
		"\16\27\u0097\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u00a4\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\7$\u00ea\n$\f$\16$\u00ed\13$\3%\6%\u00f0"+
		"\n%\r%\16%\u00f1\3%\3%\3&\3&\3&\3&\7&\u00fa\n&\f&\16&\u00fd\13&\3&\3&"+
		"\3\'\3\'\3\'\3\'\7\'\u0105\n\'\f\'\16\'\u0108\13\'\3\'\3\'\3\'\3\'\3\'"+
		"\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3/\3/\3\u0106\2\60\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\t\b\2\13\13\"\"\62;C\\^^c|\6"+
		"\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\5\2C\\^"+
		"^c|\3\2\62;\2\u0125\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\th\3\2\2\2\13j\3\2\2\2\rl\3\2\2"+
		"\2\17n\3\2\2\2\21p\3\2\2\2\23r\3\2\2\2\25t\3\2\2\2\27v\3\2\2\2\31x\3\2"+
		"\2\2\33z\3\2\2\2\35|\3\2\2\2\37\177\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2"+
		"\2\2%\u0086\3\2\2\2\'\u0089\3\2\2\2)\u008b\3\2\2\2+\u008e\3\2\2\2-\u0091"+
		"\3\2\2\2/\u00a3\3\2\2\2\61\u00a5\3\2\2\2\63\u00af\3\2\2\2\65\u00b3\3\2"+
		"\2\2\67\u00ba\3\2\2\29\u00bd\3\2\2\2;\u00c3\3\2\2\2=\u00c8\3\2\2\2?\u00cd"+
		"\3\2\2\2A\u00d4\3\2\2\2C\u00dd\3\2\2\2E\u00e1\3\2\2\2G\u00e7\3\2\2\2I"+
		"\u00ef\3\2\2\2K\u00f5\3\2\2\2M\u0100\3\2\2\2O\u010e\3\2\2\2Q\u0110\3\2"+
		"\2\2S\u0112\3\2\2\2U\u0114\3\2\2\2W\u0116\3\2\2\2Y\u0118\3\2\2\2[\u011a"+
		"\3\2\2\2]\u011e\3\2\2\2_`\7-\2\2`\4\3\2\2\2ab\7/\2\2b\6\3\2\2\2cd\7V\2"+
		"\2de\7G\2\2ef\7U\2\2fg\7V\2\2g\b\3\2\2\2hi\7}\2\2i\n\3\2\2\2jk\7\177\2"+
		"\2k\f\3\2\2\2lm\7]\2\2m\16\3\2\2\2no\7_\2\2o\20\3\2\2\2pq\7*\2\2q\22\3"+
		"\2\2\2rs\7+\2\2s\24\3\2\2\2tu\7=\2\2u\26\3\2\2\2vw\7.\2\2w\30\3\2\2\2"+
		"xy\7\60\2\2y\32\3\2\2\2z{\7?\2\2{\34\3\2\2\2|}\7~\2\2}~\7~\2\2~\36\3\2"+
		"\2\2\177\u0080\7(\2\2\u0080\u0081\7(\2\2\u0081 \3\2\2\2\u0082\u0083\7"+
		"#\2\2\u0083\"\3\2\2\2\u0084\u0085\7>\2\2\u0085$\3\2\2\2\u0086\u0087\7"+
		">\2\2\u0087\u0088\7?\2\2\u0088&\3\2\2\2\u0089\u008a\7@\2\2\u008a(\3\2"+
		"\2\2\u008b\u008c\7@\2\2\u008c\u008d\7?\2\2\u008d*\3\2\2\2\u008e\u008f"+
		"\7?\2\2\u008f\u0090\7?\2\2\u0090,\3\2\2\2\u0091\u0095\7$\2\2\u0092\u0094"+
		"\t\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7$"+
		"\2\2\u0099.\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d"+
		"\7w\2\2\u009d\u00a4\7g\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7c\2\2\u00a0"+
		"\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a4\7g\2\2\u00a3\u009a\3\2\2"+
		"\2\u00a3\u009e\3\2\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7"+
		"\7c\2\2\u00a7\u00a8\7o\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7r\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7g\2\2"+
		"\u00ae\62\3\2\2\2\u00af\u00b0\7f\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7"+
		"h\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6"+
		"\7t\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\66\3\2\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7h\2\2\u00bc8\3\2\2\2\u00bd"+
		"\u00be\7y\2\2\u00be\u00bf\7j\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7n\2\2"+
		"\u00c1\u00c2\7g\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7n\2"+
		"\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7<\3\2\2\2\u00c8\u00c9\7"+
		"g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00cc>"+
		"\3\2\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7v\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3\7p\2\2\u00d3@\3\2\2\2\u00d4"+
		"\u00d5\7e\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7v\2\2"+
		"\u00d8\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7w\2\2\u00db\u00dc"+
		"\7g\2\2\u00dcB\3\2\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7q\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7d\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4"+
		"\7g\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7m\2\2\u00e6F\3\2\2\2\u00e7\u00eb"+
		"\t\3\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ecH\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ee\u00f0\t\5\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b%\2\2\u00f4"+
		"J\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00fb\3\2\2"+
		"\2\u00f8\u00fa\n\6\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00ff\b&\2\2\u00ffL\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7,\2\2\u0102"+
		"\u0106\3\2\2\2\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b\7\61\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\b\'\2\2\u010dN\3\2\2\2\u010e\u010f\7,\2\2\u010fP\3\2"+
		"\2\2\u0110\u0111\7\61\2\2\u0111R\3\2\2\2\u0112\u0113\7`\2\2\u0113T\3\2"+
		"\2\2\u0114\u0115\7(\2\2\u0115V\3\2\2\2\u0116\u0117\7~\2\2\u0117X\3\2\2"+
		"\2\u0118\u0119\7\u0080\2\2\u0119Z\3\2\2\2\u011a\u011b\7)\2\2\u011b\u011c"+
		"\t\7\2\2\u011c\u011d\7)\2\2\u011d\\\3\2\2\2\u011e\u011f\t\b\2\2\u011f"+
		"^\3\2\2\2\t\2\u0095\u00a3\u00eb\u00f1\u00fb\u0106\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}