package client;

import java.net.MalformedURLException;

import lin.HessianService;
import lin.bean.MyCar;

import com.caucho.hessian.client.HessianProxyFactory;

public class HessianClientTest {
	
	public static void main(String [] args){
		String url = "http://localhost:8080/hessianTest/HessianService";
		HessianProxyFactory f = new HessianProxyFactory();
		try{
			HessianService h = (HessianService)f.create(HessianService.class, url);
			MyCar m =(MyCar) h.getMyCar();
			System.out.println(h.sayHello());
			MyCar c = h.getMyCar();
			System.out.println(c.toString());
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
	}

}
