package ru.mirea.lab9.task1;

public class InsertionSortTest {
    // сортировка вставками по номеру студента
    public static void insertionSortById(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getIdNumber() > current.getIdNumber()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Student[] iDNumber = {
                new Student(17, "Иван", "Петров", "Прикладная информатика", 1, "КВБО-12-25", 4.2),
                new Student(3, "Анна", "Смирнова", "Прикладная информатика", 1, "КВБО-12-25", 4.8),
                new Student(25, "Олег", "Кузнецов", "Программная инженерия", 2, "ИКБО-05-24", 3.6),
                new Student(8, "Мария", "Волкова", "Программная инженерия", 2, "ИКБО-05-24", 4.5),
                new Student(12, "Денис", "Андреев", "Информатика", 3, "ИВБО-01-23", 3.9)
        };

        System.out.println("До сортировки:");
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }

        insertionSortById(iDNumber);

        System.out.println("\nПосле сортировки вставками по номеру:");
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}