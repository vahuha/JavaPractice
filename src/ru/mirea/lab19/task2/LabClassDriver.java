package ru.mirea.lab19.task2;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        labClass.add(new Student("Петров Иван Сергеевич", 4.2));
        labClass.add(new Student("Смирнова Анна Олеговна", 4.8));
        labClass.add(new Student("Кузнецов Олег Петрович", 3.6));
        labClass.add(new Student("Волкова Мария Игоревна", 4.5));

        LabClassUI ui = new LabClassUI(labClass);
        ui.run();
    }
}