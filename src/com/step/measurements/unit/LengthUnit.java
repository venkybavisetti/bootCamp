package com.step.measurements.unit;

public enum LengthUnit implements Unit {
    FEET(12),
    INCH(1),
    CM(0.4),
    MM(0.04);
    private final double baseValue;

    LengthUnit(double baseValue) {
        this.baseValue = baseValue;
    }

    @Override
    public double convertToBase(double valueToConvert) {
        return this.baseValue * valueToConvert;
    }

    @Override
    public double convertToLocal(double value) {
        return value / this.baseValue;
    }
}


