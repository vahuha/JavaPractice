package ru.mirea.lab13.task3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    // а) разделитель — только запятая, метод split()
    public static Address parseBySplit(String s) {
        String[] parts = s.split(",");
        Address a = new Address();
        a.country = parts[0].trim();
        a.region = parts[1].trim();
        a.city = parts[2].trim();
        a.street = parts[3].trim();
        a.house = parts[4].trim();
        a.building = parts[5].trim();
        a.apartment = parts[6].trim();
        return a;
    }

    // б) разделитель — любой из символов , . ; — класс StringTokenizer
    public static Address parseByTokenizer(String s) {
        StringTokenizer st = new StringTokenizer(s, ",.;");
        Address a = new Address();
        a.country = st.nextToken().trim();
        a.region = st.nextToken().trim();
        a.city = st.nextToken().trim();
        a.street = st.nextToken().trim();
        a.house = st.nextToken().trim();
        a.building = st.nextToken().trim();
        a.apartment = st.nextToken().trim();
        return a;
    }

    @Override
    public String toString() {
        return "Страна: " + country + "\n"
                + "Регион: " + region + "\n"
                + "Город: " + city + "\n"
                + "Улица: " + street + "\n"
                + "Дом: " + house + "\n"
                + "Корпус: " + building + "\n"
                + "Квартира: " + apartment + "\n";
    }
}