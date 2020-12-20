package com.step.parking;

import java.util.ArrayList;

public class ParkingLotAssistant {
    private final ArrayList<ParkingLot> parkingLots;

    public ParkingLotAssistant() {
        this.parkingLots = new ArrayList<>();
    }

    public boolean park() {
        for (ParkingLot parkingLot : this.parkingLots) {
            if (parkingLot.park()) return true;
        }
        return false;
    }

    public boolean addParkingLot(ParkingLot parkingLot) {
        return this.parkingLots.add(parkingLot);
    }
}
