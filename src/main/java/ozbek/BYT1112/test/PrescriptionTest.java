package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.Person;
import ozbek.BYT1112.Prescription;
import ozbek.BYT1112.Treatment;

/**
 * created by ozbek
 */
public class PrescriptionTest extends TestCase {
    Prescription prescription;

    @Before
    public void setUp() throws Exception {
        prescription = new Prescription(1, "newPrescription", 200.0, new Treatment());
    }

    public void testTestGetName() {
        assertEquals(1, prescription.getIdPrescription());
    }

    public void testTestSetName() {
        prescription.setIdPrescription(2);
        assertEquals(2, prescription.getIdPrescription());
    }

    public void testGetAmount() {
        assertEquals(200.0, prescription.getAmount());
    }

    public void testSetAmount() {
        prescription.setAmount(300.0);
        assertEquals(300.0, prescription.getAmount());
    }
}
