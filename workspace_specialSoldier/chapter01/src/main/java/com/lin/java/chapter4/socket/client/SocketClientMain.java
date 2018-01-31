package com.lin.java.chapter4.socket.client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.lin.java.chapter4.socket.SocketWrapper;
import com.lin.java.chapter4.socket.client.exceptions.DirectNotExistsException;
import com.lin.java.chapter4.socket.client.exceptions.ExitException;
import com.lin.java.chapter4.socket.client.exceptions.NoOptionException;
import com.lin.java.chapter4.socket.client.processor.LineProcessor;

import static com.lin.java.chapter4.socket.Commons.print;

public class SocketClientMain {

	public static void main(String []args) throws UnknownHostException, IOException {
		Scanner scanner = new Scanner(System.in);
		SocketWrapper socketWrapper = new SocketWrapper("localhost" , 8888);
		try {
			print("已经连接上服务器端，现在可以输入数据开始通信了.....\n>");
			String line = scanner.nextLine();
			while(!"bye".equals(line)) {
				if(line != null) {
					try {
						LineProcessor processor = new LineProcessor(line);
						processor.sendContentBySocket(socketWrapper);
						socketWrapper.displayStatus();
					}catch(ExitException e) {
						break;//退出系统
					}catch(NoOptionException e) {
						/*没有做任何操作*/
					}catch(DirectNotExistsException e) {
						System.out.println(e.getMessage());
					}catch(RuntimeException e) {
						System.out.println(e.getMessage());
					}catch(FileNotFoundException e) {
						System.out.println(e.getMessage());
					}catch(SocketException e) {
						socketWrapper.displayStatus();
						System.out.println("Socket异常： " + e.getMessage()  + "，程序将与服务器断开链接....");
						break;
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println("与线上服务器断开链接！");
						break;
					}
				}
				print(">");
				line = scanner.nextLine();
			}
		}finally {
			socketWrapper.close();
		}
	}
}
