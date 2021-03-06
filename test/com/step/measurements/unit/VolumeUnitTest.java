package com.step.measurements.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class VolumeUnitTest {
    @Test
    public void shouldConvertToBaseUnitForGivenGallon() {
        double valueInBase = VolumeUnit.GALLON.convertToBase(2);
        assertEquals(7.56, valueInBase, 0.0);
    }

    @Test
    public void shouldConvertTheValueToGivenUnit() {
        double valueInGallon = VolumeUnit.GALLON.convertToThisFromBase(3.78);
        assertEquals(1, valueInGallon, 0.0);
    }
}