package com.step.measurements.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureUnitTest {
    @Test
    public void shouldConvertToBaseUnitForGivenCelsius() {
        double valueInBase = TemperatureUnit.FAHRENHEIT.convertToBase(212);
        assertEquals(100, valueInBase, 0.0);
    }

    @Test
    public void shouldConvertTheValueToGivenUnit() {
        double valueInGallon = TemperatureUnit.FAHRENHEIT.convertToThisFromBase(100);
        assertEquals(212, valueInGallon, 0.0);
    }
}