package ozbek.BYT1112;

import java.util.Date;

/**
 * created by ozbek
 */
public class Appointment {
    private int idAppointment;
    private Bill bill;
    private Date date;
    private Patient patient;

    public Appointment() {
    }

    public Appointment(int idAppointment, Bill bill, Date date, Patient patient) {
        this.idAppointment = idAppointment;
        this.bill = bill;
        this.date = date;
        this.patient = patient;
    }

    public int getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
