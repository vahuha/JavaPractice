package ru.mirea.lab13.task3;

public class AddressTest {
    public static void main(String[] args) {
        String[] commaAddresses = {
                "Россия, Москва, Москва, Вернадского, 78, 1, 15",
                "Россия,  Московская область , Химки, Ленина, 5, 2, 40",
                "Беларусь, Минская область, Минск, Независимости, 12, 3, 7",
                "Казахстан, Алматинская область, Алматы, Абая, 101, 1, 230"
        };
        String[] mixedAddresses = {
                "Россия; Москва; Москва; Стромынка. 20. 1. 8",
                "Россия, Тверская область; Тверь. Советская, 3; 1. 12",
                "Беларусь. Гомельская область, Гомель; Мира, 7. 2, 55",
                "Казахстан; Акмолинская область. Астана, Кенесары; 40, 1. 9"
        };

        System.out.println("=== Разделитель — запятая (split) ===");
        for (int i = 0; i < commaAddresses.length; i++) {
            System.out.println(Address.parseBySplit(commaAddresses[i]));
        }

        System.out.println("=== Разделители , . ; (StringTokenizer) ===");
        for (int i = 0; i < mixedAddresses.length; i++) {
            System.out.println(Address.parseByTokenizer(mixedAddresses[i]));
        }
    }
}