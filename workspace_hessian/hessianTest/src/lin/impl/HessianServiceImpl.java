package lin.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.caucho.hessian.server.HessianServlet;

import lin.HessianService;
import lin.bean.MyCar;
import lin.bean.MyCarImpl;

public class HessianServiceImpl extends HessianServlet implements HessianService {

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		System.out.println("hessian test server start!");
		return "welcome to Hessian";
	}

	@Override
	public MyCar getMyCar() {
		// TODO Auto-generated method stub
		MyCar car = new MyCarImpl();
		car.setCarName("∞¢Àπ∂Ÿ");
		car.setCarModel("One-77");
		return (MyCar)car;
	}

	@Override
	public List myLoveFruit() {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		l.add("apple");
		l.add("orange");
		return l;
	}

	@Override
	public Map myBabays() {
		// TODO Auto-generated method stub
		Map m = new HashMap();
		m.put("daughter", "ÀÔ–°√¿");
		return m;
	}

}
