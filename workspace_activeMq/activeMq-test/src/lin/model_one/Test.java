package lin.model_one;

public class Test {
	
	public static void main(String [] args){
		try{
			m();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void m(){
		Test test = new Test();
		for(int i=0; i<2; i++){
			try{
				test.t();
			}catch(Exception e){
				System.out.println("wo");
				System.out.println(e.getMessage());
				
			}
		}
		
	}
	public void t(){
		System.out.println("t()方法");
		throw new RuntimeException("t()方法RuntimeException");
	}

}
