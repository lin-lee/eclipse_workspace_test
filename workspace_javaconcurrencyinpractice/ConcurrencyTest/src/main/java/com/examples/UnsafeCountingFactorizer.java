package com.examples;

import java.io.IOException;
import java.math.BigInteger;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.annotations.NotThreadSafe;

@NotThreadSafe
public class UnsafeCountingFactorizer implements Servlet{

	private long count = 0;
	
	public void destroy() {
			
	}

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null;
	}
   
	public void init(ServletConfig arg0) throws ServletException {
		
	}
	
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		BigInteger i = extractFromRequest(req);
		BigInteger [] factors = factor(i);
		++count;
		encodeIntoResponse(resp, factors);
	}

	public long getCount(){
		return count;
	}
	void encodeIntoResponse(ServletResponse resp, BigInteger[] factors) {
    }

    BigInteger extractFromRequest(ServletRequest req) {
        return new BigInteger("7");
    }

    BigInteger[] factor(BigInteger i) {
        // Doesn't really factor
        return new BigInteger[] { i };
    }
}
