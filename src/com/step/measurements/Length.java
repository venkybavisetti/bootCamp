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
        double thisValueStandardUnit = this.convertToStandardUnit();
        double otherValueInStandardUnit = length.convertToStandardUnit();
        return thisValueStandardUnit == otherValueInStandardUnit;
    }

    public Length add(Length anotherLength) {
        double thisValueStandardUnit = this.convertToStandardUnit();
        double otherValueInStandardUnit = anotherLength.convertToStandardUnit();
        double total = thisValueStandardUnit + otherValueInStandardUnit;
        return new Length(total, this.unit.getStandardUnit());
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

    private double convertToStandardUnit() {
        return this.unit.convertToStandardUnit(this.value);
    }
}
