package ru.mirea.lab9.task2;

import java.util.Comparator;
import ru.mirea.lab9.task1.Student;

public class QuickSortTest {
    // быстрая сортировка участка массива от low до high с помощью компаратора
    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> comparator) {
        if (low >= high) return;
        Student pivot = arr[(low + high) / 2];
        int i = low;
        int j = high;
        while (i <= j) {
            while (comparator.compare(arr[i], pivot) < 0) i++;
            while (comparator.compare(arr[j], pivot) > 0) j--;
            if (i <= j) {
                Student tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        quickSort(arr, low, j, comparator);
        quickSort(arr, i, high, comparator);
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(17, "Иван", "Петров", "Прикладная информатика", 1, "КВБО-12-25", 4.2),
                new Student(3, "Анна", "Смирнова", "Прикладная информатика", 1, "КВБО-12-25", 4.8),
                new Student(25, "Олег", "Кузнецов", "Программная инженерия", 2, "ИКБО-05-24", 3.6),
                new Student(8, "Мария", "Волкова", "Программная инженерия", 2, "ИКБО-05-24", 4.5),
                new Student(12, "Денис", "Андреев", "Информатика", 3, "ИВБО-01-23", 3.9)
        };

        quickSort(students, 0, students.length - 1, new SortingStudentsByGPA());

        System.out.println("Быстрая сортировка по баллу (по убыванию):");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}