package ru.mirea.lab6;

import java.util.Scanner;

public class TemperatureTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Температура в °C: ");
        double celsius = sc.nextDouble();

        Convertable[] converters = {new KelvinConverter(), new FahrenheitConverter()};
        for (Convertable c : converters) {
            System.out.printf("%.2f °C = %.2f %s%n", celsius, c.convert(celsius), c.getUnit());
        }
    }
}