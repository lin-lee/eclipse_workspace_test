package two;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import one.Calculator;

@RunWith(value=Parameterized.class) 
public class ParameterizedTest22 {
	
	private double expected;
	private double valueOne;
	private double valueTwo;
	
	@Parameters
	public static Collection<Integer[]> getTestParameters(){
		return Arrays.asList(new Integer[][]{
			{2, 1, 1},
			{3, 2, 1},
			{4, 3, 1},
		});
	}
	
	public ParameterizedTest22(double expected,
			double valueOne, double valueTwo){
		this.expected = expected;
		this.valueOne = valueOne;
		this.valueTwo = valueTwo;
	}
	
	@Test
	public void sum(){
		Calculator calc = new Calculator();
		assertEquals("error args!", expected, calc.add(valueOne, valueTwo), 0);
	}

}
