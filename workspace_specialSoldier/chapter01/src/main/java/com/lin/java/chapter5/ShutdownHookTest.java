package com.lin.java.chapter5;

import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class ShutdownHookTest {
	
	
	
	
	public static void main(String [] args) throws InterruptedException{
		

		
		try {
			new ProcessBuilder();
			Runtime.getRuntime().exec("java");
			Runtime.getRuntime().addShutdownHook(hook);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("byebye");
		
	}

}
