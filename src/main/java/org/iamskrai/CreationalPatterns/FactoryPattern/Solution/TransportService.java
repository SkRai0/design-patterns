package org.iamskrai.CreationalPatterns.FactoryPattern.Solution;

public class TransportService {

    public static void main(String[] args) {
        //Solution:
        //1. VehicleFactory encapsulates the object creation logic, allowing us to create different types of vehicles without changing the client code.
        //2. New vehicle types can be added by simply creating new classes that implement the Vehicle interface and updating the VehicleFactory, without modifying the client code.
        //3. The client code is now decoupled from the specific vehicle implementations, making it easier to maintain and extend the codebase in the future.
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
