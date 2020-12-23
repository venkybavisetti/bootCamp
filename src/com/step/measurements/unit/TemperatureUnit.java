package com.step.measurements.unit;

public enum TemperatureUnit implements Unit {
    CELSIUS(0, 1),
    FAHRENHEIT(-32, 1.8);
    private final double baseValue;
    private final double conversionFactor;

    TemperatureUnit(double baseValue, double conversionFactor) {
        this.baseValue = baseValue;
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return (value + baseValue) / conversionFactor;
    }

    @Override
    public double convertToThisFromBase(double value) {
        return (value * conversionFactor) - baseValue;
    }
}
