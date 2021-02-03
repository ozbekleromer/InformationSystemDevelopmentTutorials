package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.NewPatient;
import ozbek.BYT1112.Patient;

import java.util.ArrayList;

/**
 * created by ozbek
 */
public class PatientTest extends TestCase {
    Patient patient;

    @Before
    public void setUp() throws Exception {
        patient = new Patient(1, "Eren", "Yalcin", "Warsaw", "555555555", 1, new ArrayList<>(), new ArrayList<>());
    }

    public void testGetIdPatient() {
        assertEquals(1, patient.getIdPatient());
    }

    public void testSetIdPatient() {
        patient.setIdPatient(2);
        assertEquals(2, patient.getIdPatient());
    }
}
