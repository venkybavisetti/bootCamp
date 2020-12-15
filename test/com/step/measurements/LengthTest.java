package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareForGivenEqualLengthsInFeetAndInches() {
        Length lengthInFeet = new Length(2, Unit.FEET);
        Length lengthInInches = new Length(24, Unit.INCH);
        assertTrue(lengthInInches.compare(lengthInFeet));
    }

    @Test
    public void shouldCompareForGivenUnEqualLengthsInFeetAndInches() {
        Length lengthInFeet = new Length(1, Unit.FEET);
        Length lengthInInches = new Length(24, Unit.INCH);
        assertFalse(lengthInInches.compare(lengthInFeet));
    }

    @Test
    public void shouldCompareForGivenEqualLengthsInInchesAndCentimeters() {
        Length lengthInCentimeter = new Length(5, Unit.CM);
        Length lengthInInches = new Length(2, Unit.INCH);
        assertTrue(lengthInInches.compare(lengthInCentimeter));
    }

    @Test
    public void shouldCompareForGivenUnEqualLengthsInInchesAndCentimeters() {
        Length lengthInCentimeter = new Length(4, Unit.CM);
        Length lengthInInches = new Length(2, Unit.INCH);
        assertFalse(lengthInInches.compare(lengthInCentimeter));
    }

    @Test
    public void shouldCompareForGivenEqualLengthsInCentimeterAndMilliMeter() {
        Length lengthInCentimeter = new Length(1, Unit.CM);
        Length lengthInMillimeter = new Length(10, Unit.MM);
        assertTrue(lengthInCentimeter.compare(lengthInMillimeter));
    }

    @Test
    public void shouldCompareForGivenUnEqualLengthsInCentimeterAndMilliMeter() {
        Length lengthInCentimeter = new Length(1, Unit.CM);
        Length lengthInMillimeter = new Length(11, Unit.MM);
        assertFalse(lengthInCentimeter.compare(lengthInMillimeter));
    }
}