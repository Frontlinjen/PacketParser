package IR;

public class Header extends IR{
	Timestamp timestamp;
	Date date;
	MacAddress sender;
	MacAddress reciever;
	EtherType type;
	int size;
	IPv4Fields fields;
	IPv4 senderIP, recieverIP;
	String protname;
	int contentLength;
}
