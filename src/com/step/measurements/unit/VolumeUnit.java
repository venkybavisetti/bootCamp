package com.step.measurements.unit;

public enum VolumeUnit implements Unit {
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
    public double convertToLocal(double value) {
        return value / this.baseValue;
    }
}
