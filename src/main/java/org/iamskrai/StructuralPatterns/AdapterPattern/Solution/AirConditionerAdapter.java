package org.iamskrai.StructuralPatterns.AdapterPattern.Solution;

public class AirConditionerAdapter implements SmartDevice {

    private AirConditioner airConditioner;

    public AirConditionerAdapter(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectToBluetooth();
        airConditioner.switchOn();
    }

    @Override
    public void turnOff() {
        airConditioner.switchOff();
        airConditioner.disconnectFromBluetooth();
    }

}
