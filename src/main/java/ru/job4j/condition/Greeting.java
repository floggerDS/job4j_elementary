package ru.job4j.condition;
/**
 * использование String и конкатенации
 * */
public class Greeting {
    public static void main(String[] args) {
        String idea = "I Like Java!";
        System.out.println(idea);
        idea = idea + " But I am a newbie. ";
        int year = 2021;
        idea = idea + year;
        System.out.println(idea);
    }
}
