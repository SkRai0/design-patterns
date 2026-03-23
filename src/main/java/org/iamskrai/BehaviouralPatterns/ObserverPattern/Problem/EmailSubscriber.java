package org.iamskrai.BehaviouralPatterns.ObserverPattern.Problem;

public class EmailSubscriber {

    private String emailAddress;

    public EmailSubscriber(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void receiveEmail(String message) {
        System.out.println("New product available: " + message + " - Sending email to " + emailAddress);
    }

}
