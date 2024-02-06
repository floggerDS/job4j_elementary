package ru.job4j.condition;

/**
 * Вам необходимо разработать программу "Глупый бот".
 * <p>
 * Бот должен принимать строку и возвращать ответ.
 * <p>
 * Бот наш глупый. Он знает только три фразы.
 * <p>
 * Если пришла фраза "Привет, Бот.", бот отвечает: "Привет, умник."
 * <p>
 * Если пришла фраза "Пока.", бот отвечает: "До скорой встречи."
 * <p>
 * Если пришла любая другая фраза,  бот отвечает: "Это ставит меня в тупик. Задайте другой вопрос."
 * <p>
 * Помните, что строки можно сравнивать только через методы equals. Нельзя использовать ==
 */
public class DummyBot {
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            rsl = "See you later.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
    }
}
