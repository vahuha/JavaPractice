package ru.mirea.lab3.random3;

import java.util.Random;

public class IncreasingCheck {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + rnd.nextInt(90);
        }

        for (int v : arr) {
            System.out.print(v + " ");
        }
        System.out.println();

        boolean increasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Массив строго возрастающий");
        } else {
            System.out.println("Массив не является строго возрастающим");
        }
    }
}