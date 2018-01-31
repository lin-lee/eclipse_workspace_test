package com.lin.java.chapter5.wait;


public class CopyOfWaitAndNofify {
	
	private static final Object object = new Object();
	
	static class ThreadA extends Thread{
		@Override
		public void run(){
			synchronized(object){
				try {
					Thread.currentThread().sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("thread end...");
			}
	
		}
	}
	
	
	public static void main(String [] args) throws InterruptedException{
		ThreadA t1 = new ThreadA();
		ThreadA t2 = new ThreadA();
		t1.start();
		t2.start();
		Thread.sleep(100);
		synchronized(Object.class){
			System.out.println(t1.getState());
			System.out.println(t2.getState());
		}
	}

}
