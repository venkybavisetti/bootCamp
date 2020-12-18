package com.step.measurements.quantity;

import com.step.measurements.unit.Unit;

public abstract class AddableMeasurement<U extends Unit> extends Measurement<U> {
    public AddableMeasurement(double value, U unit) {
        super(value, unit);
    }
    public abstract AddableMeasurement<U> add(AddableMeasurement<U> anotherMeasurement);
}
