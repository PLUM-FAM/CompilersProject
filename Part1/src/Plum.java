// Generated from Plum.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Plum extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, KEYWORD=2, OPERATOR=3, COMMENT=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "KEYWORD", "OPERATOR", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "KEYWORD", "OPERATOR", "COMMENT"
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


	public Plum(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Plum.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6\u008a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\6\2\r\n\2\r\2\16\2\16\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4|\n\4"+
		"\3\5\3\5\3\5\3\5\7\5\u0082\n\5\f\5\16\5\u0085\13\5\3\5\3\5\3\5\3\5\3\u0083"+
		"\2\6\3\3\5\4\7\5\t\6\3\2\5\5\2\13\f\17\17\"\"\6\2,-//\61\61??\6\2*+.."+
		"=>@@\2\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\f\3\2\2"+
		"\2\5o\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13\r\t\2\2\2\f\13\3\2\2\2\r\16\3\2"+
		"\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\20\3\2\2\2\20\21\b\2\2\2\21\4\3\2\2"+
		"\2\22\23\7R\2\2\23\24\7T\2\2\24\25\7Q\2\2\25\26\7I\2\2\26\27\7T\2\2\27"+
		"\30\7C\2\2\30p\7O\2\2\31\32\7D\2\2\32\33\7G\2\2\33\34\7I\2\2\34\35\7K"+
		"\2\2\35p\7P\2\2\36\37\7G\2\2\37 \7P\2\2 p\7F\2\2!\"\7H\2\2\"#\7W\2\2#"+
		"$\7P\2\2$%\7E\2\2%&\7V\2\2&\'\7K\2\2\'(\7Q\2\2(p\7P\2\2)*\7T\2\2*+\7G"+
		"\2\2+,\7C\2\2,p\7F\2\2-.\7Y\2\2./\7T\2\2/\60\7K\2\2\60\61\7V\2\2\61p\7"+
		"G\2\2\62\63\7K\2\2\63p\7H\2\2\64\65\7G\2\2\65\66\7N\2\2\66\67\7U\2\2\67"+
		"p\7G\2\289\7G\2\29:\7P\2\2:;\7F\2\2;<\7K\2\2<p\7H\2\2=>\7Y\2\2>?\7J\2"+
		"\2?@\7K\2\2@A\7N\2\2Ap\7G\2\2BC\7G\2\2CD\7P\2\2DE\7F\2\2EF\7Y\2\2FG\7"+
		"J\2\2GH\7K\2\2HI\7N\2\2Ip\7G\2\2JK\7E\2\2KL\7Q\2\2LM\7P\2\2MN\7V\2\2N"+
		"O\7K\2\2OP\7P\2\2PQ\7W\2\2Qp\7G\2\2RS\7D\2\2ST\7T\2\2TU\7G\2\2UV\7C\2"+
		"\2Vp\7M\2\2WX\7T\2\2XY\7G\2\2YZ\7V\2\2Z[\7W\2\2[\\\7T\2\2\\p\7P\2\2]^"+
		"\7K\2\2^_\7P\2\2_p\7V\2\2`a\7X\2\2ab\7Q\2\2bc\7K\2\2cp\7F\2\2de\7U\2\2"+
		"ef\7V\2\2fg\7T\2\2gh\7K\2\2hi\7P\2\2ip\7I\2\2jk\7H\2\2kl\7N\2\2lm\7Q\2"+
		"\2mn\7C\2\2np\7V\2\2o\22\3\2\2\2o\31\3\2\2\2o\36\3\2\2\2o!\3\2\2\2o)\3"+
		"\2\2\2o-\3\2\2\2o\62\3\2\2\2o\64\3\2\2\2o8\3\2\2\2o=\3\2\2\2oB\3\2\2\2"+
		"oJ\3\2\2\2oR\3\2\2\2oW\3\2\2\2o]\3\2\2\2o`\3\2\2\2od\3\2\2\2oj\3\2\2\2"+
		"p\6\3\2\2\2qr\7<\2\2r|\7?\2\2s|\t\3\2\2tu\7#\2\2u|\7?\2\2v|\t\4\2\2wx"+
		"\7>\2\2x|\7?\2\2yz\7@\2\2z|\7?\2\2{q\3\2\2\2{s\3\2\2\2{t\3\2\2\2{v\3\2"+
		"\2\2{w\3\2\2\2{y\3\2\2\2|\b\3\2\2\2}~\7/\2\2~\177\7/\2\2\177\u0083\3\2"+
		"\2\2\u0080\u0082\13\2\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7\f\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\5\2\2\u0089"+
		"\n\3\2\2\2\7\2\16o{\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}