package com.step.parking;

public class ParkingLot {
    private int filledSlotsCount;
    private final int totalSlotsCount;
    private ParkingLotListener listener;

    public ParkingLot(int totalSlotsCount) {
        this.filledSlotsCount = 0;
        this.totalSlotsCount = totalSlotsCount;
    }

    public boolean park() {
        if (isFull()) return false;
        this.filledSlotsCount++;
        if(isFull()) notifyListener();
        return true;
    }

    private void notifyListener() {
        listener.listen(this);
    }

    public boolean isFull() {
        return totalSlotsCount == filledSlotsCount;
    }

    public void addListener(ParkingLotListener parkingLotListener) {
        this.listener = parkingLotListener;
    }
}
