package org.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Calculator c = null;

	@BeforeAll
	public static void setup() {
		c = new Calculator();
	}
	
	@Test
	public void correctAdditionResultCalculatorTest() {
		float num1 = 2.56F;
		float num2 = 3.44F;
		assertEquals(6, c.add(num1, num2), "La somma non è corretta");
	}

}
