package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {
    @Test
    public void shouldBeEqualForGivenLengthsInFeetAndInches() {
        Quantity inFeet = new Quantity(2, LengthUnit.FEET);
        Quantity inInches = new Quantity(24, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInFeetAndInches() {
        Quantity inFeet = new Quantity(1, LengthUnit.FEET);
        Quantity inInches = new Quantity(24, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInInchesAndCentimeters() {
        Quantity inCentimeter = new Quantity(5, LengthUnit.CM);
        Quantity inInches = new Quantity(2, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInInchesAndCentimeters() {
        Quantity inCentimeter = new Quantity(4, LengthUnit.CM);
        Quantity inInches = new Quantity(2, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Quantity inCentimeter = new Quantity(1, LengthUnit.CM);
        Quantity inMillimeter = new Quantity(10, LengthUnit.MM);
        assertTrue(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Quantity inCentimeter = new Quantity(1, LengthUnit.CM);
        Quantity inMillimeter = new Quantity(11, LengthUnit.MM);
        assertFalse(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldAddGivenLengthOfSameUnit() {
        Quantity twoInches = new Quantity(2, LengthUnit.INCH);
        Quantity threeInches = new Quantity(3, LengthUnit.INCH);
        Quantity totalQuantity = twoInches.add(threeInches);
        assertEquals(new Quantity(5.0, LengthUnit.INCH), totalQuantity);
    }

    @Test
    public void shouldAddGivenLengthOfAnyUnit() {
        Quantity twoInches = new Quantity(2, LengthUnit.INCH);
        Quantity threeInches = new Quantity(2.5, LengthUnit.CM);
        Quantity totalQuantity = twoInches.add(threeInches);
        assertEquals(new Quantity(3, LengthUnit.INCH), totalQuantity);
    }
}