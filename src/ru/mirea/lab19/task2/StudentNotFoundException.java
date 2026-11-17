package ru.mirea.lab19.task2;

// проверяемое пользовательское исключение: студент не найден
public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}