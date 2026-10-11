package ru.mirea.lab3.random1;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    static void print(double[] arr) {
        for (double v : arr) {
            System.out.printf("%.2f ", v);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // способ 1: Math.random()
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 100;
        }
        System.out.println("Math.random(), до сортировки:");
        print(a);
        Arrays.sort(a);
        System.out.println("После сортировки:");
        print(a);

        // способ 2: класс Random
        Random rnd = new Random();
        double[] b = new double[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = rnd.nextDouble() * 100;
        }
        System.out.println("\nRandom, до сортировки:");
        print(b);
        Arrays.sort(b);
        System.out.println("После сортировки:");
        print(b);
    }
}