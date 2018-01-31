package com.lin.java.chapter5.tools;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CyclicBarrierTest {
	
	private static final int THREAD_COUNT = 3;
	
	private static final CyclicBarrier CYCLIC_BARRIER = new CyclicBarrier(
				THREAD_COUNT, new Runnable(){
					@Override
					public void run(){
						System.out.println("======>我是导游，本次点名结束，准备走下一个环节！");
					}
				});
	
	public static void main(String [] args){
		for(int i=0; i<THREAD_COUNT; i++){
			new Thread(String.valueOf(i)){
				@Override
				public void run(){
					try{
						System.out.println("我是线程："+this.getName()+" 我们到达旅游地点！");
						CYCLIC_BARRIER.await();
						System.out.println("我是线程："+this.getName()+" 我们开始骑车！");
						CYCLIC_BARRIER.await();
						System.out.println("我是线程："+this.getName()+" 我们开始爬山！");
						CYCLIC_BARRIER.await();
						System.out.println("我是线程："+this.getName()+" 我们会宾馆休息！");
						CYCLIC_BARRIER.await();
						System.out.println("我是线程："+this.getName()+" 我们开始乘车回家！");
						CYCLIC_BARRIER.await();
						System.out.println("我是线程："+this.getName()+" 我们到家了！");
						CYCLIC_BARRIER.await();
					}catch(InterruptedException e){
						e.printStackTrace();
					}catch(BrokenBarrierException e){
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
