package com.lin.java.javassistTest;

import org.junit.Test;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.CtNewMethod;
import javassist.NotFoundException;

public class JavassistTest {
	
	@Test
	public void test(){
		try {
			CtClass ctClass = ClassPool.getDefault().get("com.lin.java.javassisteTest.Hello");
			CtMethod[] ctMethods = ctClass.getMethods();
			//CtMethod method = ctClass.getMethod("test()", null);
			modifyMethod(ctMethods[1], ctClass);
		} catch (NotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void modifyMethod(CtMethod method,CtClass clazz) throws Exception{
        
        //从原方法复制产生一个新的方法
       CtMethod newMethod = CtNewMethod. copy(method, clazz, null);
       
        //重命名原方法
       String methodName = method.getLongName();
       String oldName = method.getName()+ "$Impl";
       
       method.setName(oldName);
       StringBuilder body = new StringBuilder();
       body.append( "{long start = System.currentTimeMillis();" );

        //如果有返回值，则记录返回值，没有则不记录
        if(method.getReturnType()==CtClass. voidType){
             body.append( oldName+ "($$);");
       } else{
             body.append( "Object result = " +oldName+"($$);" );
       }
       body.append( " long end = System.currentTimeMillis();"
                   + "System.out.println(\"" +methodName+ "\""+
                    "\"time used:\"+" + "(end - start));" );
       
        //如果有返回值，则添加return 语句
        if(method.getReturnType()==CtClass. voidType){
             body.append( "}");
       } else{
             body.append( "return result;}" );
       }
       newMethod.setBody(body.toString());
       clazz.addMethod(newMethod);
       
       
       clazz.writeFile("E:\\eclipse32_enjoy_4.4.1\\workspace_specialSoldier\\chapter01");
       
 }

}
