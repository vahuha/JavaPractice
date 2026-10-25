package ru.mirea.lab13.task4;

public class Shirt {
    private String id;
    private String description;
    private String color;
    private String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    // создание объекта из строки вида "S001,Black Polo Shirt,Black,XL"
    public static Shirt fromString(String line) {
        String[] parts = line.split(",");
        return new Shirt(parts[0], parts[1], parts[2], parts[3]);
    }

    @Override
    public String toString() {
        return "Код: " + id + "\n"
                + "Описание: " + description + "\n"
                + "Цвет: " + color + "\n"
                + "Размер: " + size + "\n";
    }
}