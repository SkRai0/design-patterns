package org.iamskrai.CreationalPatterns.AbstractFactoryPattern.Solution;

public class BikeFactory implements AbstractVehicleFactory{

    @Override
    public Vehicle createVehicle(){
        return new Bike();
    }
}
