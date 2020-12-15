package com.step.measurements;

public enum Unit {
    FEET(30),
    INCHES(2.5),
    CENTIMETERS(1);
    private final double value;

    Unit(double value) {
        this.value = value;
    }

    public double getValueInCenti() {
        return this.value;
    }
}
