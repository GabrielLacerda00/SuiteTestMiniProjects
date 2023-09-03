package org.example.code;

public class Calculator {

        public static int add(int a, int b) {
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

        public void printCalc(){
            System.out.println(division(4,2));
        }


        public static void main (String args[]) {
            add(2,4);
            add(3,5);
            add(4,6);
        }

}
