package com.examples;

import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequestWrapper;

import org.junit.Test;

import com.annotations.ThreadSafe;

@ThreadSafe
public class CountingFactoriserTest {
	
	
	@Test
	public void serviceTest()
			throws ServletException, IOException {
		
		ServletRequest req = null;
		ServletResponse res = null;
		
		CountingFactoriser c = new CountingFactoriser();
		c.service(req, res);

	}

	
}
