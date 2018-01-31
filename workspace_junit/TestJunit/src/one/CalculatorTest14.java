package one;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 14 代表listing 1.4
 * @author lilin
 *
 */

public class CalculatorTest14 {
	@Test
	public void testAdd(){
		Calculator calculator = new Calculator();
		double result = calculator.add(10.5, 50);
		assertEquals(60, result, 0.5);
	}

}
