package ru.mirea.lab4;

public class SeasonTest {
    static void printLove(Season s) {
        switch (s) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        // 1) любимое время года и вся информация о нём
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature());
        System.out.println("Описание: " + favorite.getDescription());

        // 2) метод со switch
        printLove(favorite);

        // 6) все времена года в цикле
        System.out.println();
        for (Season s : Season.values()) {
            System.out.printf("%-7s %4d°C  %s%n", s, s.getAverageTemperature(), s.getDescription());
        }
    }
}