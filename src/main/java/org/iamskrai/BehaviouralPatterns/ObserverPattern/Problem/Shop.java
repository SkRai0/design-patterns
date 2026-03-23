package org.iamskrai.BehaviouralPatterns.ObserverPattern.Problem;

public class Shop {

    private EmailSubscriber emailSubscriber;

    public Shop(EmailSubscriber emailSubscriber) {
        this.emailSubscriber = emailSubscriber;
    }

    public void addNewProduct(String productName) {
        System.out.println("New product added: " + productName);
        emailSubscriber.receiveEmail(productName);
    }

}
