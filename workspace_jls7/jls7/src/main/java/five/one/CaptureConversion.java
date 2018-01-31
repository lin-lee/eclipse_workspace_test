package five.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaptureConversion {
	
	
	public static void main(String [] args){
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		
		List<?> wildcardList = list;
		
		reverse(wildcardList);
		Collections.reverse(list);
		
		
		List<String> ls = new ArrayList<String>();
		List<?> l = ls;
		CaptureConversion.fill(l, new Object()); // not legal - but assume it was!
		
		String s = ls.get(0); // ClassCastException - ls contains
							  // Objects, not Strings.
	}
	
	
	
	public static void reverse(List<?> list) {
		rev(list); 
	}
	
	private static  <T> void rev(List<T> list) {
		List<T> tmp = new ArrayList<T>(list);
		for (int i = 0; i < list.size(); i++) {
			list.set(i, tmp.get(list.size() - i - 1));
		}
	}
	
	
	public static <T> void fill(List<T> l, T obj){
		
	}

}
