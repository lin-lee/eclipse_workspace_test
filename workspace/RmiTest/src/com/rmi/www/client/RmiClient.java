package com.rmi.www.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import com.rmi.www.server.AddServer;

public class RmiClient {
	public static void main(String args[]) throws RemoteException,
		MalformedURLException, NotBoundException{
		String url = "rmi://127.0.0.1/Hello";
		AddServer add;
		add =(AddServer)Naming.lookup(url);
		String result = "";
		Map secondNumber = new HashMap();
		secondNumber.put(1, "Œ“");
		secondNumber.put(2,"∞Æ");
		secondNumber.put(3,"ni");
		result = add.AddNumbers(10, secondNumber);
		System.out.println(result);
	}

}
