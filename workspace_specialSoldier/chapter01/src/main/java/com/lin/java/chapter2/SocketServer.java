package com.lin.java.chapter2;

import java.io.IOException;
import java.net.ServerSocket;

import org.junit.Test;

public class SocketServer {
	
	@Test
	public void test() throws IOException{
		ServerSocket serSocket = new ServerSocket(8888);
		System.out.println("端口已经打开为8888， 开始准备接受数据");
		SocketWrapper socketWrapper = null;
		try{
			socketWrapper = new SocketWrapper(serSocket.accept());
			String line = socketWrapper.readLine();
			while(!"bye".equals(line)){
				System.out.println("客户端传来数据："+line);
				socketWrapper.writeLine("我接受到你的数据："+line);
				line = socketWrapper.readLine();
			}
			socketWrapper.writeLine("close");
		}finally{
			if(socketWrapper != null){
				socketWrapper.close();
			}
		}
	}

}
