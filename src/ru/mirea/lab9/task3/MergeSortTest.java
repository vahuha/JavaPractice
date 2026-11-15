package ru.mirea.lab9.task3;

import ru.mirea.lab9.task1.Student;
import ru.mirea.lab9.task2.SortingStudentsByGPA;

public class MergeSortTest {
    public static void main(String[] args) {
        StudentList list1 = new StudentList();
        list1.add(new Student(17, "Иван", "Петров", "Прикладная информатика", 1, "КВБО-12-25", 4.2));
        list1.add(new Student(3, "Анна", "Смирнова", "Прикладная информатика", 1, "КВБО-12-25", 4.8));
        list1.add(new Student(21, "Павел", "Орлов", "Прикладная информатика", 1, "КВБО-12-25", 3.4));

        StudentList list2 = new StudentList();
        list2.add(new Student(25, "Олег", "Кузнецов", "Программная инженерия", 2, "ИКБО-05-24", 3.6));
        list2.add(new Student(8, "Мария", "Волкова", "Программная инженерия", 2, "ИКБО-05-24", 4.5));
        list2.add(new Student(12, "Денис", "Андреев", "Программная инженерия", 2, "ИКБО-05-24", 3.9));

        System.out.println("Первый список:");
        list1.print();
        System.out.println("\nВторой список:");
        list2.print();

        StudentList all = StudentList.join(list1, list2);
        all.mergeSort(new SortingStudentsByGPA());

        System.out.println("\nОбщий список, отсортированный слиянием по баллу:");
        all.print();
    }
}