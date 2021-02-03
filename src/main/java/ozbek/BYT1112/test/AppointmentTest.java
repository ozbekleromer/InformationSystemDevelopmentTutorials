package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import ozbek.BYT1112.*;

import java.time.LocalDate;
import java.util.Date;

/**
 * created by ozbek
 */
public class AppointmentTest extends TestCase {
    Appointment appointment;

    @Before
    public void setUp() throws Exception {
        appointment = new Appointment(1, new Bill(1, appointment, 1), new Date(2021,01,01), new Patient());
    }

    @Test
    public void testGetIdAppointment() {
        assertEquals(1, appointment.getIdAppointment());
    }

    @Test
    public void testSetIdAppointment() {
        appointment.setIdAppointment(2);
        assertEquals(2, appointment.getIdAppointment());
    }

    @Test
    public void testGetDate() {
        assertEquals(new Date(2021,01,01), appointment.getDate());
    }

    @Test
    public void testSetDate() {
        appointment.setDate(new Date(2022,01,01));
        assertEquals(new Date(2022,01,01), appointment.getDate());
    }
}