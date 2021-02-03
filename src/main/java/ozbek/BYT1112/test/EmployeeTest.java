package ozbek.BYT1112.test;

import junit.framework.TestCase;
import org.junit.Before;
import ozbek.BYT1112.Clinic;
import ozbek.BYT1112.Dentist;
import ozbek.BYT1112.Employee;

import java.util.ArrayList;
import java.util.Date;

/**
 * created by ozbek
 */
public class EmployeeTest extends TestCase {
    Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee(1, "ALi", "Guler", "Warsaw", "555555555", 1, new Date(2021, 01, 01), 5000.0);
    }

    public void testGetIdEmployee() {
        assertEquals(1, employee.getIdEmployee());
    }

    public void testSetIdEmployee() {
        employee.setIdEmployee(2);
        assertEquals(2, employee.getIdEmployee());
    }

    public void testGetHireDate() {
        assertEquals( new Date(2021, 01, 01), employee.getHireDate());
    }

    public void testSetHireDate() {
        employee.setHireDate( new Date(2022, 01, 01));
        assertEquals(new Date(2022, 01, 01), employee.getHireDate());
    }

    public void testGetSalary() {
        assertEquals(5000.0, employee.getSalary());
    }

    public void testSetSalary() {
        employee.setSalary(2000.0);
        assertEquals(2000.0, employee.getSalary());
    }
}
