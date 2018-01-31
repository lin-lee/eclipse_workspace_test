package com.lin.java.chapter3.instrumentTest.transformer;

import java.lang.instrument.Instrumentation;

public class InstForTransformer {
	
	public static void premain(String agentArgs, Instrumentation instP){
		instP.addTransformer(new TestTransformer());
	}

}
