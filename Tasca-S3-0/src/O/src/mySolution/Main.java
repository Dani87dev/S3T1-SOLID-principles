package mySolution;

public class Main {

    public static void main (String[] args){

        Guitar daniGuitar = new Guitar("\"Guitar Manoli the Rocker\".");

        InstrumentPlayer dani = new InstrumentPlayer("Dani", daniGuitar);

        dani.tuneInstrument();
        dani.playInstrument();


        //TEST OBLGATORI
    }

}
