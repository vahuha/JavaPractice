package ru.mirea.lab8;

import java.util.Scanner;

public class Task3 {
    // выводит числа от a до b: по возрастанию, если a < b, иначе по убыванию
    public static void printRange(int a, int b) {
        System.out.print(a + " ");
        if (a == b) {          // базовый случай: дошли до b
            return;
        }
        if (a < b) {
            printRange(a + 1, b);
        } else {
            printRange(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        printRange(a, b);
        System.out.println();
    }
}