package concurency;

public class SynchronizedEvenGenerator extends IntGenerator{
	
	private int currentEvenValue = 0;
	@Override
	public synchronized int next(){
		++currentEvenValue;
		Thread.currentThread().yield();
		++currentEvenValue;
		return currentEvenValue;
	}
	
	public static void main(String [] args){
		EvenChecker.test(new SynchronizedEvenGenerator());
		System.out.println("a");
	}

}