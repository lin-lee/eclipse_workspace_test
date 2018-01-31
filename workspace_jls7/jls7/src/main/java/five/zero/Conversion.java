package five.zero;

public class Conversion {
	
	public static void main(String [] args){
		Object o = new Object();
		//Thread t = (Thread)o;
		
		int i = 1;
		long l = (int)i;
		int m = (int) l;
		
		Integer in = 1;
		int ins = in.intValue();
		
		long lon =  0x7fffffffffffffffL;
		float f = lon;
		System.out.println(f==lon);
		long lon2 = (long) f;
		System.out.println(f);
	}

}
