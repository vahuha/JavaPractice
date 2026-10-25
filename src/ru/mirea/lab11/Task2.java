package ru.mirea.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        sdf.setLenient(false);

        System.out.print("Введите дату и время (дд.мм.гггг чч:мм): ");
        String input = sc.nextLine().trim();

        Date userDate;
        try {
            userDate = sdf.parse(input);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
            return;
        }

        Date now = new Date();
        System.out.println("Текущая дата: " + sdf.format(now));
        System.out.println("Ваша дата:    " + sdf.format(userDate));

        if (userDate.before(now)) {
            System.out.println("Введённая дата раньше текущей");
        } else if (userDate.after(now)) {
            System.out.println("Введённая дата позже текущей");
        } else {
            System.out.println("Даты совпадают");
        }
    }
}