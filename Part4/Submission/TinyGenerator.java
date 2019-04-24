import java.util.ArrayList;
import java.util.HashMap;


public class TinyGenerator {
	ArrayList<TinyNode> listTiny = new ArrayList<TinyNode>();
	OurSymbolTable symbolTable;
	int currentRegister = 0;
	int currentLabel = 1;
	HashMap<String, String> labelhash = new HashMap<String, String>();

	HashMap<String, String> registerHash = new HashMap<String, String>();
    
	public TinyGenerator(ArrayList<IRNode> irList, OurSymbolTable s)
	{
		this.symbolTable = s;
		for(OurSymbolTable.Symbol sym : s.getRootScope()){
			if(sym.getType() == "INT" || sym.getType()=="FLOAT")
			{


				listTiny.add(new TinyNode("var", sym.getName(),""));
			}
			else
			{

				listTiny.add(new TinyNode("str", sym.getName(), sym.getValue()));
			}
		}
		for(IRNode ir : irList)
		{
			ir = convertRegs(ir);
			switch(ir.getOp())
			{
				case("LABEL"):
					listTiny.add(new TinyNode("label", convertLabel(ir.getR1()),""));
					break;


				case("STOREI"):
					if(ir.getR1().charAt(0)=='r')
					{
						listTiny.add(new TinyNode("move", ir.getR1(),ir.getR3()));
					}
					else{
						listTiny.add(new TinyNode("move", ir.getR1(),"r"+currentRegister));
						listTiny.add(new TinyNode("move", "r"+currentRegister, ir.getR3()));
						currentRegister++;
					}
					break;


				case("STOREF"):
					if(ir.getR1().charAt(0)=='r')
					{
						listTiny.add(new TinyNode("move", ir.getR1(),ir.getR3()));
					}
					else
					{
						listTiny.add(new TinyNode("move", ir.getR1(),"r"+currentRegister));
						listTiny.add(new TinyNode("move", "r"+currentRegister, ir.getR3()));
						currentRegister++;
					}
					break;

					
				case("READI"):
					listTiny.add(new TinyNode("sys", "readi", ir.getR1()));
					break;
				case("READF"):
					listTiny.add(new TinyNode("sys", "readr", ir.getR1()));
					break;
				case("WRITEI"):
					listTiny.add(new TinyNode("sys", "writei", ir.getR1()));
					break;
				case("WRITEF"):
					listTiny.add(new TinyNode("sys", "writer", ir.getR1()));
					break;
				case("WRITES"):
					listTiny.add(new TinyNode("sys", "writes", ir.getR1()));
					break;
				case("ADDI"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("addi", ir.getR2(), ir.getR3()));
					break;
				case("ADDF"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("addr", ir.getR2(), ir.getR3()));
					break;
				case("SUBI"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("subi", ir.getR2(), ir.getR3()));
					break;
				case("SUBF"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("subr", ir.getR2(), ir.getR3()));
					break;
				case("MULTI"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("muli", ir.getR2(), ir.getR3()));
					break;
				case("MULTF"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("mulr", ir.getR2(), ir.getR3()));
					break;
				case("DIVI"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("divi", ir.getR2(), ir.getR3()));
					break;
				case("DIVF"):
					listTiny.add(new TinyNode("move", ir.getR1(), ir.getR3()));
					listTiny.add(new TinyNode("divr", ir.getR2(), ir.getR3()));
					break;
				case("GT"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpi", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					else
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpr", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					listTiny.add(new TinyNode("jgt", convertLabel(ir.getR3()), ""));
					break;
				case("GE"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpi", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					else
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpr", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					listTiny.add(new TinyNode("jge", convertLabel(ir.getR3()), ""));
					break;
				case("LT"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpi", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					else
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpr", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					listTiny.add(new TinyNode("jlt", convertLabel(ir.getR3()), ""));
					break;
				case("LE"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT"))
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpi", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					else
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpr", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					listTiny.add(new TinyNode("jle", convertLabel(ir.getR3()), ""));
					break;
				case("NE"):

					if(getTypeOfSymbol(ir.getR1()).equals("INT")){
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpi", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					else
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpr", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					listTiny.add(new TinyNode("jne", convertLabel(ir.getR3()), ""));
					break;

				case("EQ"):
					if(getTypeOfSymbol(ir.getR1()).equals("INT"))
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpi", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					else
					{
						listTiny.add(new TinyNode("move", ir.getR2(),"r"+currentRegister));
						listTiny.add(new TinyNode("cmpr", ir.getR1(), "r"+currentRegister));
						currentRegister++;
					}
					listTiny.add(new TinyNode("jeq", convertLabel(ir.getR3()), ""));
					break;
				case("JUMP"):
					listTiny.add(new TinyNode("jmp", convertLabel(ir.getR3()),""));
					break;
			}
		}
		//ending command
		listTiny.add(new TinyNode("sys", "halt", ""));
	}
	private String getTypeOfSymbol(String sym)
	{
		for(OurSymbolTable.Symbol symbol : symbolTable.getRootScope())
		{
			if(symbol.getName().equals(sym))
			{
				return symbol.getType();

			}
		}
		if(sym.contains("."))
		{
			return "FLOAT";
		}
		else
		{
			return "INT";
		}
	}
	
	public void printTiny()
	{
		for(TinyNode n : listTiny)
		{
			String toPrint = n.op + " " + n.r1;
			if(!n.r2.equals(""))
			{
				toPrint += " " + n.r2; 
			}
			System.out.println(toPrint);
		}
	}
	
	private IRNode convertRegs(IRNode ir)
	{
		if(!ir.getR1().equals("") && ir.getR1().charAt(0) == 'T')
		{
			if(!registerHash.containsKey(ir.getR1()))
			{
				registerHash.put(ir.getR1(), "r"+currentRegister);
				currentRegister++;
			}
			ir.setR1(registerHash.get(ir.getR1()));
		}
		if(!ir.getR2().equals("") && ir.getR2().charAt(0) == 'T')
		{
			if(!registerHash.containsKey(ir.getR2()))
			{
				registerHash.put(ir.getR2(), "r"+currentRegister);
				currentRegister++;
			}
			ir.setR2(registerHash.get(ir.getR2()));
		}
		if(!ir.getR3().equals("") && ir.getR3().charAt(0) == 'T')
		{
			if(!registerHash.containsKey(ir.getR3()))
			{
				registerHash.put(ir.getR3(), "r"+currentRegister);
				currentRegister++;
			}
			ir.setR3(registerHash.get(ir.getR3()));
		}
		return ir;
	}
	
	private String convertLabel(String label)
	{
		if(label.equals("main"))
		{
			return "main";
		}
		if(!labelhash.containsKey(label))
		{
			labelhash.put(label, "label"+currentLabel);
			currentLabel++;
		}
		return labelhash.get(label);
	}
	
	
	public class TinyNode
	{
		String op;
		String r1;
		String r2;



		public TinyNode(String op, String r1, String r2)
		{
			this.op = op;
			this.r1 = r1;
			this.r2 = r2;
		}
	}
}