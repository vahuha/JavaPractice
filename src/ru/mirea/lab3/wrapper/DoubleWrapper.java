package ru.mirea.lab3.wrapper;

public class DoubleWrapper {
    public static void main(String[] args) {
        // 1. объекты Double через valueOf
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf("2.71");
        System.out.println("d1 = " + d1 + ", d2 = " + d2);

        // 2. String в double
        double p = Double.parseDouble("15.5");
        System.out.println("parseDouble: " + p);

        // 3. Double в примитивные типы
        byte b = d1.byteValue();
        short s = d1.shortValue();
        int i = d1.intValue();
        long l = d1.longValue();
        float f = d1.floatValue();
        double d = d1.doubleValue();
        System.out.println("byte: " + b + ", short: " + s + ", int: " + i);
        System.out.println("long: " + l + ", float: " + f + ", double: " + d);

        // 4. вывод объекта
        System.out.println("Объект Double: " + d1);

        // 5. double в String
        String str = Double.toString(3.14);
        System.out.println("Строка: " + str);
    }
}