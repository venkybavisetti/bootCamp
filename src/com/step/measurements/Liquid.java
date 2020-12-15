package com.step.measurements;

public class Liquid {
    private final double value;
    private final Volume volume;

    public Liquid(double value, Volume volume) {
        this.value = value;
        this.volume = volume;
    }

    public boolean equalsTo(Liquid liquid) {
        double thisValueInBase = this.volume.convertToBase(this.value);
        double otherValueInBase = liquid.volume.convertToBase(liquid.value);
        return thisValueInBase == otherValueInBase;
    }


}

