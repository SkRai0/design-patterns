package org.iamskrai.CreationalPatterns.AbstractFactoryPattern.Solution;

public class TransportService {

    public static void main(String[] args) {
        //Solution
        //1. Adding and managing more vehicle types is easy. Just create a new factory and implement the Vehicle interface.
        //2. Each factory is responsible for creating a specific type of vehicle, which promotes separation of concerns and makes the code more maintainable and extensible.
        AbstractVehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.start();
        car.stop();

        AbstractVehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.start();
        bike.stop();

        AbstractVehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();
        truck.start();
        truck.stop();
    }

}
