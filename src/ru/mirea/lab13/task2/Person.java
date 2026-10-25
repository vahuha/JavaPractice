package ru.mirea.lab13.task2;

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getShortName() {
        StringBuilder sb = new StringBuilder(surname);
        if (name != null && !name.isEmpty()) {
            sb.append(' ').append(name.charAt(0)).append('.');
            if (patronymic != null && !patronymic.isEmpty()) {
                sb.append(patronymic.charAt(0)).append('.');
            }
        }
        return sb.toString();
    }
}