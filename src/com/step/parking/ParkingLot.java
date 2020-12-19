package com.step.parking;

public class ParkingLot {
    private int filledSlotsCount;
    private final int totalSlotsCount;

    public ParkingLot(int totalSlotsCount) {
        this.filledSlotsCount = 0;
        this.totalSlotsCount = totalSlotsCount;
    }

    public boolean park() {
        if (totalSlotsCount == filledSlotsCount) return false;
        this.filledSlotsCount++;
        return true;
    }
}
