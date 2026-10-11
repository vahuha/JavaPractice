package ru.mirea.lab3.format1;

import java.util.Scanner;

public class CurrencyTest {
    public static void main(String[] args) {
        CurrencyConverter conv = new CurrencyConverter();
        Scanner sc = new Scanner(System.in);
        conv.printRates();

        System.out.print("Сумма: ");
        double amount = Double.parseDouble(sc.nextLine());
        System.out.print("Из валюты (RUB, USD, EUR, CNY): ");
        String from = sc.nextLine().trim();
        System.out.print("В валюту: ");
        String to = sc.nextLine().trim();

        if (conv.indexOf(from) == -1 || conv.indexOf(to) == -1) {
            System.out.println("Неизвестная валюта");
            return;
        }

        double result = conv.convert(amount, from, to);
        System.out.printf("%.2f %s = %.2f %s%n", amount, from.toUpperCase(), result, to.toUpperCase());
    }
}