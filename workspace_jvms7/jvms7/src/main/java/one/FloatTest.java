package one;

public class FloatTest {
	
	private FloatTest(){
		
	}
	
	private FloatTest(int i){
		
	}
	
	public static void main(String [] args){
		int bits = 0x7fc00001;
		float f = Float.intBitsToFloat(bits);
		System.out.println(f);
		System.out.println(0xff800000);
		
		boolean[] b = new boolean[5];
		boolean b2 = false;
		long l = 1l;
		
		int i =1;
		FloatTest ft = new FloatTest();
		ft.instanceDo(i);
		
		classDo(i);
		
	}

	
	public strictfp void instanceDo(int i){
		int m = i;
		System.out.println(m);
	}
	
	public static void classDo(int i){
		int m = i;
		System.out.println(m);
	}
}
