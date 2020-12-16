package com.step.measurements;

public interface Unit<T> {
    double convertToBase(double value);

    double convertTo(double value, T unit);

    T getStandardUnit();
}
