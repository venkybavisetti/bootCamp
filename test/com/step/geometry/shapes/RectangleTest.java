package com.step.geometry.shapes;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void shouldCalculateAreaOfRectangle() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.area(), 0);
    }

    @Test
    public void shouldCalculateAreaOfRectangleWithGivenFractionalValues() {
        Rectangle rectangle = new Rectangle(2.5, 3.5);
        assertEquals(8.75, rectangle.area(), 0);
    }

    @Test
    public void shouldCalculatePerimeterOfRectangle() {

        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.perimeter(), 0);
    }

    @Test
    public void shouldCalculatePerimeterOfRectangleWithGivenFractionalValues() {

        Rectangle rectangle = new Rectangle(2.5, 3.5);
        assertEquals(12, rectangle.perimeter(), 0);
    }

    @Test
    public void shouldRepresentTheRectangle() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertEquals("Rectangle{length=2.0, breadth=3.0}", rectangle.toString());
    }

    @Test
    public void shouldThrowAnExceptionWhenRectangleIsCreatedWithNegativeSides() {
        assertThrows(NegetiveSideException.class, () -> new Rectangle(-2, 3));
    }
}