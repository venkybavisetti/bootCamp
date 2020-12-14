package com.step.probability;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChanceTest {
    @Test
    public void shouldRepresentChanceOfNotGettingTailWith1Coin() {
        Chance chanceOfGettingOneTail = new Chance(0.5);
        assertEquals(new Chance(0.5), chanceOfGettingOneTail.not());
    }

    @Test
    public void shouldRepresentChanceOfGettingTailsWith2Coins() {
        Chance chanceOfGettingOneTail = new Chance(0.5);
        assertEquals(new Chance(0.25), chanceOfGettingOneTail.and(chanceOfGettingOneTail));
    }

    @Test
    public void shouldRepresentChanceOfGettingAtLeastOneTailWith2Coins() {
        Chance chanceOfGettingOneTail = new Chance(0.5);
        assertEquals(new Chance(0.75), chanceOfGettingOneTail.or(chanceOfGettingOneTail));
    }
}