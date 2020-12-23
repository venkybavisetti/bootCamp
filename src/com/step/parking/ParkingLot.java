package com.step.parking;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLot implements ParkingLotInfo {
    private final int totalSlotsCount;
    private final HashMap<ParkingLotEvent, ArrayList<ParkingLotListener>> listeners;
    private int filledSlotsCount;

    public ParkingLot(int totalSlotsCount) {
        this.filledSlotsCount = 0;
        this.totalSlotsCount = totalSlotsCount;
        this.listeners = new HashMap<>();

        for (ParkingLotEvent event : ParkingLotEvent.values()) {
            this.listeners.put(event, new ArrayList<>());
        }
    }

    public boolean park() {
        if (isFull()) return false;
        this.filledSlotsCount++;
        this.notifyListener();
        return true;
    }

    public void addListener(ParkingLotListener parkingLotListener, ParkingLotEvent parkingLotEvent) {
        this.listeners.get(parkingLotEvent).add(parkingLotListener);
    }

    private void notifyListener() {
        if (this.isFull())
            notifyAll(ParkingLotEvent.FULL);
        if (this.isAlmostFull())
            notifyAll(ParkingLotEvent.ALMOST_FULL);
        if (this.isAlmostEmpty())
            notifyAll(ParkingLotEvent.ALMOST_EMPTY);
    }

    private void notifyAll(ParkingLotEvent event) {
        for (ParkingLotListener parkingLotListener : this.listeners.get(event)) {
            parkingLotListener.onStatusUpdate(this);
        }
    }

    private boolean isAlmostEmpty() {
        return this.getPercentage() <= 20;
    }

    private boolean isAlmostFull() {
        return this.getPercentage() == 80;
    }

    private double getPercentage() {
        return (this.filledSlotsCount * 100.0) / this.totalSlotsCount;
    }

    private boolean isFull() {
        return totalSlotsCount == filledSlotsCount;
    }

    @Override
    public int getParkingLotId() {
        return this.hashCode();
    }
}
