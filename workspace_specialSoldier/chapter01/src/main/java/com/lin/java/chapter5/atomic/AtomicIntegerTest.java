package com.lin.java.chapter5.atomic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
	
	public static final AtomicInteger TEST_INTEGER = new AtomicInteger(1);
	private volatile static int index = 1;
	
	public static void main(String [] args) throws InterruptedException{
		final CountDownLatch startCountDown = new CountDownLatch(1);
		final Thread[] threads = new Thread[10];
		for(int i=0; i<10; i++){
			threads[i] = new Thread(){
				@Override
				public void run(){
					try{
						startCountDown.await();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					for(int j=0; j<100; j++){
						index++;
						TEST_INTEGER.incrementAndGet();
					}
				}
			};
			threads[i].start();
		}
		Thread.sleep(1000);
		startCountDown.countDown();
		for(Thread t : threads){
			t.join();
		}

		System.out.println("Atomic最终运行结果：" + TEST_INTEGER.get());
		System.out.println("volatile最终运行结果：" + index);
	}
	

}
