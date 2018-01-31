package concurency;

public class EvenGenerator extends IntGenerator{
	
	private int currentEvenValue = 0;
	@Override
	public int next(){
		++currentEvenValue; //dangrous
		Thread.currentThread().yield();
		++currentEvenValue;
		return currentEvenValue;
	}
	public static void main(String [] args){
		EvenChecker.test(new EvenGenerator());
	}
	Semaphore;

}
