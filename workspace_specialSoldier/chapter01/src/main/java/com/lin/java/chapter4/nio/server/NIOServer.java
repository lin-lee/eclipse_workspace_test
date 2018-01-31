package com.lin.java.chapter4.nio.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Set;

import static com.lin.java.chapter4.socket.Commons.*;

public class NIOServer {
	
	public static final int BYTE_BUFFER_SIZE = 8192;
	public static final ByteBuffer CLIENT_BYTE_BUFFER =
								ByteBuffer.allocate(BYTE_BUFFER_SIZE);
	public static final int DEFAULT_PORT = 8888;
	
	public static void main(String [] args) throws IOException{
		Selector selector = createSelector();
		logInfo("服务器端已经打开端口：" + DEFAULT_PORT);
		try{
			while(true){
				selector.select();
				Set<SelectionKey> selectionKeySet = selector.selectedKeys();
				for(SelectionKey selectionKey : selectionKeySet){
					SelectionKeyProcessor selectionKeyProcessor =
									new SelectionKeyProcessor(selectionKey, selector);
					selectionKeyProcessor.processKey();
				}
				selectionKeySet.clear();
			}
		}finally{
			selector.close();
		}
	}
	
	private static Selector createSelector() throws IOException{
		ServerSocketChannel server = ServerSocketChannel.open();
		Selector selector = Selector.open();
		server.socket().bind(new InetSocketAddress(DEFAULT_PORT));
		server.configureBlocking(false);
		server.register(selector, SelectionKey.OP_ACCEPT);
		return selector;
	}

}
