package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldCompareForGivenEqualLengthsInFeetAndInches() {
        Length lengthInFeet = new Length(2, Unit.FEET);
        Length lengthInInches = new Length(24, Unit.INCHES);
        assertTrue(lengthInInches.compare(lengthInFeet));
    }

    @Test
    public void shouldCompareForGivenUnEqualLengthsInFeetAndInches() {
        Length lengthInFeet = new Length(1, Unit.FEET);
        Length lengthInInches = new Length(24, Unit.INCHES);
        assertFalse(lengthInInches.compare(lengthInFeet));
    }

    @Test
    public void shouldCompareForGivenEqualLengthsInInchesAndCentimeters() {
        Length lengthInCenti = new Length(5, Unit.CENTIMETERS);
        Length lengthInInches = new Length(2, Unit.INCHES);
        assertTrue(lengthInInches.compare(lengthInCenti));
    }

    @Test
    public void shouldCompareForGivenUnEqualLengthsInInchesAndCentimeters() {
        Length lengthInCenti = new Length(4, Unit.CENTIMETERS);
        Length lengthInInches = new Length(2, Unit.INCHES);
        assertFalse(lengthInInches.compare(lengthInCenti));
    }
}