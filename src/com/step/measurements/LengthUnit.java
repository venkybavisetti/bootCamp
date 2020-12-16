package com.step.measurements;

public enum LengthUnit {
    FEET(12),
    INCH(1),
    CM(0.4),
    MM(0.04);
    private final double baseValue;

    LengthUnit(double baseValue) {
        this.baseValue = baseValue;
    }

    public double convertToBaseUnit(double valueToConvert) {
        return this.baseValue * valueToConvert;
    }

    public double convertTo(double value, LengthUnit unit) {
        double valueInStandardUnit = this.convertToBaseUnit(value);
        return valueInStandardUnit / unit.baseValue;
    }
}
