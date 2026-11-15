package ru.mirea.lab17.task3;

// кольцевой односвязный список: последний узел ссылается на первый
public class Group {
    private Student head;

    public Group() {
        head = null;
    }

    // поиск последнего узла (того, чей next указывает на head)
    private Student getLast() {
        Student current = head;
        while (current.next != head) {
            current = current.next;
        }
        return current;
    }

    // добавление в конец
    public void add(Student s) {
        if (head == null) {
            head = s;
            s.next = head;
            return;
        }
        Student last = getLast();
        last.next = s;
        s.next = head;
    }

    // удаление по фамилии
    public boolean remove(String surname) {
        if (head == null) {
            return false;
        }
        if (head.getSurname().equals(surname)) {
            if (head.next == head) {
                head = null;
            } else {
                Student last = getLast();
                head = head.next;
                last.next = head;
            }
            return true;
        }
        Student current = head;
        while (current.next != head) {
            if (current.next.getSurname().equals(surname)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // вывод: идем, пока снова не вернемся к head
    public void print() {
        if (isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        System.out.print("1. ");
        head.print();
        int number = 2;
        Student current = head.next;
        while (current != head) {
            System.out.print(number + ". ");
            current.print();
            current = current.next;
            number++;
        }
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}