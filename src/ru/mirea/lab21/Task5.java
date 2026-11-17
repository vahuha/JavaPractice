package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Task5 {
    public static <T> ArrayList<T> newArrayList(T[] elements) {
        ArrayList<T> list = new ArrayList<T>();
        for (T e : elements) {
            list.add(e);
        }
        return list;
    }

    public static <T> HashSet<T> newHashSet(T[] elements) {
        HashSet<T> set = new HashSet<T>();
        for (T e : elements) {
            set.add(e);
        }
        return set;
    }

    // ключи и значения могут быть типа K и V или любых их подтипов
    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Количество ключей и значений не совпадает");
        }
        HashMap<K, V> map = new HashMap<K, V>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }

    public static void main(String[] args) {
        String[] words = {"a", "b", "a", "c", "b"};
        ArrayList<String> list = newArrayList(words);
        HashSet<String> set = newHashSet(words);
        System.out.println("ArrayList: " + list);
        System.out.println("HashSet:   " + set);

        ArrayList<String> keys = newArrayList(new String[] {"one", "two", "three"});
        ArrayList<Integer> values = newArrayList(new Integer[] {1, 2, 3});
        HashMap<String, Number> map = newHashMap(keys, values);
        System.out.println("HashMap:   " + map);

        ArrayList<Integer> shortValues = newArrayList(new Integer[] {1});
        try {
            newHashMap(keys, shortValues);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}