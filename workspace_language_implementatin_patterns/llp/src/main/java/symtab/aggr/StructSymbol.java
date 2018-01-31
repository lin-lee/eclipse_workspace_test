package symtab.aggr;

import java.util.LinkedHashMap;
import java.util.Map;

public class StructSymbol extends ScopedSymbol implements Type, Scope{
	Map<String, Symbol> fields = new LinkedHashMap<String, Symbol>();
	
	public StructSymbol(String name, Scope parent){
		super(name, parent);
	}
	/** For a.b, only look in fields to resolve b, not up scope tree */
	public Symbol resolveMember(String name){
		return fields.get(name);
	}
	@Override
	public Map<String, Symbol> getMembers(){
		return fields;
	}
	@Override
	public String toString(){
		return "struct "+name+":{"+
				stripBrackets(fields.keySet().toString())+"}";
	}
	

}
