package com.lin.java.chapter3.autoboxing;

public class IntegerTest {
	private static final int capacity = 1 * 1024 * 1024;
	
	public static void main(String [] args){
		Long startMillis = System.currentTimeMillis();
		newIntArrays(capacity);
		long time = (System.currentTimeMillis()-startMillis);
		System.out.println("newIntArrays() use time:" + time);
		
		startMillis = System.currentTimeMillis();
		newIntegerArrays(capacity);
		time = (System.currentTimeMillis()-startMillis);
		System.out.println("newIntegerArrays() use time:" + time);
	}
	private static void newIntArrays(int capacity){
		int[] values = new int[capacity];
		for(int i=0; i<values.length; i++){
			values[i] = i;
		}
	}
	
	private static void newIntegerArrays(int capacity){
		Integer[] values = new Integer[capacity];
		for(int i=0; i<capacity; i++){
			values[i] = i;
		}
	}

}
