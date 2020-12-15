package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {
    @Test
    public void shouldConvertToBaseUnitGivenFeet() {
        double feetInBaseValue = Unit.FEET.convertToBaseUnit(2);
        assertEquals(60, feetInBaseValue, 0.0);
    }
}