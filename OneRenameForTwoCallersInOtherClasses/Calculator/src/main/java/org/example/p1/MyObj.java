package org.example.p1;

public class MyObj  extends Calculator{

    public static int add(int a, int b) {return a + b;}
    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }


    public static void main (String args[]) {
        add(4,5);
        add(6,8);
    }
}



