package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert200RblThen3dot3333Dlr() {
        float in = 200;
        float expected = 3.3333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert58DolThen49dot3000Euro() {
        float in = 58;
        float expected = 49.3000f;
        float out = Converter.dollarToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert50EuroThen58dot3Dol() {
        float in = 50;
        float expected = 58.3f;
        float out = Converter.euroToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert788EuroThen55106dot0Rub() {
        float in = 788;
        float expected = 55160.0f;
        float out = Converter.euroToRub(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert888DolThen53280dot0Rub() {
        float in = 888;
        float expected = 53280.0f;
        float out = Converter.dollarToRub(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}