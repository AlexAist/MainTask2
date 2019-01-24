package by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.interfaces.CarInfo;

import java.util.ArrayList;
import java.util.Objects;

public class Car implements CarInfo {

    private int car_count = 0;
    private int horsePower;
    private String model;
    private String mark;
    private int price;
    private boolean childSeat = false;
    private boolean onService = false;

    public Car() {
    }

    public Car(int horsePower, String model, String mark, int price, boolean childSeat, boolean onService) {
        this.horsePower = horsePower;
        this.model = model;
        this.mark = mark;
        this.price = price;
        this.childSeat = childSeat;
        this.onService = onService;
    }

    public boolean isChildSeat() {
        return childSeat;
    }

    public void setChildSeat(boolean childSeat) {
        this.childSeat = childSeat;
    }

    public boolean isOnService() {
        return onService;
    }

    public void setOnService(boolean onService) {
        this.onService = onService;
    }

    public int getCar_count() {
        return car_count;
    }

    public void setCar_count(int car_count) {
        this.car_count = car_count;
    }


    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return  horsePower == car.horsePower &&
                price == car.price &&
                childSeat == car.childSeat &&
                onService == car.onService &&
                model.equals(car.model) &&
                mark.equals(car.mark);
    }

    @Override
    public int hashCode() {
        return Objects.hash( horsePower, model, mark, price, childSeat, onService);
    }

    @Override
    public String toString() {
        return "Car{" +
                " horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                ", childSeat=" + childSeat +
                ", onService=" + onService +
                '}';
    }

    @Override
    public void withChildSeat() {
        childSeat = !childSeat;
    }

    @Override
    public void onServiceStation() {
        onService = !onService;
    }
}
