package com.lin.java.chapter5.atomic.reference;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceABATest {
	
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
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					try{
						Thread.sleep(RANDOM_OBJECT.nextInt() & 500);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					if(ATOMIC_REFERENCE.compareAndSet(oldValue, oldValue + num)){
						System.out.println("我是线程：" + num + ",进行对象修改！");
					}
				}
			};
			threads[i].start();
		}
		Thread.sleep(200);
		startCountDownLatch.countDown();
		new Thread(){
			@Override
			public void run(){
				try{
					Thread.sleep(RANDOM_OBJECT.nextInt() & 200);
				}catch(Exception e){
					e.printStackTrace();
				}
				while(!ATOMIC_REFERENCE.compareAndSet(ATOMIC_REFERENCE.get(), "abc"));
				System.out.println("已经改为原始值！");
			}
		}.start();
	}

}
