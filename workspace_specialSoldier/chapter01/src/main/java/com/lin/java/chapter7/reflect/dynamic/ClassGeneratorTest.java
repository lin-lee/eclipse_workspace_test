package com.lin.java.chapter7.reflect.dynamic;

import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class ClassGeneratorTest {
	
	public static void main(String [] args){
		String proxyName = "$Proxy1";
		Class[] interfaces = new Class[]{HelloInterface.class};
		byte[] proxyClassFile =	ProxyGenerator.generateProxyClass(
			    proxyName, interfaces);
		writeToFile("E:\\temp\\$Proxy1.class", proxyClassFile);
		
	}
	
	private static void writeToFile(String path, byte[] classFile){
		FileOutputStream out = null;  
        
        try {  
            out = new FileOutputStream(path);  
            out.write(classFile);  
            out.flush();  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                out.close();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
	}

}
