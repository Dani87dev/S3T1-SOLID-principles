package mySolution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class AirConditionerTest {

    @Test
    void testAirConditionerActions() {
        AirConditioner coldTurboMax = new AirConditioner();

        assertDoesNotThrow(() -> {
            coldTurboMax.turnOn();
            coldTurboMax.heat();
            coldTurboMax.cool();
            coldTurboMax.turnOff();
        });
    }
}