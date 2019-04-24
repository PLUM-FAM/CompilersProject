import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;



public class OurPlumListenerIR extends PlumBaseListener 
{
	OurSymbolTable symbolTable = new OurSymbolTable();
	ArrayList<IRNode> irList = new ArrayList<IRNode>();
	int currentBlock = 1;
	int blockCount = 1;
	int temp = -1;
	public enum IdType{
		FUNC, STRING, INT, FLOAT, NONE;	}
	
	IdType currentId = IdType.NONE;
	
	@Override 
	public void enterId(PlumParser.IdContext ctx) 
	{

		switch(currentId){
			case FUNC:
				symbolTable.addScope(ctx.getText());
				currentId = IdType.NONE;
				break;
			case STRING: case INT: case FLOAT:
				symbolTable.addSymbol(currentId.name(), ctx.getText());
				break;
			case NONE:
				break;
		}
	}
	
	@Override
	public void enterAssign_expr(PlumParser.Assign_exprContext ctx)
	{
		int value = temp;

		irList.addAll(buildExpression(ctx.expr().getText()));

		String s = getTypeFromSymbolTable(ctx.id().getText());

		if(temp == value){
			irList.add(new IRNode("STORE" + s.charAt(0), ctx.expr().getText(), "", ctx.id().getText()));	
		}
		else{
			irList.add(new IRNode("STORE" + s.charAt(0), "T"+temp, "", ctx.id().getText()));
		}
	}
	@Override
	
	public void exitAssign_expr(PlumParser.Assign_exprContext ctx)
	{
		
	}
	
	@Override 
	public void enterFunc_decl(PlumParser.Func_declContext ctx) 
	{
		currentId = IdType.FUNC;

		irList.add(new IRNode("LABEL",ctx.id().getText(),"",""));
	}
	
	@Override 
	public void exitFunc_decl(PlumParser.Func_declContext ctx) 
	{
		symbolTable.moveCurrentToParent();

		currentId = IdType.NONE;
	}
	
	@Override public void enterWrite_stmt(PlumParser.Write_stmtContext ctx) 
	{
		String[] ids = ctx.id_list().getText().split(",");
		for(String id : ids){
			switch(getTypeFromSymbolTable(id)){
				case "STRING" :
					irList.add(new IRNode("WRITES",id,"",""));
					break;
				case "INT" :
					irList.add(new IRNode("WRITEI",id,"",""));
					break;
				case "FLOAT" :
					irList.add(new IRNode("WRITEF",id,"",""));
					break;
			}
		}
	}
	
	@Override public void enterRead_stmt(PlumParser.Read_stmtContext ctx) 
	{
		String[] ids = ctx.id_list().getText().split(",");
		for(String id : ids){

			for(OurSymbolTable.Symbol sym : symbolTable.getRootScope()){
				if(sym.getName().equals(id)){
					switch(sym.getType()){
						case "STRING" :
							irList.add(new IRNode("READS",id,"",""));
							break;
						case "INT" :
							irList.add(new IRNode("READI",id,"",""));
							break;
						case "FLOAT" :
							irList.add(new IRNode("READF",id,"",""));
							break;
					}
				}

			}
		}
	}
	

	@Override 
	public void exitString_decl(PlumParser.String_declContext ctx) 
	{
		currentId = IdType.NONE;
	}
	
	@Override 
	public void enterStr(PlumParser.StrContext ctx) {
		symbolTable.setSymbolVal(ctx.getText());
	}
	@Override 
	public void enterString_decl(PlumParser.String_declContext ctx) 
	{
		currentId = IdType.STRING;
	}
	

	
	@Override 
	public void enterVar_type(PlumParser.Var_typeContext ctx) 
	{ 
		if(currentId != IdType.FUNC){
			if(ctx.getText().equals("INT")){
			currentId = IdType.INT;
			}
			else if(ctx.getText().equals("FLOAT")){
				currentId = IdType.FLOAT;
			}
		}
	}
	
	@Override public void exitVar_decl(PlumParser.Var_declContext ctx) 
	{ 
		currentId = IdType.NONE;
	}
	
	@Override public void exitParam_decl(PlumParser.Param_declContext ctx) 
	{ 
		currentId = IdType.NONE;
	}
	

