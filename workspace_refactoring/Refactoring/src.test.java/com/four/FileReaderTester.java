package com.four;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FileReaderTester{
	
	private FileReader _input;
	
	@Before
	public void setUp(){
		try{
			_input = new FileReader("data.txt");
		}catch(FileNotFoundException e){
			throw new RuntimeException("unable to open test file");
		}
	}
	
	@Test
	public void testRead() throws IOException{
		char ch ='&';
		for(int i=0; i<4; i++)
			ch = (char) _input.read();
		assertEquals('m', ch);
	}
	
	@Test
	public void testReadAtEnd() throws IOException{
		int ch;
		for(int i=0; i<141; i++)
			ch = _input.read();
		assertEquals(-1, _input.read());
	}
	
	@Test
	public void testEmptyRead() throws IOException{
		File empty = new File("empty.txt");
		FileOutputStream out = new FileOutputStream(empty);
		out.close();
//		FileReader in;
//		try{
//			in = new FileReader(empty);
//			assertEquals(-1, in.read());
//		}catch(Exception e){
//			
//		}finally{
//			
//			//in.close();
//		}
		
	}
	
	@After
	public void testDown(){
		try{
			_input.close();
		}catch(IOException e){
			throw new RuntimeException("error on closing test file");
		}
	}

}
