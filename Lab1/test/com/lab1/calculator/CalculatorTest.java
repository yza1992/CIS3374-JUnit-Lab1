package com.lab1.calculator;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	@Before
	public void setUp()
	{
		calculator = new Calculator();
	}
	
	@Test
	public void addTest()
	{
		assertEquals(4, calculator.add(2, 2));
		assertNotEquals(1, calculator.add(2, 2));
	}
	
	@Test
	public void subtractTest()
	{
		assertEquals(10, calculator.subtract(15, 5));
		assertNotEquals(15, calculator.subtract(15,5));
	}
	
	@Test
	public void multiplyTest()
	{
		assertEquals(81, calculator.multiply(9, 9));
		assertNotEquals(79,calculator.multiply(9, 9));
	}
	
	
	@Test
	public void divideTest()
	{
		assertEquals(10, calculator.divide(20, 2));
		assertNotEquals(1, calculator.divide(20, 2));
	}
	
	@Test
	public void isEqual()
	{
	 assertTrue(calculator.isEqual(5, 5));
	 assertFalse(calculator.isEqual(6, 4));
	}
}
