/*
 * %W% %E%
 *
 * Copyright (c) 2006, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package sun.net.www.protocol.http;

import java.net.URL;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.PasswordAuthentication;
import sun.net.www.HeaderParser;


/**
 * BasicAuthentication: Encapsulate an http server authentication using
 * the "basic" scheme.
 *
 * @author Bill Foote
 * @version %I%, %G% 
 */


class BasicAuthentication extends AuthenticationInfo {

    private static final long serialVersionUID = 100L;

    static final char BASIC_AUTH = 'B';

    /** The authentication string for this host, port, and realm.  This is
	a simple BASE64 encoding of "login:password".    */
    String auth;

    /**
     * Create a BasicAuthentication
     */
    public BasicAuthentication(boolean isProxy, String host, int port,
			       String realm, PasswordAuthentication pw) {
	super(isProxy ? PROXY_AUTHENTICATION : SERVER_AUTHENTICATION,
	      BASIC_AUTH, host, port, realm);
	String plain = pw.getUserName() + ":";
	byte[] nameBytes = null;
	try {
	    nameBytes = plain.getBytes("ISO-8859-1");
	} catch (java.io.UnsupportedEncodingException uee) {
	    assert false;
	}

	// get password bytes
	char[] passwd = pw.getPassword();
	byte[] passwdBytes = new byte[passwd.length];
	for (int i=0; i<passwd.length; i++)
	    passwdBytes[i] = (byte)passwd[i];

	// concatenate user name and password bytes and encode them
	byte[] concat = new byte[nameBytes.length + passwdBytes.length];
	System.arraycopy(nameBytes, 0, concat, 0, nameBytes.length);
	System.arraycopy(passwdBytes, 0, concat, nameBytes.length,
			 passwdBytes.length);
	this.auth = "Basic " + (new sun.misc.BASE64Encoder()).encode(concat);
	this.pw = pw;
    }

    /**
     * Create a BasicAuthentication
     */
    public BasicAuthentication(boolean isProxy, String host, int port,
			       String realm, String auth) {
	super(isProxy ? PROXY_AUTHENTICATION : SERVER_AUTHENTICATION,
	      BASIC_AUTH, host, port, realm);
	this.auth = "Basic " + auth;
    }

    /**
     * Create a BasicAuthentication
     */
    public BasicAuthentication(boolean isProxy, URL url, String realm,
				   PasswordAuthentication pw) {
	super(isProxy ? PROXY_AUTHENTICATION : SERVER_AUTHENTICATION,
	      BASIC_AUTH, url, realm);
	String plain = pw.getUserName() + ":";
	byte[] nameBytes = null;
	try {
	    nameBytes = plain.getBytes("ISO-8859-1");
	} catch (java.io.UnsupportedEncodingException uee) {
	    assert false;
	}

	// get password bytes
	char[] passwd = pw.getPassword();
	byte[] passwdBytes = new byte[passwd.length];
	for (int i=0; i<passwd.length; i++)
	    passwdBytes[i] = (byte)passwd[i];

	// concatenate user name and password bytes and encode them
	byte[] concat = new byte[nameBytes.length + passwdBytes.length];
	System.arraycopy(nameBytes, 0, concat, 0, nameBytes.length);
	System.arraycopy(passwdBytes, 0, concat, nameBytes.length,
			 passwdBytes.length);
	this.auth = "Basic " + (new sun.misc.BASE64Encoder()).encode(concat);
	this.pw = pw;
    }

    /**
     * Create a BasicAuthentication
     */
    public BasicAuthentication(boolean isProxy, URL url, String realm,
				   String auth) {
	super(isProxy ? PROXY_AUTHENTICATION : SERVER_AUTHENTICATION,
	      BASIC_AUTH, url, realm);
	this.auth = "Basic " + auth;
    }

    /**
     * @return true if this authentication supports preemptive authorization
     */
    boolean supportsPreemptiveAuthorization() {
	return true;
    }

    /**
     * @return the name of the HTTP header this authentication wants set
     */
    String getHeaderName() {
	if (type == SERVER_AUTHENTICATION) {
	    return "Authorization";
	} else {
	    return "Proxy-authorization";
	}
    }

    /**
     * Set header(s) on the given connection. This will only be called for
     * definitive (i.e. non-preemptive) authorization.
     * @param conn The connection to apply the header(s) to
     * @param p A source of header values for this connection, if needed.
     * @param raw The raw header values for this connection, if needed.
     * @return true if all goes well, false if no headers were set.
     */
    boolean setHeaders(HttpURLConnection conn, HeaderParser p, String raw) {
        conn.setAuthenticationProperty(getHeaderName(), getHeaderValue(null,null));
        return true;
    }

    /**
     * @return the value of the HTTP header this authentication wants set
     */
    String getHeaderValue(URL url, String method) {
	/* For Basic the authorization string does not depend on the request URL 
  	 * or the request method
	 */
	return auth;
    }

    /**
     * For Basic Authentication, the security parameters can never be stale.
     * In other words there is no possibility to reuse the credentials.
     * They are always either valid or invalid.
     */
    boolean isAuthorizationStale (String header) {
	return false;
    }

    /**
     * For Basic Authentication, there is no security information in the
     * response
     */
    void checkResponse (String header, String method, URL url) {
    }

    /**
     * @return the common root path between npath and path. 
     * This is used to detect when we have an authentication for two
     * paths and the root of th authentication space is the common root.
     */

    static String getRootPath(String npath, String opath) {
        int index = 0;
        int toindex;

        /* Must normalize so we don't get confused by ../ and ./ segments */
	try {
            npath = new URI (npath).normalize().getPath();
            opath = new URI (opath).normalize().getPath();
	} catch (URISyntaxException e) {
	    /* ignore error and use the old value */
	}

        while (index < opath.length()) {
            toindex = opath.indexOf('/', index+1);
            if (toindex != -1 && opath.regionMatches(0, npath, 0, toindex+1))
                index = toindex;
            else
                return opath.substring(0, index+1);
        }
        /*should not reach here. If we do simply return npath*/
        return npath;
    }

}