package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task6 {
    static final Pattern EMAIL =
            Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*");

    public static boolean isEmail(String s) {
        return EMAIL.matcher(s).matches();
    }

    public static void main(String[] args) {
        String[] tests = {"user@example.com", "root@localhost",
                "myhost@@@com.ru", "@my.ru", "Julia String"};

        for (int i = 0; i < tests.length; i++) {
            System.out.println(tests[i] + " -> " + (isEmail(tests[i]) ? "корректный" : "некорректный"));
        }
    }
}