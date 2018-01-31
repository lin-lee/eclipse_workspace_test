package com.lin.java.chapter5.tools;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class SemaphoreByWaitNotify {
	
	private static final int QUERY_MAX_LENGTH = 5;
	
	private static final int THREAD_COUNT = 20;
	
	private static final AtomicInteger NOW_CALL_COUNT = new AtomicInteger(0);
	
	private static final Object LOCK_OBJECT = new Object();
	
	public static void main(String [] args){
		final Random random = new Random();
		for(int i=0; i<THREAD_COUNT; i++){
			new Thread(String.valueOf(i)){
				@Override
				public void run(){
					tryToLock();
					System.out.println(this.getName() +"======我开始做操作了！");
					try {
						Thread.sleep(100 + (random.nextInt() & 3000));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(this.getName()+"======操作结束了！");
					tryToUnLock();
				}
			}.start();
		}
	}

	
	private static void tryToUnLock(){
		NOW_CALL_COUNT.getAndDecrement();
		synchronized(LOCK_OBJECT){
			LOCK_OBJECT.notify();
		}
	}
	private static void tryToLock(){
		int tryTimes = 0;
		int nowValue = NOW_CALL_COUNT.get();
		while(true){
			if(nowValue < QUERY_MAX_LENGTH 
					&& NOW_CALL_COUNT.compareAndSet(nowValue, nowValue+1)){
				break;
			}
			if(tryTimes % 3 == 0){
				waitForObjectNotify();
			}
			nowValue = NOW_CALL_COUNT.get();
			tryTimes++;
		}
	}
	
	private static void waitForObjectNotify(){
		synchronized(LOCK_OBJECT){
			try{
				LOCK_OBJECT.wait(500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
