package ru.mirea.lab20.task4;

// поиск минимального и максимального элемента массива любого сравнимого типа
public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) < 0) {
                result = array[i];
            }
        }
        return result;
    }

    public T max() {
        T result = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(result) > 0) {
                result = array[i];
            }
        }
        return result;
    }
}