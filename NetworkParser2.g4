grammar NetworkParser2;


file : packet*; 


date : year=NUMBER HYPHEN month=NUMBER HYPHEN day=NUMBER;
time : hour=NUMBER COLON minutes=NUMBER COLON seconds=NUMBER DOT nanoseconds=NUMBER;

packet : datestamp=date timestamp=time  sourceMac=mac GREATERTHAN destinationMac=mac COMMA ETHERTYPE ethertype=ipv4 COMMA LENGTH totalLength=NUMBER COLON content=ipv4content;   
mac : MAC;

ipv4 : IPv4 tagNumber=tag;
tag : STARTPARENTHESIS packetType=HEXNUMBER ENDPARENTHESIS;


ipv4content : fields=ipv4fields source=IPV4ADR GREATERTHAN destination=IPV4ADR COLON protdata=protinfo dump=dumpline +;
ipv4fields : STARTPARENTHESIS tos=ipv4tos COMMA TTL ttl=NUMBER COMMA ID id=NUMBER COMMA OFFSET offset=NUMBER COMMA flags=ipv4flags COMMA protocol=ipv4proto COMMA LENGTH headLength=NUMBER ENDPARENTHESIS;
IPV4ADR : NUMBER DOT NUMBER DOT NUMBER DOT NUMBER DOT NUMBER;
ipv4tos : TOS tos=HEXNUMBER;
ipv4flags : FLAGS STARTSQUAREBRACKET flags=flagvalues ENDSQUAREBRACKET;
flagvalues : NONE | DF | MF;
ipv4proto : PROTO proto=protname STARTPARENTHESIS protoID=NUMBER ENDPARENTHESIS;
protname : ICMP | IGMP | TCP | UDP;
protinfo : protocol=protname COMMA LENGTH dataSize=NUMBER; 
dumpline : lineID=HEXNUMBER COLON (HEX+). + ?; 
hextest : HEXNUMBER;

fragment DIGIT : [0-9];
WHITESPACE : [ \t\n\r]+ -> skip;
NUMBER : DIGIT +;
MAC : BYTE COLON BYTE COLON BYTE COLON BYTE COLON BYTE COLON BYTE;
BYTE : HEX HEX;
WORD : HEX HEX HEX HEX;
HEX : [0-9a-fA-F];
HEXNUMBER : '0x' (HEX +);

COLON : ':';
DOT : '.';
COMMA : ',';
GREATERTHAN : '>';
HYPHEN : '-';
STARTPARENTHESIS : '(';
ENDPARENTHESIS : ')';
STARTSQUAREBRACKET : '[';
ENDSQUAREBRACKET : ']';
FLAGS : 'flags';
OR : '|';
NONE : 'none';
DF : 'DF';
MF : 'MF';
ICMP : 'ICMP';
IGMP : 'IGMP';
TCP : 'TCP';
UDP : 'UDP';
ETHERTYPE : 'ethertype';
IPv4 : 'IPv4';
LENGTH : 'length';
TOS : 'tos';
TTL : 'ttl';
ID : 'id';
OFFSET : 'offset';
PROTO : 'proto';