package com.step.measurements;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComparatorTest {
    @Test
    public void shouldCompareForGivenEqualLengths() {
        assertTrue(Comparator.compareFeetAndInches(1, 12));
    }

    @Test
    public void shouldCompareForGivenUnEqualLengths() {
        assertFalse(Comparator.compareFeetAndInches(1, 11));
    }
}