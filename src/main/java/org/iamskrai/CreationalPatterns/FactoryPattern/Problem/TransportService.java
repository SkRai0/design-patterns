package org.iamskrai.CreationalPatterns.FactoryPattern.Problem;

public class TransportService {

    public static void main(String[] args) {
        //Problem: 
        //1. The client code is directly creating instances of specific vehicle types,
        //which leads to tight coupling and makes it difficult to add new vehicle types without modifying existing code.
        //2. The client code is responsible for knowing the details of how to create each type of vehicle,
        //which violates the principle of encapsulation and makes the code less maintainable.
        //3. If we want to add a new type of vehicle, we would need to modify the client code,
        //which can lead to bugs and maintenance issues and violates the Open/Closed Principle.
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();

        Vehicle truck = new Truck();
        truck.start();
        truck.stop();
    }

}
