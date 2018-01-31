package com.lin.java.chapter5.tools;

import java.util.concurrent.Exchanger;

public class ExchangerTest {

	public static void main(String []args) {
		for(int i=0; i<128; i++){
			System.out.println(i+":"+hasIndex(i));
		}
		
		final Exchanger <Integer>exchanger = new Exchanger<Integer>();
		for(int i = 0 ; i < 1 ; i++) {
			final Integer num = i;
			new Thread() {
				public void run() {
					System.out.println("我是线程：Thread_" + this.getName() + " 我的数据是：" + num);
					try {
						Integer exchangeNum = exchanger.exchange(num);
						Thread.sleep(1000);
						System.out.println("我是线程：Thread_" + this.getName() + " 最初的数据为：" + num + " , 交换后的数据为：" + exchangeNum);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
		System.out.println("执行完了");
	}
	
	private static int hasIndex(int m){
		 long id = Thread.currentThread().getId();
	        int hash = (((int)(id ^ (id >>> 32))) ^ 0x811c9dc5) * 0x01000193;

	     //   int m = 1;
	        int nbits = (((0xfffffc00  >> m) & 4) | // Compute ceil(log2(m+1))
	                     ((0x000001f8 >>> m) & 2) | // The constants hold
	                     ((0xffff00f2 >>> m) & 1)); // a lookup table
	        int index;
	        while ((index = hash & ((1 << nbits) - 1)) > m)       // May retry on
	            hash = (hash >>> nbits) | (hash << (33 - nbits)); // non-power-2 m
	        return index;
	}
}
