package five.five;

public class a {
	
	public static void main(String [] args){
		Object o = new String("ab");
		System.out.println(o);
		
//		Ac a = new Ac();
//		A2 a2 = (A2) a;
		
		A2 i = new A3();
		A3 a = (A3) i;
	}

}

class Ac{
	
}

interface A2{
	
}

class A3 implements A2{
	
}