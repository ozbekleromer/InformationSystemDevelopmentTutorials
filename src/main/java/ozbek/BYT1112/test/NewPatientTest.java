package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.Employee;
import ozbek.BYT1112.NewPatient;

import java.util.Date;

/**
 * created by ozbek
 */
public class NewPatientTest extends TestCase {
    NewPatient newPatient;

    @Before
    public void setUp() throws Exception {
        newPatient = new NewPatient(1, "Eren", "Yalcin", "Warsaw", "555555555", 1);
    }

    public void testGetIdNewPatient() {
        assertEquals(1, newPatient.getIdNewPatient());
    }

    public void testSetIdNewPatient() {
        newPatient.setIdNewPatient(2);
        assertEquals(2, newPatient.getIdNewPatient());
    }
}