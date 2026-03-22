package org.iamskrai.BehaviouralPatterns.StrategyPattern.Problem;

public class Payment {

    public static void main(String[] args) {
        //Problem:
        //1. The PaymentProcessor class has multiple if-else statements to handle different payment types.
        //2. Adding new payment types requires modifying the PaymentProcessor class, which violates the Open/Closed Principle.
        
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CreditCard", 100.0);
        paymentProcessor.processPayment("PayPal", 200.0);
    }

}
