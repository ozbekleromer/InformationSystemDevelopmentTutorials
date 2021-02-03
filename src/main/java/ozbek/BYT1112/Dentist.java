package ozbek.BYT1112;

import java.util.Date;
import java.util.List;

/**
 * created by ozbek
 */
public class Dentist extends Employee{
    private int idDentist;
    private Clinic clinic;
    private List<Treatment> treatments;

    public Dentist() {
    }

    public Dentist(int idPerson, String name, String surname, String address, String telephone, int idEmployee, Date hireDate, double salary) {
        super(idPerson, name, surname, address, telephone, idEmployee, hireDate, salary);
    }

    public Dentist(int idPerson, String name, String surname, String address, String telephone, int idEmployee, Date hireDate, double salary, int idDentist, Clinic clinic, List<Treatment> treatments) {
        super(idPerson, name, surname, address, telephone, idEmployee, hireDate, salary);
        this.idDentist = idDentist;
        this.clinic = clinic;
        this.treatments = treatments;
    }

    public String enterDiagnosis() {
        return "Diagnose";
    }

    public String createPrescription() {
        return "Diagnose";
    }

    public int getIdDentist() {
        return idDentist;
    }

    public void setIdDentist(int idDentist) {
        this.idDentist = idDentist;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public List<Treatment> getTreatments() {
        return treatments;
    }

    public void setTreatments(List<Treatment> treatments) {
        this.treatments = treatments;
    }
}
