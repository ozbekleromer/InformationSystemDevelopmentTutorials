package ozbek.BYT1112;

import java.util.Date;

/**
 * created by ozbek
 */
public class Receptionist extends Employee{
    private int idReceptionist;
    private Clinic clinic;

    public Receptionist() {
    }

    public Receptionist(int idPerson, String name, String surname, String address, String telephone, int idEmployee, Date hireDate, double salary, int idReceptionist, Clinic clinic) {
        super(idPerson, name, surname, address, telephone, idEmployee, hireDate, salary);
        this.idReceptionist = idReceptionist;
        this.clinic = clinic;
    }

    public boolean confirmPayment() {
        return true;
    }

    public Appointment createAppointment() {
        return new Appointment();
    }

    public Appointment editAppointment() {
        return new Appointment();
    }

    public Appointment cancelAppointment() {
        return new Appointment();
    }

    public int getIdReceptionist() {
        return idReceptionist;
    }

    public void setIdReceptionist(int idReceptionist) {
        this.idReceptionist = idReceptionist;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
}
