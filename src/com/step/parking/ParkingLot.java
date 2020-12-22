package com.step.parking;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLot {
    private int filledSlotsCount;
    private final int totalSlotsCount;
    private final HashMap<ParkingLotEvent, ArrayList<ParkingLotListener>> listeners;

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
        if(this.isFull()){
            notifyAll(ParkingLotEvent.FULL);
        }
        if(this.isAlmostFull()){
            notifyAll(ParkingLotEvent.ALMOST_FULL);
        }
    }

    private void notifyAll(ParkingLotEvent event) {
        for (ParkingLotListener parkingLotListener : this.listeners.get(event)) {
            parkingLotListener.onStatusUpdate(this);
        }
    }

    private boolean isAlmostFull() {
        final double percentage = (double) this.filledSlotsCount / this.totalSlotsCount;
        return percentage >= 0.8;
    }

    private boolean isFull() {
        return totalSlotsCount == filledSlotsCount;
    }
}
