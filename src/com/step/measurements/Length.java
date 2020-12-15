package com.step.measurements;

public class Length {
    private final double value;
    private final Unit unit;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(Length length) {
        double thisValueInCentimeter = this.convertToBaseUnit();
        double otherValueInCentimeter = length.convertToBaseUnit();
        return thisValueInCentimeter == otherValueInCentimeter;
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBaseUnit(this.value);
    }
}
