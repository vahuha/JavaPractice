package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // дата получения задания
        Calendar received = Calendar.getInstance();
        received.set(2026, Calendar.OCTOBER, 20, 10, 40, 0);

        // дата сдачи задания — текущий момент
        Date submitted = new Date();

        System.out.println("Разработчик: Балакина");
        System.out.println("Задание получено: " + sdf.format(received.getTime()));
        System.out.println("Задание сдано:    " + sdf.format(submitted));
    }
}