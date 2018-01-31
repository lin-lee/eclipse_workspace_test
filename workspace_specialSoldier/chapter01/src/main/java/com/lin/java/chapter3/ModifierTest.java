package com.lin.java.chapter3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

import javassist.Modifier;

public class ModifierTest {
	
	@Test
	public void test(){
		Class<IntTest> c = IntTest.class;
		
		int i = c.getModifiers();
		boolean isPublic = Modifier.isPublic(i);
		
		Annotation[] a = c.getDeclaredAnnotations();
		Field[] f = c.getDeclaredFields();
		Method[] m = c.getDeclaredMethods();
		
		System.out.println(isPublic);
	}

}
