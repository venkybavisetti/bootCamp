package com.step.measurements.unit;

public interface Unit {
    double convertToBase(double value);

    double convertTo(double value, Unit unit);

    Unit getStandardUnit();
}
