package com.lin.java.chapter4.aio.file;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;

import static com.lin.java.chapter4.socket.Commons.*;

public class FileReadCompletion implements CompletionHandler<Integer, FileChannel>{

	private AtomicInteger ai = new AtomicInteger(0);
	
	private ByteBuffer byteBuffer;
	private long nowPosition;
	private AsynchronousFileChannel readFileChannel;
	
	public FileReadCompletion(ByteBuffer byteBuffer , AsynchronousFileChannel readFileChannel) {
		this.byteBuffer = byteBuffer;
		this.readFileChannel = readFileChannel;
	}

	@Override
	public void completed(Integer result, FileChannel writeChannel) {
		if(result > 0){
			ai.incrementAndGet();
			byteBuffer.flip();
			try{
				int writeLength = writeChannel.write(byteBuffer, nowPosition);
				nowPosition += writeLength;
			}catch(Exception e){
				
			}
			byteBuffer.clear();
			readFileChannel.read(byteBuffer, nowPosition, writeChannel, this);
		}else{
			System.out.println(ai);
			closeStreams(readFileChannel, writeChannel);
		}
	}

	@Override
	public void failed(Throwable exc, FileChannel attachment) {
		exc.printStackTrace();
	}

	
	public long getNowPosition() {
		return nowPosition;
	}

}
