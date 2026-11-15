package ru.mirea.lab17.task1;

// односвязный список студентов
public class Group {
    private Student head;

    // создание пустого списка
    public Group() {
        head = null;
    }

    // добавление в конец
    public void add(Student s) {
        s.next = null;
        if (head == null) {
            head = s;
            return;
        }
        Student current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = s;
    }

    // удаление по фамилии
    public boolean remove(String surname) {
        if (head == null) {
            return false;
        }
        if (head.getSurname().equals(surname)) {
            head = head.next;
            return true;
        }
        Student current = head;
        while (current.next != null) {
            if (current.next.getSurname().equals(surname)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // вывод списка
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

    // очистка
    public void clear() {
        head = null;
    }

    // проверка на пустоту
    public boolean isEmpty() {
        return head == null;
    }
}