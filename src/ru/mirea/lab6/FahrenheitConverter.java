package ru.mirea.lab6;

public class FahrenheitConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    @Override
    public String getUnit() {
        return "°F";
    }
}