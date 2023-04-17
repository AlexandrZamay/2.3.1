package web.Model;

public class Car {
    public Car() {}

    public Car(int maxSpeed, boolean isMechanical, String color) {
        this.maxSpeed = maxSpeed;
        this.isMechanical = isMechanical;
        this.color = color;
    }

    public int maxSpeed;
    public boolean isMechanical;
    public String color;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isMechanical() {
        return isMechanical;
    }

    public void setMechanical(boolean mechanical) {
        isMechanical = mechanical;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", isMechanical=" + isMechanical +
                ", color='" + color + '\'' +
                '}';
    }
}
