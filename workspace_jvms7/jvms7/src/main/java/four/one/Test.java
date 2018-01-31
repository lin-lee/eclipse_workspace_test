package four.one;

import java.io.DataInput;

public class Test {
	
	private final  Long l = 0x1L;
	
	public static void main(String [] args){
		int[] i = new int[5];
		System.out.println(i.getClass().getName());
		System.out.println("1");
	}
	
	static Object m(int i, double d, Thread t){
		return new Object();
	}

	public String check(String s){
		switch(s){
		case "abc": return "abc";
		case "d" : return "d";
		default: return "s";
		}
		
	}
}
