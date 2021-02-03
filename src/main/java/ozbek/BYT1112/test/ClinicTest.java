package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.*;

import java.util.ArrayList;

/**
 * created by ozbek
 */

public class ClinicTest extends TestCase {
    Clinic clinic;

    @Before
    public void setUp() throws Exception {
        clinic = new Clinic(1, new ArrayList<Dentist>(), new Receptionist(), new ArrayList<Patient>(), new Admin());
    }

    public void testGetIdClinic() {
        assertEquals(1, clinic.getIdClinic());
    }

    public void testSetIdClinic() {
        clinic.setIdClinic(2);
        assertEquals(2, clinic.getIdClinic());
    }
}