package org.example.p1;

public class MyObj  extends Calculator{

    public static int sum(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public static void main (String args[]) {
        sum(4,5);
        sum(6,8);
    }
}



