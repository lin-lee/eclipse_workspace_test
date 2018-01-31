package com.lin.java.chapter5.atomic.reference;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
	
	public static final AtomicReference<String> ATOMIC_REFERENCE
					= new AtomicReference<String>("abc");
	private static final Random RANDOM_OBJECT = new Random();
	
	public static void main(String [] args) throws InterruptedException{
		final CountDownLatch startCountDownLatch = new CountDownLatch(1);
		Thread[] threads = new Thread[20];
		for(int i=0; i<20; i++){
			final int num = i;
			threads[i] = new Thread(){
				@Override
				public void run(){
					String oldValue = ATOMIC_REFERENCE.get();
					try{
						startCountDownLatch.await();
						Thread.sleep(RANDOM_OBJECT.nextInt() & 1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					if(ATOMIC_REFERENCE.compareAndSet(oldValue, oldValue + num)){
						System.out.println("线程： " + num + ",进行了对象修改！");
					}
				}
			};
			threads[i].start();
		}
		Thread.sleep(200);
		startCountDownLatch.countDown();
		for(Thread thread : threads){
			thread.join();
		}
		System.out.println("最终结果为：" + ATOMIC_REFERENCE.get());
	}

}
