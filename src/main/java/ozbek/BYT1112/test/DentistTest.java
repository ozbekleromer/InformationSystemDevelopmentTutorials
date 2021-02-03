package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.*;

import java.util.ArrayList;
import java.util.Date;

/**
 * created by ozbek
 */
public class DentistTest extends TestCase {
    Dentist dentist;

    @Before
    public void setUp() throws Exception {
        dentist = new Dentist(1, "ALi", "Guler", "Warsaw", "555555555", 1, new Date(), 5000.0, 1, new Clinic(), new ArrayList<>());
    }

    public void testGetIdDentist() {
        assertEquals(1, dentist.getIdDentist());
    }

    public void testSetIdDentist() {
        dentist.setIdDentist(2);
        assertEquals(2, dentist.getIdDentist());
    }
}