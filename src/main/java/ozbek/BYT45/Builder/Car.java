package ozbek.BYT45.Builder;

/**
 * created by ozbek on 2021-01-01
 */
public class Car implements CarPlan {

    private int seat;
    private int maxSpeed;
    private double engine;
    private String Color;

    @Override
    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(String color) {
        Color = color;
    }

    public int getSeat() {
        return seat;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getEngine() {
        return engine;
    }

    public String getColor() {
        return Color;
    }
}
