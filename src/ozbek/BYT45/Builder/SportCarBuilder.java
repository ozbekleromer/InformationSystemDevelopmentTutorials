package ozbek.BYT45.Builder;

/**
 * created by ozbek on 2021-01-01
 */
public class SportCarBuilder implements CarBuilder {

    private Car sportCar;

    public SportCarBuilder() {
        this.sportCar = new Car();
    }

    @Override
    public void buildSeats() {
        sportCar.setSeat(2);
    }

    @Override
    public void buildMaxSpeed() {
        sportCar.setMaxSpeed(300);
    }

    @Override
    public void buildEngine() {
        sportCar.setEngine(6.0);
    }

    @Override
    public void buildColor() {
        sportCar.setColor("Red");
    }

    @Override
    public Car getCar() {
        return sportCar;
    }
}
