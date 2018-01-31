
public class TryCatchTest {

	public static void main(String [] args){
		Long l = System.currentTimeMillis();
		testTryCatch();
		System.out.println("time used: " + (System.currentTimeMillis()-l));
		
		Long t  = System.currentTimeMillis();
		testTryCatch();
		System.out.println("time used: " + (System.currentTimeMillis()-t));
	}
	
	public static void testTryCatch(){
		int a=0;
		for(int i=0; i<10000; i++){
			try{
				a++;
			}catch(Exception e){
				
			}
		}
	}
	
	public static void testTryCatchIn(){
		int a=0;
		try{
			for(int i=0; i<10000; i++){
				a++;
			}
		}catch(Exception e){
			
		}
	
	}
}
