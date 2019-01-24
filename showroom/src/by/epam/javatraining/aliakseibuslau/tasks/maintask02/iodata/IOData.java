package by.epam.javatraining.aliakseibuslau.tasks.maintask02.iodata;

import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.Car;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family.Sedan;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.family.Universal;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.lorry.Lorry;
import by.epam.javatraining.aliakseibuslau.tasks.maintask02.carierarchy.minibus.Transporter;

public class IOData {

    public Car[] carArr = new Car[7];

    public IOData() {
    }

    public Car[] initialize(){
        Car sedan = new Sedan(105, "ford", "focus" , 13450, false, false, 450);
        carArr[0] = sedan;
        Car universal = new Universal(150, "VW", "Touran", 15000, true, false, 7);
        carArr[1] = universal;
        Car lorry = new Lorry(740, "MAN", "TGX", 56800, false, false, 15000);
        carArr[2] = lorry;
        Car transporter = new Transporter(200, "VW", "Transporter", 20000, true, true, 900, 8);
        carArr[3] = transporter;
        Car sedanAudi = new Sedan(176, "AUDI", "A8L", 100000, false, false, 655);
        carArr[4] = sedanAudi;
        Car universalAudi = new Universal(300, "AUDI", "Q7", 125000, true, false, 7);
        carArr[5] = universalAudi;
        Car lorryKamaz = new Lorry(550, "KAMAZ", "2", 5000, false, true, 10000);
        carArr[6] = lorryKamaz;
        return carArr;
    }
}
