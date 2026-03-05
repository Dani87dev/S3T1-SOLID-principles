package mySolution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class InstrumentPlayerTest {

    @Test
    void checkPlayerWorksWithGuitar() {
        // 1. Preparem l'instrument real i el jugador
        Guitar myGuitar = new Guitar("Gibson");
        InstrumentPlayer playerTest = new InstrumentPlayer("Dani", myGuitar);

        // 2. Verifiquem que pot afinar i tocar sense llançar errors
        assertDoesNotThrow(() -> {
            playerTest.tuneInstrument();
            playerTest.playInstrument();
        });
    }

    @Test
    void checkOCPWithNewInstrument() {
        Musicable saxo = new Musicable() {
            @Override
            public String play() {
                return "🎷 Jazzing it up";
            }

            @Override
            public String getName() {
                return "Saxophone";
            }
        };

        InstrumentPlayer playerTest2 = new InstrumentPlayer("Lisa", saxo);

        assertDoesNotThrow(() -> {
            playerTest2.tuneInstrument();
            playerTest2.playInstrument();
        });
    }
}