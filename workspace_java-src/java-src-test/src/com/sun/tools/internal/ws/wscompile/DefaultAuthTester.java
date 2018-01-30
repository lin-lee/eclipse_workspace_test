/*
 * Copyright (c) 1997, 2008, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms. 
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package com.sun.tools.internal.ws.wscompile;

import com.sun.istack.internal.NotNull;
import com.sun.tools.internal.ws.processor.modeler.wsdl.ConsoleErrorReporter;

import java.io.File;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.Arrays;

/**
 * @author Vivek Pandey
 */
public class DefaultAuthTester {
    public static void main(String[] args) throws BadCommandLineException {
        DefaultAuthenticator da = new MyAuthenticator(new ConsoleErrorReporter(System.out), new File("c:\\Users\\vivekp\\.metro\\auth"));
                
        PasswordAuthentication pa = da.getPasswordAuthentication();
        if(pa!= null && pa.getUserName().equals("vivek") && Arrays.equals(pa.getPassword(), "test".toCharArray()))
            System.out.println("Success!");
        else
            System.out.println("Failiure!");

    }

    private static class MyAuthenticator extends DefaultAuthenticator{

        public MyAuthenticator(@NotNull ErrorReceiver receiver, @NotNull File authfile) throws BadCommandLineException {
            super(receiver, authfile);
        }

        protected URL getRequestingURL() {
            try {
                return new URL("http://foo.com/myservice?wsdl");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
