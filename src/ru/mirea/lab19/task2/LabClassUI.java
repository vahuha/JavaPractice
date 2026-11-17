package ru.mirea.lab19.task2;

import java.util.Scanner;

// консольный интерфейс для сортировки и поиска студентов
public class LabClassUI {
    private LabClass labClass;
    private Scanner sc = new Scanner(System.in);

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void run() {
        while (true) {
            System.out.println();
            System.out.println("1 - добавить студента");
            System.out.println("2 - показать список");
            System.out.println("3 - сортировать по среднему баллу");
            System.out.println("4 - найти студента по ФИО");
            System.out.println("0 - выход");
            System.out.print("Выберите пункт: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    labClass.print();
                    break;
                case "3":
                    labClass.sortByGpa();
                    System.out.println("Отсортировано по убыванию балла:");
                    labClass.print();
                    break;
                case "4":
                    findStudent();
                    break;
                case "0":
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Нет такого пункта");
            }
        }
    }

    private void addStudent() {
        System.out.print("ФИО: ");
        String fio = sc.nextLine();
        System.out.print("Средний балл (через точку): ");
        String gpaText = sc.nextLine().trim();
        try {
            double gpa = Double.parseDouble(gpaText);
            labClass.add(new Student(fio, gpa));
            System.out.println("Студент добавлен");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: балл должен быть числом");
        } catch (EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private void findStudent() {
        System.out.print("ФИО для поиска: ");
        String fio = sc.nextLine();
        try {
            Student s = labClass.findByFio(fio);
            System.out.println("Найден: " + s);
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (EmptyStringException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}