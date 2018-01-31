package six.one;

public class Test {
	
	public static void main(String [] args){
		Class<? extends Test> test = new Test().getClass();
		System.out.println(test.isMemberClass());
		Class x = new Test().new m().getClass();
		System.out.println(x.isMemberClass());
	}

	
	class m{
		
	}
}
