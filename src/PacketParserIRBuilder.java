import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import Frontend.NetworkParser2Visitor;
import Frontend.NetworkParser2Parser.*;


public class PacketParserIRBuilder implements NetworkParser2Visitor {

	@Override
	public Object visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitDate(DateContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitAddress(AddressContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitIp(IpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitHeader(HeaderContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitHex(HexContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBodyContent(BodyContentContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitOptionsheader(OptionsheaderContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitBody(BodyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitWord(WordContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitMac(MacContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitTimestamp(TimestampContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
