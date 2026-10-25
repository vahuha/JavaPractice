package ru.mirea.lab11.task3;

import java.util.Calendar;

public class StudentTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2007, Calendar.MARCH, 15);

        Student s = new Student("Иван", "Иванов", cal.getTime());

        System.out.println(s);
        System.out.println("Короткий формат: " + s.getBirthDate("short"));
        System.out.println("Средний формат:  " + s.getBirthDate("medium"));
        System.out.println("Полный формат:   " + s.getBirthDate("full"));
    }
}