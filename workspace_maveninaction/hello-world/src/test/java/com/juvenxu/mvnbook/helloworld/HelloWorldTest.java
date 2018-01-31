package com.juvenxu.mvnbook.helloworld;

import static org.junit.Assert.*;

import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class HelloWorldTest
{
	@Test
    public void test(){
    	assertEquals("Hello Maven", HelloWorld.say());
    }
}
