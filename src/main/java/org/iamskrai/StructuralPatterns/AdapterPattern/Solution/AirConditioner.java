package org.iamskrai.StructuralPatterns.AdapterPattern.Solution;

public class AirConditioner {

    public void connectToBluetooth() {
        System.out.println("Air Conditioner connected to Bluetooth");
    }
    public void switchOn() {
        System.out.println("Air Conditioner switched on");
    }
    public void switchOff() {
        System.out.println("Air Conditioner switched off");
    }
    public void disconnectFromBluetooth() {
        System.out.println("Air Conditioner disconnected from Bluetooth");
    }

}
