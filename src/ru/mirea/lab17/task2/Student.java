package ru.mirea.lab17.task2;

import java.util.Scanner;

// узел двухсвязного списка: данные + ссылки на предыдущий и следующий
public class Student {
    private String surname;
    private String name;
    private int age;
    Student prev;
    Student next;

    public String getSurname() { return surname; }

    public void read(Scanner sc) {
        System.out.print("Фамилия: ");
        surname = sc.nextLine().trim();
        System.out.print("Имя: ");
        name = sc.nextLine().trim();
        System.out.print("Возраст: ");
        age = Integer.parseInt(sc.nextLine().trim());
    }

    public void print() {
        System.out.println(surname + " " + name + ", возраст " + age);
    }
}