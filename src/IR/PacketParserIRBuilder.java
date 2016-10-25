
package IR;
import java.util.List;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Frontend.NetworkParser2Visitor;
import Frontend.NetworkParser2Parser.*;


public class PacketParserIRBuilder implements NetworkParser2Visitor<IR> {

	@Override
	public IR visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitDate(DateContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4flags(Ipv4flagsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitDumpline(DumplineContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitPacket(PacketContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitType(TypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitMac(MacContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitProtinfo(ProtinfoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitFile(FileContext ctx) {
		List<PacketContext> packages = ctx.packet();
		for (PacketContext packet : packages) {
			IPv4Packet newPacket = new IPv4Packet();
			newPacket.header.date = (Date) visitDate(packet.datestamp);
			newPacket.header.timestamp = (Timestamp) visitTime(packet.timestamp);
			newPacket.header.sender = (MacAddress) visitMac(packet.sourceMac);
			newPacket.header.reciever = (MacAddress) visitMac(packet.destinationMac);
			newPacket.header.type = (EtherType) visitType(packet.ethertype);
			newPacket.header.contentLength = Integer.parseInt(packet.totalLength.getText());
			newPacket.content = (HeaderContent) visitIpv4content(packet.content);
			
		}
		return null;
	}

	@Override
	public IR visitIpv4proto(Ipv4protoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4(Ipv4Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitFlagvalues(FlagvaluesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4tos(Ipv4tosContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitProtname(ProtnameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4content(Ipv4contentContext ctx) {
		
	}

	@Override
	public IR visitIpv4fields(Ipv4fieldsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitTime(TimeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitTag(TagContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}
