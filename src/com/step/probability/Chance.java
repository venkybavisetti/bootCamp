package com.step.probability;

import java.util.Objects;

public class Chance {
    private final double value;

    public Chance(double value) {
        this.value = value;
    }

    public Chance not() {
        return new Chance(1 - value);
    }

    public Chance and(Chance otherChance) {
        return new Chance(value * otherChance.value);
    }

    public Chance or( Chance otherChance) {
        return this.not().and(otherChance.not()).not();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance that = (Chance) o;
        return Double.compare(that.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
