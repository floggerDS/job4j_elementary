package ru.job4j.condition;

/**
 * В этом задании нам нужно будет написать формулу вычисления площади треугольника.
 *
 * Площадь треугольника вычисляется по формуле Герона. p - полупериметр (вычисляется как сумма всех сторон, деленная на 2.)
 */

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TriangleArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
