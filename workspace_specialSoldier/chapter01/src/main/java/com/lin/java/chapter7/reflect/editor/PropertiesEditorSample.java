package com.lin.java.chapter7.reflect.editor;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class PropertiesEditorSample {
	
	private static final Field[] TEST_FIELDS 
							= TestDO.class.getDeclaredFields();
	static{
		PropertyEditorManager.registerEditor(NodeDO.class, NodeDOEditor.class);
	}

	public static void main(String [] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IntrospectionException{
		Map<String, String> parameter = new HashMap<String, String>(){
			private static final long serialVersionUID = 1L;
			{
				put("nodeName", "小胖测试");
				put("nodeDO", "xie|pangpang@|2012-12-21 12:21:12");
			}
		};
		
		TestDO testDO = convertParametorToDO(parameter);
		System.out.println(testDO.getNodeName());
		System.out.println(testDO.getNodeDO());
	}
	
	private static TestDO convertParametorToDO(Map<String, String> parameter) throws IntrospectionException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		TestDO testDO = new TestDO();
		for(Field field : TEST_FIELDS){
			PropertyDescriptor propertyDescriptor 
					= new PropertyDescriptor(field.getName(), TestDO.class);
			Method method = propertyDescriptor.getWriteMethod();
			if(field.getType() == String.class){
				method.invoke(testDO, parameter.get(field.getName()));
			}else{
				PropertyEditor propertyEditor
						= PropertyEditorManager.findEditor(field.getType());
				if(propertyEditor != null){
					propertyEditor.setAsText(parameter.get(field.getName()));
					method.invoke(testDO, propertyEditor.getValue());
				}else{
					System.out.println("properties:"+field.getName()+",can not find editor");
				}
			}
		}
		return testDO;
	}
}
