package com.step.measurements;

import com.step.measurements.unit.LengthUnit;
import com.step.measurements.unit.VolumeUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityTest {
    @Test
    public void shouldBeEqualForGivenLengthsInFeetAndInches() {
        Quantity<LengthUnit> inFeet = new Quantity<>(2, LengthUnit.FEET, LengthUnit.INCH);
        Quantity<LengthUnit> inInches = new Quantity<>(24, LengthUnit.INCH, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInFeetAndInches() {
        Quantity<LengthUnit> inFeet = new Quantity<>(1, LengthUnit.FEET, LengthUnit.INCH);
        Quantity<LengthUnit> inInches = new Quantity<>(24, LengthUnit.INCH, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inFeet));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInInchesAndCentimeters() {
        Quantity<LengthUnit> inCentimeter = new Quantity<>(5, LengthUnit.CM, LengthUnit.INCH);
        Quantity<LengthUnit> inInches = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        assertTrue(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInInchesAndCentimeters() {
        Quantity<LengthUnit> inCentimeter = new Quantity<>(4, LengthUnit.CM, LengthUnit.INCH);
        Quantity<LengthUnit> inInches = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        assertFalse(inInches.equalsTo(inCentimeter));
    }

    @Test
    public void shouldBeEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Quantity<LengthUnit> inCentimeter = new Quantity<>(1, LengthUnit.CM, LengthUnit.INCH);
        Quantity<LengthUnit> inMillimeter = new Quantity<>(10, LengthUnit.MM, LengthUnit.INCH);
        assertTrue(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldBeUnEqualForGivenLengthsInCentimeterAndMilliMeter() {
        Quantity<LengthUnit> inCentimeter = new Quantity<>(1, LengthUnit.CM, LengthUnit.INCH);
        Quantity<LengthUnit> inMillimeter = new Quantity<>(11, LengthUnit.MM, LengthUnit.INCH);
        assertFalse(inCentimeter.equalsTo(inMillimeter));
    }

    @Test
    public void shouldAddGivenLengthOfSameUnit() {
        Quantity<LengthUnit> twoInches = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        Quantity<LengthUnit> threeInches = new Quantity<>(3, LengthUnit.INCH, LengthUnit.INCH);
        Quantity<LengthUnit> totalQuantity = twoInches.add(threeInches);
        assertEquals(new Quantity<>(5.0, LengthUnit.INCH, LengthUnit.INCH), totalQuantity);
    }

    @Test
    public void shouldAddGivenLengthOfAnyUnit() {
        Quantity<LengthUnit> twoInches = new Quantity<>(2, LengthUnit.INCH, LengthUnit.INCH);
        Quantity<LengthUnit> threeInches = new Quantity<>(2.5, LengthUnit.CM, LengthUnit.INCH);
        Quantity<LengthUnit> totalQuantity = twoInches.add(threeInches);
        assertEquals(new Quantity<>(3, LengthUnit.INCH, LengthUnit.INCH), totalQuantity);
    }

    @Test
    public void shouldBeEqualForGivenVolumesInGallonAndLitre() {
        Quantity<VolumeUnit> inGallon = new Quantity<>(1, VolumeUnit.GALLON, VolumeUnit.LITER);
        Quantity<VolumeUnit> inLitre = new Quantity<>(3.78, VolumeUnit.LITER, VolumeUnit.LITER);
        assertTrue(inGallon.equalsTo(inLitre));
    }

    @Test
    public void shouldAddGivenVolumesInGallonAndLitre() {
        Quantity<VolumeUnit> inGallon = new Quantity<>(1, VolumeUnit.GALLON, VolumeUnit.LITER);
        Quantity<VolumeUnit> inLitre = new Quantity<>(1, VolumeUnit.LITER, VolumeUnit.LITER);
        Quantity<VolumeUnit> total = inLitre.add(inGallon);
        assertEquals(new Quantity<>(4.78, VolumeUnit.LITER, VolumeUnit.LITER), total);
    }
}