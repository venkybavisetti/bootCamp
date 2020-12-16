package com.step.measurements;

import java.util.Objects;

public class Quantity <T extends Unit>{
    private final double value;
    private final T unit;

    public Quantity(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalsTo(Quantity<T> quantity) {
        double thisValueStandardUnit = this.convertToBaseUnit();
        double otherValueInStandardUnit = quantity.convertToBaseUnit();
        return thisValueStandardUnit == otherValueInStandardUnit;
    }

    public Quantity add(Quantity<T> anotherQuantity) {
        double thisValueStandardUnit = this.convertToStandardUnit();
        double otherValueInStandardUnit = anotherQuantity.convertToStandardUnit();
        double total = thisValueStandardUnit + otherValueInStandardUnit;
        return new Quantity(total, this.unit.getStandardUnit());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }

    private double convertToStandardUnit() {
        return this.unit.convertTo(this.value, this.unit.getStandardUnit());
    }
}
