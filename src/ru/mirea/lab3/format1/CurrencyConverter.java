package ru.mirea.lab3.format1;

public class CurrencyConverter {
    private String[] codes = {"RUB", "USD", "EUR", "CNY"};
    // сколько рублей стоит 1 единица валюты
    private double[] rates = {1.0, 80.0, 93.0, 11.0};

    public int indexOf(String code) {
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equalsIgnoreCase(code)) return i;
        }
        return -1;
    }

    public double convert(double amount, String from, String to) {
        double inRub = amount * rates[indexOf(from)];
        return inRub / rates[indexOf(to)];
    }

    public void printRates() {
        System.out.println("Курсы к рублю:");
        for (int i = 0; i < codes.length; i++) {
            System.out.printf("%-5s %10.2f%n", codes[i], rates[i]);
        }
    }
}