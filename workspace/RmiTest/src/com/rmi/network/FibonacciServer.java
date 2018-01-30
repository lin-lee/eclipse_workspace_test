package com.rmi.network;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import com.rmi.network.FibonacciImpl;

public class FibonacciServer {
	
	public static void main(String [] args) {
		try{
			FibonacciImpl f = new FibonacciImpl();
			Naming.rebind("fibonacci", f);
			System.out.println("Fibonacci Server ready.");
		}catch(RemoteException rex){
			System.out.println("Exception in FibonacciImpl.main: "+rex);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("MalformedURLException "+ e);
		}
	}

}
