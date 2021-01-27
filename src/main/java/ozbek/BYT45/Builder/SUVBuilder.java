package ozbek.BYT45.Builder;

/**
 * created by ozbek on 2021-01-01
 */
public class SUVBuilder implements CarBuilder {

    private Car SUVCar;

    public SUVBuilder() {
        this.SUVCar = new Car();
    }

    @Override
    public void buildSeats() {
        SUVCar.setSeat(5);
    }

    @Override
    public void buildMaxSpeed() {
        SUVCar.setMaxSpeed(160);
    }

    @Override
    public void buildEngine() {
        SUVCar.setEngine(2.0);
    }

    @Override
    public void buildColor() {
        SUVCar.setColor("Black");
    }

    @Override
    public Car getCar() {
        return SUVCar;
    }
}
