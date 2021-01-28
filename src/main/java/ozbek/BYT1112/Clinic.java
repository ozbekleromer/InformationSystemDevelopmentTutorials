package ozbek.BYT1112;

import java.util.List;

/**
 * created by ozbek
 */
public class Clinic {
    private int idClinic;
    private List<Dentist> dentists;
    private Receptionist receptionist;
    private List<Patient> patients;
    private Admin admin;

    public Clinic() {
    }

    public Clinic(int idClinic, List<Dentist> dentists, Receptionist receptionist, List<Patient> patients, Admin admin) {
        this.idClinic = idClinic;
        this.dentists = dentists;
        this.receptionist = receptionist;
        this.patients = patients;
        this.admin = admin;
    }

    public int getIdClinic() {
        return idClinic;
    }

    public void setIdClinic(int idClinic) {
        this.idClinic = idClinic;
    }

    public List<Dentist> getDentists() {
        return dentists;
    }

    public void setDentists(List<Dentist> dentists) {
        this.dentists = dentists;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
