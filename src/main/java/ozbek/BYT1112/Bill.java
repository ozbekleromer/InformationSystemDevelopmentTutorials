package ozbek.BYT1112;

/**
 * created by ozbek
 */
public class Bill {
    private int idBill;
    private Appointment appointment;
    private double amount;

    public Bill() {
    }

    public Bill(int idBill, Appointment appointment, double amount) {
        this.idBill = idBill;
        this.appointment = appointment;
        this.amount = amount;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
