package org.lin;

import java.util.concurrent.TimeUnit;

/**
 * �ػ��̲߳���
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
						TimeUnit.SECONDS.sleep(2);//����2��
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread t = new Thread(r);
		t.setDaemon(true);//����Ϊ�ػ��߳�
		t.start();
		
		System.out.println("Main Thread start:");
		TimeUnit.SECONDS.sleep(6);
		System.out.println("Main Thread end.");
	}

}
