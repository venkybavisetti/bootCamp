package com.step.measurements.quantity;

import com.step.measurements.unit.TemperatureUnit;

public class Temperature extends Measurement<TemperatureUnit> {

    public Temperature(double value, TemperatureUnit unit) {
        super(value, unit);
    }

}
