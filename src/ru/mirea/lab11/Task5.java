package ru.mirea.lab11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {
    static final int N = 20000;

    static void fill(List<Integer> list) {
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
    }

    static void test(String title, List<Integer> list) {
        long start, time;

        // добавление в конец
        start = System.nanoTime();
        fill(list);
        time = System.nanoTime() - start;
        System.out.printf("%-11s добавление в конец:  %8.2f мс%n", title, time / 1e6);

        // вставка в начало
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(0, i);
        }
        time = System.nanoTime() - start;
        System.out.printf("%-11s вставка в начало:    %8.2f мс%n", title, time / 1e6);

        // поиск по образцу
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            list.indexOf(N - 1);
        }
        time = System.nanoTime() - start;
        System.out.printf("%-11s поиск по образцу:    %8.2f мс%n", title, time / 1e6);

        // доступ по индексу
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.get(i);
        }
        time = System.nanoTime() - start;
        System.out.printf("%-11s доступ по индексу:   %8.2f мс%n", title, time / 1e6);

        // удаление из начала
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.remove(0);
        }
        time = System.nanoTime() - start;
        System.out.printf("%-11s удаление из начала:  %8.2f мс%n%n", title, time / 1e6);
    }

    public static void main(String[] args) {
        test("ArrayList", new ArrayList<Integer>());
        test("LinkedList", new LinkedList<Integer>());
    }
}