package ru.mirea.lab17.task1;

import java.util.Scanner;

// узел списка: данные студента + ссылка на следующий узел
public class Student {
    private String surname;
    private String name;
    private int age;
    Student next;

    public String getSurname() { return surname; }

    // считать поля с консоли
    public void read(Scanner sc) {
        System.out.print("Фамилия: ");
        surname = sc.nextLine().trim();
        System.out.print("Имя: ");
        name = sc.nextLine().trim();
        System.out.print("Возраст: ");
        age = Integer.parseInt(sc.nextLine().trim());
    }

    // вывести поля на экран
    public void print() {
        System.out.println(surname + " " + name + ", возраст " + age);
    }
}