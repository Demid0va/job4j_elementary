package ru.job4j;

public class converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }
    public static float rubleToEuro2(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = 1; 
        return rsl;
    }

    public static void main(String[] args) {
        float euro = converter.rubleToEuro(70);
        float dollar = converter.rubleToDollar(60);
        System.out.println("60 rubles are " + euro + " euro.");
        System.out.println("70 rubles are " + dollar + " dollar.");
    }
}