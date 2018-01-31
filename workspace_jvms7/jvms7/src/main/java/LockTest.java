
public class LockTest {
	
	private int x;
	private int somethingElse;
	
	static{
		
	}
	
	static  void init(){
		
		synchronized(LockTest.class){
			
		}
		
		LockTest lt = new LockTest();
		synchronized(lt){
			
		}
		
	}
	
	public int multiply(int something) {
		synchronized(this) {
		return something * this.somethingElse;
		}
		}

	public void setX(int y){
		this.x = x;
	}
}
