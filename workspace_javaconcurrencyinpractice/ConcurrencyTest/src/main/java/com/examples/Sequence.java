package com.examples;

import com.annotations.GuardedBy;
import com.annotations.ThreadSafe;

@ThreadSafe
public class Sequence {
	
	@GuardedBy("this") private int Value;
	
	public synchronized int getNext(){
		return Value++;
	}

}
