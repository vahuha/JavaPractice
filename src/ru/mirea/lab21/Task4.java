package ru.mirea.lab21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    // сохранение содержимого каталога в список
    public static List<String> listDirectory(String path) {
        File dir = new File(path);
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("Это не каталог: " + path);
        }
        String[] names = dir.list();
        List<String> result = new ArrayList<String>();
        if (names != null) {
            for (String name : names) {
                result.add(name);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Путь к каталогу (Enter - текущий каталог): ");
        String path = sc.nextLine().trim();
        if (path.isEmpty()) {
            path = ".";
        }
        try {
            List<String> files = listDirectory(path);
            System.out.println("Всего элементов: " + files.size());
            for (int i = 0; i < 5 && i < files.size(); i++) {
                System.out.println((i + 1) + ". " + files.get(i));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}