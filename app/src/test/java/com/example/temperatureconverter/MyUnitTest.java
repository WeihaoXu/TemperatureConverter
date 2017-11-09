package com.example.temperatureconverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by weihaoxu on 11/8/17.
 */

public class MyUnitTest {
    @Test
    public void freezePointFCorrect() throws Exception {
        float freezeFExpected = 32;
        float freezeFActual = ConverterUtil.convertCelsiusToFahrenheit(0);
        assertEquals("Conversion from celsius to fahrenheit failed",
                freezeFExpected, freezeFActual, 0.001);
    }

    @Test
    public void BoilPointCCorrect() throws Exception {
        float boilCExpected = 100;
        float boilFActual = ConverterUtil.convertFahrenheitToCelsius(212);
        assertEquals("Conversion from fahrenheit to celsius failed",
                boilCExpected, boilFActual, 0.001);
    }


}