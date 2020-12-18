package com.step.measurements;

import com.step.measurements.unit.Unit;

import java.util.Objects;

public class Measurement<T extends Unit> {
    private final double value;
    private final T unit;
    private final T standardUnit;

    public Measurement(double value, T unit, T standardUnit) {
        this.value = value;
        this.unit = unit;
        this.standardUnit = standardUnit;
    }

    public boolean equalsTo(Measurement<T> measurement) {
        double thisValueInBaseUnit = this.convertToBaseUnit();
        double otherValueInBaseUnit = measurement.convertToBaseUnit();
        return thisValueInBaseUnit == otherValueInBaseUnit;
    }

    public Measurement<T> add(Measurement<T> anotherMeasurement) {
        double thisValueInStandardUnit = this.convertToBaseUnit();
        double otherValueInStandardUnit = anotherMeasurement.convertToBaseUnit();
        double total = roundValue(thisValueInStandardUnit + otherValueInStandardUnit);
        return new Measurement<>(standardUnit.convertToThisFromBase(total), standardUnit, standardUnit);
    }

    private double roundValue(double value) {
        return Math.round((value) * 100) / 100.0;
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

    private double convertToBaseUnit() {
        return this.unit.convertToBase(this.value);
    }
}
