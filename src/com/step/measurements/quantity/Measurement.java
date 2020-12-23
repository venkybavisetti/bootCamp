package com.step.measurements.quantity;

import com.step.measurements.unit.Unit;

import java.util.Objects;

public class Measurement<T extends Unit> {
    private final double value;
    private final T unit;

    public Measurement(double value, T unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalsTo(Measurement<T> measurement) {
        double thisValueInBaseUnit = this.convertToBaseUnit();
        double otherValueInBaseUnit = measurement.convertToBaseUnit();
        return thisValueInBaseUnit == otherValueInBaseUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Measurement<?> measurement = (Measurement<?>) o;
        return Double.compare(measurement.value, value) == 0 &&
            Objects.equals(unit, measurement.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    protected double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }
}
