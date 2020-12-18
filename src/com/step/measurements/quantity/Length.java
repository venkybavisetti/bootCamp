package com.step.measurements.quantity;

import com.step.measurements.unit.LengthUnit;

public class Length extends AddableMeasurement<LengthUnit> {
    public Length(double value, LengthUnit unit) {
        super(value, unit);
    }

    public Length add(AddableMeasurement<LengthUnit> anotherMeasurement) {
        LengthUnit standardUnit = LengthUnit.INCH;
        double thisValueInStandardUnit = this.convertToBaseUnit();
        double otherValueInStandardUnit = anotherMeasurement.convertToBaseUnit();
        double total = thisValueInStandardUnit + otherValueInStandardUnit;
        return new Length(standardUnit.convertToThisFromBase(total), standardUnit);
    }
}
