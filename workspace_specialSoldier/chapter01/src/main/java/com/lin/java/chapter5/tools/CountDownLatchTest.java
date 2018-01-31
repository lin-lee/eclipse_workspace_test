package com.lin.java.chapter5.tools;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	
	private static final int GROUP_SIZE = 5;
	
	private static final Random random = new Random();
	
	public static void main(String [] args) throws InterruptedException{
		processOneGroup("分组1");
		processOneGroup("分组2");
		
	}
	
	private static void processOneGroup(final String groupName) throws InterruptedException{
		final CountDownLatch preCountDown = new CountDownLatch(GROUP_SIZE);
		final CountDownLatch startCountDown = new CountDownLatch(1);
		final CountDownLatch endCountDown = new CountDownLatch(GROUP_SIZE);
		System.out.println("======>\n分组：" + groupName + "比赛开始：");
		for(int i=0; i<GROUP_SIZE; i++){
			new Thread(String.valueOf(i)){
				@Override
				public void run(){
					preCountDown.countDown();
					System.out.println("我是线程组：【" + groupName + "】,第"
								+ this.getName() +" 号线程，我已经准备就绪！");
					try{
						startCountDown.await();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					
					try {
						Thread.sleep(Math.abs(random.nextInt()) % 1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("我是线程组：【" + groupName + "】,第"
							+ this.getName() +" 号线程，我已执行完成！");
					endCountDown.countDown();
							
				}
			}.start();
		}
		
		preCountDown.await();
		System.out.println("各就各位，预备！");
		startCountDown.countDown();
		
		endCountDown.await();
		System.out.println(groupName + "比赛结束！");
	}

}
