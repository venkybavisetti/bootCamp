package com.step.parking;

public class ParkingLot {
    private int filledSlotsCount;
    private final int totalSlotsCount;
//    private final Attendant observer;

    public ParkingLot(int totalSlotsCount) {
        this.filledSlotsCount = 0;
        this.totalSlotsCount = totalSlotsCount;
    }

    public boolean park() {
        if (isFull()) return false;
        this.filledSlotsCount++;
        if(isFull()) notifyObserver();
        return true;
    }

    private void notifyObserver() {

    }

    public boolean isFull() {
        return totalSlotsCount == filledSlotsCount;
    }
}
