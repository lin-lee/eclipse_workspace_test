package com.lin.java.chapter3.oom;

import java.nio.ByteBuffer;

public class ByteBufferOOM {
	
	//-XX:MaxDirectMemorySize=256m
	public static void main(String [] args){
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(256 * 1024 * 1024);
		ByteBuffer.allocateDirect(1024 * 1024);
	}

}
