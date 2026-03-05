package mySolution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class UserConfirmationTest {

    private User user;
    private final UserConfirmation confirmation= new UserConfirmation();

    @BeforeEach
    void setUp() {
        user = new User("Dani", "dani@gmail.com", "dani1234@");

    }


    @Test
    void testConfirmUserSucceful(){

        assertDoesNotThrow( () -> {confirmation.confirmUser(user);} );

    }


}
