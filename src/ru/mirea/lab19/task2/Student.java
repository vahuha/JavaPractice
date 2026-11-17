package ru.mirea.lab19.task2;

public class Student implements Comparable<Student> {
    private String fio;
    private double gpa;

    public Student(String fio, double gpa) {
        if (fio == null || fio.trim().isEmpty()) {
            throw new EmptyStringException("ФИО студента не может быть пустым");
        }
        this.fio = fio.trim();
        this.gpa = gpa;
    }

    public String getFio() { return fio; }
    public double getGpa() { return gpa; }

    // сравнение по среднему баллу в порядке убывания
    @Override
    public int compareTo(Student other) {
        if (this.gpa > other.gpa) return -1;
        if (this.gpa < other.gpa) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%-30s балл %.1f", fio, gpa);
    }
}