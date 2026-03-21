package org.iamskrai.CreationalPatterns.AbstractFactoryPattern.Solution;

public class CarFactory implements AbstractVehicleFactory{

    @Override
    public Vehicle createVehicle(){
        return new Car();
    }
}
