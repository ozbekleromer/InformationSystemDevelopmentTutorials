package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.Clinic;
import ozbek.BYT1112.Prescription;
import ozbek.BYT1112.Receptionist;
import ozbek.BYT1112.Treatment;

import java.util.ArrayList;
import java.util.Date;

/**
 * created by ozbek
 */
public class ReceptionistTest extends TestCase {
    Receptionist receptionist;

    @Before
    public void setUp() throws Exception {
        receptionist = new Receptionist(1, "ALi", "Guler", "Warsaw", "555555555", 1, new Date(), 5000.0, 1, new Clinic());
    }

    public void testGetIdReceptionist() {
        assertEquals(1, receptionist.getIdReceptionist());
    }

    public void testSetIdReceptionist() {
        receptionist.setIdReceptionist(2);
        assertEquals(2, receptionist.getIdReceptionist());
    }
}