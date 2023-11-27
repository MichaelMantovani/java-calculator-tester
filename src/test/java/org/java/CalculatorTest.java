package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator c = null;
	private static final float num1 = 6;
	private static final float num2 = 3;

	@BeforeAll
	public static void setup() {
		c = new Calculator();
	}
	
	@Test
	public void correctAdditionResultCalculatorTest() {
		assertEquals(9, c.add(num1, num2), "La somma non è corretta");
	}
	
	@Test
	public void correctSubtractionResultCalculatorTest() {
		assertEquals(3, c.subtract(num1, num2), "La sottrazione non  è corretta");
	}
	
	@Test
	public void correctDivideResultCalculatorTest() {
		assertEquals(2, c.divide(num1, num2)," La divisione non è corretta");
	}
	
	@Test 
	public void divideByZeroResultCalculatorTest() {
		float num2 = 0;
		assertThrows(ArithmeticException.class, ()-> c.divide(num1,num2), "Eccezione attesa con diviso per zero");
	}
	
	@Test
	public void correctMultiplyResultCalculatorTest() {
		assertEquals(18, c.multiply(num1, num2), "La moltiplicazione non è corretta");
	}
}
