package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.Patient;
import ozbek.BYT1112.Person;

import java.util.ArrayList;

/**
 * created by ozbek
 */
public class PersonTest extends TestCase {
    Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person(1, "Eren", "Yalcin", "Warsaw", "555555555");
    }

    public void testGetIdPerson() {
        assertEquals(1, person.getIdPerson());
    }

    public void testSetIdPerson() {
        person.setIdPerson(2);
        assertEquals(2, person.getIdPerson());
    }

    public void testTestGetName() {
        assertEquals("Eren", person.getName());
    }

    public void testTestSetName() {
        person.setName("Ali");
        assertEquals("Ali", person.getName());
    }

    public void testGetSurname() {
        assertEquals("Yalcin", person.getSurname());
    }

    public void testSetSurname() {
        person.setSurname("Guler");
        assertEquals("Guler", person.getSurname());
    }

    public void testGetAddress() {
        assertEquals("Warsaw", person.getAddress());
    }

    public void testSetAddress() {
        person.setAddress("Krakow");
        assertEquals("Krakow", person.getAddress());
    }

    public void testGetTelephone() {
        assertEquals("555555555", person.getTelephone());
    }

    public void testSetTelephone() {
        person.setTelephone("222222222");
        assertEquals("222222222", person.getTelephone());
    }
}