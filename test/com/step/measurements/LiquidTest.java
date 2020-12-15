package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LiquidTest {
    @Test
    public void shouldBeEqualForGivenVolumesInGallonAndLitre() {
        Liquid inGallon = new Liquid(1, Volume.GALLON);
        Liquid inLitre = new Liquid(3.78, Volume.LITER);
        assertTrue(inGallon.equalsTo(inLitre));
    }
}