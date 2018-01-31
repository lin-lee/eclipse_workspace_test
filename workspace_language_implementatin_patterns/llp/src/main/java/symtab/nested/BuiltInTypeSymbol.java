package symtab.nested;

/** A symbol for built in types such int, float primitive types */
public class BuiltInTypeSymbol extends Symbol implements Type{
	
	public BuiltInTypeSymbol(String name){
		super(name);
	}

}
