package ru.job4j.converter;

/**
 * перевод рублей в валюту
 */
public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static boolean testResultRubleToDollar(int in, int expected) {
        return Converter.rubleToDollar(in) == expected;
    }

    public static boolean testResultRubleToEuro(int in, int expected) {
        return Converter.rubleToDollar(in) == expected;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");

        System.out.println(testResultRubleToDollar(140, 2));
        System.out.println(testResultRubleToEuro(180, 3));
    }
}
