package com.step.parking;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class ParkingLotTest {
    @Test
    public void shouldParkCar() {
        ParkingLot parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.park());
    }

    @Test
    public void shouldNotParkCar() {
        ParkingLotListener mockListener = mock(ParkingLotListener.class);
        ParkingLot parkingLot = new ParkingLot(1);

        parkingLot.addListener(mockListener);
        parkingLot.park();
        assertFalse(parkingLot.park());
    }

    @Test
    public void shouldGetStatusOfTheParkingLotWhenParkingLotIsFull() {
        ParkingLotListener mockListener = mock(ParkingLotListener.class);

        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.addListener(mockListener);
        parkingLot.park();
        assertTrue(parkingLot.isFull());
    }

    @Test
    public void shouldGetStatusOfTheParkingLotWhenParkingLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertFalse(parkingLot.isFull());
    }
}
