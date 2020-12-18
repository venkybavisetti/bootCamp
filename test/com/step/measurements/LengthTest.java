package com.step.measurements;

import com.step.measurements.quantity.Length;
import com.step.measurements.unit.LengthUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldBeEqualForGivenLengthsInFeetAndInches() {
        Length inFeet = new Length(2, LengthUnit.FEET);
        Length inInches = new Length(24, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInFeetAndInches() {
        Length inFeet = new Length(1, LengthUnit.FEET);
        Length inInches = new Length(24, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInInchesAndCentimeters() {
        Length inCentimeter = new Length(5, LengthUnit.CM);
        Length inInches = new Length(2, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInInchesAndCentimeters() {
        Length inCentimeter = new Length(4, LengthUnit.CM);
        Length inInches = new Length(2, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Length inCentimeter = new Length(1, LengthUnit.CM);
        Length inMillimeter = new Length(10, LengthUnit.MM);
        assertTrue(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Length inCentimeter = new Length(1, LengthUnit.CM);
        Length inMillimeter = new Length(11, LengthUnit.MM);
        assertFalse(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldAddGivenLengthOfSameUnit() {
        Length twoInches = new Length(2, LengthUnit.INCH);
        Length threeInches = new Length(3, LengthUnit.INCH);
        Length totalMeasurement = twoInches.add(threeInches);
        assertEquals(new Length(5.0, LengthUnit.INCH), totalMeasurement);
    }

    @Test
    public void shouldAddGivenLengthOfAnyUnit() {
        Length twoInches = new Length(2, LengthUnit.INCH);
        Length threeInches = new Length(2.5, LengthUnit.CM);
        Length totalMeasurement = twoInches.add(threeInches);
        assertEquals(new Length(3, LengthUnit.INCH), totalMeasurement);
    }
}