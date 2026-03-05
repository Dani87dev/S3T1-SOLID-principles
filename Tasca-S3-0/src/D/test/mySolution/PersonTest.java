package mySolution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    @Test
    void testCrearPersonaIModificarNom() {
        Person p = new Person("Marc");
        assertEquals("Marc", p.getName());

        p.setName("Anna");
        assertEquals("Anna", p.getName());
    }
}