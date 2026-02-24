package dani.refactor;

public class InstrumentPlayer {

    private Musicable instrumentMusical;

    public InstrumentPlayer(Musicable instrumentMusical) {
        this.instrumentMusical = instrumentMusical;
    }

    public void playInstrument(){
        this.instrumentMusical.play();
    }

}
