package Calculator.src.main.java.org.example.code;

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
            System.out.println(add(1,2));
            System.out.println(add(1,2));
        }

}
