package ru.mirea.lab17.task3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Group group = new Group();

        while (true) {
            System.out.println();
            System.out.println("1 - добавить студента");
            System.out.println("2 - удалить студента");
            System.out.println("3 - показать всех");
            System.out.println("4 - очистить список");
            System.out.println("5 - проверить на пустоту");
            System.out.println("0 - выход");
            System.out.print("Выберите пункт: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    Student s = new Student();
                    try {
                        s.read(sc);
                        group.add(s);
                        System.out.println("Студент добавлен");
                    } catch (NumberFormatException e) {
                        System.out.println("Возраст должен быть целым числом");
                    }
                    break;
                case "2":
                    System.out.print("Фамилия для удаления: ");
                    String surname = sc.nextLine().trim();
                    if (group.remove(surname)) {
                        System.out.println("Студент удален");
                    } else {
                        System.out.println("Студент не найден");
                    }
                    break;
                case "3":
                    group.print();
                    break;
                case "4":
                    group.clear();
                    System.out.println("Список очищен");
                    break;
                case "5":
                    if (group.isEmpty()) {
                        System.out.println("Список пуст");
                    } else {
                        System.out.println("Список не пуст");
                    }
                    break;
                case "0":
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Нет такого пункта");
            }
        }
    }
}