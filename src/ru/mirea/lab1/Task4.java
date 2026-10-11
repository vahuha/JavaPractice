package ru.mirea.lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Размер должен быть больше нуля");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int sumWhile = 0;
        int i = 0;
        while (i < n) {
            sumWhile += arr[i];
            i++;
        }

        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += arr[j];
            j++;
        } while (j < n);

        int min = arr[0];
        int max = arr[0];
        for (int k = 1; k < n; k++) {
            if (arr[k] < min) min = arr[k];
            if (arr[k] > max) max = arr[k];
        }

        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}