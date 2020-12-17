package com.step.measurements.unit;

public interface Unit {
    double convertToBase(double value);

    double convertToLocal(double value);
}
