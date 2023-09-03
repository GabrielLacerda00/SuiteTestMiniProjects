package org.example.code;

public class Calculator {

        public static int sum(int a, int b) {
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
            sum(2,4);
            sum(3,5);
            sum(4,6);
        }

}
