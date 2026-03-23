package org.iamskrai.BehaviouralPatterns.ObserverPattern.Problem;

public class Homepage {

    public static void main(String[] args) {
        //Problem: 
        //1. Tight coupling between Shop and EmailSubscriber
        //2. Only one type of subscriber (email) is supported and adding new types of subscribers (e.g., SMS) would require modifying the Shop class, violating the Open/Closed Principle.

        EmailSubscriber emailSubscriber = new EmailSubscriber("john@example.com");
        Shop shop = new Shop(emailSubscriber);
        shop.addNewProduct("Smartphone");
        shop.addNewProduct("Laptop");
    }

}
