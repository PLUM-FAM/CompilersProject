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
	
	public void addScope(String name){
		Scope scope = new Scope();
		scope.name = name;
		scope.parent = current;
		scope.children = new ArrayList<Scope>();
		current.children.add(scope);
		current = scope;
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
	
	public void setSymbolVal(String value){
		currentSymbol.value = value;
		current.symbols.add(currentSymbol);
	}
	
	public void moveCurToParent(){
		current = current.parent;
	}
	
	public void printSymbolTable(){
		if(!isError){
			printSymbolTable(root);
		}
		else{
			System.out.println("DECLARATION ERROR " + errorList.get(0));
		}
	}
	
	public void printSymbolTable(Scope curScope){
		if(curScope.equals(root)){
			System.out.print("Symbol table " + curScope.name);
		} else {
			System.out.print("\nSymbol table " + curScope.name);
		}
		
		for(Symbol symbol : curScope.symbols){
			if(symbol.type.equals("STRING")){
				System.out.print("\nname " + symbol.name + " type " + symbol.type + " value " + symbol.value);
			} else {
				System.out.print("\nname " + symbol.name + " type " + symbol.type);
			}
		}
		
		for(Scope child : curScope.children){
			System.out.println();
			printSymbolTable(child);
		}
	}
	
	public List<Symbol> getRootScope(){
		return root.symbols;
	}
	
	public static class Scope {
		private String name;
		private Scope parent;
		private List<Scope> children;
		private List<Symbol> symbols = new ArrayList<Symbol>();
	}
	
	public static class Symbol{
		private String name, type, value;
		public String getName() {
			return name;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
        }
        public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
	}
}