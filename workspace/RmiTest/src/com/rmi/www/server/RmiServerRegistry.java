package com.rmi.www.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RmiServerRegistry {
	
	public static void main(String [] args){
		try{
			LocateRegistry.createRegistry(1099);
			AddServer add = new AddServerImpl();
			Naming.rebind("Hello", add);
			System.out.println("Hello Server is ready.");
		}catch(Exception e){
			System.out.println("Hello Server failed:" + e);
		}
	}

}
