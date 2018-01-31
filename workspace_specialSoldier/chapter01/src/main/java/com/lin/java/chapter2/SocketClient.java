package com.lin.java.chapter2;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import org.junit.Test;

public class SocketClient {
	
	@Test
	public void test() throws UnknownHostException, IOException{
		Scanner scanner = new Scanner(System.in);
		SocketWrapper socketWrapper = new SocketWrapper(new Socket("localhost", 8888));
		try{
			System.out.println("已经连接上服务端：现在可以输入数据开始通信了");
			String sendMsg = scanner.nextLine();
			socketWrapper.writeLine(sendMsg);
			String recivedMsg = socketWrapper.readLine();
			while(!"close".equals(recivedMsg)){
				System.out.println("===【服务器返回】===>" + recivedMsg);
				sendMsg = scanner.nextLine();
				socketWrapper.writeLine(sendMsg);
				recivedMsg = socketWrapper.readLine();
			}
			socketWrapper.writeLine("aaaaa");
			
			System.out.println("我是客户端， 结束了！");
		}finally{
			if(socketWrapper != null){
				socketWrapper.close();
			}
		}
	}

}
