// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/Keyword.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KeywordLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMESPACE=1, FUNCTION_DEFINITION=2, IF=3, WHILE=4, ELSE=5, ELSE_IF=6, 
		RETURN=7, CONTINUE=8, FOR=9, BREAK=10, INT=11, DOUBLE=12, CHAR=13, STRING=14, 
		BOOL=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NAMESPACE", "FUNCTION_DEFINITION", "IF", "WHILE", "ELSE", "ELSE_IF", 
		"RETURN", "CONTINUE", "FOR", "BREAK", "INT", "DOUBLE", "CHAR", "STRING", 
		"BOOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'namespace'", "'def'", "'if'", "'while'", "'else'", "'elif'", "'return'", 
		"'continue'", "'for'", "'break'", "'int'", "'double'", "'char'", "'string'", 
		"'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMESPACE", "FUNCTION_DEFINITION", "IF", "WHILE", "ELSE", "ELSE_IF", 
		"RETURN", "CONTINUE", "FOR", "BREAK", "INT", "DOUBLE", "CHAR", "STRING", 
		"BOOL"
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


	public KeywordLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Keyword.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\2\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21\3\2\2\2w\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\3!\3\2\2\2\5+\3\2\2\2\7/\3\2\2\2\t\62\3\2\2\2\138\3\2\2\2\r=\3\2"+
		"\2\2\17B\3\2\2\2\21I\3\2\2\2\23R\3\2\2\2\25V\3\2\2\2\27\\\3\2\2\2\31`"+
		"\3\2\2\2\33g\3\2\2\2\35l\3\2\2\2\37s\3\2\2\2!\"\7p\2\2\"#\7c\2\2#$\7o"+
		"\2\2$%\7g\2\2%&\7u\2\2&\'\7r\2\2\'(\7c\2\2()\7e\2\2)*\7g\2\2*\4\3\2\2"+
		"\2+,\7f\2\2,-\7g\2\2-.\7h\2\2.\6\3\2\2\2/\60\7k\2\2\60\61\7h\2\2\61\b"+
		"\3\2\2\2\62\63\7y\2\2\63\64\7j\2\2\64\65\7k\2\2\65\66\7n\2\2\66\67\7g"+
		"\2\2\67\n\3\2\2\289\7g\2\29:\7n\2\2:;\7u\2\2;<\7g\2\2<\f\3\2\2\2=>\7g"+
		"\2\2>?\7n\2\2?@\7k\2\2@A\7h\2\2A\16\3\2\2\2BC\7t\2\2CD\7g\2\2DE\7v\2\2"+
		"EF\7w\2\2FG\7t\2\2GH\7p\2\2H\20\3\2\2\2IJ\7e\2\2JK\7q\2\2KL\7p\2\2LM\7"+
		"v\2\2MN\7k\2\2NO\7p\2\2OP\7w\2\2PQ\7g\2\2Q\22\3\2\2\2RS\7h\2\2ST\7q\2"+
		"\2TU\7t\2\2U\24\3\2\2\2VW\7d\2\2WX\7t\2\2XY\7g\2\2YZ\7c\2\2Z[\7m\2\2["+
		"\26\3\2\2\2\\]\7k\2\2]^\7p\2\2^_\7v\2\2_\30\3\2\2\2`a\7f\2\2ab\7q\2\2"+
		"bc\7w\2\2cd\7d\2\2de\7n\2\2ef\7g\2\2f\32\3\2\2\2gh\7e\2\2hi\7j\2\2ij\7"+
		"c\2\2jk\7t\2\2k\34\3\2\2\2lm\7u\2\2mn\7v\2\2no\7t\2\2op\7k\2\2pq\7p\2"+
		"\2qr\7i\2\2r\36\3\2\2\2st\7d\2\2tu\7q\2\2uv\7q\2\2vw\7n\2\2w \3\2\2\2"+
		"\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}