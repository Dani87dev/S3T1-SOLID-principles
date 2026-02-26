package mySolution;

public class ServicePerson {

    private Saveable saveTypeDB;

    //Constr
    public ServicePerson(Saveable saveTypeDB) {

        this.saveTypeDB = saveTypeDB;
    }

    //Saving
    public void SaveData(Person person) {

        saveTypeDB.savePerson(person);
    }


}
