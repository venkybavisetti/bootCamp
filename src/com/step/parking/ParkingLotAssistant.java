package com.step.parking;

import java.util.ArrayList;

public class ParkingLotAssistant implements ParkingLotListener {
    private final ArrayList<ParkingLotInfo> filledParkingLots;

    public ParkingLotAssistant() {
        this.filledParkingLots = new ArrayList<>();
    }

    @Override
    public void onStatusUpdate(ParkingLotInfo parkingLotInfo) {
        this.filledParkingLots.add(parkingLotInfo);
    }
}
