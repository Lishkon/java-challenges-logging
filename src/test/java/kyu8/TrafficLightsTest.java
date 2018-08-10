package kyu8;



import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrafficLightsTest {
    @Test
    public void updateLightTests(){
        assertEquals("green", TrafficLights.updateLights("red"));
        assertEquals("yellow", TrafficLights.updateLights("green"));
        assertEquals("red", TrafficLights.updateLights("yellow"));
    }

}
