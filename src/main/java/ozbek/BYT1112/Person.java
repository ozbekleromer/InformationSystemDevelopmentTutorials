package ozbek.BYT1112;

/**
 * created by ozbek on 2021-01-27
 */
public class Person {
    private int idPerson;
    private String name;
    private String surname;
    private String address;
    private String telephone;

    public Person(int idPerson, String name, String surname, String address, String telephone) {
        this.idPerson = idPerson;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.telephone = telephone;
    }

    public void login() {

    }

    public void logout() {

    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
