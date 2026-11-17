package ru.mirea.lab19.task2;

// непроверяемое пользовательское исключение: пустая строка
public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(message);
    }
}