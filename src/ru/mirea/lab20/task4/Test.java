package ru.mirea.lab20.task4;

public class Test {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};
        MinMax<Integer> mm1 = new MinMax<Integer>(numbers);
        System.out.println("Integer: min = " + mm1.min() + ", max = " + mm1.max());

        String[] words = {"груша", "яблоко", "апельсин", "киви"};
        MinMax<String> mm2 = new MinMax<String>(words);
        System.out.println("String: min = " + mm2.min() + ", max = " + mm2.max());

        System.out.println();
        System.out.println("5 + 2.5 = " + Calculator.sum(5, 2.5));
        System.out.println("10 - 3L = " + Calculator.subtraction(10, 3L));
        System.out.println("4.5 * 2 = " + Calculator.multiply(4.5, 2));
        System.out.println("7 / 2.0 = " + Calculator.divide(7, 2.0));
        try {
            System.out.println("1 / 0 = " + Calculator.divide(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("1 / 0: " + e.getMessage());
        }
    }
}