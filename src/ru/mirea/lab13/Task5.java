package ru.mirea.lab13;

public class Task5 {
    // +<код страны><3 цифры>-<3 цифры>-<4 цифры>
    public static String format(String phone) {
        String country;
        String number;   // последние 10 цифр

        if (phone.startsWith("+")) {
            country = phone.substring(1, phone.length() - 10);
            number = phone.substring(phone.length() - 10);
        } else if (phone.startsWith("8") && phone.length() == 11) {
            country = "7";
            number = phone.substring(1);
        } else {
            return "Неверный формат: " + phone;
        }

        StringBuilder sb = new StringBuilder();
        sb.append('+').append(country)
                .append(number.substring(0, 3)).append('-')
                .append(number.substring(3, 6)).append('-')
                .append(number.substring(6));
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] phones = {"+79175655655", "+104289652211", "89175655655"};
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i] + " -> " + format(phones[i]));
        }
    }
}