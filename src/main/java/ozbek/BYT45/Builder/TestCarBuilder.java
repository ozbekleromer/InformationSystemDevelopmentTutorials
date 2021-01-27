package ozbek.BYT45.Builder;

/**
 * created by ozbek on 2021-01-01
 */
public class TestCarBuilder {

    public static void main(String[] args) {
        CarBuilder suvBuilder = new SUVBuilder();
        CarEngineer carEngineer = new CarEngineer(suvBuilder);
        carEngineer.makeCar();

        Car suvCar = carEngineer.getCar();
        System.out.println("SUV Built");
        System.out.println("Car Color: " + suvCar.getColor());
        System.out.println("Car Engine Size: " + suvCar.getEngine());
        System.out.println("Car Max Speed: " + suvCar.getMaxSpeed());
        System.out.println("Car Seat Count: " + suvCar.getSeat());

        System.out.println("*********************************");

        CarBuilder sportCarBuilder = new SportCarBuilder();
        carEngineer = new CarEngineer(sportCarBuilder);
        carEngineer.makeCar();

        Car sportCar = carEngineer.getCar();
        System.out.println("Sport Car Built");
        System.out.println("Car Color: " + sportCar.getColor());
        System.out.println("Car Engine Size: " + sportCar.getEngine());
        System.out.println("Car Max Speed: " + sportCar.getMaxSpeed());
        System.out.println("Car Seat Count: " + sportCar.getSeat());
    }
}
