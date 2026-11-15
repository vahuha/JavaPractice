package ru.mirea.lab9.task3;

import ru.mirea.lab9.task1.Student;

// узел списка: студент + ссылка на следующий узел
public class Node {
    Student data;
    Node next;

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }
}