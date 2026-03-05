package mySolution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ServicePersonTest {
    
    @Test
    void checkWorksWithOtherDdbbSystems() {

        Saveable otherTypeDdbb = new Saveable() {

            @Override
            public void savePerson(Person person) {
                System.out.println("Saving at :" + person.getName());
            }

        };

        ServicePerson serviceFakeforTest = new ServicePerson(otherTypeDdbb);

        Person testPerson = new Person("testPersonJohny");

        assertDoesNotThrow(() -> serviceFakeforTest.SaveData(testPerson));
    }
}
