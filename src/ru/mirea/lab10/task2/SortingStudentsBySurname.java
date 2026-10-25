package ru.mirea.lab10.task2;

import java.util.Comparator;
import ru.mirea.lab9.task1.Student;

public class SortingStudentsBySurname implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getSurname().compareTo(b.getSurname());
    }
}