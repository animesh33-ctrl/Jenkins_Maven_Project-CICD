package com;

//import src.main.java.com.Calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest{
	
	@Test
	public void testAddition() {
		Calculator calc = new Calculator();
		int result = calc.add(2, 3);
		assertEquals(5,result);
	}
}
