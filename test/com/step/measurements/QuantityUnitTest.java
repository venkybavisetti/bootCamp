package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityUnitTest {
    @Test
    public void shouldConvertToStandardUnitForGivenFeet() {
        double feetInBaseValue = LengthUnit.FEET.convertToBase(2);
        assertEquals(24.0, feetInBaseValue, 0.0);
    }
}