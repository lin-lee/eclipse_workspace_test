package three.impl;

import three.Response;

public class SampleResponse implements Response {
	
	private static final String NAME = "Test";
	public String getName(){
		return NAME;
	}
	public boolean equals(Object object){
		boolean result = false;
		if(object instanceof SampleResponse){
			result = ((SampleResponse) object).getName().equals(getName());
		}
		return result;
	}
	public int hashCode(){
		return NAME.hashCode();
	}

}
