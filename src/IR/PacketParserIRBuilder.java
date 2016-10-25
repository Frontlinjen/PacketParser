package IR;
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
	public IR visitAddress(AddressContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitIp(IpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitHeader(HeaderContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitHex(HexContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitBodyContent(BodyContentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitOptionsheader(OptionsheaderContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitBody(BodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitWord(WordContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitMac(MacContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IR visitTimestamp(TimestampContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}


}
