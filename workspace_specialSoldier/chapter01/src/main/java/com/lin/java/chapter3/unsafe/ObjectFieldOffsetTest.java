package com.lin.java.chapter3.unsafe;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class ObjectFieldOffsetTest {
	
	private static Unsafe getUnsafe() throws IllegalArgumentException, IllegalAccessException{
		Field field = Unsafe.class.getDeclaredFields()[0];
		field.setAccessible(true);
		Unsafe unsafe = (Unsafe)field.get(null);
		return unsafe;
	}

	
	public static void main(String [] args) throws IllegalArgumentException, IllegalAccessException{
		String s = new String();
		Field[] f = s.getClass().getDeclaredFields();
		System.out.println(getUnsafe().objectFieldOffset(f[0]));
		System.out.println(getUnsafe().objectFieldOffset(f[3]));
		System.out.println(getUnsafe().objectFieldOffset(f[2]));
		System.out.println(getUnsafe().objectFieldOffset(f[1]));
	}
}
