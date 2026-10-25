package ru.mirea.lab9.task2;

import java.util.Comparator;
import ru.mirea.lab9.task1.Student;

// сравнение по среднему баллу в порядке убывания
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        if (a.getGpa() > b.getGpa()) return -1;
        if (a.getGpa() < b.getGpa()) return 1;
        return 0;
    }
}