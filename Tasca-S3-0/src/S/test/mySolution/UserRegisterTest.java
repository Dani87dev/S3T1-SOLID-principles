package mySolution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class UserRegisterTest {

    private  UserRegister registration;

    @BeforeEach
    void setUp() {
        User user = new User("Dani", "dani@gmail.com", "Danidanidani123");
        UserConfirmation confirmation = new UserConfirmation();
        UserValidator validation = new UserValidator();
        registration = new UserRegister(user, validation, confirmation);

    }


    @Test
    void UserRegisterWorks(){

        assertDoesNotThrow( () -> registration.register());
    }


}
