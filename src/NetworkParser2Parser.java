// Generated from C:\Users\Hjorthen\NetworkParser2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NetworkParser2Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEXFORMAL=1, NUMBER=2, CHAR=3, WHITESPACE=4, COLON=5, DOT=6, HYPHEN=7, 
		LESSTHAN=8, ROUNDOPEN=9, ROUNDCLOSE=10, SQUAREOPEN=11, SQUARECLOSE=12, 
		ETHERTYPE=13, LENGTH=14, TOS=15, TTL=16, ID=17, OFFSET=18, FLAGS=19, PROTO=20, 
		CHECKSUM=21, SEQ=22, ACK=23, WIN=24, OPTIONS=25, NOP=26, TSVAL=27, MSS=28, 
		WSCALE=29, SACKOK=30, EOL=31, ECR=32;
	public static final String[] tokenNames = {
		"<INVALID>", "HEXFORMAL", "NUMBER", "CHAR", "WHITESPACE", "':'", "'.'", 
		"'-'", "'>'", "'('", "')'", "'['", "']'", "'ethertype'", "'length'", "'tos'", 
		"'ttl'", "'id'", "'offset'", "FLAGS", "'proto'", "'cksum'", "'seq'", "'ack'", 
		"'win'", "'options'", "'nop'", "'TS val'", "'mss'", "'wscale'", "'sackOK'", 
		"'eol'", "'ecr'"
	};
	public static final int
		RULE_program = 0, RULE_hex = 1, RULE_mac = 2, RULE_date = 3, RULE_timestamp = 4, 
		RULE_word = 5, RULE_ip = 6, RULE_address = 7, RULE_optionsheader = 8, 
		RULE_header = 9, RULE_bodyContent = 10, RULE_body = 11;
	public static final String[] ruleNames = {
		"program", "hex", "mac", "date", "timestamp", "word", "ip", "address", 
		"optionsheader", "header", "bodyContent", "body"
	};

	@Override
	public String getGrammarFileName() { return "NetworkParser2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public NetworkParser2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public HeaderContext header(int i) {
			return getRuleContext(HeaderContext.class,i);
		}
		public List<HeaderContext> header() {
			return getRuleContexts(HeaderContext.class);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24); header();
				setState(25); body();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HexContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public TerminalNode CHAR(int i) {
			return getToken(NetworkParser2Parser.CHAR, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(NetworkParser2Parser.CHAR); }
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitHex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitHex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hex);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(31);
					_la = _input.LA(1);
					if ( !(_la==NUMBER || _la==CHAR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MacContext extends ParserRuleContext {
		public HexContext hex(int i) {
			return getRuleContext(HexContext.class,i);
		}
		public TerminalNode COLON(int i) {
			return getToken(NetworkParser2Parser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NetworkParser2Parser.COLON); }
		public List<HexContext> hex() {
			return getRuleContexts(HexContext.class);
		}
		public MacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterMac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitMac(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitMac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MacContext mac() throws RecognitionException {
		MacContext _localctx = new MacContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); hex();
			setState(37); match(COLON);
			setState(38); hex();
			setState(39); match(COLON);
			setState(40); hex();
			setState(41); match(COLON);
			setState(42); hex();
			setState(43); match(COLON);
			setState(44); hex();
			setState(45); match(COLON);
			setState(46); hex();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public List<TerminalNode> HYPHEN() { return getTokens(NetworkParser2Parser.HYPHEN); }
		public TerminalNode HYPHEN(int i) {
			return getToken(NetworkParser2Parser.HYPHEN, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(NUMBER);
			setState(49); match(HYPHEN);
			setState(50); match(NUMBER);
			setState(51); match(HYPHEN);
			setState(52); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimestampContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public TerminalNode DOT() { return getToken(NetworkParser2Parser.DOT, 0); }
		public TerminalNode COLON(int i) {
			return getToken(NetworkParser2Parser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NetworkParser2Parser.COLON); }
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(NUMBER);
			setState(55); match(COLON);
			setState(56); match(NUMBER);
			setState(57); match(COLON);
			setState(58); match(NUMBER);
			setState(59); match(DOT);
			setState(60); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public TerminalNode CHAR(int i) {
			return getToken(NetworkParser2Parser.CHAR, i);
		}
		public List<TerminalNode> CHAR() { return getTokens(NetworkParser2Parser.CHAR); }
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_word);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					_la = _input.LA(1);
					if ( !(_la==NUMBER || _la==CHAR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IpContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(NetworkParser2Parser.DOT); }
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public TerminalNode DOT(int i) {
			return getToken(NetworkParser2Parser.DOT, i);
		}
		public IpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitIp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpContext ip() throws RecognitionException {
		IpContext _localctx = new IpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(NUMBER);
			setState(68); match(DOT);
			setState(69); match(NUMBER);
			setState(70); match(DOT);
			setState(71); match(NUMBER);
			setState(72); match(DOT);
			setState(73); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressContext extends ParserRuleContext {
		public IpContext ip() {
			return getRuleContext(IpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(NetworkParser2Parser.DOT, 0); }
		public TerminalNode NUMBER() { return getToken(NetworkParser2Parser.NUMBER, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); ip();
			setState(76); match(DOT);
			setState(77); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsheaderContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public TerminalNode TSVAL(int i) {
			return getToken(NetworkParser2Parser.TSVAL, i);
		}
		public List<TerminalNode> SACKOK() { return getTokens(NetworkParser2Parser.SACKOK); }
		public TerminalNode EOL(int i) {
			return getToken(NetworkParser2Parser.EOL, i);
		}
		public List<TerminalNode> WSCALE() { return getTokens(NetworkParser2Parser.WSCALE); }
		public TerminalNode WSCALE(int i) {
			return getToken(NetworkParser2Parser.WSCALE, i);
		}
		public TerminalNode MSS(int i) {
			return getToken(NetworkParser2Parser.MSS, i);
		}
		public List<TerminalNode> TSVAL() { return getTokens(NetworkParser2Parser.TSVAL); }
		public TerminalNode ECR(int i) {
			return getToken(NetworkParser2Parser.ECR, i);
		}
		public List<TerminalNode> EOL() { return getTokens(NetworkParser2Parser.EOL); }
		public List<TerminalNode> NOP() { return getTokens(NetworkParser2Parser.NOP); }
		public TerminalNode SACKOK(int i) {
			return getToken(NetworkParser2Parser.SACKOK, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public TerminalNode NOP(int i) {
			return getToken(NetworkParser2Parser.NOP, i);
		}
		public List<TerminalNode> MSS() { return getTokens(NetworkParser2Parser.MSS); }
		public List<TerminalNode> ECR() { return getTokens(NetworkParser2Parser.ECR); }
		public OptionsheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterOptionsheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitOptionsheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitOptionsheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsheaderContext optionsheader() throws RecognitionException {
		OptionsheaderContext _localctx = new OptionsheaderContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optionsheader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOP) | (1L << TSVAL) | (1L << MSS) | (1L << WSCALE) | (1L << SACKOK) | (1L << EOL) | (1L << ECR))) != 0)) {
				{
				setState(90);
				switch (_input.LA(1)) {
				case MSS:
					{
					{
					setState(79); match(MSS);
					setState(80); match(NUMBER);
					}
					}
					break;
				case SACKOK:
					{
					setState(81); match(SACKOK);
					}
					break;
				case TSVAL:
					{
					{
					setState(82); match(TSVAL);
					setState(83); match(NUMBER);
					}
					}
					break;
				case ECR:
					{
					{
					setState(84); match(ECR);
					setState(85); match(NUMBER);
					}
					}
					break;
				case NOP:
					{
					setState(86); match(NOP);
					}
					break;
				case WSCALE:
					{
					{
					setState(87); match(WSCALE);
					setState(88); match(NUMBER);
					}
					}
					break;
				case EOL:
					{
					setState(89); match(EOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> SQUARECLOSE() { return getTokens(NetworkParser2Parser.SQUARECLOSE); }
		public TerminalNode SQUARECLOSE(int i) {
			return getToken(NetworkParser2Parser.SQUARECLOSE, i);
		}
		public MacContext mac(int i) {
			return getRuleContext(MacContext.class,i);
		}
		public TerminalNode CHECKSUM() { return getToken(NetworkParser2Parser.CHECKSUM, 0); }
		public TerminalNode SEQ() { return getToken(NetworkParser2Parser.SEQ, 0); }
		public TerminalNode ROUNDCLOSE(int i) {
			return getToken(NetworkParser2Parser.ROUNDCLOSE, i);
		}
		public TerminalNode SQUAREOPEN(int i) {
			return getToken(NetworkParser2Parser.SQUAREOPEN, i);
		}
		public TerminalNode OPTIONS() { return getToken(NetworkParser2Parser.OPTIONS, 0); }
		public TerminalNode DOT(int i) {
			return getToken(NetworkParser2Parser.DOT, i);
		}
		public TerminalNode LENGTH(int i) {
			return getToken(NetworkParser2Parser.LENGTH, i);
		}
		public TerminalNode ID() { return getToken(NetworkParser2Parser.ID, 0); }
		public List<TerminalNode> DOT() { return getTokens(NetworkParser2Parser.DOT); }
		public TerminalNode OFFSET() { return getToken(NetworkParser2Parser.OFFSET, 0); }
		public AddressContext address(int i) {
			return getRuleContext(AddressContext.class,i);
		}
		public List<TerminalNode> LESSTHAN() { return getTokens(NetworkParser2Parser.LESSTHAN); }
		public List<TerminalNode> ROUNDCLOSE() { return getTokens(NetworkParser2Parser.ROUNDCLOSE); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode PROTO() { return getToken(NetworkParser2Parser.PROTO, 0); }
		public TerminalNode WIN() { return getToken(NetworkParser2Parser.WIN, 0); }
		public List<TerminalNode> LENGTH() { return getTokens(NetworkParser2Parser.LENGTH); }
		public List<AddressContext> address() {
			return getRuleContexts(AddressContext.class);
		}
		public List<TerminalNode> HEXFORMAL() { return getTokens(NetworkParser2Parser.HEXFORMAL); }
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public TerminalNode HEXFORMAL(int i) {
			return getToken(NetworkParser2Parser.HEXFORMAL, i);
		}
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public List<MacContext> mac() {
			return getRuleContexts(MacContext.class);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public TerminalNode TTL() { return getToken(NetworkParser2Parser.TTL, 0); }
		public TerminalNode ROUNDOPEN(int i) {
			return getToken(NetworkParser2Parser.ROUNDOPEN, i);
		}
		public TerminalNode ETHERTYPE() { return getToken(NetworkParser2Parser.ETHERTYPE, 0); }
		public List<TerminalNode> FLAGS() { return getTokens(NetworkParser2Parser.FLAGS); }
		public List<TerminalNode> ROUNDOPEN() { return getTokens(NetworkParser2Parser.ROUNDOPEN); }
		public List<TerminalNode> COLON() { return getTokens(NetworkParser2Parser.COLON); }
		public TerminalNode TOS() { return getToken(NetworkParser2Parser.TOS, 0); }
		public OptionsheaderContext optionsheader() {
			return getRuleContext(OptionsheaderContext.class,0);
		}
		public TerminalNode LESSTHAN(int i) {
			return getToken(NetworkParser2Parser.LESSTHAN, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(NetworkParser2Parser.COLON, i);
		}
		public TerminalNode FLAGS(int i) {
			return getToken(NetworkParser2Parser.FLAGS, i);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public List<TerminalNode> SQUAREOPEN() { return getTokens(NetworkParser2Parser.SQUAREOPEN); }
		public TerminalNode ACK() { return getToken(NetworkParser2Parser.ACK, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); date();
			setState(96); timestamp();
			setState(97); mac();
			setState(98); match(LESSTHAN);
			setState(99); mac();
			setState(100); match(ETHERTYPE);
			setState(101); word();
			setState(102); match(ROUNDOPEN);
			setState(103); match(HEXFORMAL);
			setState(104); match(ROUNDCLOSE);
			setState(105); match(LENGTH);
			setState(106); match(NUMBER);
			setState(107); match(COLON);
			setState(108); match(ROUNDOPEN);
			setState(109); match(TOS);
			setState(110); match(HEXFORMAL);
			setState(111); match(TTL);
			setState(112); match(NUMBER);
			setState(113); match(ID);
			setState(114); match(NUMBER);
			setState(115); match(OFFSET);
			setState(116); match(NUMBER);
			setState(117); match(FLAGS);
			setState(118); match(SQUAREOPEN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << CHAR) | (1L << DOT))) != 0)) {
				{
				setState(121);
				switch (_input.LA(1)) {
				case NUMBER:
				case CHAR:
					{
					setState(119); word();
					}
					break;
				case DOT:
					{
					setState(120); match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126); match(SQUARECLOSE);
			setState(127); match(PROTO);
			setState(128); word();
			setState(129); match(ROUNDOPEN);
			setState(130); match(NUMBER);
			setState(131); match(ROUNDCLOSE);
			setState(132); match(LENGTH);
			setState(133); match(NUMBER);
			setState(134); match(ROUNDCLOSE);
			setState(135); address();
			setState(136); match(LESSTHAN);
			setState(137); address();
			setState(138); match(COLON);
			setState(139); match(FLAGS);
			setState(140); match(SQUAREOPEN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << CHAR) | (1L << DOT))) != 0)) {
				{
				setState(143);
				switch (_input.LA(1)) {
				case NUMBER:
				case CHAR:
					{
					setState(141); word();
					}
					break;
				case DOT:
					{
					setState(142); match(DOT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148); match(SQUARECLOSE);
			setState(149); match(CHECKSUM);
			setState(150); match(HEXFORMAL);
			setState(151); match(ROUNDOPEN);
			setState(152); word();
			setState(153); match(ROUNDCLOSE);
			setState(156);
			_la = _input.LA(1);
			if (_la==SEQ) {
				{
				setState(154); match(SEQ);
				setState(155); match(NUMBER);
				}
			}

			setState(160);
			_la = _input.LA(1);
			if (_la==ACK) {
				{
				setState(158); match(ACK);
				setState(159); match(NUMBER);
				}
			}

			setState(162); match(WIN);
			setState(163); match(NUMBER);
			setState(164); match(OPTIONS);
			setState(165); match(SQUAREOPEN);
			setState(166); optionsheader();
			setState(167); match(SQUARECLOSE);
			setState(168); match(LENGTH);
			setState(169); match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContentContext extends ParserRuleContext {
		public HexContext hex(int i) {
			return getRuleContext(HexContext.class,i);
		}
		public List<HexContext> hex() {
			return getRuleContexts(HexContext.class);
		}
		public BodyContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterBodyContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitBodyContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitBodyContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContentContext bodyContent() throws RecognitionException {
		BodyContentContext _localctx = new BodyContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bodyContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171); hex();
			setState(172); hex();
			setState(173); hex();
			setState(174); hex();
			setState(175); hex();
			setState(176); hex();
			setState(177); hex();
			setState(178); hex();
			setState(180); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(179);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(182); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode HEXFORMAL(int i) {
			return getToken(NetworkParser2Parser.HEXFORMAL, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(NetworkParser2Parser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NetworkParser2Parser.COLON); }
		public List<BodyContentContext> bodyContent() {
			return getRuleContexts(BodyContentContext.class);
		}
		public List<TerminalNode> HEXFORMAL() { return getTokens(NetworkParser2Parser.HEXFORMAL); }
		public BodyContentContext bodyContent(int i) {
			return getRuleContext(BodyContentContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HEXFORMAL) {
				{
				{
				setState(184); match(HEXFORMAL);
				setState(185); match(COLON);
				setState(186); bodyContent();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\"\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\6\2\36\n\2\r\2\16\2\37\3\3\6\3#\n\3\r"+
		"\3\16\3$\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7B\n\7\r\7\16\7C\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13|\n\13\f\13\16\13\177\13\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u0092\n\13\f\13\16\13\u0095\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u009f\n\13\3\13\3\13\5\13\u00a3\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\6\f\u00b7\n\f\r\f\16\f\u00b8\3\r\3\r\3\r\7\r\u00be\n\r\f\r\16\r\u00c1"+
		"\13\r\3\r\3\u00b8\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\3\2\4\5\u00c8\2"+
		"\35\3\2\2\2\4\"\3\2\2\2\6&\3\2\2\2\b\62\3\2\2\2\n8\3\2\2\2\fA\3\2\2\2"+
		"\16E\3\2\2\2\20M\3\2\2\2\22^\3\2\2\2\24a\3\2\2\2\26\u00ad\3\2\2\2\30\u00bf"+
		"\3\2\2\2\32\33\5\24\13\2\33\34\5\30\r\2\34\36\3\2\2\2\35\32\3\2\2\2\36"+
		"\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2!#\t\2\2\2\"!\3\2\2\2"+
		"#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&\'\5\4\3\2\'(\7\7\2\2()\5\4"+
		"\3\2)*\7\7\2\2*+\5\4\3\2+,\7\7\2\2,-\5\4\3\2-.\7\7\2\2./\5\4\3\2/\60\7"+
		"\7\2\2\60\61\5\4\3\2\61\7\3\2\2\2\62\63\7\4\2\2\63\64\7\t\2\2\64\65\7"+
		"\4\2\2\65\66\7\t\2\2\66\67\7\4\2\2\67\t\3\2\2\289\7\4\2\29:\7\7\2\2:;"+
		"\7\4\2\2;<\7\7\2\2<=\7\4\2\2=>\7\b\2\2>?\7\4\2\2?\13\3\2\2\2@B\t\2\2\2"+
		"A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\r\3\2\2\2EF\7\4\2\2FG\7\b\2"+
		"\2GH\7\4\2\2HI\7\b\2\2IJ\7\4\2\2JK\7\b\2\2KL\7\4\2\2L\17\3\2\2\2MN\5\16"+
		"\b\2NO\7\b\2\2OP\7\4\2\2P\21\3\2\2\2QR\7\36\2\2R]\7\4\2\2S]\7 \2\2TU\7"+
		"\35\2\2U]\7\4\2\2VW\7\"\2\2W]\7\4\2\2X]\7\34\2\2YZ\7\37\2\2Z]\7\4\2\2"+
		"[]\7!\2\2\\Q\3\2\2\2\\S\3\2\2\2\\T\3\2\2\2\\V\3\2\2\2\\X\3\2\2\2\\Y\3"+
		"\2\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\23\3\2\2\2`^\3\2\2\2"+
		"ab\5\b\5\2bc\5\n\6\2cd\5\6\4\2de\7\n\2\2ef\5\6\4\2fg\7\17\2\2gh\5\f\7"+
		"\2hi\7\13\2\2ij\7\3\2\2jk\7\f\2\2kl\7\20\2\2lm\7\4\2\2mn\7\7\2\2no\7\13"+
		"\2\2op\7\21\2\2pq\7\3\2\2qr\7\22\2\2rs\7\4\2\2st\7\23\2\2tu\7\4\2\2uv"+
		"\7\24\2\2vw\7\4\2\2wx\7\25\2\2x}\7\r\2\2y|\5\f\7\2z|\7\b\2\2{y\3\2\2\2"+
		"{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2"+
		"\2\u0080\u0081\7\16\2\2\u0081\u0082\7\26\2\2\u0082\u0083\5\f\7\2\u0083"+
		"\u0084\7\13\2\2\u0084\u0085\7\4\2\2\u0085\u0086\7\f\2\2\u0086\u0087\7"+
		"\20\2\2\u0087\u0088\7\4\2\2\u0088\u0089\7\f\2\2\u0089\u008a\5\20\t\2\u008a"+
		"\u008b\7\n\2\2\u008b\u008c\5\20\t\2\u008c\u008d\7\7\2\2\u008d\u008e\7"+
		"\25\2\2\u008e\u0093\7\r\2\2\u008f\u0092\5\f\7\2\u0090\u0092\7\b\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0097\7\16\2\2\u0097\u0098\7\27\2\2\u0098\u0099\7\3\2\2\u0099\u009a\7"+
		"\13\2\2\u009a\u009b\5\f\7\2\u009b\u009e\7\f\2\2\u009c\u009d\7\30\2\2\u009d"+
		"\u009f\7\4\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2"+
		"\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a3\7\4\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\32\2\2\u00a5\u00a6\7"+
		"\4\2\2\u00a6\u00a7\7\33\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\5\22\n\2\u00a9"+
		"\u00aa\7\16\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\7\4\2\2\u00ac\25\3\2"+
		"\2\2\u00ad\u00ae\5\4\3\2\u00ae\u00af\5\4\3\2\u00af\u00b0\5\4\3\2\u00b0"+
		"\u00b1\5\4\3\2\u00b1\u00b2\5\4\3\2\u00b2\u00b3\5\4\3\2\u00b3\u00b4\5\4"+
		"\3\2\u00b4\u00b6\5\4\3\2\u00b5\u00b7\13\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\27\3\2\2"+
		"\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc\7\7\2\2\u00bc\u00be\5\26\f\2\u00bd"+
		"\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\31\3\2\2\2\u00c1\u00bf\3\2\2\2\17\37$C\\^{}\u0091\u0093\u009e"+
		"\u00a2\u00b8\u00bf";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}