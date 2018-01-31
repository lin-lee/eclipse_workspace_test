package com.lin.java.chapter5;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class UnsafeTest {
	

	    
	
	public static void main(String [] args) throws IllegalArgumentException, IllegalAccessException{
		Field field = Unsafe.class.getDeclaredFields()[0];
		field.setAccessible(true);
		Unsafe unsafe = (Unsafe)field.get(null);
		
		 int base = unsafe.arrayBaseOffset(int[].class);
		
		        int scale = unsafe.arrayIndexScale(int[].class);
		        if ((scale & (scale - 1)) != 0)
		            throw new Error("data type scale not a power of two");
		        int m = 31 - Integer.numberOfLeadingZeros(scale);
		    
	}

}
