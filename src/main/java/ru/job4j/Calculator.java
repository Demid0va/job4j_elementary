package ru.job4j.calculator;
public class Calculator {
    public static double manWeight(short height) {
        double rsl = (187 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height2) {
        double rsl = (170 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        short height2 = 170;
        double man = Calculator.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Calculator.womanWeight(height);
        System.out.println("Woman 170 is " + woman);
    }

}
