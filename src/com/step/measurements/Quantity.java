package com.step.measurements;

import com.step.measurements.unit.Unit;

import java.util.Objects;

public class Quantity <T extends Unit>{
    private final double value;
    private final T unit;

    public Quantity(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalsTo(Quantity<T> quantity) {
        double thisValueInBaseUnit = this.convertToBaseUnit();
        double otherValueInBaseUnit = quantity.convertToBaseUnit();
        return thisValueInBaseUnit == otherValueInBaseUnit;
    }

    public Quantity<T> add(Quantity<T> anotherQuantity, T standardUnit) {
        double thisValueInStandardUnit = this.convertToStandardUnit(standardUnit);
        double otherValueInStandardUnit = anotherQuantity.convertToStandardUnit(standardUnit);
        double total = Math.round((thisValueInStandardUnit + otherValueInStandardUnit) * 100) / 100.0;
        return new Quantity<>(total, standardUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity<?> quantity = (Quantity<?>) o;
        return Double.compare(quantity.value, value) == 0 &&
                Objects.equals(unit, quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }

    private double convertToStandardUnit(T standardUnit) {
        return this.unit.convertTo(this.value, standardUnit);
    }
}
