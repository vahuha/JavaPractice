package ru.mirea.lab9.task3;

import java.util.Comparator;
import ru.mirea.lab9.task1.Student;

// односвязный список студентов
public class StudentList {
    private Node head;

    public StudentList() {
        head = null;
    }

    // добавление в конец
    public void add(Student s) {
        Node node = new Node(s);
        if (head == null) {
            head = node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    // объединение двух списков в новый список
    public static StudentList join(StudentList a, StudentList b) {
        StudentList result = new StudentList();
        Node current = a.head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }
        current = b.head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }
        return result;
    }

    // сортировка слиянием всего списка
    public void mergeSort(Comparator<Student> comparator) {
        head = mergeSort(head, comparator);
    }

    // 1) делим список пополам, 2) сортируем половины рекурсивно, 3) сливаем
    private Node mergeSort(Node start, Comparator<Student> comparator) {
        if (start == null || start.next == null) {
            return start;
        }
        int size = 0;
        Node current = start;
        while (current != null) {
            size++;
            current = current.next;
        }
        Node middle = start;
        for (int i = 0; i < size / 2 - 1; i++) {
            middle = middle.next;
        }
        Node second = middle.next;
        middle.next = null;

        Node left = mergeSort(start, comparator);
        Node right = mergeSort(second, comparator);
        return merge(left, right, comparator);
    }

    // слияние двух отсортированных цепочек: каждый раз берем меньший из двух первых
    private Node merge(Node a, Node b, Comparator<Student> comparator) {
        Node first = null;
        Node last = null;
        while (a != null && b != null) {
            Node smaller;
            if (comparator.compare(a.data, b.data) <= 0) {
                smaller = a;
                a = a.next;
            } else {
                smaller = b;
                b = b.next;
            }
            if (first == null) {
                first = smaller;
            } else {
                last.next = smaller;
            }
            last = smaller;
        }
        Node rest;
        if (a != null) {
            rest = a;
        } else {
            rest = b;
        }
        if (first == null) {
            return rest;
        }
        last.next = rest;
        return first;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}