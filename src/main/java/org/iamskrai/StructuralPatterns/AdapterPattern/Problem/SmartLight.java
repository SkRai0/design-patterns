package org.iamskrai.StructuralPatterns.AdapterPattern.Problem;

public class SmartLight {

    public void connectToWifi() {
        System.out.println("Smart Light connected to WiFi");
    }
    public void switchOn() {
        System.out.println("Smart Light switched on");
    }
    public void switchOff() {
        System.out.println("Smart Light switched off");
    }
    public void disconnectFromWifi() {
        System.out.println("Smart Light disconnected from WiFi");
    }

}
