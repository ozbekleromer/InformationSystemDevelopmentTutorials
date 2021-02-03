package ozbek.BYT1112;

import java.util.List;

/**
 * created by ozbek
 */
public class Patient extends Person{
    private int idPatient;
    private List<Appointment> appointments;
    private List<Treatment> treatments;

    public Patient() {
    }

    public Patient(int idPerson, String name, String surname, String address, String telephone) {
        super(idPerson, name, surname, address, telephone);
    }

    public Patient(int idPerson, String name, String surname, String address, String telephone, int idPatient, List<Appointment> appointments, List<Treatment> treatments) {
        super(idPerson, name, surname, address, telephone);
        this.idPatient = idPatient;
        this.appointments = appointments;
        this.treatments = treatments;
    }

    public Prescription showPrescription() {
        return new Prescription();
    }

    public Appointment editAppointment() {
        return new Appointment();
    }

    public Appointment createAppointment() {
        return new Appointment();
    }

    public Appointment cancelAppointment() {
        return new Appointment();
    }

    public Bill makePayment() {
        return new Bill();
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }
}
