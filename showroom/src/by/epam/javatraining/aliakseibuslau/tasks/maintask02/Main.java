package by.epam.javatraining.aliakseibuslau.tasks.maintask02;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.exceptions.NullArrayEx;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.exceptions.NullLengthArrEx;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.iodata.IOData;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.logic.Logic;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        IOData ioData = new IOData();
        Car[] carArr = new Car[7];
        carArr = ioData.initialize();
        Logic logic = new Logic();
        try {
            Car[] car = logic.bubbleSortByPrice(carArr);
            for (int i = 0; i < car.length; i++) {
                System.out.println(car[i].toString());
            }
        } catch (NullPointerException e) {
            log.error("sds");
        } catch (NullLengthArrEx nullLengthArrEx) {
            nullLengthArrEx.printStackTrace();
        } catch (NullArrayEx nullArrayEx) {
            nullArrayEx.printStackTrace();
        }
    }
}
