package ozbek.BYT1112;

/**
 * created by ozbek
 */
public class Admin extends Person{
    private int idAdmin;
    private Clinic clinic;

    public Admin() {
    }

    public Admin(int idPerson, String name, String surname, String address, String telephone, int idAdmin, Clinic clinic) {
        super(idPerson, name, surname, address, telephone);
        this.idAdmin = idAdmin;
        this.clinic = clinic;
    }

    public void manageUsers() {

    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
}
