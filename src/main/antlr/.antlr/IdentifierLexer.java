// Generated from /Users/cjw/Library/Mobile Documents/com~apple~CloudDocs/workspace/JavaCompiler/src/main/antlr/Identifier.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IdentifierLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTION_NAME=1, TYPE_NAME=2, VARIABLE_NAME=3, IDENTIFIER=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FUNCTION_NAME", "TYPE_NAME", "VARIABLE_NAME", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FUNCTION_NAME", "TYPE_NAME", "VARIABLE_NAME", "IDENTIFIER"
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


	public IdentifierLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Identifier.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6`\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\5\5_\n\5\2\2\6\3\3\5\4\7\5\t\6\3\2\2\2`\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5&\3\2\2\2\7A\3\2\2\2\t^\3\2\2\2\13"+
		"\f\7`\2\2\f\r\7]\2\2\r\16\7c\2\2\16\17\7/\2\2\17\20\7|\2\2\20\21\7C\2"+
		"\2\21\22\7/\2\2\22\23\7\\\2\2\23\24\7a\2\2\24\25\7&\2\2\25\26\7_\2\2\26"+
		"\27\7]\2\2\27\30\7c\2\2\30\31\7/\2\2\31\32\7|\2\2\32\33\7C\2\2\33\34\7"+
		"/\2\2\34\35\7\\\2\2\35\36\7a\2\2\36\37\7&\2\2\37 \7\62\2\2 !\7/\2\2!\""+
		"\7;\2\2\"#\7_\2\2#$\7,\2\2$%\7&\2\2%\4\3\2\2\2&\'\7`\2\2\'(\7]\2\2()\7"+
		"c\2\2)*\7/\2\2*+\7|\2\2+,\7C\2\2,-\7/\2\2-.\7\\\2\2./\7a\2\2/\60\7&\2"+
		"\2\60\61\7_\2\2\61\62\7]\2\2\62\63\7c\2\2\63\64\7/\2\2\64\65\7|\2\2\65"+
		"\66\7C\2\2\66\67\7/\2\2\678\7\\\2\289\7a\2\29:\7&\2\2:;\7\62\2\2;<\7/"+
		"\2\2<=\7;\2\2=>\7_\2\2>?\7,\2\2?@\7&\2\2@\6\3\2\2\2AB\7`\2\2BC\7]\2\2"+
		"CD\7c\2\2DE\7/\2\2EF\7|\2\2FG\7C\2\2GH\7/\2\2HI\7\\\2\2IJ\7a\2\2JK\7&"+
		"\2\2KL\7_\2\2LM\7]\2\2MN\7c\2\2NO\7/\2\2OP\7|\2\2PQ\7C\2\2QR\7/\2\2RS"+
		"\7\\\2\2ST\7a\2\2TU\7&\2\2UV\7\62\2\2VW\7/\2\2WX\7;\2\2XY\7_\2\2YZ\7,"+
		"\2\2Z[\7&\2\2[\b\3\2\2\2\\_\5\3\2\2]_\5\7\4\2^\\\3\2\2\2^]\3\2\2\2_\n"+
		"\3\2\2\2\4\2^\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}