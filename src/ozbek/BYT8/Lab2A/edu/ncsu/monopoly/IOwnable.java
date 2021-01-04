package ozbek.BYT8.Lab2A.edu.ncsu.monopoly;

/**
 * created by ozbek on 2021-01-03
 */
public interface IOwnable {
    String getName();

    Player getOwner();

    int getPrice();

    boolean isAvailable();

    void setAvailable(boolean available);

    void setName(String name);

    void setOwner(Player theOwner);

    String toString();
}
