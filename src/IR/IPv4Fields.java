
package IR;

public class IPv4Fields extends IR{
	NP2HexaDecimal tos;
	int ttl;
	int id;
	int offset;
	String flags;
	String proto; //needs a class of its own
	int length;
}