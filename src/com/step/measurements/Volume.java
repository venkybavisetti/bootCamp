package com.step.measurements;

public enum Volume {
    GALLON(3.78), LITER(1);
    private final double baseValue;

    Volume(double baseValue) {
        this.baseValue = baseValue;
    }

    public double convertToBase(double value) {
        return value*this.baseValue;
    }
}
