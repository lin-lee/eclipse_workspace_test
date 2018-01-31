package twelve.five;

class Super {
	Super() {
		printThree();
	}

	void printThree() {
		System.out.println("three");
	}
}

public class Test2 extends Super {
	int three = (int) Math.PI; // That is, 3

	void printThree() {
		System.out.println(three);
	}

	public static void main(String[] args) throws InterruptedException {
		Test2 t = new Test2();
		t.printThree();
		
		final Object o = new Object();
		Thread thread = new Thread(){
			public void run(){
				boolean b = true;
				while(b){
					
		
						if(b){
							
								Thread.sleep(1);
					
						}
					
					b = false;
					System.out.println(":");
				}
				
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
	
	@Override
	protected synchronized void finalize(){
		int[] i = new int[4];
		try {
			i.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
