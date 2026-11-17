package ru.mirea.lab20.tasks123;

import java.io.Serializable;

// обобщенный класс с тремя параметрами типа и ограничениями
public class Triple<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T first;
    private V second;
    private K third;

    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() { return first; }
    public V getSecond() { return second; }
    public K getThird() { return third; }

    // вывод имен классов трех переменных
    public void printClassNames() {
        System.out.println("T: " + first.getClass().getName());
        System.out.println("V: " + second.getClass().getName());
        System.out.println("K: " + third.getClass().getName());
    }
}