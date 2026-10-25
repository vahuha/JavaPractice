package ru.mirea.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU, 1500 RUB, 12.50 EU, 7 USD.";

        // (?<![\d.])  — перед числом не должно быть цифры или точки
        // \d+         — целая часть
        // (\.\d{2})?  — необязательная дробная часть ровно из 2 цифр
        // \s          — пробел
        // (USD|RUB|EU) — валюта
        // \b          — после валюты конец слова
        Pattern p = Pattern.compile("(?<![\\d.])\\d+(\\.\\d{2})?\\s(USD|RUB|EU)\\b");
        Matcher m = p.matcher(text);

        System.out.println("Текст: " + text);
        System.out.println("Найденные цены:");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}