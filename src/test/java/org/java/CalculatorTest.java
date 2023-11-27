package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator c = null;
	private static final float num1 = 2;
	private static final float num2 = 3;

	@BeforeAll
	public static void setup() {
		c = new Calculator();
	}
	
	@Test
	public void correctAdditionResultCalculatorTest() {
		assertEquals(5, c.add(num1, num2), "La somma non è corretta");
	}
	
	@Test
	public void correctSubtractionResultCalculatorTest() {
		assertEquals(-1, c.subtract(num1, num2), "La sottrazione non  è corretta");
	}
}
