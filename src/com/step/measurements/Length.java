package com.step.measurements;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalsTo(Length length) {
        double thisValueInBaseUnit = this.convertToBaseUnit();
        double otherValueInBaseUnit = length.convertToBaseUnit();
        return thisValueInBaseUnit == otherValueInBaseUnit;
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBaseUnit(this.value);
    }
}
