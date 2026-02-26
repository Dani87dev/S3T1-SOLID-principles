package mySolution;

public abstract class Instrument implements Musicable {

    private String name;

    public Instrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract String play();
}