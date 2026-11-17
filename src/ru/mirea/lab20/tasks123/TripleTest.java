package ru.mirea.lab20.tasks123;

public class TripleTest {
    public static void main(String[] args) {
        Triple<String, Cat, Integer> t1 = new Triple<String, Cat, Integer>("Hello", new Cat("Барсик"), 42);
        System.out.println(t1.getFirst() + ", " + t1.getSecond() + ", " + t1.getThird());
        t1.printClassNames();

        System.out.println();

        Triple<Double, Cat, Long> t2 = new Triple<Double, Cat, Long>(3.14, new Cat("Мурка"), 100L);
        System.out.println(t2.getFirst() + ", " + t2.getSecond() + ", " + t2.getThird());
        t2.printClassNames();
    }
}