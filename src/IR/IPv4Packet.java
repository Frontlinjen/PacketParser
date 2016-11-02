
package IR;

import java.util.ArrayList;
import java.util.List;

public class IPv4Packet extends IR{
	Header header = new Header();
	Content content = new Content();
	List<IPv4Packet> dumplines = new ArrayList<IPv4Packet>();
}
