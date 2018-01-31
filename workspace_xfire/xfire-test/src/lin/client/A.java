package lin.client;
 
import java.net.HttpURLConnection;
import java.net.URL;
 
import org.codehaus.xfire.client.Client;
 
public class A {
	
	public double RMB2Dollar(double RMB)
	{
		try{
			String wsdl = "http://[ip]:[port]/[yourProjectName]/services/ExchangeService?wsdl";
			URL url = new URL(wsdl);
			HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
			httpConnection.connect();
			Client client = new Client(httpConnection.getInputStream(),null);	
			//可以查询 xfire连接池调用
			Object []results = client.invoke("RMB2Dollar", new Object[]{RMB});
			return (Double)results[0];
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A client = new A();
		System.out.println("invoking service : ExchangeService results="+client.RMB2Dollar(100.0));
	}
 
}
