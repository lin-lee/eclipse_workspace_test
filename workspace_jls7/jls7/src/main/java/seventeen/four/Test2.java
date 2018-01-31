package seventeen.four;



public class Test2  {
	
	public static void main(String[] args) throws InterruptedException {
		final int A = 0;
		final int B = 0;
		
		//A = 2;
		System.out.println(A);
		
		final Object o = new Object();
		Thread thread = new Thread(){
			public void run(){
				synchronized(o){
					try {
						o.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				int r2 = A;
				 B = 1;
				System.out.println(r2+","+B);
			
				
			}
		};
		thread.start();
		Thread.sleep(5000);
		thread.interrupt();
		Thread.sleep(5000);
		synchronized(o){
			o.notify();
		}
		
		
	}
	
}
