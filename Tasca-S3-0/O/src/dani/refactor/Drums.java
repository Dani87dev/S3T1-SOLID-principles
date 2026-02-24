package dani.refactor;

public class Drums extends  Instrument {

    public Drums(String name) {
        super(name);
    }


    @Override
    public String play() {
        return "🥁 Beating the drums";
    }
}
