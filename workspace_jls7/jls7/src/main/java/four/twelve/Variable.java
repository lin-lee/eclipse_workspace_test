package four.twelve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Variable{
	
	public static void main(String [] args){
		List l = new ArrayList<Number>();

		
	
			final List<String> ls = l;
		
		
		List<String> list = new ArrayList<String>();
		//Object[] o = list;
		m(list);
	}
	
	
	
	static void m(List<String>... stringLists) {
		System.out.println(stringLists);
		Object[] array = stringLists;
		System.out.println(array.getClass());
		List<Integer> tmpList = Arrays.asList(42);
		array[0] = tmpList; // (1)
		String s = stringLists[0].get(0); // (2)
		System.out.println(s);
	}
}
