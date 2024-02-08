package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wensday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Птяница", "Friday" -> 5;
            case "Суббота", "Satturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }
}
