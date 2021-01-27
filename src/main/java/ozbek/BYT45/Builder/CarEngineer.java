package ozbek.BYT45.Builder;

/**
 * created by ozbek on 2021-01-01
 */
public class CarEngineer {

    private CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        return this.carBuilder.getCar();
    }

    public void makeCar() {
        this.carBuilder.buildColor();
        this.carBuilder.buildEngine();
        this.carBuilder.buildSeats();
        this.carBuilder.buildMaxSpeed();
    }
}
