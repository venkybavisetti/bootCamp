package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {
    @Test
    public void shouldBeEqualForGivenLengthsInFeetAndInches() {
        Length inFeet = new Length(2, Unit.FEET);
        Length inInches = new Length(24, Unit.INCH);
        assertTrue(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInFeetAndInches() {
        Length inFeet = new Length(1, Unit.FEET);
        Length inInches = new Length(24, Unit.INCH);
        assertFalse(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInInchesAndCentimeters() {
        Length inCentimeter = new Length(5, Unit.CM);
        Length inInches = new Length(2, Unit.INCH);
        assertTrue(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInInchesAndCentimeters() {
        Length inCentimeter = new Length(4, Unit.CM);
        Length inInches = new Length(2, Unit.INCH);
        assertFalse(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Length inCentimeter = new Length(1, Unit.CM);
        Length inMillimeter = new Length(10, Unit.MM);
        assertTrue(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Length inCentimeter = new Length(1, Unit.CM);
        Length inMillimeter = new Length(11, Unit.MM);
        assertFalse(inCentimeter.equalsTo(inMillimeter));
    }
}