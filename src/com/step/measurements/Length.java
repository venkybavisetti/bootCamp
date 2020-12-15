package com.step.measurements;

public class Length {
    private final double value;
    private final LengthUnit lengthUnit;

    public Length(double value, LengthUnit lengthUnit) {
        this.value = value;
        this.lengthUnit = lengthUnit;
    }

    public boolean equalsTo(Length length) {
        double thisValueInBaseUnit = this.convertToBaseUnit();
        double otherValueInBaseUnit = length.convertToBaseUnit();
        return thisValueInBaseUnit == otherValueInBaseUnit;
    }

    private double convertToBaseUnit() {
        return this.lengthUnit.convertToBaseUnit(this.value);
    }
}
