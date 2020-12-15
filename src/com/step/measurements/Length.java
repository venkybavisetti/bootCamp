package com.step.measurements;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length length) {
        return length.unit.getValueInCenti() * length.value == this.unit.getValueInCenti() * this.value;
    }
}
