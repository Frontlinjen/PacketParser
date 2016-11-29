// Generated from C:\Users\Hjorthen\NetworkParser2.g4 by ANTLR 4.1
package Frontend;
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
		IPV4ADR=1, NUMBER=2, MAC=3, BYTE=4, WORD=5, HEX=6, HEXNUMBER=7, COLON=8, 
		DOT=9, COMMA=10, GREATERTHAN=11, HYPHEN=12, STARTPARENTHESIS=13, ENDPARENTHESIS=14, 
		STARTSQUAREBRACKET=15, ENDSQUAREBRACKET=16, FLAGS=17, OR=18, NONE=19, 
		DF=20, MF=21, ICMP=22, IGMP=23, TCP=24, UDP=25, ETHERTYPE=26, IPv4=27, 
		LENGTH=28, TOS=29, TTL=30, ID=31, OFFSET=32, PROTO=33, WHITESPACE=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"IPV4ADR", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", "':'", 
		"'.'", "','", "'>'", "'-'", "'('", "')'", "'['", "']'", "'flags'", "'|'", 
		"'none'", "'DF'", "'MF'", "'ICMP'", "'IGMP'", "'TCP'", "'UDP'", "'ethertype'", 
		"'IPv4'", "'length'", "'tos'", "'ttl'", "'id'", "'offset'", "'proto'", 
		"WHITESPACE"
	};
	public static final String[] ruleNames = {
		"IPV4ADR", "DIGIT", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", 
		"COLON", "DOT", "COMMA", "GREATERTHAN", "HYPHEN", "STARTPARENTHESIS", 
		"ENDPARENTHESIS", "STARTSQUAREBRACKET", "ENDSQUAREBRACKET", "FLAGS", "OR", 
		"NONE", "DF", "MF", "ICMP", "IGMP", "TCP", "UDP", "ETHERTYPE", "IPv4", 
		"LENGTH", "TOS", "TTL", "ID", "OFFSET", "PROTO", "WHITESPACE"
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
		case 34: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2$\u00e5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\6\4W\n\4\r\4\16\4X\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\6\tu\n\t"+
		"\r\t\16\tv\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\7$\u00df"+
		"\n$\f$\16$\u00e2\13$\3$\3$\2%\3\3\1\5\2\1\7\4\1\t\5\1\13\6\1\r\7\1\17"+
		"\b\1\21\t\1\23\n\1\25\13\1\27\f\1\31\r\1\33\16\1\35\17\1\37\20\1!\21\1"+
		"#\22\1%\23\1\'\24\1)\25\1+\26\1-\27\1/\30\1\61\31\1\63\32\1\65\33\1\67"+
		"\34\19\35\1;\36\1=\37\1? \1A!\1C\"\1E#\1G$\2\3\2\5\3\2\62;\5\2\62;CHc"+
		"h\5\2\13\f\17\17\"\"\u00e6\2\3\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5S\3\2\2\2\7V\3\2\2\2\tZ\3\2\2\2\13f\3\2"+
		"\2\2\ri\3\2\2\2\17n\3\2\2\2\21p\3\2\2\2\23x\3\2\2\2\25z\3\2\2\2\27|\3"+
		"\2\2\2\31~\3\2\2\2\33\u0080\3\2\2\2\35\u0082\3\2\2\2\37\u0084\3\2\2\2"+
		"!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2\'\u0090\3\2\2\2)\u0092\3"+
		"\2\2\2+\u0097\3\2\2\2-\u009a\3\2\2\2/\u009d\3\2\2\2\61\u00a2\3\2\2\2\63"+
		"\u00a7\3\2\2\2\65\u00ab\3\2\2\2\67\u00af\3\2\2\29\u00b9\3\2\2\2;\u00be"+
		"\3\2\2\2=\u00c5\3\2\2\2?\u00c9\3\2\2\2A\u00cd\3\2\2\2C\u00d0\3\2\2\2E"+
		"\u00d7\3\2\2\2G\u00e0\3\2\2\2IJ\5\7\4\2JK\5\25\13\2KL\5\7\4\2LM\5\25\13"+
		"\2MN\5\7\4\2NO\5\25\13\2OP\5\7\4\2PQ\5\25\13\2QR\5\7\4\2R\4\3\2\2\2ST"+
		"\t\2\2\2T\6\3\2\2\2UW\5\5\3\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y\b\3\2\2\2Z[\5\13\6\2[\\\5\23\n\2\\]\5\13\6\2]^\5\23\n\2^_\5\13\6\2_"+
		"`\5\23\n\2`a\5\13\6\2ab\5\23\n\2bc\5\13\6\2cd\5\23\n\2de\5\13\6\2e\n\3"+
		"\2\2\2fg\5\17\b\2gh\5\17\b\2h\f\3\2\2\2ij\5\17\b\2jk\5\17\b\2kl\5\17\b"+
		"\2lm\5\17\b\2m\16\3\2\2\2no\t\3\2\2o\20\3\2\2\2pq\7\62\2\2qr\7z\2\2rt"+
		"\3\2\2\2su\5\17\b\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\22\3\2\2"+
		"\2xy\7<\2\2y\24\3\2\2\2z{\7\60\2\2{\26\3\2\2\2|}\7.\2\2}\30\3\2\2\2~\177"+
		"\7@\2\2\177\32\3\2\2\2\u0080\u0081\7/\2\2\u0081\34\3\2\2\2\u0082\u0083"+
		"\7*\2\2\u0083\36\3\2\2\2\u0084\u0085\7+\2\2\u0085 \3\2\2\2\u0086\u0087"+
		"\7]\2\2\u0087\"\3\2\2\2\u0088\u0089\7_\2\2\u0089$\3\2\2\2\u008a\u008b"+
		"\7h\2\2\u008b\u008c\7n\2\2\u008c\u008d\7c\2\2\u008d\u008e\7i\2\2\u008e"+
		"\u008f\7u\2\2\u008f&\3\2\2\2\u0090\u0091\7~\2\2\u0091(\3\2\2\2\u0092\u0093"+
		"\7p\2\2\u0093\u0094\7q\2\2\u0094\u0095\7p\2\2\u0095\u0096\7g\2\2\u0096"+
		"*\3\2\2\2\u0097\u0098\7F\2\2\u0098\u0099\7H\2\2\u0099,\3\2\2\2\u009a\u009b"+
		"\7O\2\2\u009b\u009c\7H\2\2\u009c.\3\2\2\2\u009d\u009e\7K\2\2\u009e\u009f"+
		"\7E\2\2\u009f\u00a0\7O\2\2\u00a0\u00a1\7R\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\7K\2\2\u00a3\u00a4\7I\2\2\u00a4\u00a5\7O\2\2\u00a5\u00a6\7R\2\2\u00a6"+
		"\62\3\2\2\2\u00a7\u00a8\7V\2\2\u00a8\u00a9\7E\2\2\u00a9\u00aa\7R\2\2\u00aa"+
		"\64\3\2\2\2\u00ab\u00ac\7W\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae\7R\2\2\u00ae"+
		"\66\3\2\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7j\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7{\2\2"+
		"\u00b6\u00b7\7r\2\2\u00b7\u00b8\7g\2\2\u00b88\3\2\2\2\u00b9\u00ba\7K\2"+
		"\2\u00ba\u00bb\7R\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd\7\66\2\2\u00bd:\3"+
		"\2\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7i\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7j\2\2\u00c4<\3\2\2\2\u00c5"+
		"\u00c6\7v\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7u\2\2\u00c8>\3\2\2\2\u00c9"+
		"\u00ca\7v\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7n\2\2\u00cc@\3\2\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7f\2\2\u00cfB\3\2\2\2\u00d0\u00d1\7q\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7g\2\2"+
		"\u00d5\u00d6\7v\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7r\2\2\u00d8\u00d9\7t\2"+
		"\2\u00d9\u00da\7q\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7q\2\2\u00dcF\3\2"+
		"\2\2\u00dd\u00df\t\4\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\b$\2\2\u00e4H\3\2\2\2\6\2Xv\u00e0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}