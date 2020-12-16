package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthUnitTest {
    @Test
    public void shouldConvertToStandardUnitForGivenFeet() {
        double feetInBaseValue = LengthUnit.FEET.convertToStandardUnit(2);
        assertEquals(60, feetInBaseValue, 0.0);
    }
}