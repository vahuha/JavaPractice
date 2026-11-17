package ru.mirea.lab19.task1;

import java.util.Scanner;

public class OnlinePurchase {
    // проверка ИНН физического лица: 12 цифр и две контрольные цифры
    public static void checkInn(String inn) throws InvalidInnException {
        if (!inn.matches("\\d{12}")) {
            throw new InvalidInnException("ИНН должен состоять из 12 цифр: " + inn);
        }
        int[] digits = new int[12];
        for (int i = 0; i < 12; i++) {
            digits[i] = inn.charAt(i) - '0';
        }
        int[] k11 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] k12 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum11 = 0;
        for (int i = 0; i < k11.length; i++) {
            sum11 += k11[i] * digits[i];
        }
        int sum12 = 0;
        for (int i = 0; i < k12.length; i++) {
            sum12 += k12[i] * digits[i];
        }
        if (sum11 % 11 % 10 != digits[10] || sum12 % 11 % 10 != digits[11]) {
            throw new InvalidInnException("Неверные контрольные цифры ИНН: " + inn);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ФИО: ");
        String fio = sc.nextLine().trim();
        System.out.print("ИНН: ");
        String inn = sc.nextLine().trim();
        try {
            checkInn(inn);
            System.out.println("Заказ оформлен. Покупатель: " + fio + ", ИНН " + inn);
        } catch (InvalidInnException e) {
            System.out.println("Заказ не оформлен. " + e.getMessage());
        }
    }
}