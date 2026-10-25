package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Год: ");
        int year = sc.nextInt();
        System.out.print("Месяц (1-12): ");
        int month = sc.nextInt();
        System.out.print("Число: ");
        int day = sc.nextInt();
        System.out.print("Часы: ");
        int hours = sc.nextInt();
        System.out.print("Минуты: ");
        int minutes = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day, hours, minutes, 0);   // месяцы в Calendar с 0

        Date date = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("Объект Date:     " + sdf.format(date));
        System.out.printf("Объект Calendar: %02d.%02d.%d %02d:%02d%n",
                cal.get(Calendar.DAY_OF_MONTH), cal.get(Calendar.MONTH) + 1,
                cal.get(Calendar.YEAR), cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));
    }
}