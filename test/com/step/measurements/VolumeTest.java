package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VolumeTest {
    @Test
    public void shouldBeEqualForGivenVolumesInGallonAndLitre() {
        Volume inGallon = new Volume(1, VolumeUnit.GALLON);
        Volume inLitre = new Volume(3.78, VolumeUnit.LITER);
        assertTrue(inGallon.equalsTo(inLitre));
    }
}