package by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;

import java.util.Objects;

public class Sedan extends Car {

    private int trunkVol;

    public Sedan() {
        super();
    }

    public Sedan (int horsePower, String model, String mark, int price, boolean childSeat,
                  boolean onService, int trunkVol){
        super( horsePower, model, mark, price, childSeat, onService);
        this.trunkVol = trunkVol;
    }

    public int getTrunkVol() {
        return trunkVol;
    }

    public void setTrunkVol(int trunkVol) {
        this.trunkVol = trunkVol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sedan sedan = (Sedan) o;
        return trunkVol == sedan.trunkVol;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), trunkVol);
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
                "Sedan{" +
                "trunkVol=" + trunkVol +
                '}';
    }
}
