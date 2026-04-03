package org.iamskrai.StructuralPatterns.AdapterPattern.Problem;

public class SmartRoom {

    public static void main(String[] args) {
        //Problem:
        //1. Client code is tightly coupled to device-specific APIs.
        //2. Every device has different connect/disconnect methods, so control flow is duplicated.
        //3. Adding a new device forces SmartRoom to change (Open/Closed Principle violation).

        AirConditioner airConditioner = new AirConditioner();
        SmartLight smartLight = new SmartLight();

        airConditioner.connectToBluetooth();
        airConditioner.switchOn();

        smartLight.connectToWifi();
        smartLight.switchOn();

        airConditioner.switchOff();
        airConditioner.disconnectFromBluetooth();

        smartLight.switchOff();
        smartLight.disconnectFromWifi();
    }

}
