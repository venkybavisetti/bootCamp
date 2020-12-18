package com.step.measurements.quantity;

import com.step.measurements.unit.VolumeUnit;

public class Volume extends AddableMeasurement<VolumeUnit> {
    public Volume(double value, VolumeUnit unit) {
        super(value, unit);
    }

    @Override
    public Volume add(AddableMeasurement<VolumeUnit> anotherMeasurement) {
        VolumeUnit standardUnit = VolumeUnit.LITER;
        double thisValueInStandardUnit = this.convertToBaseUnit();
        double otherValueInStandardUnit = anotherMeasurement.convertToBaseUnit();
        double total = Math.round((thisValueInStandardUnit + otherValueInStandardUnit) * 100) / 100.0;
        return new Volume(standardUnit.convertToThisFromBase(total), standardUnit);
    }
}