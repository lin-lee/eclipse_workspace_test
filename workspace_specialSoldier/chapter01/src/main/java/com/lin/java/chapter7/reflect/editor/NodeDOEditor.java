package com.lin.java.chapter7.reflect.editor;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NodeDOEditor extends PropertyEditorSupport{
	
	public static final SimpleDateFormat DEFAULT_DATE_FORMAT
						= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public void setAsText(String text){
		String[] tokens = text.split("\\|");
		NodeDO nodeDO = new NodeDO();
		nodeDO.setName(tokens[0]);
		nodeDO.setEmail(tokens[1]);
		try{
			nodeDO.setDateTime(DEFAULT_DATE_FORMAT.parse(tokens[2]));
		}catch(ParseException e){
			throw new IllegalArgumentException();
		}
		setValue(nodeDO);
	}

}
