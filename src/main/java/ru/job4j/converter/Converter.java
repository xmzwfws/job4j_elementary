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
        float euro = Converter.rubleToEuro(280);
        float expectedEuro = 4;
        boolean passedEuro = expectedEuro == euro;
        float dollar = Converter.rubleToDollar(240);
        float expectedDollar = 4;
        boolean passedDollar = expectedDollar == dollar;
        System.out.println("280 rubles are 4. Test result: " + passedEuro);
        System.out.println("240 rubles are 4. Test result: " + passedDollar);

    }
}