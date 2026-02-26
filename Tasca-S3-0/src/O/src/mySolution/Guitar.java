package mySolution;

public class Guitar extends Instrument {

    public Guitar(String name) {
        super(name);
    }

    @Override
    public String play() {
        return "🎸 Strumming the guitar";
    }
}
