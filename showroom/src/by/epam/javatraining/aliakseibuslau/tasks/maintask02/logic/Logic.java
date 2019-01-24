package by.epam.javatraining.aliakseibuslau.tasks.maintask02.logic;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family.Sedan;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family.Universal;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.minibus.Transporter;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.exceptions.NullArrayEx;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.exceptions.NullLengthArrEx;
import org.apache.log4j.Logger;

public class Logic {

    public Logic() {
    }

    private static final Logger log = Logger.getLogger(Logic.class);

    private static void arrayForExceptionCheck(Car[] array) throws NullArrayEx, NullLengthArrEx {
        if (array == null) {
            log.error("Array is not defined exception");
            throw new NullArrayEx();
        }
        else if (array.length == 0) {
            log.error("Array is empty exception");
            throw new NullLengthArrEx();
        }
    }

    int calcPrice(Car[] carArr) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(carArr);
        int sumPrices = 0;
        for (Car car : carArr) {
            sumPrices += car.getPrice();
        }
        return sumPrices;
    }

    int calcHorsePower(Car[] carArr) throws NullArrayEx, NullLengthArrEx{
        arrayForExceptionCheck(carArr);
        int sumHorsePower = 0;
        for (Car car : carArr) {
            sumHorsePower += car.getHorsePower();
        }
        return sumHorsePower;
    }

   public Car minPrice(Car[] carArr) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(carArr);
        int minPrice = carArr[0].getPrice();
        int indexOfCarWithMinPrice = 0;
        for (int i = 0; i < carArr.length; i++) {
            int tmp = carArr[i].getPrice();
            if(tmp < minPrice){
                minPrice = carArr[i].getPrice();
                indexOfCarWithMinPrice = i;
            }
        }
        return carArr[indexOfCarWithMinPrice];
    }

    public Car maxPrice(Car[]carArr) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(carArr);
        int maxPrice = 0;
        int indexOfCarWithMaxPrice = 0;
        for (int i = 0; i < carArr.length; i++) {
            int carPrice = carArr[i].getPrice();
            if (carPrice > maxPrice){
                maxPrice = carArr[i].getPrice();
                indexOfCarWithMaxPrice = i;
            }
        }
        return carArr[indexOfCarWithMaxPrice];
    }

    public int trunkVolSum (Car[] carArr) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(carArr);
        int trunkVolSum = 0;
        for (Car car : carArr) {
            if (car instanceof Sedan) {
                Sedan sCar = (Sedan) car;
                trunkVolSum += sCar.getTrunkVol();
            }
            else if(car instanceof Transporter){
                Transporter trCar = (Transporter) car;
                trunkVolSum += trCar.getTrunkVol();
            }
        }
        return trunkVolSum;
    }

    public int calcSeats (Car[] carArr) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(carArr);
        int seatsSum = 0;
        for (Car car : carArr) {
            if (car instanceof Universal) {
                Universal uCar = (Universal) car;
                seatsSum += uCar.getSeats();
            }
            else if(car instanceof Transporter){
                Transporter trCar = (Transporter) car;
                seatsSum += trCar.getSeats();
            }
        }
        return seatsSum;
    }

    public Car[] bubbleSortByPrice(Car[] arr) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(arr);
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j].getPrice() > arr[j+1].getPrice() ){
                Car tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public Car[] selectionSortByHorsePower(Car[] arr) throws NullArrayEx, NullLengthArrEx {
        arrayForExceptionCheck(arr);
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i].getHorsePower();
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].getHorsePower() < min) {
                    min = arr[j].getHorsePower();
                    min_i = j;
                }
            }
            if (i != min_i) {
                Car tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        return arr;
    }
}
