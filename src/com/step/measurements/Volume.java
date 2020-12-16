package com.step.measurements;

public class Volume {
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


}

