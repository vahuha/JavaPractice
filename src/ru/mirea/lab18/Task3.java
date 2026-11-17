package ru.mirea.lab18;

import java.util.Scanner;

public class Task3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Перехвачено исключение: " + e);
        }
        // catch (NumberFormatException e) и catch (ArithmeticException e) после catch (Exception e)
        // не компилируются: эти исключения уже перехвачены общим обработчиком
    }

    public static void main(String[] args) {
        Task3 t = new Task3();
        t.exceptionDemo();
    }
}