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
		T__0=1, T__1=2, T__2=3, STRING_LITERAL=4, LEFT_CURLY_BRACE=5, RIGHT_CURLY_BRACE=6, 
		LEFT_BRACKET=7, RIGHT_BRACKET=8, LEFT_PARENTHESES=9, RIGHT_PARENTHESES=10, 
		SEMICOLON=11, COMMA=12, DOT=13, ASSIGN_SYMBOL=14, LOGIC_OR=15, LOGIC_AND=16, 
		LOGIC_NOT=17, MUL=18, DIV=19, XOR=20, AND=21, OR=22, NOT=23, LESS_THAN=24, 
		LESS_OR_EQUAL_THAN=25, GREATER_THAN=26, GREATER_OR_EQUAL_THAN=27, EQUAL_SYMBOL=28, 
		NOT_EQUAL_SYMBOL=29, BOOL_LITERAL=30, NAMESPACE_SYMBOL=31, FUNCTION_DEFINITION_SYMBOL=32, 
		CLASS_DEFINITION_SYMNOL=33, IF_SYMBOL=34, WHILE_SYMBOL=35, ELSE_SYMBOL=36, 
		ELSE_IF_SYMBOL=37, RETURN_SYMBOL=38, CONTINUE_SYMBOL=39, FOR_SYMBOL=40, 
		BREAK_SYMBOL=41, IDENTIFIER=42, WHITE_SPACE=43, LINE_COMMENT=44, COMMENT=45, 
		CHAR_LITERAL=46, DIGIT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "STRING_LITERAL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", 
			"SEMICOLON", "COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", 
			"LOGIC_NOT", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "LESS_THAN", "LESS_OR_EQUAL_THAN", 
			"GREATER_THAN", "GREATER_OR_EQUAL_THAN", "EQUAL_SYMBOL", "NOT_EQUAL_SYMBOL", 
			"BOOL_LITERAL", "NAMESPACE_SYMBOL", "FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", 
			"IF_SYMBOL", "WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", 
			"CONTINUE_SYMBOL", "FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", 
			"LINE_COMMENT", "COMMENT", "CHAR_LITERAL", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'new'", null, "'{'", "'}'", "'['", "']'", "'('", 
			"')'", "';'", "','", "'.'", "'='", "'||'", "'&&'", "'!'", "'*'", "'/'", 
			"'^'", "'&'", "'|'", "'~'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			null, "'namespace'", "'def'", "'struct'", "'if'", "'while'", "'else'", 
			"'elif'", "'return'", "'continue'", "'for'", "'break'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STRING_LITERAL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", 
			"LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", 
			"SEMICOLON", "COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", 
			"LOGIC_NOT", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "LESS_THAN", "LESS_OR_EQUAL_THAN", 
			"GREATER_THAN", "GREATER_OR_EQUAL_THAN", "EQUAL_SYMBOL", "NOT_EQUAL_SYMBOL", 
			"BOOL_LITERAL", "NAMESPACE_SYMBOL", "FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", 
			"IF_SYMBOL", "WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", 
			"CONTINUE_SYMBOL", "FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", 
			"LINE_COMMENT", "COMMENT", "CHAR_LITERAL", "DIGIT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0124\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u00b4\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3"+
		"&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3+\3+\7+\u00fa\n+\f+\16+\u00fd\13+\3,\6,\u0100\n,"+
		"\r,\16,\u0101\3,\3,\3-\3-\3-\3-\7-\u010a\n-\f-\16-\u010d\13-\3-\3-\3."+
		"\3.\3.\3.\7.\u0115\n.\f.\16.\u0118\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60"+
		"\3\60\3\u0116\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\t\n"+
		"\2\13\13\"\",-//\61<C\\^^c|\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\5\2C\\^^c|\3\2\62;\2\u0129\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3"+
		"\2\2\2\ti\3\2\2\2\13r\3\2\2\2\rt\3\2\2\2\17v\3\2\2\2\21x\3\2\2\2\23z\3"+
		"\2\2\2\25|\3\2\2\2\27~\3\2\2\2\31\u0080\3\2\2\2\33\u0082\3\2\2\2\35\u0084"+
		"\3\2\2\2\37\u0086\3\2\2\2!\u0089\3\2\2\2#\u008c\3\2\2\2%\u008e\3\2\2\2"+
		"\'\u0090\3\2\2\2)\u0092\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2\2/\u0098\3"+
		"\2\2\2\61\u009a\3\2\2\2\63\u009c\3\2\2\2\65\u009f\3\2\2\2\67\u00a1\3\2"+
		"\2\29\u00a4\3\2\2\2;\u00a7\3\2\2\2=\u00b3\3\2\2\2?\u00b5\3\2\2\2A\u00bf"+
		"\3\2\2\2C\u00c3\3\2\2\2E\u00ca\3\2\2\2G\u00cd\3\2\2\2I\u00d3\3\2\2\2K"+
		"\u00d8\3\2\2\2M\u00dd\3\2\2\2O\u00e4\3\2\2\2Q\u00ed\3\2\2\2S\u00f1\3\2"+
		"\2\2U\u00f7\3\2\2\2W\u00ff\3\2\2\2Y\u0105\3\2\2\2[\u0110\3\2\2\2]\u011e"+
		"\3\2\2\2_\u0122\3\2\2\2ab\7-\2\2b\4\3\2\2\2cd\7/\2\2d\6\3\2\2\2ef\7p\2"+
		"\2fg\7g\2\2gh\7y\2\2h\b\3\2\2\2im\7$\2\2jl\t\2\2\2kj\3\2\2\2lo\3\2\2\2"+
		"mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7$\2\2q\n\3\2\2\2rs\7}\2\2"+
		"s\f\3\2\2\2tu\7\177\2\2u\16\3\2\2\2vw\7]\2\2w\20\3\2\2\2xy\7_\2\2y\22"+
		"\3\2\2\2z{\7*\2\2{\24\3\2\2\2|}\7+\2\2}\26\3\2\2\2~\177\7=\2\2\177\30"+
		"\3\2\2\2\u0080\u0081\7.\2\2\u0081\32\3\2\2\2\u0082\u0083\7\60\2\2\u0083"+
		"\34\3\2\2\2\u0084\u0085\7?\2\2\u0085\36\3\2\2\2\u0086\u0087\7~\2\2\u0087"+
		"\u0088\7~\2\2\u0088 \3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7(\2\2\u008b"+
		"\"\3\2\2\2\u008c\u008d\7#\2\2\u008d$\3\2\2\2\u008e\u008f\7,\2\2\u008f"+
		"&\3\2\2\2\u0090\u0091\7\61\2\2\u0091(\3\2\2\2\u0092\u0093\7`\2\2\u0093"+
		"*\3\2\2\2\u0094\u0095\7(\2\2\u0095,\3\2\2\2\u0096\u0097\7~\2\2\u0097."+
		"\3\2\2\2\u0098\u0099\7\u0080\2\2\u0099\60\3\2\2\2\u009a\u009b\7>\2\2\u009b"+
		"\62\3\2\2\2\u009c\u009d\7>\2\2\u009d\u009e\7?\2\2\u009e\64\3\2\2\2\u009f"+
		"\u00a0\7@\2\2\u00a0\66\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2\u00a3\7?\2\2\u00a3"+
		"8\3\2\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6\7?\2\2\u00a6:\3\2\2\2\u00a7\u00a8"+
		"\7#\2\2\u00a8\u00a9\7?\2\2\u00a9<\3\2\2\2\u00aa\u00ab\7v\2\2\u00ab\u00ac"+
		"\7t\2\2\u00ac\u00ad\7w\2\2\u00ad\u00b4\7g\2\2\u00ae\u00af\7h\2\2\u00af"+
		"\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b4\7g\2\2"+
		"\u00b3\u00aa\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7"+
		"p\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba"+
		"\7u\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7e\2\2\u00bd"+
		"\u00be\7g\2\2\u00be@\3\2\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7h\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7v\2\2\u00c5"+
		"\u00c6\7t\2\2\u00c6\u00c7\7w\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7v\2\2"+
		"\u00c9D\3\2\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7h\2\2\u00ccF\3\2\2\2\u00cd"+
		"\u00ce\7y\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7n\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2H\3\2\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7n\2"+
		"\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7J\3\2\2\2\u00d8\u00d9\7"+
		"g\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7h\2\2\u00dcL"+
		"\3\2\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\u00e1\7w\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7p\2\2\u00e3N\3\2\2\2\u00e4"+
		"\u00e5\7e\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7v\2\2"+
		"\u00e8\u00e9\7k\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec"+
		"\7g\2\2\u00ecP\3\2\2\2\u00ed\u00ee\7h\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0"+
		"\7t\2\2\u00f0R\3\2\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7m\2\2\u00f6T\3\2\2\2\u00f7\u00fb"+
		"\t\3\2\2\u00f8\u00fa\t\4\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcV\3\2\2\2\u00fd\u00fb\3\2\2\2"+
		"\u00fe\u0100\t\5\2\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b,\2\2\u0104"+
		"X\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7\61\2\2\u0107\u010b\3\2\2"+
		"\2\u0108\u010a\n\6\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109"+
		"\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\b-\2\2\u010fZ\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\7,\2\2\u0112"+
		"\u0116\3\2\2\2\u0113\u0115\13\2\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3"+
		"\2\2\2\u0116\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011a\7,\2\2\u011a\u011b\7\61\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\b.\2\2\u011d\\\3\2\2\2\u011e\u011f\7)\2\2\u011f\u0120"+
		"\t\7\2\2\u0120\u0121\7)\2\2\u0121^\3\2\2\2\u0122\u0123\t\b\2\2\u0123`"+
		"\3\2\2\2\n\2km\u00b3\u00fb\u0101\u010b\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}