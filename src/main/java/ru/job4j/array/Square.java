package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int i = 0; i < result.length; i++) {
            result[i] = i * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = calculate(5);
        for (int val : array) {
            System.out.println(val);
        }
    }
}
