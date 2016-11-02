package IR;

public class Content extends IR{
	String tos;
	int TTL;
	int id;
	int offset;
	String flags;
	String proto;
	String protoID;
	int headerLength;
	IPv4Fields fields;
	IPv4 senderIP, recieverIP;
	String protname;
}
