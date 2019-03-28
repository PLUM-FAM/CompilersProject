public class OurPlumListener extends PlumBaseListener
{
	OurSymbolTable symTable = new OurSymbolTable();
	int currentBlock = 1; //starts at 1 instead of 0 to get desired outputs for grading.
	public enum IdType
	{
		FUNC, STRING, INT, FLOAT, NONE;	
	}
	
	IdType currentId = IdType.NONE;
	
	@Override 
	public void enterId(PlumParser.IdContext context) {
		switch(currentId){
			case FUNC:
				symTable.addScope(context.getText());
				currentId = IdType.NONE;
				break;
			case STRING: case INT: case FLOAT:
				symTable.addSymbol(currentId.name(), context.getText());
				break;
			case NONE:
				break;
		}
	}
	
	@Override
	public void enterFunc_decl(PlumParser.Func_declContext context) {
		currentId = IdType.FUNC;
	}
	
	@Override 
	public void exitFunc_decl(PlumParser.Func_declContext context) {
		symTable.moveCurrentToParent();
		currentId = IdType.NONE;
	}
	
	@Override 
	public void enterString_decl(PlumParser.String_declContext context) {
		currentId = IdType.STRING;
	}
	
	@Override 
	public void exitString_decl(PlumParser.String_declContext context) {
		currentId = IdType.NONE;
	}
	
	@Override 
	public void enterStr(PlumParser.StrContext context) {
		symTable.setSymbolVal(context.getText());
	}
	
	@Override 
	public void enterVar_type(PlumParser.Var_typeContext context) { 
		if(currentId != IdType.FUNC){
			if(context.getText().equals("INT")){
			currentId = IdType.INT;
			}
			else if(context.getText().equals("FLOAT")){
				currentId = IdType.FLOAT;
			}
		}
	}
	
	@Override public void exitVar_decl(PlumParser.Var_declContext context) { 
		currentId = IdType.NONE;
	}
	
	@Override public void exitParam_decl(PlumParser.Param_declContext context) { 
		currentId = IdType.NONE;
	}
	
	@Override 
	public void enterIf_stmt(PlumParser.If_stmtContext context) {
		symTable.addScope("BLOCK " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitIf_stmt(PlumParser.If_stmtContext context) {
		symTable.moveCurrentToParent();
	}
	
	//TODO: issues with this method being called more often than it should. I.e. outputs do not match, creation of a new block in empty elses.
	//***/FIXED***
	@Override 
	public void enterElse_part(PlumParser.Else_partContext context) { 
		symTable.addScope("BLOCK " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitElse_part(PlumParser.Else_partContext context) {
		symTable.moveCurrentToParent();
	}
	
	@Override 
	public void enterWhile_stmt(PlumParser.While_stmtContext context) {
		symTable.addScope("BLOCK " + currentBlock);
		currentBlock++;
	}
	
	@Override 
	public void exitWhile_stmt(PlumParser.While_stmtContext context) {
		symTable.moveCurrentToParent();
	}
	
	//get method for entire symbol table.
	public OurSymbolTable getSymbolTable(){
		return symTable;
	}
}