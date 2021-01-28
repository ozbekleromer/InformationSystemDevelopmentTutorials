package ozbek.BYT1112;

/**
 * created by ozbek
 */
public class NewPatient extends Person{
    private int idNewPatient;

    public NewPatient() {
    }

    public NewPatient(int idPerson, String name, String surname, String address, String telephone, int idNewPatient) {
        super(idPerson, name, surname, address, telephone);
        this.idNewPatient = idNewPatient;
    }

    public Patient signUp() {
        return new Patient(this.idNewPatient, super.getName(), super.getSurname(), super.getAddress(), super.getTelephone());
    }

    public int getIdNewPatient() {
        return idNewPatient;
    }

    public void setIdNewPatient(int idNewPatient) {
        this.idNewPatient = idNewPatient;
    }
}
