package by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.minibus;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;

import java.util.Objects;

public class Transporter extends Car {

    private int trunkVol;
    private int seats;

    public Transporter() {
        super();
    }

    public Transporter ( int horsePower, String model, String mark, int price, boolean childSeat,
                  boolean onService, int trunkVol, int seats){
        super( horsePower, model, mark, price, childSeat, onService);
        this.seats = seats;
        this.trunkVol = trunkVol;
    }

    public int getTrunkVol() {
        return trunkVol;
    }

    public void setTrunkVol(int trunkVol) {
        this.trunkVol = trunkVol;
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
        Transporter that = (Transporter) o;
        return trunkVol == that.trunkVol &&
                seats == that.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trunkVol, seats);
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
                "Transporter{" +
                "trunkVol=" + trunkVol +
                ", seats=" + seats +
                '}';
    }
}
