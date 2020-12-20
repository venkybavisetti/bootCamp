package com.step.parking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotAssistantTest {
    @Test
    public void shouldParkCarInParkingLot() {
        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();
        parkingLotAssistant.addParkingLot(new ParkingLot(5));
        parkingLotAssistant.addParkingLot(new ParkingLot(5));
        assertTrue(parkingLotAssistant.park());
    }

    @Test
    public void shouldNotParkCarInParkingLotWhenAllParkingLotsAreFull() {
        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLotAssistant.addParkingLot(parkingLot);
        parkingLot.park();
        assertFalse(parkingLotAssistant.park());
    }
}