package ru.mirea.lab18;

import java.util.Scanner;

public class Task4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: \"" + intString + "\" не является целым числом");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } finally {
            System.out.println("Блок finally выполнен");
        }
    }

    public static void main(String[] args) {
        Task4 t = new Task4();
        t.exceptionDemo();
    }
}