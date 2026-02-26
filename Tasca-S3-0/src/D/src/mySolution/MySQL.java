package mySolution;

public class MySQL implements Saveable{

    @Override
    public void savePerson(Person person) {
        System.out.println("Save in MySQL DB");
    }
}
