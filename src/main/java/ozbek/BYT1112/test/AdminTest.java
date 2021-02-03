package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import ozbek.BYT1112.Admin;
import ozbek.BYT1112.Clinic;

/**
 * created by ozbek
 */
public class AdminTest extends TestCase {
    Admin admin;

    @Before
    public void setUp() throws Exception {
        admin = new Admin(1, "Omer", "Ozbek", "Warsaw", "555555555", 1, new Clinic());
    }

    @Test
    public void testGetIdAdmin() {
        assertEquals(1, admin.getIdAdmin());
    }

    @Test
    public void testSetIdAdmin() {
        admin.setIdAdmin(2);
        assertEquals(2, admin.getIdAdmin());
    }
}