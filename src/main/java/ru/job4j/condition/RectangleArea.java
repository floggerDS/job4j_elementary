package ru.job4j.condition;

/**
 * В этом задании необходимо вычислить площадь прямоугольника. Известны периметр и соотношение сторон прямоугольника.
 */
public class RectangleArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double l  = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = RectangleArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        result1 = RectangleArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
        result1 = RectangleArea.square(19, 7);
        System.out.println(" p = 19, k = 7, s = 9.81, real = " + result1);
    }
}
