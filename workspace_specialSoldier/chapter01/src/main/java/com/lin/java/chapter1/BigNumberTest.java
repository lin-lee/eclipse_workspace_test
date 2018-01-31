package com.lin.java.chapter1;

import java.math.BigDecimal;
import java.math.BigInteger;




import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BigNumberTest {
	private static final Logger log = LoggerFactory.getLogger(BigNumberTest.class);
	
	private static String lPad(String now, int expectLength, char paddingChar){
		if(now == null || now.length() >= expectLength){
			return now;
		}
		StringBuilder buf = new StringBuilder(expectLength);
		for(int i=0,paddingLength=expectLength-now.length(); i<paddingLength; i++){
			buf.append(paddingChar);
		}
		return buf.append(now).toString();
	}
	
	@Test
	public void test(){
		BigDecimal bigDecimal = new BigDecimal("12222336548969665544552222222222665544");
		System.out.println("数字的原始值是：" + bigDecimal);
		
		byte[] bytes = bigDecimal.toBigInteger().toByteArray();
		for(byte b : bytes){
			String bitString = lPad(Integer.toBinaryString(b&0xff), 8, '0');
			System.out.println(bitString);
		}
		BigInteger bigInteger = new BigInteger(bytes);
		System.out.println("还原结果为：" + bigInteger);
		log.info("log test");
	}

}
