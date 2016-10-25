// Generated from C:\Users\Hjorthen\NetworkParser2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NetworkParser2Parser}.
 */
public interface NetworkParser2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(@NotNull NetworkParser2Parser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(@NotNull NetworkParser2Parser.DateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(@NotNull NetworkParser2Parser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(@NotNull NetworkParser2Parser.AddressContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#ip}.
	 * @param ctx the parse tree
	 */
	void enterIp(@NotNull NetworkParser2Parser.IpContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#ip}.
	 * @param ctx the parse tree
	 */
	void exitIp(@NotNull NetworkParser2Parser.IpContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(@NotNull NetworkParser2Parser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(@NotNull NetworkParser2Parser.HeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(@NotNull NetworkParser2Parser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(@NotNull NetworkParser2Parser.HexContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#bodyContent}.
	 * @param ctx the parse tree
	 */
	void enterBodyContent(@NotNull NetworkParser2Parser.BodyContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#bodyContent}.
	 * @param ctx the parse tree
	 */
	void exitBodyContent(@NotNull NetworkParser2Parser.BodyContentContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull NetworkParser2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull NetworkParser2Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#optionsheader}.
	 * @param ctx the parse tree
	 */
	void enterOptionsheader(@NotNull NetworkParser2Parser.OptionsheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#optionsheader}.
	 * @param ctx the parse tree
	 */
	void exitOptionsheader(@NotNull NetworkParser2Parser.OptionsheaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull NetworkParser2Parser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull NetworkParser2Parser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(@NotNull NetworkParser2Parser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(@NotNull NetworkParser2Parser.WordContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#mac}.
	 * @param ctx the parse tree
	 */
	void enterMac(@NotNull NetworkParser2Parser.MacContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#mac}.
	 * @param ctx the parse tree
	 */
	void exitMac(@NotNull NetworkParser2Parser.MacContext ctx);

	/**
	 * Enter a parse tree produced by {@link NetworkParser2Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp(@NotNull NetworkParser2Parser.TimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link NetworkParser2Parser#timestamp}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp(@NotNull NetworkParser2Parser.TimestampContext ctx);
}