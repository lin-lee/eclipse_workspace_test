package com.lin.java.chapter4.nio.client;

import static com.lin.java.chapter4.socket.Commons.*;

import java.io.FileOutputStream;

import com.lin.java.chapter4.file.FileUtils;
import com.lin.java.chapter4.socket.SocketWrapper;

public class ClientMain {
	
	public static void main(String[] args){
		
		for(int i=0; i<50; i++){
			final String num = String.valueOf(i);
			new Thread(String.valueOf(i)){
				@Override
				public void run(){
					SocketWrapper socketWrapper = null;
					FileOutputStream  stream = null;
					try{
						stream = new FileOutputStream("e:/temp/aaa" + num + ".pdf");
						socketWrapper = new SocketWrapper("localhost", 8888);
						
						println("已经连接上服务器端.....");
						socketWrapper.write("我是线程：" + num, DEFAULT_MESSAGE_CHARSET);
						byte[] buffer = new byte[8192];
						int len = socketWrapper.read(buffer);
						while(len>0){
							println("我是线程：" + num + " 我接收到数据，长度为："+ len);
							stream.write(buffer, 0, len);
							len = socketWrapper.read(buffer);
						}
					}catch(Exception e){
						e.printStackTrace();
					}finally{
						FileUtils.closeStream(stream, socketWrapper);
					}
				}
			}.start();
		}
	}

}
