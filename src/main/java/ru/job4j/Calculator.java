package ru.job4j;

public class Calculator {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        short height2 = 170;
        double man = Calculator.manWeight(height);
        System.out.println(man);
        double woman = Calculator.womanWeight(height);
        System.out.println(woman);
    }
}
