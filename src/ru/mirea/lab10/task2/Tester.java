package ru.mirea.lab10.task2;

import java.util.Comparator;
import ru.mirea.lab9.task1.Student;
import ru.mirea.lab9.task2.QuickSortTest;
import ru.mirea.lab9.task2.SortingStudentsByGPA;

public class Tester {
    private Student[] iDNumber;

    // 1) заполнение массива
    public void setArray() {
        iDNumber = new Student[] {
                new Student(17, "Иван", "Петров", "Прикладная информатика", 1, "КВБО-12-25", 4.2),
                new Student(3, "Анна", "Смирнова", "Прикладная информатика", 1, "КВБО-12-25", 4.8),
                new Student(25, "Олег", "Кузнецов", "Программная инженерия", 2, "ИКБО-05-24", 3.6),
                new Student(8, "Мария", "Волкова", "Программная инженерия", 2, "ИКБО-05-24", 4.5),
                new Student(12, "Денис", "Андреев", "Информатика", 3, "ИВБО-01-23", 3.9)
        };
    }

    // 2) быстрая сортировка
    public void quickSort(Comparator<Student> comparator) {
        QuickSortTest.quickSort(iDNumber, 0, iDNumber.length - 1, comparator);
    }

    // 2) сортировка слиянием
    public void mergeSort(Comparator<Student> comparator) {
        iDNumber = mergeSort(iDNumber, comparator);
    }

    private Student[] mergeSort(Student[] arr, Comparator<Student> comparator) {
        if (arr.length <= 1) return arr;
        int mid = arr.length / 2;
        Student[] left = new Student[mid];
        Student[] right = new Student[arr.length - mid];
        for (int i = 0; i < mid; i++) left[i] = arr[i];
        for (int i = mid; i < arr.length; i++) right[i - mid] = arr[i];
        return merge(mergeSort(left, comparator), mergeSort(right, comparator), comparator);
    }

    // слияние двух отсортированных массивов в один
    public static Student[] merge(Student[] a, Student[] b, Comparator<Student> comparator) {
        Student[] result = new Student[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (comparator.compare(a[i], b[j]) <= 0) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    // 3) вывод массива
    public void outArray() {
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Tester t = new Tester();

        t.setArray();
        System.out.println("Исходный массив:");
        t.outArray();

        t.quickSort(new SortingStudentsByGPA());
        System.out.println("Быстрая сортировка по баллу (по убыванию):");
        t.outArray();

        t.setArray();
        t.mergeSort(new SortingStudentsByGPA());
        System.out.println("Сортировка слиянием по баллу (по убыванию):");
        t.outArray();

        // 4) сортировка по другому полю — по фамилии
        t.setArray();
        t.quickSort(new SortingStudentsBySurname());
        System.out.println("Быстрая сортировка по фамилии:");
        t.outArray();
    }
}