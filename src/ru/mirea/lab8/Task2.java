package ru.mirea.lab8;

import java.util.Scanner;

public class Task2 {
    // выводит числа от 1 до n
    public static void printUpTo(int n) {
        if (n == 0) {          // базовый случай: печатать нечего
            return;
        }
        printUpTo(n - 1);      // сначала выводим числа от 1 до n-1
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        printUpTo(n);
        System.out.println();
    }
}