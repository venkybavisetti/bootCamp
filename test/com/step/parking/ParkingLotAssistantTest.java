package com.step.parking;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ParkingLotAssistantTest {
    @Test
    public void shouldNotifyListenerWhenParkingLotIsFull() {
        final ParkingLotAssistant parkingLotAssistant = mock(ParkingLotAssistant.class);
        final ParkingLot parkingLot = new ParkingLot(1);

        parkingLot.addListener(parkingLotAssistant, ParkingLotEvent.FULL);
        parkingLot.park();
        parkingLot.park();

        verify(parkingLotAssistant).onStatusUpdate(parkingLot);
    }
}