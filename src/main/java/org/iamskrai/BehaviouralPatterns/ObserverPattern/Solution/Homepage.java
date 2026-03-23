package org.iamskrai.BehaviouralPatterns.ObserverPattern.Solution;

public class Homepage {

    public static void main(String[] args) {
        //Solution:
        //1. Using Observer pattern to decouple the notification logic from the shop logic.
        //2. The shop (Subject) maintains a list of subscribers (Observers) and notifies them of new products.
        //3. This allows for easy addition of new types of subscribers (e.g., SMS) without modifying the shop class, adhering to the Open/Closed Principle.

        Shop shop = new Shop();

        Observer emailSubscriber = new EmailSubscriber("john@example.com");
        Observer smsSubscriber = new SmsSubscriber("123-456-7890");

        shop.subscribe(emailSubscriber);
        shop.subscribe(smsSubscriber);

        // Both subscribers will receive this notification
        shop.addNewProduct("Smartphone");
        shop.addNewProduct("Laptop");

        shop.unsubscribe(smsSubscriber);

        //Only email subscriber will receive this notification
        shop.addNewProduct("Tablet");

    }

}
