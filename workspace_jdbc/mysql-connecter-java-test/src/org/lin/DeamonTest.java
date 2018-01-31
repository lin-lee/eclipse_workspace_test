package org.lin;

import java.util.concurrent.TimeUnit;

/**
 * 守护线程测试
 * @author lilin
 *
 */
public class DeamonTest {
	
	public static void main(String [] args) throws InterruptedException{
		Runnable r = new Runnable(){
			public void run(){
				for(int i=1; i<=10; i++){
					System.out.print(i+",");
					try {
						TimeUnit.SECONDS.sleep(2);//休眠2秒
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t = new Thread(r);
		t.setDaemon(true);//设置为守护线程
		t.start();
		
		System.out.println("Main Thread start:");
		TimeUnit.SECONDS.sleep(6);
		System.out.println("Main Thread end.");
	}

}
