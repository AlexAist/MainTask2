package by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;

import java.util.Objects;

public class Universal extends Car {

    private int seats;

    public Universal() {
        super();
    }

    public Universal ( int horsePower, String model, String mark, int price, boolean childSeat,
                  boolean onService, int seats){
        super( horsePower, model, mark, price, childSeat, onService);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Universal universal = (Universal) o;
        return seats == universal.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats);
    }

    @Override
    public String toString() {
        return  "Car{" +
                " horsePower=" + getHorsePower() +
                ", model='" + getModel() + '\'' +
                ", mark='" + getMark() + '\'' +
                ", price=" + getPrice() +
                ", childSeat=" + isChildSeat() +
                ", onService=" + isOnService() +
                '}' +
                "Universal{" +
                "seats=" + seats +
                '}';
    }
}
