package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float expectedEuro = 2;
        boolean passedEuro = expectedEuro == euro;
        float dollar = Converter.rubleToDollar(120);
        float expectedDollar = 2;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("140 rubles are 2. Test result: " + passedEuro);
        System.out.println("120 rubles are 2. Test result: " + passedDollar);

    }
}