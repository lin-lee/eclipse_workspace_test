package http;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.URIException;
import org.apache.commons.httpclient.auth.CredentialsProvider;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.URIUtil;


public class HttpTest2 {
	
	public static void main(String [] args) throws URIException{
		Map<String, Map> params = new HashMap<String, Map>();
		
		Map<String,String> header =(Map<String,String>)params.get("header");
		Map<String,String> query =(Map<String,String>)params.get("query");
		HttpClient client = new HttpClient();
		//client.getHostConfiguration().setProxy("192.168.0.1",  9527);//代理
		client.getParams().setAuthenticationPreemptive(true);
		
		String uri = "http://www.blablabla.com";
		String uri2 = "http://www.baidu.com";
		HttpMethod httpmethod = new PostMethod(uri2);
		if(header != null){
			for (Map.Entry<String, String> entry : header.entrySet()) {
				httpmethod.addRequestHeader(entry.getKey(), entry.getValue());
			}
		}
		
		String queryString="";
		if(query != null){
			for (Map.Entry<String, String> entry : query.entrySet()) {
				queryString+=entry.getKey()+"="+entry.getValue()+"&";
			}
		}
	//	queryString = queryString.substring(0, queryString.lastIndexOf("&"));
		
		httpmethod.setQueryString(URIUtil.encodeQuery(queryString));
		
		try { 
			int code = client.executeMethod(httpmethod);
			if( (code == HttpStatus.SC_MOVED_TEMPORARILY) 
			    || (code == HttpStatus.SC_MOVED_PERMANENTLY)
			    || (code == HttpStatus.SC_SEE_OTHER)
			    || (code == HttpStatus.SC_TEMPORARY_REDIRECT)){
				Header h = httpmethod.getResponseHeader("location");
				if(h != null){
					String newUrl = h.getValue();
					if(newUrl == null || newUrl.equals("")){
						newUrl = "/";
						PostMethod redirect = new PostMethod(newUrl);
					}
				}
			}
			String s = httpmethod.getResponseBodyAsString();
			System.out.println(s);
			
		} catch (Exception e) {  
			throw new IllegalArgumentException(e);
		}finally{  
			  httpmethod.releaseConnection();    
			  client.getHttpConnectionManager().closeIdleConnections(0);
		}  
		
	}
}
