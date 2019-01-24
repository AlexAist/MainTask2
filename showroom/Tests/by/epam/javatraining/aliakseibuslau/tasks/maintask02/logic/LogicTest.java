package by.epam.javatraining.aliakseibuslau.tasks.maintask02.logic;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.Main;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family.Sedan;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family.Universal;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.lorry.Lorry;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.minibus.Transporter;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.exceptions.NullArrayEx;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.exceptions.NullLengthArrEx;
import org.apache.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicTest {

    private static final Logger log = Logger.getLogger(LogicTest.class);
    private Logic logic = new Logic();

    private Car[] carArr = new Car[7];
    private Car sedan = new Sedan(105, "ford", "focus" , 13450, false, false, 450);
    private Car universal = new Universal(150, "VW", "Touran", 15000, true, false, 7);
    private Car lorry = new Lorry(740, "MAN", "TGX", 56800, false, false, 15000);
    private Car transporter = new Transporter(200, "VW", "Transporter", 20000, true, true, 900, 8);
    private Car sedanAudi = new Sedan(176, "AUDI", "A8L", 100000, false, false, 655);
    private Car universalAudi = new Universal(300, "AUDI", "Q7", 125000, true, false, 7);
    private Car lorryKamaz = new Lorry(550, "KAMAZ", "2", 5000, false, true, 10000);

    @Test
    public void calcPriceTest() throws NullArrayEx, NullLengthArrEx {
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;
        Logic logic = new Logic();
        assertEquals(335250, logic.calcPrice(carArr));
    }

    @Test
    public void calcPriceTest1() {
        Car[] carArrT = new Car[1];
        carArrT[0] = sedan;
        try {
            assertEquals(13450, logic.calcPrice(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void calcPriceTest2(){
        Car[] carArrT = new Car[0];
        try {
            assertEquals(0, logic.calcPrice(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void calcHorsePowerTest(){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;
        try {
            assertEquals(2221, logic.calcHorsePower(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }

    }

    @Test
    public void calcHorsePowerTest1(){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;
        try {
            assertEquals(2221, logic.calcHorsePower(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }

    }

    @Test
    public void minPriceTest (){
        Car[] carArrT = new Car[1];
        carArrT[0] = sedan;
        try {
            assertEquals(sedan, logic.minPrice(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void minPriceTest1 (){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;
        try {
            assertEquals(lorryKamaz, logic.minPrice(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void maxPriceTest (){
        Car[] carArrT = new Car[1];
        carArrT[0] = sedan;
        try {
            assertEquals(sedan, logic.maxPrice(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void maxPriceTest1 (){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;
        try {
            assertEquals(universalAudi, logic.maxPrice(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void trunkVolSumTest(){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;
        try {
            assertEquals(2005, logic.trunkVolSum(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void trunkVolSumTest1 (){
        Car[] carArrT = new Car[1];
        carArrT[0] = sedan;
        try {
            assertEquals(450, logic.trunkVolSum(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void calcSeatsTest(){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;
        try {
            assertEquals(22, logic.calcSeats(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void calcSeatsTest1 (){
        Car[] carArrT = new Car[1];
        carArrT[0] = sedan;
        try {
            assertEquals(0, logic.calcSeats(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void bubbleSortByPriceTest(){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;

        Car[] res ;
        res = new Car[]{lorryKamaz, sedan, universal, transporter, lorry, sedanAudi, universalAudi};
        try {
            assertArrayEquals(res, logic.bubbleSortByPrice(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void bubbleSortByPriceTest1(){
        Car[] carArrT = new Car[1];
        carArrT[0] = sedan;

        Car[] res ;
        res = new Car[]{sedan};
        try {
            assertArrayEquals(res, logic.bubbleSortByPrice(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void selectionSortByHorsePowerTest(){
        carArr[0] = sedan;
        carArr[1] = universal;
        carArr[2] = lorry;
        carArr[3] = transporter;
        carArr[4] = sedanAudi;
        carArr[5] = universalAudi;
        carArr[6] = lorryKamaz;

        Car[] res ;
        res = new Car[]{sedan, universal, sedanAudi, transporter, universalAudi, lorryKamaz, lorry };
        try {
            assertArrayEquals(res, logic.selectionSortByHorsePower(carArr));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }

    @Test
    public void selectionSortByHorsePowerTest1(){
        Car[] carArrT = new Car[1];
        carArrT[0] = sedan;

        Car[] res ;
        res = new Car[]{sedan};
        try {
            assertArrayEquals(res, logic.bubbleSortByPrice(carArrT));
        }catch (NullPointerException e){
            log.error("NUllPointerEx");
        } catch (NullArrayEx nullArrayEx) {
            log.error("array is not defined");
        } catch (NullLengthArrEx nullLengthArrEx) {
            log.error("null length");
        }
    }
}