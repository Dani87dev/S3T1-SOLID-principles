package mySolution;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class WashingMachineTest {

    @Test
    void testWashingMachineActions() {
        WashingMachine cleanMaxWhiteTurbo = new WashingMachine();

        assertDoesNotThrow(() -> {
            cleanMaxWhiteTurbo.turnOn();
            cleanMaxWhiteTurbo.wash();
            cleanMaxWhiteTurbo.turnOff();
        });
    }
}