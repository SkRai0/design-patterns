package org.iamskrai.CreationalPatterns.AbstractFactoryPattern.Problem;

public class TransportService {

    public static void main(String[] args) {
        //Problem:
        //1. Adding more vehicle types (e.g., Bus, Van) would require modifying the VehicleFactory class, which violates the Open/Closed Principle.
        //2. Managing the creation of different vehicle types in a single factory class can lead to code that is difficult to maintain and extend as the number of vehicle types increases.
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.createVehicle("car");
        car.start();
        car.stop();

        Vehicle bike = factory.createVehicle("bike");
        bike.start();
        bike.stop();

        Vehicle truck = factory.createVehicle("truck");
        truck.start();
        truck.stop();
    }

}
