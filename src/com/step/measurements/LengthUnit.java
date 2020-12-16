package com.step.measurements;

public enum LengthUnit implements Unit<LengthUnit> {
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
    public double convertTo(double value, LengthUnit unit) {
        double valueInStandardUnit = this.convertToBase(value);
        return valueInStandardUnit / unit.baseValue;
    }

    public LengthUnit getStandardUnit() {
        return INCH;
    }
}
