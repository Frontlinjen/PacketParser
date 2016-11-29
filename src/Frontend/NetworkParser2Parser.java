// Generated from C:\Users\Hjorthen\NetworkParser2.g4 by ANTLR 4.1
package Frontend;
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
		IPV4ADR=1, NUMBER=2, MAC=3, BYTE=4, WORD=5, HEX=6, HEXNUMBER=7, COLON=8, 
		DOT=9, COMMA=10, GREATERTHAN=11, HYPHEN=12, STARTPARENTHESIS=13, ENDPARENTHESIS=14, 
		STARTSQUAREBRACKET=15, ENDSQUAREBRACKET=16, FLAGS=17, OR=18, NONE=19, 
		DF=20, MF=21, ICMP=22, IGMP=23, TCP=24, UDP=25, ETHERTYPE=26, IPv4=27, 
		LENGTH=28, TOS=29, TTL=30, ID=31, OFFSET=32, PROTO=33, WHITESPACE=34;
	public static final String[] tokenNames = {
		"<INVALID>", "IPV4ADR", "NUMBER", "MAC", "BYTE", "WORD", "HEX", "HEXNUMBER", 
		"':'", "'.'", "','", "'>'", "'-'", "'('", "')'", "'['", "']'", "'flags'", 
		"'|'", "'none'", "'DF'", "'MF'", "'ICMP'", "'IGMP'", "'TCP'", "'UDP'", 
		"'ethertype'", "'IPv4'", "'length'", "'tos'", "'ttl'", "'id'", "'offset'", 
		"'proto'", "WHITESPACE"
	};
	public static final int
		RULE_file = 0, RULE_date = 1, RULE_time = 2, RULE_packet = 3, RULE_mac = 4, 
		RULE_ipv4 = 5, RULE_tag = 6, RULE_ipv4content = 7, RULE_ipv4fields = 8, 
		RULE_ipv4tos = 9, RULE_ipv4flags = 10, RULE_flagvalues = 11, RULE_ipv4proto = 12, 
		RULE_protname = 13, RULE_protinfo = 14, RULE_dumpline = 15;
	public static final String[] ruleNames = {
		"file", "date", "time", "packet", "mac", "ipv4", "tag", "ipv4content", 
		"ipv4fields", "ipv4tos", "ipv4flags", "flagvalues", "ipv4proto", "protname", 
		"protinfo", "dumpline"
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
	public static class FileContext extends ParserRuleContext {
		public List<PacketContext> packet() {
			return getRuleContexts(PacketContext.class);
		}
		public PacketContext packet(int i) {
			return getRuleContext(PacketContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(32); packet();
				}
				}
				setState(37);
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

	public static class DateContext extends ParserRuleContext {
		public Token year;
		public Token month;
		public Token day;
		public List<TerminalNode> HYPHEN() { return getTokens(NetworkParser2Parser.HYPHEN); }
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
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
		enterRule(_localctx, 2, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); ((DateContext)_localctx).year = match(NUMBER);
			setState(39); match(HYPHEN);
			setState(40); ((DateContext)_localctx).month = match(NUMBER);
			setState(41); match(HYPHEN);
			setState(42); ((DateContext)_localctx).day = match(NUMBER);
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

	public static class TimeContext extends ParserRuleContext {
		public Token hour;
		public Token minutes;
		public Token seconds;
		public Token nanoseconds;
		public TerminalNode DOT() { return getToken(NetworkParser2Parser.DOT, 0); }
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public TerminalNode COLON(int i) {
			return getToken(NetworkParser2Parser.COLON, i);
		}
		public List<TerminalNode> COLON() { return getTokens(NetworkParser2Parser.COLON); }
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); ((TimeContext)_localctx).hour = match(NUMBER);
			setState(45); match(COLON);
			setState(46); ((TimeContext)_localctx).minutes = match(NUMBER);
			setState(47); match(COLON);
			setState(48); ((TimeContext)_localctx).seconds = match(NUMBER);
			setState(49); match(DOT);
			setState(50); ((TimeContext)_localctx).nanoseconds = match(NUMBER);
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

	public static class PacketContext extends ParserRuleContext {
		public DateContext datestamp;
		public TimeContext timestamp;
		public MacContext sourceMac;
		public MacContext destinationMac;
		public Ipv4Context ethertype;
		public Token totalLength;
		public Ipv4contentContext content;
		public List<MacContext> mac() {
			return getRuleContexts(MacContext.class);
		}
		public MacContext mac(int i) {
			return getRuleContext(MacContext.class,i);
		}
		public TerminalNode ETHERTYPE() { return getToken(NetworkParser2Parser.ETHERTYPE, 0); }
		public TerminalNode COLON() { return getToken(NetworkParser2Parser.COLON, 0); }
		public Ipv4contentContext ipv4content() {
			return getRuleContext(Ipv4contentContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(NetworkParser2Parser.COMMA, i);
		}
		public TerminalNode GREATERTHAN() { return getToken(NetworkParser2Parser.GREATERTHAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(NetworkParser2Parser.COMMA); }
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(NetworkParser2Parser.NUMBER, 0); }
		public TerminalNode LENGTH() { return getToken(NetworkParser2Parser.LENGTH, 0); }
		public Ipv4Context ipv4() {
			return getRuleContext(Ipv4Context.class,0);
		}
		public PacketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterPacket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitPacket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitPacket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PacketContext packet() throws RecognitionException {
		PacketContext _localctx = new PacketContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_packet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); ((PacketContext)_localctx).datestamp = date();
			setState(53); ((PacketContext)_localctx).timestamp = time();
			setState(54); ((PacketContext)_localctx).sourceMac = mac();
			setState(55); match(GREATERTHAN);
			setState(56); ((PacketContext)_localctx).destinationMac = mac();
			setState(57); match(COMMA);
			setState(58); match(ETHERTYPE);
			setState(59); ((PacketContext)_localctx).ethertype = ipv4();
			setState(60); match(COMMA);
			setState(61); match(LENGTH);
			setState(62); ((PacketContext)_localctx).totalLength = match(NUMBER);
			setState(63); match(COLON);
			setState(64); ((PacketContext)_localctx).content = ipv4content();
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
		public TerminalNode MAC() { return getToken(NetworkParser2Parser.MAC, 0); }
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
		enterRule(_localctx, 8, RULE_mac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(MAC);
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

	public static class Ipv4Context extends ParserRuleContext {
		public TagContext tagNumber;
		public TerminalNode IPv4() { return getToken(NetworkParser2Parser.IPv4, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public Ipv4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterIpv4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitIpv4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitIpv4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4Context ipv4() throws RecognitionException {
		Ipv4Context _localctx = new Ipv4Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_ipv4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(IPv4);
			setState(69); ((Ipv4Context)_localctx).tagNumber = tag();
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

	public static class TagContext extends ParserRuleContext {
		public Token packetType;
		public TerminalNode HEXNUMBER() { return getToken(NetworkParser2Parser.HEXNUMBER, 0); }
		public TerminalNode STARTPARENTHESIS() { return getToken(NetworkParser2Parser.STARTPARENTHESIS, 0); }
		public TerminalNode ENDPARENTHESIS() { return getToken(NetworkParser2Parser.ENDPARENTHESIS, 0); }
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(STARTPARENTHESIS);
			setState(72); ((TagContext)_localctx).packetType = match(HEXNUMBER);
			setState(73); match(ENDPARENTHESIS);
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

	public static class Ipv4contentContext extends ParserRuleContext {
		public Ipv4fieldsContext fields;
		public Token source;
		public Token destination;
		public ProtinfoContext protdata;
		public DumplineContext dump;
		public DumplineContext dumpline(int i) {
			return getRuleContext(DumplineContext.class,i);
		}
		public TerminalNode GREATERTHAN() { return getToken(NetworkParser2Parser.GREATERTHAN, 0); }
		public TerminalNode COLON() { return getToken(NetworkParser2Parser.COLON, 0); }
		public TerminalNode IPV4ADR(int i) {
			return getToken(NetworkParser2Parser.IPV4ADR, i);
		}
		public ProtinfoContext protinfo() {
			return getRuleContext(ProtinfoContext.class,0);
		}
		public Ipv4fieldsContext ipv4fields() {
			return getRuleContext(Ipv4fieldsContext.class,0);
		}
		public List<TerminalNode> IPV4ADR() { return getTokens(NetworkParser2Parser.IPV4ADR); }
		public List<DumplineContext> dumpline() {
			return getRuleContexts(DumplineContext.class);
		}
		public Ipv4contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterIpv4content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitIpv4content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitIpv4content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4contentContext ipv4content() throws RecognitionException {
		Ipv4contentContext _localctx = new Ipv4contentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ipv4content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); ((Ipv4contentContext)_localctx).fields = ipv4fields();
			setState(76); ((Ipv4contentContext)_localctx).source = match(IPV4ADR);
			setState(77); match(GREATERTHAN);
			setState(78); ((Ipv4contentContext)_localctx).destination = match(IPV4ADR);
			setState(79); match(COLON);
			setState(80); ((Ipv4contentContext)_localctx).protdata = protinfo();
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81); ((Ipv4contentContext)_localctx).dump = dumpline();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEXNUMBER );
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

	public static class Ipv4fieldsContext extends ParserRuleContext {
		public Ipv4tosContext tos;
		public Token ttl;
		public Token id;
		public Token offset;
		public Ipv4flagsContext flags;
		public Ipv4protoContext protocol;
		public Token headLength;
		public TerminalNode NUMBER(int i) {
			return getToken(NetworkParser2Parser.NUMBER, i);
		}
		public TerminalNode TTL() { return getToken(NetworkParser2Parser.TTL, 0); }
		public TerminalNode STARTPARENTHESIS() { return getToken(NetworkParser2Parser.STARTPARENTHESIS, 0); }
		public Ipv4flagsContext ipv4flags() {
			return getRuleContext(Ipv4flagsContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(NetworkParser2Parser.COMMA, i);
		}
		public TerminalNode ENDPARENTHESIS() { return getToken(NetworkParser2Parser.ENDPARENTHESIS, 0); }
		public TerminalNode ID() { return getToken(NetworkParser2Parser.ID, 0); }
		public TerminalNode OFFSET() { return getToken(NetworkParser2Parser.OFFSET, 0); }
		public Ipv4tosContext ipv4tos() {
			return getRuleContext(Ipv4tosContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(NetworkParser2Parser.COMMA); }
		public List<TerminalNode> NUMBER() { return getTokens(NetworkParser2Parser.NUMBER); }
		public TerminalNode LENGTH() { return getToken(NetworkParser2Parser.LENGTH, 0); }
		public Ipv4protoContext ipv4proto() {
			return getRuleContext(Ipv4protoContext.class,0);
		}
		public Ipv4fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterIpv4fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitIpv4fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitIpv4fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4fieldsContext ipv4fields() throws RecognitionException {
		Ipv4fieldsContext _localctx = new Ipv4fieldsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ipv4fields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(STARTPARENTHESIS);
			setState(87); ((Ipv4fieldsContext)_localctx).tos = ipv4tos();
			setState(88); match(COMMA);
			setState(89); match(TTL);
			setState(90); ((Ipv4fieldsContext)_localctx).ttl = match(NUMBER);
			setState(91); match(COMMA);
			setState(92); match(ID);
			setState(93); ((Ipv4fieldsContext)_localctx).id = match(NUMBER);
			setState(94); match(COMMA);
			setState(95); match(OFFSET);
			setState(96); ((Ipv4fieldsContext)_localctx).offset = match(NUMBER);
			setState(97); match(COMMA);
			setState(98); ((Ipv4fieldsContext)_localctx).flags = ipv4flags();
			setState(99); match(COMMA);
			setState(100); ((Ipv4fieldsContext)_localctx).protocol = ipv4proto();
			setState(101); match(COMMA);
			setState(102); match(LENGTH);
			setState(103); ((Ipv4fieldsContext)_localctx).headLength = match(NUMBER);
			setState(104); match(ENDPARENTHESIS);
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

	public static class Ipv4tosContext extends ParserRuleContext {
		public Token tos;
		public TerminalNode HEXNUMBER() { return getToken(NetworkParser2Parser.HEXNUMBER, 0); }
		public TerminalNode TOS() { return getToken(NetworkParser2Parser.TOS, 0); }
		public Ipv4tosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4tos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterIpv4tos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitIpv4tos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitIpv4tos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4tosContext ipv4tos() throws RecognitionException {
		Ipv4tosContext _localctx = new Ipv4tosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ipv4tos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(TOS);
			setState(107); ((Ipv4tosContext)_localctx).tos = match(HEXNUMBER);
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

	public static class Ipv4flagsContext extends ParserRuleContext {
		public FlagvaluesContext flags;
		public FlagvaluesContext flagvalues() {
			return getRuleContext(FlagvaluesContext.class,0);
		}
		public TerminalNode FLAGS() { return getToken(NetworkParser2Parser.FLAGS, 0); }
		public TerminalNode STARTSQUAREBRACKET() { return getToken(NetworkParser2Parser.STARTSQUAREBRACKET, 0); }
		public TerminalNode ENDSQUAREBRACKET() { return getToken(NetworkParser2Parser.ENDSQUAREBRACKET, 0); }
		public Ipv4flagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterIpv4flags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitIpv4flags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitIpv4flags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4flagsContext ipv4flags() throws RecognitionException {
		Ipv4flagsContext _localctx = new Ipv4flagsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ipv4flags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(FLAGS);
			setState(110); match(STARTSQUAREBRACKET);
			setState(111); ((Ipv4flagsContext)_localctx).flags = flagvalues();
			setState(112); match(ENDSQUAREBRACKET);
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

	public static class FlagvaluesContext extends ParserRuleContext {
		public TerminalNode DF() { return getToken(NetworkParser2Parser.DF, 0); }
		public TerminalNode NONE() { return getToken(NetworkParser2Parser.NONE, 0); }
		public TerminalNode MF() { return getToken(NetworkParser2Parser.MF, 0); }
		public FlagvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterFlagvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitFlagvalues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitFlagvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagvaluesContext flagvalues() throws RecognitionException {
		FlagvaluesContext _localctx = new FlagvaluesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_flagvalues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << DF) | (1L << MF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Ipv4protoContext extends ParserRuleContext {
		public ProtnameContext proto;
		public Token protoID;
		public TerminalNode HEX() { return getToken(NetworkParser2Parser.HEX, 0); }
		public TerminalNode PROTO() { return getToken(NetworkParser2Parser.PROTO, 0); }
		public TerminalNode STARTPARENTHESIS() { return getToken(NetworkParser2Parser.STARTPARENTHESIS, 0); }
		public ProtnameContext protname() {
			return getRuleContext(ProtnameContext.class,0);
		}
		public TerminalNode ENDPARENTHESIS() { return getToken(NetworkParser2Parser.ENDPARENTHESIS, 0); }
		public Ipv4protoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipv4proto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterIpv4proto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitIpv4proto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitIpv4proto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ipv4protoContext ipv4proto() throws RecognitionException {
		Ipv4protoContext _localctx = new Ipv4protoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ipv4proto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(PROTO);
			setState(117); ((Ipv4protoContext)_localctx).proto = protname();
			setState(118); match(STARTPARENTHESIS);
			setState(119); ((Ipv4protoContext)_localctx).protoID = match(HEX);
			setState(120); match(ENDPARENTHESIS);
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

	public static class ProtnameContext extends ParserRuleContext {
		public TerminalNode IGMP() { return getToken(NetworkParser2Parser.IGMP, 0); }
		public TerminalNode TCP() { return getToken(NetworkParser2Parser.TCP, 0); }
		public TerminalNode UDP() { return getToken(NetworkParser2Parser.UDP, 0); }
		public TerminalNode ICMP() { return getToken(NetworkParser2Parser.ICMP, 0); }
		public ProtnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterProtname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitProtname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitProtname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtnameContext protname() throws RecognitionException {
		ProtnameContext _localctx = new ProtnameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_protname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ICMP) | (1L << IGMP) | (1L << TCP) | (1L << UDP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ProtinfoContext extends ParserRuleContext {
		public ProtnameContext protocol;
		public Token dataSize;
		public TerminalNode COMMA() { return getToken(NetworkParser2Parser.COMMA, 0); }
		public ProtnameContext protname() {
			return getRuleContext(ProtnameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(NetworkParser2Parser.NUMBER, 0); }
		public TerminalNode LENGTH() { return getToken(NetworkParser2Parser.LENGTH, 0); }
		public ProtinfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protinfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterProtinfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitProtinfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitProtinfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtinfoContext protinfo() throws RecognitionException {
		ProtinfoContext _localctx = new ProtinfoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_protinfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); ((ProtinfoContext)_localctx).protocol = protname();
			setState(125); match(COMMA);
			setState(126); match(LENGTH);
			setState(127); ((ProtinfoContext)_localctx).dataSize = match(NUMBER);
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

	public static class DumplineContext extends ParserRuleContext {
		public Token lineID;
		public TerminalNode COLON() { return getToken(NetworkParser2Parser.COLON, 0); }
		public TerminalNode HEXNUMBER() { return getToken(NetworkParser2Parser.HEXNUMBER, 0); }
		public DumplineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dumpline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).enterDumpline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NetworkParser2Listener ) ((NetworkParser2Listener)listener).exitDumpline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NetworkParser2Visitor ) return ((NetworkParser2Visitor<? extends T>)visitor).visitDumpline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DumplineContext dumpline() throws RecognitionException {
		DumplineContext _localctx = new DumplineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dumpline);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((DumplineContext)_localctx).lineID = match(HEXNUMBER);
			setState(130); match(COLON);
			setState(132); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(131);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3$\u008b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\tU\n\t\r\t\16"+
		"\tV\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\6"+
		"\21\u0087\n\21\r\21\16\21\u0088\3\21\3\u0088\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\4\3\2\25\27\3\2\30\33}\2%\3\2\2\2\4(\3\2\2\2\6.\3\2"+
		"\2\2\b\66\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16I\3\2\2\2\20M\3\2\2\2\22X\3"+
		"\2\2\2\24l\3\2\2\2\26o\3\2\2\2\30t\3\2\2\2\32v\3\2\2\2\34|\3\2\2\2\36"+
		"~\3\2\2\2 \u0083\3\2\2\2\"$\5\b\5\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2()\7\4\2\2)*\7\16\2\2*+\7\4\2\2+,\7\16\2"+
		"\2,-\7\4\2\2-\5\3\2\2\2./\7\4\2\2/\60\7\n\2\2\60\61\7\4\2\2\61\62\7\n"+
		"\2\2\62\63\7\4\2\2\63\64\7\13\2\2\64\65\7\4\2\2\65\7\3\2\2\2\66\67\5\4"+
		"\3\2\678\5\6\4\289\5\n\6\29:\7\r\2\2:;\5\n\6\2;<\7\f\2\2<=\7\34\2\2=>"+
		"\5\f\7\2>?\7\f\2\2?@\7\36\2\2@A\7\4\2\2AB\7\n\2\2BC\5\20\t\2C\t\3\2\2"+
		"\2DE\7\5\2\2E\13\3\2\2\2FG\7\35\2\2GH\5\16\b\2H\r\3\2\2\2IJ\7\17\2\2J"+
		"K\7\t\2\2KL\7\20\2\2L\17\3\2\2\2MN\5\22\n\2NO\7\3\2\2OP\7\r\2\2PQ\7\3"+
		"\2\2QR\7\n\2\2RT\5\36\20\2SU\5 \21\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3"+
		"\2\2\2W\21\3\2\2\2XY\7\17\2\2YZ\5\24\13\2Z[\7\f\2\2[\\\7 \2\2\\]\7\4\2"+
		"\2]^\7\f\2\2^_\7!\2\2_`\7\4\2\2`a\7\f\2\2ab\7\"\2\2bc\7\4\2\2cd\7\f\2"+
		"\2de\5\26\f\2ef\7\f\2\2fg\5\32\16\2gh\7\f\2\2hi\7\36\2\2ij\7\4\2\2jk\7"+
		"\20\2\2k\23\3\2\2\2lm\7\37\2\2mn\7\t\2\2n\25\3\2\2\2op\7\23\2\2pq\7\21"+
		"\2\2qr\5\30\r\2rs\7\22\2\2s\27\3\2\2\2tu\t\2\2\2u\31\3\2\2\2vw\7#\2\2"+
		"wx\5\34\17\2xy\7\17\2\2yz\7\b\2\2z{\7\20\2\2{\33\3\2\2\2|}\t\3\2\2}\35"+
		"\3\2\2\2~\177\5\34\17\2\177\u0080\7\f\2\2\u0080\u0081\7\36\2\2\u0081\u0082"+
		"\7\4\2\2\u0082\37\3\2\2\2\u0083\u0084\7\t\2\2\u0084\u0086\7\n\2\2\u0085"+
		"\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0089!\3\2\2\2\5%V\u0088";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}