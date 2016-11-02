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
		int year = Integer.parseInt(ctx.day.getText());
		int month = Integer.parseInt(ctx.day.getText());
		int day = Integer.parseInt(ctx.day.getText());

		System.out.println("Date: " + year + "-" + month + "-" + day);
		
		Date datecontext = new Date(year, month, day);
				
		return datecontext;
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
		EtherType ET = new EtherType(new NP2HexaDecimal(ctx.getText()));
		System.out.println("Type:" + ET);
		return ET;
	}

	@Override
	public IR visitMac(MacContext ctx) {
		MacAddress macAdd = new MacAddress(ctx.getText());
		System.out.println("MAC:" + macAdd);
		return macAdd;	
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
			newPacket.content = (Content) visitIpv4content(packet.content);		
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
		Content content = new Content();
		content.senderIP = new IPv4(ctx.source.getText());
		content.recieverIP = new IPv4(ctx.destination.getText());
		content.tos = new NP2HexaDecimal(ctx.ipv4fields().tos.getText());
		content.TTL = Integer.parseInt(ctx.ipv4fields().ttl.getText());
		content.id = Integer.parseInt(ctx.ipv4fields().id.getText());
		content.offset = Integer.parseInt(ctx.ipv4fields().offset.getText());
		content.protoID = Integer.parseInt(ctx.ipv4fields().protocol.getText());
		content.headerLength = Integer.parseInt(ctx.ipv4fields().headLength.getText());
		content.flags = ctx.ipv4fields().flags.getText();
		content.proto = ctx.ipv4fields().protocol.getText();
				
		return content;
	}

	@Override
	public IR visitIpv4fields(Ipv4fieldsContext ctx) {
		
		return null;
	}

	@Override
	public IR visitTime(TimeContext ctx) {
		int hour = Integer.parseInt(ctx.hour.getText());
		int minutes = Integer.parseInt(ctx.hour.getText());
		int seconds = Integer.parseInt(ctx.hour.getText());
		int miliseconds = Integer.parseInt(ctx.hour.getText());
		
		System.out.println("Timestamp: " + hour + ":" + minutes + ":" + seconds + "." + miliseconds);

		Timestamp timecontext = new Timestamp(hour, minutes, seconds, miliseconds);
				
		return timecontext;
	}

	@Override
	public IR visitTag(TagContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}
