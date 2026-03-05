package mySolution;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserValidatortest {

    private User user;
    private final UserValidator validator = new UserValidator();

    @BeforeEach
    void setUp() {
        user = new User("Dani", "dani@gmail.com", "dani1234@");
    }


    @Test
    void testEmailInvalid() {
        user.setEmail("123");

        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateUser(user);
        });
    }

    @Test
    void testEmailValid() {

        assertDoesNotThrow(() -> validator.validateUser(user));

    }

    @Test
    void testPasswordInvalid() {
        user.setPassword("aba");
        assertThrows(IllegalArgumentException.class, () -> {
            validator.validateUser(user);
        });
    }

    @Test
    void testPasswordValid() {

        assertDoesNotThrow(() -> validator.validateUser(user));
    }


}




