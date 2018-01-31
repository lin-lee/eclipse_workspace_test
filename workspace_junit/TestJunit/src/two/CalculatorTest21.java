package two;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import one.Calculator;

public class CalculatorTest21 {
	
	@Test
	public void testAdd(){
		Calculator calculator = new Calculator();
		double result = calculator.add(1, 1);
		assertEquals("args error lol", 2, result, 0);
	}

}
