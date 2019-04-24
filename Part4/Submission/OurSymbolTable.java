import java.util.ArrayList;
import java.util.List;

public class OurSymbolTable {
	private Scope root;
	private Scope current;
	private Symbol currentSymbol;
	private boolean isError = false;
	private List<String> errorList = new ArrayList<String>();
	
	public OurSymbolTable(){
		root = new Scope();
		root.name = "GLOBAL";
		root.children = new ArrayList<Scope>();
		current = root;
	}

	public void moveCurrentToParent(){
		current = current.parent;
	}
	
	public void addSymbol(String type, String name){
		boolean exists = false;
		for(Symbol sym: current.symbols){
			if(sym.name.equals(name)){
				isError = true;
				errorList.add(name);
			}
		}
		if(!exists){
			Symbol s = new Symbol();
			s.name = name;
			s.type = type;
			currentSymbol = s;
			if(!type.equals("STRING")){
				setSymbolVal(null);
			}
		}
	}

	public void addScope(String name){
		Scope scope = new Scope();
		scope.name = name;
		scope.parent = current;
		scope.children = new ArrayList<Scope>();
		current.children.add(scope);
		current = scope;
	}
	
	
	
	public void setSymbolVal(String value){
		currentSymbol.value = value;
		current.symbols.add(currentSymbol);
	}
	
	
	
	public void printSymbolTable(){
		if(!isError){
			printSymbolTable(root);
		}
		else{
			System.out.println("DECLARATION ERROR " + errorList.get(0));
		}
	}
	
	//overloaded print Symbol table when within a scope
	public void printSymbolTable(Scope currentScope){
		if(currentScope.equals(root)){
			System.out.print("Symbol table " + currentScope.name);
		} else {
			System.out.print("\nSymbol table " + currentScope.name);
		}
		
		for(Symbol symbol : currentScope.symbols){
			if(symbol.type.equals("STRING")){
				System.out.print("\nname " + symbol.name + " type " + symbol.type + " value " + symbol.value);
			} else {
				System.out.print("\nname " + symbol.name + " type " + symbol.type);
			}
		}
		
		for(Scope child : currentScope.children){
			System.out.println();
			printSymbolTable(child);
		}
	}
	
	public List<Symbol> getRootScope(){
		return root.symbols;
	}

	
	//a scope can have both a parent and children of type scope.
	public static class Scope {
		private String name;
		private Scope parent;
		private List<Scope> children;
		private List<Symbol> symbols = new ArrayList<Symbol>();
	}
	
	public static class Symbol{
		private String name, type, value;
		//get methods for instances
		public String getName() {
			return name;
		}
		public String getValue() {
			return value;
		}
		public String getType() {
			return type;
		}

		//set methods for instances
		public void setType(String type) {
			this.type = type;
		}
		public void setValue(String value) {
			this.value = value;
        }
        public void setName(String name) {
			this.name = name;
		}
		
	}
}