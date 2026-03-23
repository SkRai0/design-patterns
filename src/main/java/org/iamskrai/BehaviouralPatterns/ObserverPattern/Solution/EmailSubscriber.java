package org.iamskrai.BehaviouralPatterns.ObserverPattern.Solution;

public class EmailSubscriber implements Observer {

    private String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("New product available: " + message + " - Sending email to " + email);
    }

}
