package IR;

import java.awt.Color;
import java.io.IOException;

import javax.swing.text.html.CSS.Attribute;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import Frontend.NetworkParser2Lexer;
import Frontend.NetworkParser2Parser;

public class PrettyPrinter {

	public static void main(String[] args) throws Exception {
		
		ParseTree tree = null;
		try {
			CharStream input = new ANTLRFileStream(args[0]);
			NetworkParser2Lexer lex = new NetworkParser2Lexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lex);
			NetworkParser2Parser parser = new NetworkParser2Parser(tokens);
			tree = parser.file();
			if(parser.getNumberOfSyntaxErrors()> 0)
			{
				throw new Exception("SyntaxError");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Prints the tree
		PacketParserIRBuilder builder = new PacketParserIRBuilder();
		builder.visit(tree);
		
	}
}
