package com.step.parking;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotAttendantTest {
    @Test
    public void shouldAddParkingLot() {
        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant();
        assertTrue(parkingLotAttendant.addParkingLot(new ParkingLot(5)));
    }

    @Test
    public void shouldParkCarInParkingLot() {
        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant();
        parkingLotAttendant.addParkingLot(new ParkingLot(5));
        parkingLotAttendant.addParkingLot(new ParkingLot(5));
        assertTrue(parkingLotAttendant.park());
    }

    @Test
    public void shouldNotParkCarInParkingLotWhenAllParkingLotsAreFull() {
        ParkingLotAttendant parkingLotAttendant = new ParkingLotAttendant();
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        parkingLotAttendant.addParkingLot(parkingLot);
        assertFalse(parkingLotAttendant.park());
    }
}