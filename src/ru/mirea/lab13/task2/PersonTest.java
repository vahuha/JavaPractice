package ru.mirea.lab13.task2;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Смирнова", "Анна", "Сергеевна");
        Person p2 = new Person("Иванов", "Пётр", null);
        Person p3 = new Person("Сидоров", "", "");

        System.out.println(p1.getShortName());
        System.out.println(p2.getShortName());
        System.out.println(p3.getShortName());
    }
}