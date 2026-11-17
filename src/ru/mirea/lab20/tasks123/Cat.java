package ru.mirea.lab20.tasks123;

import java.io.Serializable;

// наследник Animal, реализующий Serializable: подходит для параметра V
public class Cat extends Animal implements Serializable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cat " + getName();
    }
}