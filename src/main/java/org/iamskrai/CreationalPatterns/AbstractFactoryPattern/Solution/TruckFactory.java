package org.iamskrai.CreationalPatterns.AbstractFactoryPattern.Solution;

public class TruckFactory implements AbstractVehicleFactory{

    @Override
    public Vehicle createVehicle(){
        return new Truck();
    }
}
