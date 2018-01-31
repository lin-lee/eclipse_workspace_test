package com.lin.java.chapter4.file;

import java.io.IOException;
import java.nio.ByteBuffer;

public class CopyFileTestMain{
	
	public static void main(String [] args) throws IOException{
		copyFileByStreamTest();
		copyFileByDirectByteBuffer();
		copyFileByMapperByteBuffer();
	}
	
	private static void copyFileByStreamTest() throws IOException{
		long start = System.nanoTime();
		FileUtils.copyFile("E:\\copyTest\\apache-tomcat-6.0.43-src.zip", 
				"E:\\copyTest\\apache-tomcat-6.0.43-src-copy-1.zip");
		System.out.println(System.nanoTime() - start);
	}
	
	private static void copyFileByDirectByteBuffer() throws IOException{
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1 *1024 * 1024);
		long start = System.nanoTime();
		FileUtils.copyFileByByteBuffer("E:\\copyTest\\apache-tomcat-6.0.43-src.zip", 
				"E:\\copyTest\\apache-tomcat-6.0.43-src-copy-2.zip", byteBuffer, true);
		System.out.println(System.nanoTime() - start);
	}
	
	private static void copyFileByMapperByteBuffer() throws IOException{
		long start = System.nanoTime();
		FileUtils.copyFileByMappedByteBuffer("E:\\copyTest\\apache-tomcat-6.0.43-src.zip", 
				"E:\\copyTest\\apache-tomcat-6.0.43-src-copy-3.zip");
		System.out.println(System.nanoTime() - start);
	}
}