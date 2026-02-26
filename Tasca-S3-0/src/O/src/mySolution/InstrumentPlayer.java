package mySolution;

public class InstrumentPlayer {

    private Musicable musicalInstrument;
    private String playerName;

    public InstrumentPlayer(String playerName, Musicable musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
        this.playerName = playerName;
    }

    public Musicable getMusicalInstrument() {
        return musicalInstrument;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setMusicalInstrument(Musicable musicalInstrument) {
        this.musicalInstrument = musicalInstrument;
    }

    public void playInstrument(){
        System.out.println(this.musicalInstrument.play());
    }

    public void tuneInstrument(){
        System.out.println(this.getPlayerName() + " tunes the " + this.getMusicalInstrument().getName());
        System.out.println(this.getPlayerName() + " looks at the audience and gets ready to play...");
    }

}