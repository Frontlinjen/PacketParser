package IR;
public class Header extends IR{
	Timestamp timestamp;
	Date date;
	MacAddress sender;
	MacAddress reciever;
	EtherType type;
	int size;
	int contentLength;
}