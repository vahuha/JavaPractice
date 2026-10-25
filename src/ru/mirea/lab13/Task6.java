package ru.mirea.lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Имя файла: ");
        String fileName = console.nextLine().trim();

        StringBuilder text = new StringBuilder();
        try {
            Scanner file = new Scanner(new File(fileName));
            while (file.hasNextLine()) {
                text.append(file.nextLine()).append(' ');
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            return;
        }

        String[] words = text.toString().trim().split("\\s+");
        System.out.println(getLine(words));
    }

    public static String getLine(String[] words) {
        if (words.length == 0) return "";

        String[] chain = new String[words.length];
        boolean[] used = new boolean[words.length];

        // пробуем начать с каждого слова
        for (int i = 0; i < words.length; i++) {
            chain[0] = words[i];
            used[i] = true;
            if (build(words, used, chain, 1)) {
                StringBuilder sb = new StringBuilder(chain[0]);
                for (int k = 1; k < chain.length; k++) {
                    sb.append(' ').append(chain[k]);
                }
                return sb.toString();
            }
            used[i] = false;
        }
        return "Цепочку составить нельзя";
    }

    private static boolean build(String[] words, boolean[] used, String[] chain, int pos) {
        if (pos == words.length) return true;

        String prev = chain[pos - 1];
        char last = Character.toLowerCase(prev.charAt(prev.length() - 1));

        for (int i = 0; i < words.length; i++) {
            if (!used[i] && Character.toLowerCase(words[i].charAt(0)) == last) {
                used[i] = true;
                chain[pos] = words[i];
                if (build(words, used, chain, pos + 1)) return true;
                used[i] = false;
            }
        }
        return false;
    }
}