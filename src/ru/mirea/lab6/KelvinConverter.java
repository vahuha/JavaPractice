package ru.mirea.lab6;

public class KelvinConverter implements Convertable {
    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public String getUnit() {
        return "K";
    }
}