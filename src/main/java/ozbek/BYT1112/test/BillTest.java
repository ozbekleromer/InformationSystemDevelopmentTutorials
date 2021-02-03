package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import ozbek.BYT1112.Admin;
import ozbek.BYT1112.Appointment;
import ozbek.BYT1112.Bill;
import ozbek.BYT1112.Clinic;

/**
 * created by ozbek
 */

public class BillTest extends TestCase {
    Bill bill;

    @Before
    public void setUp() throws Exception {
        bill = new Bill(1, new Appointment(), 1.0);
    }

    @Test
    public void testGetIdBill() {
        assertEquals(1, bill.getIdBill());
    }

    public void testSetIdBill() {
        bill.setIdBill(2);
        assertEquals(2, bill.getIdBill());
    }

    public void testGetAmount() {
        assertEquals(1.0, bill.getAmount());
    }

    public void testSetAmount() {
        bill.setAmount(2.0);
        assertEquals(2.0, bill.getAmount());
    }
}