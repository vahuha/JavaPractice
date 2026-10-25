package ru.mirea.lab8;

import java.util.Scanner;

public class Task4 {
    // сколько способов заполнить оставшиеся digitsLeft цифр так,
    // чтобы их сумма была равна sumLeft (цифры от 0 до 9)
    public static int count(int digitsLeft, int sumLeft) {
        if (digitsLeft == 0) {
            return (sumLeft == 0) ? 1 : 0;     // базовый случай
        }
        int result = 0;
        for (int digit = 0; digit <= 9 && digit <= sumLeft; digit++) {
            result += count(digitsLeft - 1, sumLeft - digit);
        }
        return result;
    }

    // количество k-значных чисел с суммой цифр s
    public static int countNumbers(int k, int s) {
        int result = 0;
        for (int first = 1; first <= 9 && first <= s; first++) {
            result += count(k - 1, s - first);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("k = ");
        int k = sc.nextInt();
        System.out.print("s = ");
        int s = sc.nextInt();
        System.out.println("Количество чисел: " + countNumbers(k, s));
    }
}