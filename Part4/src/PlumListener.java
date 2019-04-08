// Generated from Plum.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlumParser}.
 */
public interface PlumListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlumParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(PlumParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(PlumParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PlumParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PlumParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PlumParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PlumParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void enterPgm_body(PlumParser.Pgm_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#pgm_body}.
	 * @param ctx the parse tree
	 */
	void exitPgm_body(PlumParser.Pgm_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(PlumParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(PlumParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void enterString_decl(PlumParser.String_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#string_decl}.
	 * @param ctx the parse tree
	 */
	void exitString_decl(PlumParser.String_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(PlumParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(PlumParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(PlumParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(PlumParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(PlumParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(PlumParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#any_type}.
	 * @param ctx the parse tree
	 */
	void enterAny_type(PlumParser.Any_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#any_type}.
	 * @param ctx the parse tree
	 */
	void exitAny_type(PlumParser.Any_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#id_list}.
	 * @param ctx the parse tree
	 */
	void enterId_list(PlumParser.Id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#id_list}.
	 * @param ctx the parse tree
	 */
	void exitId_list(PlumParser.Id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void enterId_tail(PlumParser.Id_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#id_tail}.
	 * @param ctx the parse tree
	 */
	void exitId_tail(PlumParser.Id_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_list(PlumParser.Param_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#param_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_list(PlumParser.Param_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(PlumParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(PlumParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_tail(PlumParser.Param_decl_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#param_decl_tail}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_tail(PlumParser.Param_decl_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declarations(PlumParser.Func_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#func_declarations}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declarations(PlumParser.Func_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl(PlumParser.Func_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#func_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl(PlumParser.Func_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(PlumParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(PlumParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterStmt_list(PlumParser.Stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitStmt_list(PlumParser.Stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PlumParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PlumParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBase_stmt(PlumParser.Base_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#base_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBase_stmt(PlumParser.Base_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(PlumParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(PlumParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(PlumParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(PlumParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRead_stmt(PlumParser.Read_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#read_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRead_stmt(PlumParser.Read_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWrite_stmt(PlumParser.Write_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#write_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWrite_stmt(PlumParser.Write_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PlumParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PlumParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PlumParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PlumParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void enterExpr_prefix(PlumParser.Expr_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#expr_prefix}.
	 * @param ctx the parse tree
	 */
	void exitExpr_prefix(PlumParser.Expr_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#expr_recurse}.
	 * @param ctx the parse tree
	 */
	void enterExpr_recurse(PlumParser.Expr_recurseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#expr_recurse}.
	 * @param ctx the parse tree
	 */
	void exitExpr_recurse(PlumParser.Expr_recurseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PlumParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PlumParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prefix(PlumParser.Factor_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#factor_prefix}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prefix(PlumParser.Factor_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#factor_recurse}.
	 * @param ctx the parse tree
	 */
	void enterFactor_recurse(PlumParser.Factor_recurseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#factor_recurse}.
	 * @param ctx the parse tree
	 */
	void exitFactor_recurse(PlumParser.Factor_recurseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expr(PlumParser.Postfix_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expr(PlumParser.Postfix_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void enterCall_expr(PlumParser.Call_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#call_expr}.
	 * @param ctx the parse tree
	 */
	void exitCall_expr(PlumParser.Call_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(PlumParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(PlumParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_tail(PlumParser.Expr_list_tailContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#expr_list_tail}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_tail(PlumParser.Expr_list_tailContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PlumParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PlumParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(PlumParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(PlumParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(PlumParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(PlumParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PlumParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PlumParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#else_pre}.
	 * @param ctx the parse tree
	 */
	void enterElse_pre(PlumParser.Else_preContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#else_pre}.
	 * @param ctx the parse tree
	 */
	void exitElse_pre(PlumParser.Else_preContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(PlumParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(PlumParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(PlumParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(PlumParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#compop}.
	 * @param ctx the parse tree
	 */
	void enterCompop(PlumParser.CompopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#compop}.
	 * @param ctx the parse tree
	 */
	void exitCompop(PlumParser.CompopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlumParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(PlumParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlumParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(PlumParser.While_stmtContext ctx);
}