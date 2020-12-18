package com.step.measurements;

import com.step.measurements.quantity.Temperature;
import com.step.measurements.unit.TemperatureUnit;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {
    @Test
    public void shouldBeEqualWhenTwoTemperatureAreSame() {
        Temperature inCelsius = new Temperature(100, TemperatureUnit.CELSIUS);
        Temperature inFahrenheit = new Temperature(212, TemperatureUnit.FAHRENHEIT);
        assertTrue(inCelsius.equalsTo(inFahrenheit));
    }
}