package ru.mirea.lab1;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }
}