package org.iamskrai.CreationalPatterns.AbstractFactoryPattern.Problem;

public class VehicleFactory {

    public Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "bike":
                return new Bike();
            case "truck":
                return new Truck();
            default:
                throw new IllegalArgumentException("Unknown vehicle type: " + type);
        }
    }

}