	public void printIR(){
		for(IRNode n : irList){
			System.out.println(";"+n.getOp()+ " " + n.getR1()+ " " + n.getR2()+ " " + n.getR3());
		}
	}


	@Override 
	public void enterIf_stmt(PlumParser.If_stmtContext ctx) 
	{
		blockCount = currentBlock;
		int val = temp;
		String exp1, exp2;
		irList.addAll(buildExpression(ctx.cond().expr(0).getText()));
		if(val == temp){
			exp1 = ctx.cond().expr(0).getText();
		}
		else{
			exp1 = "T" + temp;
		}
		irList.addAll(buildExpression(ctx.cond().expr(1).getText()));
		if(val == temp){
			exp2 = ctx.cond().expr(1).getText();
		}
		else{
			exp2 = "T" + temp;
		}
		if(ctx.else_pre().else_part() != null){
			irList.add(makeIRCond(exp1, ctx.cond().compop().getText(),exp2,"BEGIN_ELSE_"+blockCount));
		}
		else{
			irList.add(makeIRCond(exp1, ctx.cond().compop().getText(),exp2,"END_IF_"+blockCount));
		}
		symbolTable.addScope("BLOCK " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitIf_stmt(PlumParser.If_stmtContext ctx) 
	{
		irList.add(new IRNode("LABEL","END_IF_"+blockCount,"",""));
		blockCount--;
		symbolTable.moveCurrentToParent();
	}
	
	@Override 
	public void enterWhile_stmt(PlumParser.While_stmtContext ctx)
	{
		blockCount = currentBlock;
		irList.add(new IRNode("LABEL","BEGIN_WHILE_"+blockCount,"",""));
		int value = temp;
		String exp1, exp2;
		irList.addAll(buildExpression(ctx.cond().expr(0).getText()));
		if(value == temp){
			exp1 = ctx.cond().expr(0).getText();
		}
		else{
			exp1 = "T" + temp;
		}
		irList.addAll(buildExpression(ctx.cond().expr(1).getText()));
		if(value == temp){
			exp2 = ctx.cond().expr(1).getText();
		}
		else{
			exp2 = "T" + temp;
		}
		irList.add(makeIRCond(exp1, ctx.cond().compop().getText(),exp2,"END_WHILE_"+blockCount));
		symbolTable.addScope("BLOCK " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitWhile_stmt(PlumParser.While_stmtContext ctx) 
	{
		irList.add(new IRNode("JUMP", "", "", "BEGIN_WHILE_" + blockCount));
		irList.add(new IRNode("LABEL","END_WHILE_"+blockCount,"",""));
		blockCount--;
		symbolTable.moveCurrentToParent();
	}

	@Override 
	public void enterElse_pre(PlumParser.Else_preContext ctx) 
	{
		if(ctx.else_part() != null){
			irList.add(new IRNode("JUMP", "", "", "END_IF_" + blockCount));
			irList.add(new IRNode("LABEL","BEGIN_ELSE_"+blockCount,"",""));
		}
		symbolTable.addScope("BLOCK " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitElse_pre(PlumParser.Else_preContext ctx) 
	{
		symbolTable.moveCurrentToParent();
	}
	
	private ArrayList<IRNode> buildExpression(String expr)
	{
		String type = null;
		String[] ids = expr.split("\\+|\\-|\\*|\\/");
		String id = ids[0];
		id = id.replaceAll(" ","");
		id = id.replaceAll("[()]", "");
		type = getTypeFromSymbolTable(id);
		if(type != "INT" && type != "FLOAT"){
			if(id.contains(".")){
				type = "FLOAT";
			}
			else{
				type = "INT";
			}
		}
		
		ArrayList<IRNode> exprIR = new ArrayList<IRNode>();
		if(expr.contains("(")){
			int paren = 0;
			int sIndex = -1;
			for(int i = 0; i < expr.length(); i++)
			{
				if(expr.charAt(i) == '('){
					if(paren==0){
						sIndex = i;
					}
					paren++;
				}
				else if(expr.charAt(i) == ')')
				{
					paren--;
				}
				if(sIndex != -1 && paren == 0)
				{
					exprIR.addAll(buildExpression(expr.substring(sIndex+1, i)));
					expr = expr.substring(0,sIndex) + "T" + temp + expr.substring(i+1,expr.length());
					i=0;
					sIndex = -1;
				}
			}
		}
		int sIndex = 0, mulIndex = -1;
		for(int i = 0; i < expr.length(); i++)
		{
			if(expr.charAt(i) == '*' || expr.charAt(i) == '/' || expr.charAt(i) == '+' || expr.charAt(i) == '-' || (i == expr.length()-1 && mulIndex != -1))
			{
				if(expr.charAt(i) == '*' || expr.charAt(i) == '/')
				{
					mulIndex = i;
				}
				else if(mulIndex == -1)
				{
					sIndex = i+1;
				}
				else{
					if(i == expr.length()-1)
					{
						exprIR.add(makeIRMul(expr.substring(sIndex, mulIndex),expr.charAt(mulIndex),expr.substring(mulIndex+1, i+1),type));
						expr = expr.substring(0,sIndex) + "T" + temp + expr.substring(i+1,expr.length());
					}
					else
					{
						exprIR.add(makeIRMul(expr.substring(sIndex, mulIndex),expr.charAt(mulIndex),expr.substring(mulIndex+1, i),type));
						expr = expr.substring(0,sIndex) + "T" + temp + expr.substring(i,expr.length());
					}
					i=0;
					mulIndex = -1;
					sIndex = 0;
				}
			}
		}
		
		int addIndex = -1;
		for(int i = 0; i < expr.length(); i++)
		{
			if(expr.charAt(i) == '+' || expr.charAt(i) == '-' || (i == expr.length()-1 && addIndex != -1))
			{
				if(addIndex == -1){
					addIndex = i;
				}
				else
				{
					if(i == expr.length()-1)
					{
						exprIR.add(makeIRAdd(expr.substring(0, addIndex),expr.charAt(addIndex),expr.substring(addIndex+1, i+1),type));
						expr = expr.substring(0,0) + "T" + temp + expr.substring(i+1,expr.length());
					}
					else
					{
						exprIR.add(makeIRAdd(expr.substring(0, addIndex),expr.charAt(addIndex),expr.substring(addIndex+1, i), type));
						expr = expr.substring(0,0) + "T" + temp + expr.substring(i,expr.length());
					}
					i=0;
					addIndex = -1;
				}
			}
		}
		
		
		return exprIR;
	}
	
	
	
	public IRNode makeIRAdd(String val1, char op, String val2, String type)
	{
		IRNode exprIR = null;
		val1.replace(" ", "");
		val2.replace(" ", "");
		if(op == '+'){
			temp++;
			exprIR=new IRNode("ADD" + type.charAt(0),val1,val2,"T"+temp);
		}
		else if(op == '-'){
			temp++;
			exprIR=new IRNode("SUB" + type.charAt(0),val1,val2,"T"+temp);
		}
		return exprIR;	
	}

	public IRNode makeIRMul(String val1, char op, String val2, String type)
	{
		IRNode exprIR = null;
		val1.replace(" ", "");
		val2.replace(" ", "");
		if(op == '*'){
			temp++;
			exprIR=new IRNode("MULT" + type.charAt(0),val1,val2,"T"+temp);
		}
		else if(op == '/'){
			temp++;
			exprIR=new IRNode("DIV" + type.charAt(0),val1,val2,"T"+temp);
		}
		return exprIR;
	}
	
	public IRNode makeIRCond(String exp1, String op, String exp2, String label)
	{
		IRNode condIR =null;
		String oper = "";
		switch(op){
			case "!=":
				oper = "EQ";
				break;
			case "=":
				oper = "NE";
				break;
			case ">=":
				oper = "LT";
				break;
			case "<=":
				oper = "GT";
				break;
			case ">":
				oper = "LE";
				break;
			case "<":
				oper = "GE";
				break;
		}
		condIR = new IRNode(oper,exp1,exp2,label);
		return condIR;
	}
	
	public String getTypeFromSymbolTable(String var){
		for(OurSymbolTable.Symbol sym : symbolTable.getRootScope())
		{
			if(sym.getName().equals(var)){
				return sym.getType();
			}
		}
		return null;
	}
	
	
	


	public ArrayList<IRNode> getIRList()
	{
		return irList;
	}
	 
	public OurSymbolTable getSymbolTable()
	{
		return symbolTable;
	}
}