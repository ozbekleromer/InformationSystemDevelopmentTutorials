package ozbek.BYT1112;

import java.util.Date;

/**
 * created by ozbek
 */
public class Treatment {
    private int idTreatment;
    private Date date;
    private String description;
    private Prescription prescription;
    private Dentist dentist;
    private Patient patient;

    public Treatment() {
    }

    public Treatment(int idTreatment, Date date, String description, Prescription prescription, Dentist dentist, Patient patient) {
        this.idTreatment = idTreatment;
        this.date = date;
        this.description = description;
        this.prescription = prescription;
        this.dentist = dentist;
        this.patient = patient;
    }

    public int getIdTreatment() {
        return idTreatment;
    }

    public void setIdTreatment(int idTreatment) {
        this.idTreatment = idTreatment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
