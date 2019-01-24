package by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.lorry;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;

import java.util.Objects;

public class Lorry extends Car {

    private int carrying;

    public Lorry() {
        super();
    }

    public Lorry ( int horsePower, String model, String mark, int price, boolean childSeat,
                  boolean onService, int carrying){
        super( horsePower, model, mark, price, childSeat, onService);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lorry lorry = (Lorry) o;
        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carrying);
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
                "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
