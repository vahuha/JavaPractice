package ru.mirea.lab19.task1;

// проверяемое пользовательское исключение: недействительный ИНН
public class InvalidInnException extends Exception {
    public InvalidInnException(String message) {
        super(message);
    }
}