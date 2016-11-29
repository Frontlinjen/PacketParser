// Generated from C:\Users\Hjorthen\NetworkParser2.g4 by ANTLR 4.1
package Frontend;
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
	 * Visit a parse tree produced by {@link NetworkParser2Parser#ipv4flags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4flags(@NotNull NetworkParser2Parser.Ipv4flagsContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#dumpline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDumpline(@NotNull NetworkParser2Parser.DumplineContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#packet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPacket(@NotNull NetworkParser2Parser.PacketContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#mac}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMac(@NotNull NetworkParser2Parser.MacContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#protinfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtinfo(@NotNull NetworkParser2Parser.ProtinfoContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(@NotNull NetworkParser2Parser.FileContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#ipv4proto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4proto(@NotNull NetworkParser2Parser.Ipv4protoContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#ipv4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4(@NotNull NetworkParser2Parser.Ipv4Context ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#flagvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlagvalues(@NotNull NetworkParser2Parser.FlagvaluesContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#ipv4tos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4tos(@NotNull NetworkParser2Parser.Ipv4tosContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#protname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtname(@NotNull NetworkParser2Parser.ProtnameContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#ipv4content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4content(@NotNull NetworkParser2Parser.Ipv4contentContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#ipv4fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpv4fields(@NotNull NetworkParser2Parser.Ipv4fieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(@NotNull NetworkParser2Parser.TimeContext ctx);

	/**
	 * Visit a parse tree produced by {@link NetworkParser2Parser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(@NotNull NetworkParser2Parser.TagContext ctx);
}