package symtab.nested;


public class SymbolTable {
	GlobalScope globals = new GlobalScope();
	
    public SymbolTable() { initTypeSystem(); }
    protected void initTypeSystem() {
        globals.define(new BuiltInTypeSymbol("int"));
        globals.define(new BuiltInTypeSymbol("float"));
        globals.define(new BuiltInTypeSymbol("void")); // pseudo-type
    }

    public String toString() { return globals.toString(); }

}