package ru.mirea.lab10;

import ru.mirea.lab10.task2.Tester;
import ru.mirea.lab9.task1.Student;
import ru.mirea.lab9.task2.SortingStudentsByGPA;

public class Task3 {
    public static void main(String[] args) {
        Student[] group1 = {
                new Student(3, "Анна", "Смирнова", "Прикладная информатика", 1, "КВБО-12-25", 4.8),
                new Student(17, "Иван", "Петров", "Прикладная информатика", 1, "КВБО-12-25", 4.2),
                new Student(30, "Кирилл", "Орлов", "Прикладная информатика", 1, "КВБО-12-25", 3.4)
        };
        Student[] group2 = {
                new Student(8, "Мария", "Волкова", "Программная инженерия", 2, "ИКБО-05-24", 4.5),
                new Student(12, "Денис", "Андреев", "Информатика", 3, "ИВБО-01-23", 3.9),
                new Student(25, "Олег", "Кузнецов", "Программная инженерия", 2, "ИКБО-05-24", 3.6)
        };

        Student[] all = Tester.merge(group1, group2, new SortingStudentsByGPA());

        System.out.println("Общий отсортированный список:");
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}