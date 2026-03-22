package org.iamskrai.BehaviouralPatterns.StrategyPattern.Problem;

public class PaymentProcessor {

    public void processPayment(String paymentType, double amount) {
        if (paymentType.equalsIgnoreCase("CreditCard")) {
            // Process credit card payment
            System.out.println("Processing credit card payment of $" + amount);
        } else if (paymentType.equalsIgnoreCase("PayPal")) {
            // Process PayPal payment
            System.out.println("Processing PayPal payment of $" + amount);
        } else if (paymentType.equalsIgnoreCase("BankTransfer")) {
            // Process bank transfer payment
            System.out.println("Processing bank transfer payment of $" + amount);
        } else {
            System.out.println("Unsupported payment type: " + paymentType);
        }
    }

}
