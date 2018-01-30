package com.rmi.www.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface AddServer extends Remote{
	public String AddNumbers(int firstNumber, Map secondNumber) throws RemoteException;

}
