package org.iamskrai.BehaviouralPatterns.ObserverPattern.Solution;

public class SmsSubscriber implements Observer {

    private String phoneNumber;

    public SmsSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String message) {
        System.out.println("New product available: " + message + " - Sending SMS to " + phoneNumber);
    }
}
