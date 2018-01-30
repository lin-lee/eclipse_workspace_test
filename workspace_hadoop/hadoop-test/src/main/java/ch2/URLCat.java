package ch2;

import java.net.URL;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;

public class URLCat {
	
	static {
		URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
	}

	public static void main(String [] args){
		
	}
}
