package com.step.measurements;

public enum Unit {
    FEET(30),
    INCH(2.5),
    CM(1),
    MM(0.1);
    private final double baseValue;

    Unit(double baseValue) {
        this.baseValue = baseValue;
    }

    public double convertToBaseUnit(double valueToConvert) {
        return this.baseValue * valueToConvert;
    }
}