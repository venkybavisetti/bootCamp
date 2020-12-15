package com.step.measurements;

public class Volume {
    private final double value;
    private final VolumeUnit volumeUnit;

    public Volume(double value, VolumeUnit volumeUnit) {
        this.value = value;
        this.volumeUnit = volumeUnit;
    }

    public boolean equalsTo(Volume volume) {
        double thisValueInBase = this.volumeUnit.convertToBase(this.value);
        double otherValueInBase = volume.volumeUnit.convertToBase(volume.value);
        return thisValueInBase == otherValueInBase;
    }


}

