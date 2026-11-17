package ru.mirea.lab20.tasks123;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Animal " + name;
    }
}