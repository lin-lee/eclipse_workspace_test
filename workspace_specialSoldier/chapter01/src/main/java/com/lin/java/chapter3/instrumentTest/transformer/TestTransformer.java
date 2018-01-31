package com.lin.java.chapter3.instrumentTest.transformer;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class TestTransformer implements ClassFileTransformer{

	@Override
	public byte[] transform(ClassLoader loader, String className,
			Class<?> classBeingRedefined, ProtectionDomain protectionDomain,
			byte[] classfileBuffer) throws IllegalClassFormatException {
		// 输出加载的类名，同样看到了类的加载
		if("com/lin/java/chapter3/AsmTest/ForASMTestClass".equals(className)){
			try{
				CtClass ctClass = ClassPool.getDefault()
						.get(className.replace('/', '.'));
				CtMethod ctMethod = ctClass.getDeclaredMethod("display1");
				ctMethod.insertBefore("name=\"我是name! 这次用javassist了哦！\";" +
						"value=\"我是value! \";" +
						"System.out.println(\"我是加进去的哦：\" + name);"
						);
				ctMethod.insertAfter("System.out.println(value);");
				return ctClass.toBytecode();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return classfileBuffer;
	}
	

}
