package org.example.p1;


public class Calculator {
	
	public  int add(int a, int b) {
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
		Calculator cal = new Calculator();
		cal.sum(5,6);
	}
}
