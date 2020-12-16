package com.step.measurements;

import java.util.Objects;

public class Volume {
    private static final VolumeUnit STANDARD_UNIT = VolumeUnit.LITER;
    private final double value;
    private final VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean equalsTo(Volume volume) {
        double thisValueInBase = this.unit.convertToBase(this.value);
        double otherValueInBase = volume.unit.convertToBase(volume.value);
        return thisValueInBase == otherValueInBase;
    }

    public Volume add(Volume anotherVolume) {
        double thisValueInStandardUnit = this.convertToStandardUnit();
        double otherValueInStandardUnit = anotherVolume.convertToStandardUnit();
        double total = thisValueInStandardUnit + otherValueInStandardUnit;
        return new Volume(total, STANDARD_UNIT);
    }

    private double convertToStandardUnit() {
        return this.unit.convertTo(this.value, STANDARD_UNIT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 &&
                unit == volume.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        return "Volume{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

