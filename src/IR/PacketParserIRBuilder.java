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
	public IR visitDate(Frontend.NetworkParser2Parser.DateContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4flags(Frontend.NetworkParser2Parser.Ipv4flagsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitDumpline(Frontend.NetworkParser2Parser.DumplineContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitPacket(Frontend.NetworkParser2Parser.PacketContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitType(Frontend.NetworkParser2Parser.TypeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitMac(Frontend.NetworkParser2Parser.MacContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitProtinfo(Frontend.NetworkParser2Parser.ProtinfoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitFile(Frontend.NetworkParser2Parser.FileContext ctx) {
		List<PacketContext> packages = ctx.packet();
		for (PacketContext packetContext : packages) {
			
		}
	}

	@Override
	public IR visitIpv4proto(Frontend.NetworkParser2Parser.Ipv4protoContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4(Frontend.NetworkParser2Parser.Ipv4Context ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitFlagvalues(Frontend.NetworkParser2Parser.FlagvaluesContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4tos(Frontend.NetworkParser2Parser.Ipv4tosContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitProtname(Frontend.NetworkParser2Parser.ProtnameContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4content(Frontend.NetworkParser2Parser.Ipv4contentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIpv4fields(Frontend.NetworkParser2Parser.Ipv4fieldsContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitTime(Frontend.NetworkParser2Parser.TimeContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitTag(Frontend.NetworkParser2Parser.TagContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
