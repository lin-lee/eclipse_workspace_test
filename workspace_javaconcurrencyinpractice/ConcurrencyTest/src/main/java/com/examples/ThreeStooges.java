package com.examples;

import java.util.HashSet;
import java.util.Set;

import com.annotations.Immutable;

@Immutable
public class ThreeStooges {
	private final Set<String> stooges = new HashSet<String>();
	
	public ThreeStooges(){
		stooges.add("Moe");
		stooges.add("Larry");
		stooges.add("Curly");
	}
	
	public boolean isStooges(String name){
		return stooges.contains(name);
	}

}
