package four.eight;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Vector;

public class Outer<T> {
	T t;

	Vector v = new Vector<String>();
	
	 class Inner<S> {
		
		
	}
	
	public void test(){
		Vector v = new Vector<String>();
		Outer<Double>.Inner i = new Inner();
		// Type t = ((ParameterizedType) type)i.getClass();
	}
}