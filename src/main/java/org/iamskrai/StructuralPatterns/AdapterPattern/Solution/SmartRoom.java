package org.iamskrai.StructuralPatterns.AdapterPattern.Solution;

public class SmartRoom {

    public static void main(String[] args) {
        //Solution:
        //1. Creating adapters hide the complexity of the existing devices and provide a simple interface to interact with them.
        //2. The client code can work with the new interface without worrying about the underlying implementation of the existing devices.
        SmartDevice airConditioner = new AirConditionerAdapter(new AirConditioner());
        SmartDevice smartLight = new SmartLightAdapter(new SmartLight());

        airConditioner.turnOn();
        smartLight.turnOn();

        airConditioner.turnOff();
        smartLight.turnOff();
    }

}
