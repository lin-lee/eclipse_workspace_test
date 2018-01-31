package symtab._class;

public class Symbol {
	String name;
	Type type;
	Scope scope;
	CymbolAST def;	//points at ID node in tree
	
	 public Symbol(String name) { this.name = name; }
	    public Symbol(String name, Type type) { this(name); this.type = type; }
	    public String getName() { return name; }

	    public String toString() {
	        String s = "";
	        if ( scope!=null ) s = scope.getScopeName()+".";
	        if ( type!=null ) return '<'+s+getName()+":"+type+'>';
	        return s+getName();
	    }

	    public static String stripBrackets(String s) {
	        return s.substring(1,s.length()-1);
	    }

}
