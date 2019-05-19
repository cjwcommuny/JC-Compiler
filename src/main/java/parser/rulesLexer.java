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
		TEST_SYMBOL=1, LEFT_CURLY_BRACE=2, RIGHT_CURLY_BRACE=3, LEFT_BRACKET=4, 
		RIGHT_BRACKET=5, LEFT_PARENTHESES=6, RIGHT_PARENTHESES=7, SEMICOLON=8, 
		COMMA=9, DOT=10, ASSIGN_SYMBOL=11, LOGIC_OR=12, LOGIC_AND=13, LOGIC_NOT=14, 
		LESS_THAN=15, LESS_OR_EQUAL_THAN=16, GREATER_THAN=17, GREATER_OR_EQUAL_THAN=18, 
		EQUAL_SYMBOL=19, STRING_LITERAL=20, BOOL_LITERAL=21, NAMESPACE_SYMBOL=22, 
		FUNCTION_DEFINITION_SYMBOL=23, CLASS_DEFINITION_SYMNOL=24, IF_SYMBOL=25, 
		WHILE_SYMBOL=26, ELSE_SYMBOL=27, ELSE_IF_SYMBOL=28, RETURN_SYMBOL=29, 
		CONTINUE_SYMBOL=30, FOR_SYMBOL=31, BREAK_SYMBOL=32, IDENTIFIER=33, WHITE_SPACE=34, 
		LINE_COMMENT=35, COMMENT=36, ADD=37, SUB=38, MUL=39, DIV=40, XOR=41, AND=42, 
		OR=43, NOT=44, INT_LITERAL=45, DOUBLE_LITERAL=46, CHAR_LITERAL=47;
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
			"COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", 
			"LESS_THAN", "LESS_OR_EQUAL_THAN", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", 
			"EQUAL_SYMBOL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
			"FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", "IF_SYMBOL", 
			"WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
			"FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", "LINE_COMMENT", 
			"COMMENT", "ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "INT_LITERAL", 
			"DOUBLE_LITERAL", "CHAR_LITERAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TEST'", "'{'", "'}'", "'['", "']'", "'('", "')'", "';'", "','", 
			"'.'", "'='", "'||'", "'&&'", "'!'", "'<'", "'<='", "'>'", "'>='", "'=='", 
			null, null, "'namespace'", "'def'", "'struct'", "'if'", "'while'", "'else'", 
			"'elif'", "'return'", "'continue'", "'for'", "'break'", null, null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'^'", "'&'", "'|'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEST_SYMBOL", "LEFT_CURLY_BRACE", "RIGHT_CURLY_BRACE", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_PARENTHESES", "RIGHT_PARENTHESES", "SEMICOLON", 
			"COMMA", "DOT", "ASSIGN_SYMBOL", "LOGIC_OR", "LOGIC_AND", "LOGIC_NOT", 
			"LESS_THAN", "LESS_OR_EQUAL_THAN", "GREATER_THAN", "GREATER_OR_EQUAL_THAN", 
			"EQUAL_SYMBOL", "STRING_LITERAL", "BOOL_LITERAL", "NAMESPACE_SYMBOL", 
			"FUNCTION_DEFINITION_SYMBOL", "CLASS_DEFINITION_SYMNOL", "IF_SYMBOL", 
			"WHILE_SYMBOL", "ELSE_SYMBOL", "ELSE_IF_SYMBOL", "RETURN_SYMBOL", "CONTINUE_SYMBOL", 
			"FOR_SYMBOL", "BREAK_SYMBOL", "IDENTIFIER", "WHITE_SPACE", "LINE_COMMENT", 
			"COMMENT", "ADD", "SUB", "MUL", "DIV", "XOR", "AND", "OR", "NOT", "INT_LITERAL", 
			"DOUBLE_LITERAL", "CHAR_LITERAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0139\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\7\25\u0092\n\25\f\25\16\25\u0095"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00a2"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\7\"\u00e8\n\"\f\"\16\"\u00eb"+
		"\13\"\3#\6#\u00ee\n#\r#\16#\u00ef\3#\3#\3$\3$\3$\3$\7$\u00f8\n$\f$\16"+
		"$\u00fb\13$\3$\3$\3%\3%\3%\3%\7%\u0103\n%\f%\16%\u0106\13%\3%\3%\3%\3"+
		"%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\5.\u011e\n."+
		"\3.\6.\u0121\n.\r.\16.\u0122\3/\5/\u0126\n/\3/\7/\u0129\n/\f/\16/\u012c"+
		"\13/\3/\5/\u012f\n/\3/\6/\u0132\n/\r/\16/\u0133\3\60\3\60\3\60\3\60\3"+
		"\u0104\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\n\b\2\13\13"+
		"\"\"\62;C\\^^c|\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\4\2--//\3\2\62;\5\2C\\^^c|\2\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5f\3\2\2\2\7h\3\2\2"+
		"\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2"+
		"\2\25v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33}\3\2\2\2\35\u0080\3\2\2\2\37"+
		"\u0082\3\2\2\2!\u0084\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008c\3"+
		"\2\2\2)\u008f\3\2\2\2+\u00a1\3\2\2\2-\u00a3\3\2\2\2/\u00ad\3\2\2\2\61"+
		"\u00b1\3\2\2\2\63\u00b8\3\2\2\2\65\u00bb\3\2\2\2\67\u00c1\3\2\2\29\u00c6"+
		"\3\2\2\2;\u00cb\3\2\2\2=\u00d2\3\2\2\2?\u00db\3\2\2\2A\u00df\3\2\2\2C"+
		"\u00e5\3\2\2\2E\u00ed\3\2\2\2G\u00f3\3\2\2\2I\u00fe\3\2\2\2K\u010c\3\2"+
		"\2\2M\u010e\3\2\2\2O\u0110\3\2\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0116"+
		"\3\2\2\2W\u0118\3\2\2\2Y\u011a\3\2\2\2[\u011d\3\2\2\2]\u0125\3\2\2\2_"+
		"\u0135\3\2\2\2ab\7V\2\2bc\7G\2\2cd\7U\2\2de\7V\2\2e\4\3\2\2\2fg\7}\2\2"+
		"g\6\3\2\2\2hi\7\177\2\2i\b\3\2\2\2jk\7]\2\2k\n\3\2\2\2lm\7_\2\2m\f\3\2"+
		"\2\2no\7*\2\2o\16\3\2\2\2pq\7+\2\2q\20\3\2\2\2rs\7=\2\2s\22\3\2\2\2tu"+
		"\7.\2\2u\24\3\2\2\2vw\7\60\2\2w\26\3\2\2\2xy\7?\2\2y\30\3\2\2\2z{\7~\2"+
		"\2{|\7~\2\2|\32\3\2\2\2}~\7(\2\2~\177\7(\2\2\177\34\3\2\2\2\u0080\u0081"+
		"\7#\2\2\u0081\36\3\2\2\2\u0082\u0083\7>\2\2\u0083 \3\2\2\2\u0084\u0085"+
		"\7>\2\2\u0085\u0086\7?\2\2\u0086\"\3\2\2\2\u0087\u0088\7@\2\2\u0088$\3"+
		"\2\2\2\u0089\u008a\7@\2\2\u008a\u008b\7?\2\2\u008b&\3\2\2\2\u008c\u008d"+
		"\7?\2\2\u008d\u008e\7?\2\2\u008e(\3\2\2\2\u008f\u0093\7$\2\2\u0090\u0092"+
		"\t\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7$"+
		"\2\2\u0097*\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b"+
		"\7w\2\2\u009b\u00a2\7g\2\2\u009c\u009d\7h\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7n\2\2\u009f\u00a0\7u\2\2\u00a0\u00a2\7g\2\2\u00a1\u0098\3\2\2"+
		"\2\u00a1\u009c\3\2\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7"+
		"c\2\2\u00a5\u00a6\7o\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9"+
		"\7r\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7e\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		".\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7h\2\2\u00b0"+
		"\60\3\2\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7w\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7v\2\2\u00b7\62\3\2\2\2\u00b8"+
		"\u00b9\7k\2\2\u00b9\u00ba\7h\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7y\2\2\u00bc"+
		"\u00bd\7j\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2"+
		"\u00c0\66\3\2\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7"+
		"u\2\2\u00c4\u00c5\7g\2\2\u00c58\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7h\2\2\u00ca:\3\2\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7w\2\2\u00cf"+
		"\u00d0\7t\2\2\u00d0\u00d1\7p\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7k\2\2"+
		"\u00d7\u00d8\7p\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7g\2\2\u00da>\3\2\2"+
		"\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de@\3\2"+
		"\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3"+
		"\7c\2\2\u00e3\u00e4\7m\2\2\u00e4B\3\2\2\2\u00e5\u00e9\t\3\2\2\u00e6\u00e8"+
		"\t\4\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00eaD\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\t\5\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\b#\2\2\u00f2F\3\2\2\2\u00f3\u00f4"+
		"\7\61\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f8\n\6\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\b$\2\2\u00fd"+
		"H\3\2\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\7,\2\2\u0100\u0104\3\2\2\2"+
		"\u0101\u0103\13\2\2\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\7,\2\2\u0108\u0109\7\61\2\2\u0109\u010a\3\2\2\2\u010a\u010b\b%"+
		"\2\2\u010bJ\3\2\2\2\u010c\u010d\7-\2\2\u010dL\3\2\2\2\u010e\u010f\7/\2"+
		"\2\u010fN\3\2\2\2\u0110\u0111\7,\2\2\u0111P\3\2\2\2\u0112\u0113\7\61\2"+
		"\2\u0113R\3\2\2\2\u0114\u0115\7`\2\2\u0115T\3\2\2\2\u0116\u0117\7(\2\2"+
		"\u0117V\3\2\2\2\u0118\u0119\7~\2\2\u0119X\3\2\2\2\u011a\u011b\7\u0080"+
		"\2\2\u011bZ\3\2\2\2\u011c\u011e\t\7\2\2\u011d\u011c\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u0121\t\b\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\\\3\2\2\2"+
		"\u0124\u0126\t\7\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a"+
		"\3\2\2\2\u0127\u0129\t\b\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u012f\7\60\2\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u0132\t\b\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134^\3\2\2\2\u0135\u0136"+
		"\7)\2\2\u0136\u0137\t\t\2\2\u0137\u0138\7)\2\2\u0138`\3\2\2\2\17\2\u0093"+
		"\u00a1\u00e9\u00ef\u00f9\u0104\u011d\u0122\u0125\u012a\u012e\u0133\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}