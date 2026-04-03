package org.iamskrai.StructuralPatterns.AdapterPattern.Solution;

public class SmartLightAdapter implements SmartDevice {

    private SmartLight smartLight;

    public SmartLightAdapter(SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    @Override
    public void turnOn() {
        smartLight.connectToWifi();
        smartLight.switchOn();
    }

    @Override
    public void turnOff() {
        smartLight.switchOff();
        smartLight.disconnectFromWifi();
    }

}
