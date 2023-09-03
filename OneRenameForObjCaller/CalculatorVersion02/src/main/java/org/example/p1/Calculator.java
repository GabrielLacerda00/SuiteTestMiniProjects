package org.example.p1;


public class Calculator {
	
	public  int sum(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public float division(int a, int b) {
		return a / b;
	}


	public static void main (String args[]) {
		Calculator calc = new Calculator();
		calc.sum(4,5);
	}
}
