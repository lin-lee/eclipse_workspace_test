package two.eleven;

public class Test extends SuperTest implements I{
	
	 void doPrivate(){
		
	}
	
	
	@Override
	public void doTest(){
		System.out.println("doTest is doing");
	}
	
	public static void main(String [] args){
		I i = new Test();
		i.doTest();
		
		Test t = new Test();
		t.doPrivate();
		
		SuperTest st = new Test();
		st.doSuper();
	}
	

}

interface I{
	void doTest();
}

class SuperTest{
	protected void doSuper(){
		
	}
}
