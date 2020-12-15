package com.step.measurements;

import java.util.Objects;

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

    public Length add(Length anotherLength) {
        double thisValueInBaseUnit = this.convertToBaseUnit();
        double otherValueInBaseUnit = anotherLength.convertToBaseUnit();
        double total = this.lengthUnit.convertToLocal(thisValueInBaseUnit + otherValueInBaseUnit);
        return new Length(total, this.lengthUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                lengthUnit == length.lengthUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, lengthUnit);
    }
}
