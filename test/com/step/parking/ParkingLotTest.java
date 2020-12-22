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
}
