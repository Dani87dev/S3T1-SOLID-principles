package mySolution;

public class Piano extends Instrument {

    public Piano(String name) {
        super(name);
    }


    @Override
    public String play() {
        return "🎹 Playing the piano";
    }
}
