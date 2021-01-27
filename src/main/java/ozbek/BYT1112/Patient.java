package ozbek.BYT1112;

/**
 * created by ozbek on 2021-01-27
 */
public class Patient extends Person{
    private int idPatient;

    public Patient(int idPerson, String name, String surname, String address, String telephone, int idPatient) {
        super(idPerson, name, surname, address, telephone);
        this.idPatient = idPatient;
    }

    public String showPrescription() {
        return "Prescription";
    }

    public String editAppointment() {
        return "New appointment details";
    }

    public String createAppointment() {
        return "New appointment details";
    }

    public String makePayment() {
        return "Payment details";
    }

    public String cancelAppointment() {
        return "Canceled appointment details";
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }
}
