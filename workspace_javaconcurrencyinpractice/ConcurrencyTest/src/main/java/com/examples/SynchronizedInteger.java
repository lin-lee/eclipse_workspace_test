package com.examples;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.annotations.GuardedBy;
import com.annotations.ThreadSafe;

@ThreadSafe
public class SynchronizedInteger {
	@GuardedBy("this") private int value;
	private int value2;
	private Lock lock = new ReentrantLock();
	
	private SynchronizedInteger(int value){
		this.value = value;
	}
	public int get(){
		return value;
	}
	public synchronized void set(int value){
		this.value = value;
	}
	public synchronized void setValue2(int value2){
		this.value2 = value2;
	}
	
	public static void main(String [] args){
		final SynchronizedInteger s = new SynchronizedInteger(5);
		Thread t = new Thread(new Runnable(){
			public void run(){
				s.get();
			}
		}, "t1");
		t.start();
		s.setValue2(0);
	}

}
