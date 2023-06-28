package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            System.out.println("Hi, SmartAss");
            rsl = "Hi, SmartAss";
        } else if ("Bye.".equals(question)) {
            System.out.println("See you later");
            rsl = "See you later";
        }
    return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);

    }
}
