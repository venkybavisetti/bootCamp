package com.step.measurements;

import com.step.measurements.unit.LengthUnit;
import com.step.measurements.unit.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeasurementTest {
    @Test
    public void shouldBeEqualForGivenLengthsInFeetAndInches() {
        Measurement<LengthUnit> inFeet = new Measurement<>(2, LengthUnit.FEET, LengthUnit.INCH);
        Measurement<LengthUnit> inInches = new Measurement<>(24, LengthUnit.INCH, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInFeetAndInches() {
        Measurement<LengthUnit> inFeet = new Measurement<>(1, LengthUnit.FEET, LengthUnit.INCH);
        Measurement<LengthUnit> inInches = new Measurement<>(24, LengthUnit.INCH, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInInchesAndCentimeters() {
        Measurement<LengthUnit> inCentimeter = new Measurement<>(5, LengthUnit.CM, LengthUnit.INCH);
        Measurement<LengthUnit> inInches = new Measurement<>(2, LengthUnit.INCH, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInInchesAndCentimeters() {
        Measurement<LengthUnit> inCentimeter = new Measurement<>(4, LengthUnit.CM, LengthUnit.INCH);
        Measurement<LengthUnit> inInches = new Measurement<>(2, LengthUnit.INCH, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Measurement<LengthUnit> inCentimeter = new Measurement<>(1, LengthUnit.CM, LengthUnit.INCH);
        Measurement<LengthUnit> inMillimeter = new Measurement<>(10, LengthUnit.MM, LengthUnit.INCH);
        assertTrue(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Measurement<LengthUnit> inCentimeter = new Measurement<>(1, LengthUnit.CM, LengthUnit.INCH);
        Measurement<LengthUnit> inMillimeter = new Measurement<>(11, LengthUnit.MM, LengthUnit.INCH);
        assertFalse(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldAddGivenLengthOfSameUnit() {
        Measurement<LengthUnit> twoInches = new Measurement<>(2, LengthUnit.INCH, LengthUnit.INCH);
        Measurement<LengthUnit> threeInches = new Measurement<>(3, LengthUnit.INCH, LengthUnit.INCH);
        Measurement<LengthUnit> totalMeasurement = twoInches.add(threeInches);
        assertEquals(new Measurement<>(5.0, LengthUnit.INCH, LengthUnit.INCH), totalMeasurement);
    }

    @Test
    public void shouldAddGivenLengthOfAnyUnit() {
        Measurement<LengthUnit> twoInches = new Measurement<>(2, LengthUnit.INCH, LengthUnit.INCH);
        Measurement<LengthUnit> threeInches = new Measurement<>(2.5, LengthUnit.CM, LengthUnit.INCH);
        Measurement<LengthUnit> totalMeasurement = twoInches.add(threeInches);
        assertEquals(new Measurement<>(3, LengthUnit.INCH, LengthUnit.INCH), totalMeasurement);
    }

    @Test
    public void shouldBeEqualForGivenVolumesInGallonAndLitre() {
        Measurement<VolumeUnit> inGallon = new Measurement<>(1, VolumeUnit.GALLON, VolumeUnit.LITER);
        Measurement<VolumeUnit> inLitre = new Measurement<>(3.78, VolumeUnit.LITER, VolumeUnit.LITER);
        assertTrue(inGallon.equalsTo(inLitre));
    }

    @Test
    public void shouldAddGivenVolumesInGallonAndLitre() {
        Measurement<VolumeUnit> inGallon = new Measurement<>(1, VolumeUnit.GALLON, VolumeUnit.LITER);
        Measurement<VolumeUnit> inLitre = new Measurement<>(1, VolumeUnit.LITER, VolumeUnit.LITER);
        Measurement<VolumeUnit> total = inLitre.add(inGallon);
        assertEquals(new Measurement<>(4.78, VolumeUnit.LITER, VolumeUnit.LITER), total);
    }
}