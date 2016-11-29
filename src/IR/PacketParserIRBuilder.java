package IR;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Frontend.NetworkParser2Visitor;
import Utility.Counter;
import Frontend.NetworkParser2Parser.*;


public class PacketParserIRBuilder extends AbstractParseTreeVisitor<IR> implements NetworkParser2Visitor<IR> {

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
		int year = Integer.parseInt(ctx.year.getText());
		int month = Integer.parseInt(ctx.month.getText());
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

	public IR visitType(Ipv4Context ctx) {
		EtherType ET = new EtherType(new NP2HexaDecimal(ctx.tagNumber.packetType.getText()));
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
		List<IPv4Packet> IPv4Packets = new ArrayList<IPv4Packet>();
		for (PacketContext packet : packages) {
			System.out.println("--START PACKAGE--\n");
			IPv4Packet newPacket = new IPv4Packet();
			newPacket.header.date = (Date) visitDate(packet.datestamp);
			newPacket.header.timestamp = (Timestamp) visitTime(packet.timestamp);
			newPacket.header.sender = (MacAddress) visitMac(packet.sourceMac);
			newPacket.header.reciever = (MacAddress) visitMac(packet.destinationMac);
			newPacket.header.type = (EtherType) visitType(packet.ethertype);
			newPacket.header.contentLength = Integer.parseInt(packet.totalLength.getText());
			newPacket.content = (Content) visitIpv4content(packet.content);	
			System.out.println("\n--END PACKAGE--");
			IPv4Packets.add(newPacket);
		}
		HashMap<String, Counter> comb = new HashMap<String, Counter>();
		for (IPv4Packet packet : IPv4Packets){
			String key = packet.content.senderIP + " -> " + packet.content.recieverIP;
			Counter result = comb.get(key);
			if(result == null){
				comb.put(key, new Counter(1));
			}
			else{
				result.Increment();
			}
		}
		System.out.println("Printing IP overview: ");
		Iterator<Map.Entry<String, Counter>> it = comb.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Counter> pair = it.next();
			System.out.println(pair.getKey() + ": " + pair.getValue());
			it.remove();
		}
		HashMap<String, String> IPAddress = new HashMap<String, String>();
		HashMap<String, String> MacAddress = new HashMap<String, String>();
		for (IPv4Packet packet : IPv4Packets){
			String[] currentIP = {packet.content.senderIP.toString(), packet.content.recieverIP.toString()};
			String[] currentMac = {packet.header.sender.toString(), packet.header.reciever.toString()};
			
			for (int i = 0; i < currentIP.length; i++) {
				String Mac = IPAddress.get(currentIP[i]);
				String IP = MacAddress.get(currentMac[i]);
				//System.err.println("currentIP " + currentIP[i] + " currentMac: " + currentMac[i] + " MAC: " + Mac + " IP: " + IP);
				if(Mac==null)
				{
					IPAddress.put(currentIP[i], currentMac[i]);
				}
				else if(!Mac.equals(currentMac[i]))
				{
					System.err.println("IP " + currentIP[i] + " changed from " + Mac + " to " + currentMac[i]);
				}
				if(IP==null)
				{
					MacAddress.put(currentMac[i], currentIP[i]);
				}
				else if(!IP.equals(currentIP[i]))
				{
					System.err.println(currentMac[i] + " changed from " + IP + " to " + currentIP[i]);
				}
			}
			
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
		content.tos = new NP2HexaDecimal(ctx.ipv4fields().tos.tos.getText());
		content.TTL = Integer.parseInt(ctx.ipv4fields().ttl.getText());
		content.id = Integer.parseInt(ctx.ipv4fields().id.getText());
		content.offset = Integer.parseInt(ctx.ipv4fields().offset.getText());
		content.protoID = Integer.parseInt(ctx.ipv4fields().protocol.protoID.getText());
		content.headerLength = Integer.parseInt(ctx.ipv4fields().headLength.getText());
		content.flags = ctx.ipv4fields().flags.getText();
		content.proto = ctx.ipv4fields().protocol.getText();
		
		System.out.println("IPv4:" + " Sender IP: " + content.senderIP + " Reciever IP: " + content.recieverIP + " tos: " + content.tos
							+ " TLL: " + content.TTL + " id: " + content.id + " offset: " + content.offset + " protoID: " + content.protoID
							+ " header length: " + content.headerLength + " flags: " + content.flags + " proto: " + content.proto);
		
		return content;
	}

	@Override
	public IR visitIpv4fields(Ipv4fieldsContext ctx) {
		
		return null;
	}

	@Override
	public IR visitTime(TimeContext ctx) {
		int hour = Integer.parseInt(ctx.hour.getText());
		int minutes = Integer.parseInt(ctx.minutes.getText());
		int seconds = Integer.parseInt(ctx.seconds.getText());
		int miliseconds = Integer.parseInt(ctx.nanoseconds.getText());
		
		System.out.println("Timestamp: " + hour + ":" + minutes + ":" + seconds + "." + miliseconds);

		Timestamp timecontext = new Timestamp(hour, minutes, seconds, miliseconds);
				
		return timecontext;
	}

	@Override
	public IR visitTag(TagContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitHextest(HextestContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}
