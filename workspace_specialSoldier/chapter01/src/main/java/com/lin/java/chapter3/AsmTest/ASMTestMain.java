package com.lin.java.chapter3.AsmTest;

import java.io.IOException;
import java.net.URLClassLoader;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

public class ASMTestMain {
	
	private final static DynamicClassLoader TEST_CLASS_LOADER
			= new DynamicClassLoader((URLClassLoader)ASMTestMain.class.getClassLoader());

	public static void main(String [] args) throws Exception{
		Class<?> beforeASMClass = TEST_CLASS_LOADER.loadClass("com.lin.java.chapter3.AsmTest.ForASMTestClass");
		TEST_CLASS_LOADER.defineClassByByteArray("com.lin.java.chapter3.AsmTest.ForASMTestClass", asmChangeClassCall());
		
		Class<?> afterASMClass = TEST_CLASS_LOADER.loadClass("com.lin.java.chapter3.AsmTest.ForASMTestClass");
		
		Object beforeObject = beforeASMClass.newInstance();
		Object afterObject = afterASMClass.newInstance();
		beforeASMClass.getMethod("display1").invoke(beforeObject);
		afterASMClass.getMethod("display1").invoke(afterObject);
		
		beforeASMClass.getMethod("display2").invoke(beforeObject);
		afterASMClass.getMethod("display2").invoke(afterObject);
	}
	
	private static byte[] asmChangeClassCall() throws IOException{
		ClassReader classReader = new ClassReader("com.lin.java.chapter3.AsmTest.ForASMTestClass");
		ClassWriter classWriter = new ClassWriter(ClassWriter.COMPUTE_MAXS);
		ASMClassModifyAdpter modifyAdpter = new ASMClassModifyAdpter(classWriter);
		classReader.accept(modifyAdpter, ClassReader.SKIP_DEBUG);
		
		return classWriter.toByteArray();
	}

}
