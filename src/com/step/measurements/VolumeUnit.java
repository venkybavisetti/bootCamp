package com.step.measurements;

public enum VolumeUnit implements Unit<VolumeUnit> {
    GALLON(3.78), LITER(1);
    private final double baseValue;

    VolumeUnit(double baseValue) {
        this.baseValue = baseValue;
    }

    @Override
    public double convertToBase(double value) {
        return value * this.baseValue;
    }

    @Override
    public double convertTo(double value, VolumeUnit unit) {
        double valueInStandardUnit = this.convertToBase(value);
        return valueInStandardUnit / unit.baseValue;
    }

    @Override
    public VolumeUnit getStandardUnit() {
        return LITER;
    }
}
