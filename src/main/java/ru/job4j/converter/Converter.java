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

        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        in = 200;
        expected = 3.3333333f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("200 rubles are 3.3333333 Test result : " + passed);

        in = 58;
        expected = 49.300003f;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("58 dollar are 49.300003 Test result : " + passed);

        in = 50;
        expected = 58.3f;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("50 euro are 58.3 Test result : " + passed);

        in = 788;
        expected = 55160.0f;
        out = Converter.euroToRub(in);
        passed = expected == out;
        System.out.println("788 euro are 55160.0 Test result : " + passed);

        in = 888;
        expected = 53280.0f;
        out = Converter.euroToRub(in);
        passed = expected == out;
        System.out.println("888 dollar are 53280.0 Test result : " + passed);
    }
}
