package ru.mirea.lab1;

public class Task7 {
    private static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tests = {0, 1, 5, 10, 20};
        for (int n : tests) {
            System.out.println(n + "! = " + factorial(n));
        }
    }
}