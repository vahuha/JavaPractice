package ru.mirea.lab14;

import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String regex = "abcdefghijklmnopqrstuv18340";
        String[] tests = {"abcdefghijklmnopqrstuv18340", "abcdefghijklmnoasdfasdpqrstuv18340"};

        for (int i = 0; i < tests.length; i++) {
            boolean ok = Pattern.matches(regex, tests[i]);
            System.out.println(tests[i] + " -> " + (ok ? "подходит" : "не подходит"));
        }
    }
}