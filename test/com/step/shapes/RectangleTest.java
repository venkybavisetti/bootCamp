package com.step.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void shouldCalculateAreaOfRectangle() throws NegativeBreadthException, NegativeLengthException {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(6, rectangle.area(), 0);
    }

    @Test
    public void shouldCalculateAreaOfRectangleWithGivenFractionalValues() throws NegativeBreadthException, NegativeLengthException {
        Rectangle rectangle = Rectangle.create(2.5, 3.5);
        assertEquals(8.75, rectangle.area(), 0);
    }

    @Test
    public void shouldCalculatePerimeterOfRectangle() throws NegativeBreadthException, NegativeLengthException {

        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals(10, rectangle.perimeter(), 0);
    }

    @Test
    public void shouldCalculatePerimeterOfRectangleWithGivenFractionalValues() throws NegativeBreadthException, NegativeLengthException {

        Rectangle rectangle = Rectangle.create(2.5, 3.5);
        assertEquals(12, rectangle.perimeter(), 0);
    }

    @Test
    public void shouldRepresentTheRectangle() throws NegativeBreadthException, NegativeLengthException {
        Rectangle rectangle = Rectangle.create(2, 3);
        assertEquals("Rectangle{length=2.0, breadth=3.0}", rectangle.toString());
    }

    @Test
    public void shouldThrowAnExceptionWhenRectangleIsCreatedWithNegativeLength() {
        assertThrows(NegativeLengthException.class, () -> Rectangle.create(-2, 3));
    }

    @Test
    public void shouldThrowAnExceptionWhenRectangleIsCreatedWithNegativeBreadth() {
        assertThrows(NegativeBreadthException.class, () -> Rectangle.create(2, -3));
    }
}