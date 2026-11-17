package ru.mirea.lab19.task2;

// группа студентов: хранение, сортировка и поиск
public class LabClass {
    private Student[] students = new Student[100];
    private int count = 0;

    public void add(Student s) {
        if (count == students.length) {
            System.out.println("Группа заполнена");
            return;
        }
        students[count] = s;
        count++;
    }

    // сортировка вставками массива ссылок на объекты, реализующие Comparable
    public static <T extends Comparable<T>> void sort(T[] arr, int n) {
        for (int i = 1; i < n; i++) {
            T current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(current) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public void sortByGpa() {
        sort(students, count);
    }

    public Student findByFio(String fio) throws StudentNotFoundException {
        if (fio == null || fio.trim().isEmpty()) {
            throw new EmptyStringException("Строка поиска пуста");
        }
        for (int i = 0; i < count; i++) {
            if (students[i].getFio().equalsIgnoreCase(fio.trim())) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Студент \"" + fio.trim() + "\" не найден");
    }

    public void print() {
        if (count == 0) {
            System.out.println("Список пуст");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
    }
}