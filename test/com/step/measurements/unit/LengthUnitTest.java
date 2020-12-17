package com.step.measurements.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthUnitTest {
    @Test
    public void shouldConvertToBaseUnitForGivenFeet() {
        double feetInBaseValue = LengthUnit.FEET.convertToBase(2);
        assertEquals(24.0, feetInBaseValue, 0.0);
    }

    @Test
    public void shouldConvertTheValueToGivenUnit() {
        double valueInInches = LengthUnit.CM.convertToLocal(0.8);
        assertEquals(2, valueInInches, 0.0);
    }
}