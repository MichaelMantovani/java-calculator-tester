package org.java;

public class Calculator {

	public float add(float num1, float num2) {
		return num1 + num2;
	}

	public float subtract(float num1, float num2) {
		return num1 - num2;
	}

	public float divide(float num1, float num2) throws ArithmeticException {
		
		if (num2==0) throw new ArithmeticException("Non posso dividere un numero per 0");
		return num1 / num2;
	}
	
	public float multiply(float num1, float num2) {
		return num1 * num2;
	}
}
