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

        float in2 = 200;
        float expected2 = 3.3333333f;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected == out;
        System.out.println("200 rubles are 3.3333333 Test result : " + passed2);

        float in3 = 58;
        float expected3 = 49.300003f;
        float out3 = Converter.dollarToEuro(in);
        boolean passed3 = expected == out;
        System.out.println("58 dollar are 49.300003 Test result : " + passed3);

        float in4 = 50;
        float expected4 = 58.3f;
        float out4 = Converter.euroToDollar(in);
        boolean passed4 = expected == out;
        System.out.println("50 euro are 58.3 Test result : " + passed4);

        float in5 = 788;
        float expected5 = 55160.0f;
        float out5 = Converter.euroToRub(in);
        boolean passed5 = expected == out;
        System.out.println("788 euro are 55160.0 Test result : " + passed5);

        float in6 = 888;
        float expected6 = 53280.0f;
        float out6 = Converter.euroToRub(in);
        boolean passed6 = expected == out;
        System.out.println("888 dollar are 53280.0 Test result : " + passed6);
    }
}
