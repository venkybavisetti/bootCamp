package com.step.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void shouldCalculateAreaOfASquare() {
        Square square = new Square(3);
        assertEquals(9, square.area(), 0);
    }

    @Test
    public void shouldCalculateAreaOfASquareWithDecimal() {
        Square square = new Square(3.5);
        assertEquals(12.25, square.area(), 0);
    }

    @Test
    public void shouldCalculateThePerimeterOfSquareWithGivenSide() {
        Square square = new Square(3);
        assertEquals(12,square.perimeter(),0);
    }

    @Test
    public void shouldCalculateThePerimeterOfSquareWithGivenSideWithDecimal() {
        Square square = new Square(3.5);
        assertEquals(14, square.perimeter(), 0);
    }

    @Test
    public void shouldGiveTextRepresentationOfSquare() {
        Square square = new Square(3);
        assertEquals("Square{side=3.0}",square.toString());
    }
}