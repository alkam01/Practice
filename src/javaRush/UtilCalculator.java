package javaRush;

public class UtilCalculator {
    public static final String EQUAL = " = ";
    static int a = 45;
    static int b = 15;
    static class Calculator {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }
        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }
        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }
        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
    public static void main(String[] args) {
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }
}
