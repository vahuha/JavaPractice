package ru.mirea.lab17.task2;

// двухсвязный список студентов
public class Group {
    private Student head;
    private Student tail;

    public Group() {
        head = null;
        tail = null;
    }

    // добавление в конец через tail
    public void add(Student s) {
        s.next = null;
        s.prev = tail;
        if (head == null) {
            head = s;
        } else {
            tail.next = s;
        }
        tail = s;
    }

    // удаление по фамилии
    public boolean remove(String surname) {
        Student current = head;
        while (current != null) {
            if (current.getSurname().equals(surname)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev.next = current.next;
                }
                if (current.next == null) {
                    tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // вывод от начала к концу
    public void print() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        int number = 1;
        Student current = head;
        while (current != null) {
            System.out.print(number + ". ");
            current.print();
            current = current.next;
            number++;
        }
    }

    // вывод от конца к началу
    public void printBackward() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        Student current = tail;
        while (current != null) {
            current.print();
            current = current.prev;
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}