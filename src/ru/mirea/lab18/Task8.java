package ru.mirea.lab18;

import java.util.Scanner;

public class Task8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ключ: ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
                return;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage() + ". Попробуйте еще раз");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Task8 t = new Task8();
        t.getKey();
    }
}