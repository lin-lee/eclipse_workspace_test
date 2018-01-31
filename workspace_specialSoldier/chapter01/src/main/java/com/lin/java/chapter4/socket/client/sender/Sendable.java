package com.lin.java.chapter4.socket.client.sender;

import java.io.IOException;

import com.lin.java.chapter4.socket.SocketWrapper;

public interface Sendable {
	
	public byte getSendType();
	
	public void sendContent(SocketWrapper socketWrapper) throws IOException;
	
}
