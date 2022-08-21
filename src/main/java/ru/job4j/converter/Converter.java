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

    public static float dollarToEuro(float value) {
        float rsl = value * 0.85f;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.166f;
        return rsl;
    }

    public static float euroToRub(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRub(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(200);
        System.out.println("200 rubles are " + dollar + " dollar.");
        float euro2 = Converter.dollarToEuro(58);
        System.out.println("58 dollar are " + euro2 + " euro.");
        float dollar2 = Converter.euroToDollar(50);
        System.out.println("50 euro are " + dollar2 + " dollar.");
        float rubl1 = Converter.euroToRub(788);
        System.out.println("788 euro are " + rubl1 + " rub.");
        float rubl2 = Converter.dollarToRub(888);
        System.out.println("888 dollar are " + rubl2 + " rub.");

    }
}
