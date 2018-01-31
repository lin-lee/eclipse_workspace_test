package com.lin.java.chapter5.security;

public class NovisiabilityTest2 {
	
		private volatile boolean ready;
		private int number;

		public void run(){
			while(!ready){
				number++;
				Thread.yield();
			}
			System.out.println(ready);
		}
		
		public void readyOn(){
			this.ready = true;
		}
	
	public static void main(String [] args){
		NovisiabilityTest2 n = new NovisiabilityTest2();
		n.run();
	}

}
