package mySolution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MySqlTest {

    @Test
    void checkMySQLClassisWorking(){

        Saveable mySqlDdbb = new MySQL();

        ServicePerson testService = new ServicePerson(mySqlDdbb);
        Person testPerson = new Person("MySQL_test_user");

        assertDoesNotThrow(()->testService.SaveData(testPerson));

    }
}
