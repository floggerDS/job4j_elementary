package ru.job4j.array;

/**
 * Объявление массива
 */
public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];
        names[0] = "Ivan Safronov";
        names[1] = "Mikhail Ivanov";
        names[2] = "Sergei Sergeev";
        names[3] = "Mikhail Lukin";

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
