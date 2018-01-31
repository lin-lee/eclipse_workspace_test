package dynamic_class_loading_in_the_Java_virtual_machine;

import java.io.IOException;

public class MyClassLoader extends ClassLoader{
	
	private String directory;
	
	public MyClassLoader(String dir){
		directory = dir;
	}
	
	@Override
	public synchronized Class<?> loadClass(String name) throws ClassNotFoundException{
		Class<?> c = findLoadedClass(name);
		if(c != null)
			return c;
		try{
			c = findSystemClass(name);
			return c;
		}catch(ClassNotFoundException e){
			
		}
		try{
			byte[] data = getClassData(directory, name);
			return defineClass(name, data, 0, data.length);
		}catch(IOException e){
			throw new ClassNotFoundException();
		}
		
	}
	
	byte[] getClassData(String directory, String name) throws IOException{
		return null;
		
	}
	

}
