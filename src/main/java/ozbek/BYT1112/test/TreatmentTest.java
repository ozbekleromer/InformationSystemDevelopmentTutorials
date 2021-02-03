package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.*;

import java.util.Date;

/**
 * created by ozbek
 */
public class TreatmentTest extends TestCase {
    Treatment treatment;

    @Before
    public void setUp() throws Exception {
        treatment = new Treatment(1, new Date(2021, 01, 01), "New Description", new Prescription(), new Dentist(), new Patient());
    }

    public void testGetIdTreatment() {
        assertEquals(1, treatment.getIdTreatment());
    }

    public void testSetIdTreatment() {
        treatment.setIdTreatment(2);
        assertEquals(2, treatment.getIdTreatment());
    }

    public void testGetDate() {
        assertEquals(new Date(2021, 01, 01), treatment.getDate());
    }

    public void testSetDate() {
        treatment.setDate(new Date(2022, 01, 01));
        assertEquals(new Date(2022, 01, 01), treatment.getDate());
    }

    public void testGetDescription() {
        assertEquals("New Description", treatment.getDescription());
    }

    public void testSetDescription() {
        treatment.setDescription("Newer Description");
        assertEquals("Newer Description", treatment.getDescription());
    }
}