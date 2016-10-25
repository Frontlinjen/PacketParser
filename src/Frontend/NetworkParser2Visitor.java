package Frontend;
// Generated from C:\Users\Hjorthen\NetworkParser2.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NetworkParser2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NetworkParser2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(@NotNull NetworkParser2Parser.DateContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(@NotNull NetworkParser2Parser.AddressContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#ip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIp(@NotNull NetworkParser2Parser.IpContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(@NotNull NetworkParser2Parser.HeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#hex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHex(@NotNull NetworkParser2Parser.HexContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#bodyContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyContent(@NotNull NetworkParser2Parser.BodyContentContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull NetworkParser2Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#optionsheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsheader(@NotNull NetworkParser2Parser.OptionsheaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull NetworkParser2Parser.BodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(@NotNull NetworkParser2Parser.WordContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#mac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMac(@NotNull NetworkParser2Parser.MacContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#timestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp(@NotNull NetworkParser2Parser.TimestampContext ctx);
}