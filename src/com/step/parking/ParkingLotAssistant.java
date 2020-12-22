package com.step.parking;

import java.util.ArrayList;

public class ParkingLotAssistant implements ParkingLotListener {
    private final ArrayList<ParkingLot> filledParkingLots;

    public ParkingLotAssistant() {
        this.filledParkingLots = new ArrayList<>();
    }

    @Override
    public void onStatusUpdate(ParkingLot parkingLot) {
        this.filledParkingLots.add(parkingLot);
    }
}
