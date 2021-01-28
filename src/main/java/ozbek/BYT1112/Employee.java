package ozbek.BYT1112;

import java.util.Date;

/**
 * created by ozbek
 */
public class Employee extends Person{
    private int idEmployee;
    private Date hireDate;
    private double salary;

    public Employee() {
    }

    public Employee(int idPerson, String name, String surname, String address, String telephone, int idEmployee, Date hireDate, double salary) {
        super(idPerson, name, surname, address, telephone);
        this.idEmployee = idEmployee;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
