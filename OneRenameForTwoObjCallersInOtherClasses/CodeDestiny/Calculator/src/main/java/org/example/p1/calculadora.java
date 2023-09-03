package org.example.p1;

public class calculadora extends Calculator{
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }


    public static void main (String args[]) {
        Calculator cal = new Calculator();
        cal.sum(4,5);
        cal.sum(6,8);
    }
}
