package Frontend;
// Generated from C:\Users\Hjorthen\NetworkParser2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NetworkParser2Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEXFORMAL=1, NUMBER=2, CHAR=3, WHITESPACE=4, COLON=5, DOT=6, HYPHEN=7, 
		LESSTHAN=8, ROUNDOPEN=9, ROUNDCLOSE=10, SQUAREOPEN=11, SQUARECLOSE=12, 
		ETHERTYPE=13, LENGTH=14, TOS=15, TTL=16, ID=17, OFFSET=18, FLAGS=19, PROTO=20, 
		CHECKSUM=21, SEQ=22, ACK=23, WIN=24, OPTIONS=25, NOP=26, TSVAL=27, MSS=28, 
		WSCALE=29, SACKOK=30, EOL=31, ECR=32;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"HEXFORMAL", "NUMBER", "CHAR", "WHITESPACE", "':'", "'.'", "'-'", "'>'", 
		"'('", "')'", "'['", "']'", "'ethertype'", "'length'", "'tos'", "'ttl'", 
		"'id'", "'offset'", "FLAGS", "'proto'", "'cksum'", "'seq'", "'ack'", "'win'", 
		"'options'", "'nop'", "'TS val'", "'mss'", "'wscale'", "'sackOK'", "'eol'", 
		"'ecr'"
	};
	public static final String[] ruleNames = {
		"NATURALNUMBER", "NULL", "HEXLETTERS", "UPPER", "LOWER", "DIGIT", "HEXFORMAL", 
		"NUMBER", "CHAR", "WHITESPACE", "COLON", "DOT", "HYPHEN", "LESSTHAN", 
		"ROUNDOPEN", "ROUNDCLOSE", "SQUAREOPEN", "SQUARECLOSE", "ETHERTYPE", "LENGTH", 
		"TOS", "TTL", "ID", "OFFSET", "FLAGS", "PROTO", "CHECKSUM", "SEQ", "ACK", 
		"WIN", "OPTIONS", "NOP", "TSVAL", "MSS", "WSCALE", "SACKOK", "EOL", "ECR"
	};


	public NetworkParser2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NetworkParser2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 9: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\"\u00f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\3\b\6\bc\n\b\r\b\16\b"+
		"d\3\t\6\th\n\t\r\t\16\ti\3\n\3\n\5\nn\n\n\3\13\6\13q\n\13\r\13\16\13r"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\2"+
		"(\3\2\1\5\2\1\7\2\1\t\2\1\13\2\1\r\2\1\17\3\1\21\4\1\23\5\1\25\6\2\27"+
		"\7\1\31\b\1\33\t\1\35\n\1\37\13\1!\f\1#\r\1%\16\1\'\17\1)\20\1+\21\1-"+
		"\22\1/\23\1\61\24\1\63\25\1\65\26\1\67\27\19\30\1;\31\1=\32\1?\33\1A\34"+
		"\1C\35\1E\36\1G\37\1I \1K!\1M\"\1\3\2\4\5\2\13\f\17\17\"\"\4\2HHhh\u00f3"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3"+
		"\2\2\2\13W\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21g\3\2\2\2\23m\3\2\2\2\25p"+
		"\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33z\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!"+
		"\u0080\3\2\2\2#\u0082\3\2\2\2%\u0084\3\2\2\2\'\u0086\3\2\2\2)\u0090\3"+
		"\2\2\2+\u0097\3\2\2\2-\u009b\3\2\2\2/\u009f\3\2\2\2\61\u00a2\3\2\2\2\63"+
		"\u00a9\3\2\2\2\65\u00af\3\2\2\2\67\u00b5\3\2\2\29\u00bb\3\2\2\2;\u00bf"+
		"\3\2\2\2=\u00c3\3\2\2\2?\u00c7\3\2\2\2A\u00cf\3\2\2\2C\u00d3\3\2\2\2E"+
		"\u00da\3\2\2\2G\u00de\3\2\2\2I\u00e5\3\2\2\2K\u00ec\3\2\2\2M\u00f0\3\2"+
		"\2\2OP\4\63;\2P\4\3\2\2\2QR\7\62\2\2R\6\3\2\2\2ST\4ch\2T\b\3\2\2\2UV\4"+
		"C\\\2V\n\3\2\2\2WX\4c|\2X\f\3\2\2\2Y\\\5\3\2\2Z\\\5\5\3\2[Y\3\2\2\2[Z"+
		"\3\2\2\2\\\16\3\2\2\2]^\7\62\2\2^_\7z\2\2_b\3\2\2\2`c\5\7\4\2ac\5\r\7"+
		"\2b`\3\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\20\3\2\2\2fh\5\r"+
		"\7\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\22\3\2\2\2kn\5\13\6\2ln"+
		"\5\t\5\2mk\3\2\2\2ml\3\2\2\2n\24\3\2\2\2oq\t\2\2\2po\3\2\2\2qr\3\2\2\2"+
		"rp\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\b\13\2\2u\26\3\2\2\2vw\7<\2\2w\30\3\2"+
		"\2\2xy\7\60\2\2y\32\3\2\2\2z{\7/\2\2{\34\3\2\2\2|}\7@\2\2}\36\3\2\2\2"+
		"~\177\7*\2\2\177 \3\2\2\2\u0080\u0081\7+\2\2\u0081\"\3\2\2\2\u0082\u0083"+
		"\7]\2\2\u0083$\3\2\2\2\u0084\u0085\7_\2\2\u0085&\3\2\2\2\u0086\u0087\7"+
		"g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7j\2\2\u0089\u008a\7g\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7v\2\2\u008c\u008d\7{\2\2\u008d\u008e\7r\2\2\u008e"+
		"\u008f\7g\2\2\u008f(\3\2\2\2\u0090\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092"+
		"\u0093\7p\2\2\u0093\u0094\7i\2\2\u0094\u0095\7v\2\2\u0095\u0096\7j\2\2"+
		"\u0096*\3\2\2\2\u0097\u0098\7v\2\2\u0098\u0099\7q\2\2\u0099\u009a\7u\2"+
		"\2\u009a,\3\2\2\2\u009b\u009c\7v\2\2\u009c\u009d\7v\2\2\u009d\u009e\7"+
		"n\2\2\u009e.\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7f\2\2\u00a1\60\3"+
		"\2\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8\62\3\2\2\2\u00a9"+
		"\u00aa\t\3\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7i\2"+
		"\2\u00ad\u00ae\7u\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1"+
		"\7t\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7q\2\2\u00b4"+
		"\66\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7m\2\2\u00b7\u00b8\7u\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00ba\7o\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc"+
		"\u00bd\7g\2\2\u00bd\u00be\7s\2\2\u00be:\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7e\2\2\u00c1\u00c2\7m\2\2\u00c2<\3\2\2\2\u00c3\u00c4\7y\2\2\u00c4"+
		"\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6>\3\2\2\2\u00c7\u00c8\7q\2\2\u00c8"+
		"\u00c9\7r\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7q\2\2"+
		"\u00cc\u00cd\7p\2\2\u00cd\u00ce\7u\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7p\2"+
		"\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7r\2\2\u00d2B\3\2\2\2\u00d3\u00d4\7"+
		"V\2\2\u00d4\u00d5\7U\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7x\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9D\3\2\2\2\u00da\u00db\7o\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00dd\7u\2\2\u00ddF\3\2\2\2\u00de\u00df\7y\2\2\u00df"+
		"\u00e0\7u\2\2\u00e0\u00e1\7e\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7n\2\2"+
		"\u00e3\u00e4\7g\2\2\u00e4H\3\2\2\2\u00e5\u00e6\7u\2\2\u00e6\u00e7\7c\2"+
		"\2\u00e7\u00e8\7e\2\2\u00e8\u00e9\7m\2\2\u00e9\u00ea\7Q\2\2\u00ea\u00eb"+
		"\7M\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef"+
		"\7n\2\2\u00efL\3\2\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7e\2\2\u00f2\u00f3"+
		"\7t\2\2\u00f3N\3\2\2\2\t\2[bdimr";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}