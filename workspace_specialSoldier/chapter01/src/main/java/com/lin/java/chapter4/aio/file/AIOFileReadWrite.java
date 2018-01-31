package com.lin.java.chapter4.aio.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

public class AIOFileReadWrite {
	
	public static void main(String [] args) throws IOException{
		AsynchronousFileChannel readChannel
							= AsynchronousFileChannel.open(Paths.get("E:/copyTest/Hadoop.PDF"));
		FileChannel writeChannel 
							= new FileOutputStream("E:/copyTest/Hadoop2.PDF").getChannel();
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		FileReadCompletion completion = new FileReadCompletion(byteBuffer, readChannel);
		
		readChannel.read(byteBuffer, 0l, writeChannel, completion);
		
		System.in.read();
	}

}
