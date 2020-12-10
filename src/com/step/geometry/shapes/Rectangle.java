package com.step.geometry.shapes;

public class Rectangle {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        if(length<0||breadth<0){
            throw new NegetiveSideException();
        }
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return this.length * this.breadth;
    }

    public double perimeter() {
        return 2 * (this.length + this.breadth);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
