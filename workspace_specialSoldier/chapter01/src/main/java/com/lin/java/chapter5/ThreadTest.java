package com.lin.java.chapter5;


import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ThreadTest {
	
	 public enum State {
	        /**
	         * Thread state for a thread which has not yet started.
	         */
	        NEW,
	        OLD,
	        BIG,
	        SMALL
	 }
	

	public static void main(String [] args) throws InterruptedException{
		byte by = 55;
		int i = 2147483647/0;
		int b = 0___1_1_5;

		float f = 0x55.p+1f;
		float fMax = 1f/0f;
		
		char c = '\u0008';
		
		String 总2 = "a"+1.1e2;
		boolean bb = Character.isJavaIdentifierStart(c);
			
			System.out.println(总2);
		
		System.out.println(Thread.currentThread().getState());
		ReentrantReadWriteLock r = new ReentrantReadWriteLock();
		r.writeLock().lock();
		
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 30, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3),  
                new ThreadPoolExecutor.DiscardOldestPolicy());  

		
		Thread.State.TIMED_WAITING.toString();
		ThreadTest o = new ThreadTest();
		synchronized(o){
			try {
				o.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void test() throws Exception {
		try{
			List<String> list = new ArrayList<String>();
		}catch(final Throwable t){
			t.printStackTrace();
			try{
				throw new Exception();
			}catch(Exception e){
				
			}
			
		}
	}

	 private static String toUnicode(String s){
	    	char[] c = s.toCharArray();
	    	StringBuffer sb = new StringBuffer();
	    	for(char tmp:c)
	    		sb.append("\\u" + Integer.toHexString(tmp));
	    	return sb.toString();
	    }
}
