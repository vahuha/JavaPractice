package ru.mirea.lab3.random4;

import java.util.Random;
import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Введите натуральное число n: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) break;
            } else {
                sc.next();   // выбрасываем неверный ввод
            }
            System.out.println("Неверный ввод, повторите");
        }

        Random rnd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(n + 1);
        }
        System.out.print("Массив: ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        // считаем чётные, чтобы знать размер второго массива
        int evenCount = 0;
        for (int v : arr) {
            if (v % 2 == 0) evenCount++;
        }

        if (evenCount == 0) {
            System.out.println("Чётных элементов нет");
            return;
        }

        int[] even = new int[evenCount];
        int k = 0;
        for (int v : arr) {
            if (v % 2 == 0) {
                even[k] = v;
                k++;
            }
        }
        System.out.print("Чётные: ");
        for (int v : even) System.out.print(v + " ");
        System.out.println();
    }
}