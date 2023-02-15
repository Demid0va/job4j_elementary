package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = ru.job4j.Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euro. Test result: " + passed);
        in = 180;
        expected = 3;
        out = ru.job4j.Converter.rubleToDollar(out);
        passed = expected == out;
        System.out.println("180 rubles are 3 Dollar. Test result: " + out);
    }
}