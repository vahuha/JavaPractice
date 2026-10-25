package ru.mirea.lab11.task3;

import java.text.DateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private Date birthDate;

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    // дата рождения в заданном формате
    public String getBirthDate(String format) {
        int style;
        if (format.equals("short")) {
            style = DateFormat.SHORT;
        } else if (format.equals("full")) {
            style = DateFormat.FULL;
        } else {
            style = DateFormat.MEDIUM;
        }
        return DateFormat.getDateInstance(style).format(birthDate);
    }

    @Override
    public String toString() {
        return surname + " " + name + ", дата рождения: " + getBirthDate("medium");
    }
}