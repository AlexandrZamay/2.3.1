package web.Model;

public class Car {
    public Car() {}

    public Car(int series, boolean isMechanical, String color) {
        this.series = series;
        this.isMechanical = isMechanical;
        this.color = color;
    }

    public int series;
    public boolean isMechanical;
    public String color;

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
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
                "maxSpeed=" + series +
                ", isMechanical=" + isMechanical +
                ", color='" + color + '\'' +
                '}';
    }
}
