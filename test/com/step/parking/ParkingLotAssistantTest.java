package com.step.parking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotAssistantTest {
    @Test
    public void shouldAddParkingLot() {
        ParkingLotAssistant parkingLotAssistant = new ParkingLotAssistant();
        assertTrue(parkingLotAssistant.addParkingLot(new ParkingLot(5)));
    }

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
        parkingLot.park();
        parkingLotAssistant.addParkingLot(parkingLot);
        assertFalse(parkingLotAssistant.park());
    }
}