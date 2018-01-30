package com.rmi.www.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;


public class AddServerImpl extends UnicastRemoteObject implements AddServer {
	
	public AddServerImpl() throws RemoteException{
		super();
	}
	@Override
	public String AddNumbers(int firstNumber, Map secondNumber)
			throws RemoteException {
		// TODO Auto-generated method stub
		return ""+firstNumber + secondNumber.toString();
	}

}
