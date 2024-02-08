package ru.job4j.condition;

public class Triangle {
    public static boolean whenExist(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

    public static boolean  whenNotExist(double ab, double ac, double bc) {
        return !((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }
}
