package dynamic_class_loading_in_the_Java_virtual_machine;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Server {
	
	private Object service;
	
	public void updateService(String location) 
			throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		MyClassLoader cl = new MyClassLoader(location);
		Class<?> c = cl.loadClass("Service");
		service = c.newInstance();
	}
	
	public void processRequest(Class<?> ...parameterTypes) 
			throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		Class<?> c = service.getClass();
		Method m = c.getMethod("run", parameterTypes);
		m.invoke(service, parameterTypes);
	}

	
	
	 class Point  { int x, y; }
	
	 interface Ipoint{
		 public static Point p = new Server().new Point();
	 }
}
