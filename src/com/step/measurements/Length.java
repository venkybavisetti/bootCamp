package com.step.measurements;

import java.util.Objects;

public class Length {
    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
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

    public Length add(Length anotherLength) {
        double thisValueInBaseUnit = this.convertToBaseUnit();
        double otherValueInBaseUnit = anotherLength.convertToBaseUnit();
        double total = this.unit.convertToLocal(thisValueInBaseUnit + otherValueInBaseUnit);
        return new Length(total, this.unit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
