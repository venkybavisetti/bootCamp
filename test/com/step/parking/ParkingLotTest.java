package com.step.parking;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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

        parkingLot.addListener(mockListener, ParkingLotEvent.FULL);
        parkingLot.park();

        assertFalse(parkingLot.park());
        verify(mockListener).onStatusUpdate(parkingLot);
    }

    @Test
    public void shouldGetNotifiedWhenTheParkingLotIsAlmostFull() {
        ParkingLotListener mockListener = mock(ParkingLotListener.class);
        ParkingLot parkingLot = new ParkingLot(5);

        parkingLot.addListener(mockListener, ParkingLotEvent.ALMOST_FULL);
        parkingLot.park();
        parkingLot.park();
        parkingLot.park();

        assertTrue(parkingLot.park());
        verify(mockListener).onStatusUpdate(parkingLot);
    }

    @Test
    public void shouldGetNotifiedWhenTheParkingLotIsAlmostEmpty() {
        ParkingLotListener mockListener = mock(ParkingLotListener.class);
        ParkingLot parkingLot = new ParkingLot(5);

        parkingLot.addListener(mockListener, ParkingLotEvent.ALMOST_EMPTY);

        assertTrue(parkingLot.park());
        verify(mockListener).onStatusUpdate(parkingLot);
    }
}
