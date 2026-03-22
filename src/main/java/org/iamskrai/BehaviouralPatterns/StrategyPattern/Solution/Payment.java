package org.iamskrai.BehaviouralPatterns.StrategyPattern.Solution;

public class Payment {

    public static void main(String[] args) {
        //Solution:
        //1. Creating a PaymentStrategy interface that defines a common method for processing payments.
        //2. Implementing different payment strategies (e.g., CreditCardPaymentStrategy, Paypal
        //3. Using composition to allow the PaymentProcessor to use different payment strategies without modifying its code, adhering to the Open/Closed Principle.
        
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCardPaymentStrategy());
        paymentProcessor.processPayment(100.0);
        paymentProcessor.setPaymentStrategy(new PaypalPaymentStrategy());
        paymentProcessor.processPayment(200.0);
    }

}
