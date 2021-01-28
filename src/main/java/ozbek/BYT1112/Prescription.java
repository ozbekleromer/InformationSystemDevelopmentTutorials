package ozbek.BYT1112;

/**
 * created by ozbek
 */
public class Prescription {
    private int idPrescription;
    private String name;
    private double amount;
    private Treatment treatment;

    public Prescription() {
    }

    public Prescription(int idPrescription, String name, double amount, Treatment treatment) {
        this.idPrescription = idPrescription;
        this.name = name;
        this.amount = amount;
        this.treatment = treatment;
    }

    public int getIdPrescription() {
        return idPrescription;
    }

    public void setIdPrescription(int idPrescription) {
        this.idPrescription = idPrescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }
}
