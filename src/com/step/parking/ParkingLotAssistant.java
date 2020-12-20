package com.step.parking;

import java.util.HashMap;

public class ParkingLotAssistant implements ParkingLotListener{
    private final HashMap<ParkingLot, ParkingLotStatus> parkingLots;

    public ParkingLotAssistant() {
        this.parkingLots = new HashMap<>();
    }

    public boolean park() {
        for (ParkingLot parkingLot : this.parkingLots.keySet()) {
            if (parkingLot.park()) return true;
        }
        return false;
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLot.addListener(this::listen);
        this.parkingLots.put(parkingLot, ParkingLotStatus.VACANT);
    }

    @Override
    public void listen(ParkingLot parkingLot) {
        this.parkingLots.put(parkingLot, ParkingLotStatus.FULL);
    }
}
