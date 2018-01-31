package com.lin.java.chapter5.suspend;

@SuppressWarnings("deprecation")
public class SuspendAndResume {
	
	private static final Object object = new Object();
	
	static class ThreadA extends Thread{
		@Override
		public void run(){
			synchronized(object){
				System.out.println("start...");
				Thread.currentThread().suspend();
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
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		t1.resume();
		t2.resume();
	}

}
