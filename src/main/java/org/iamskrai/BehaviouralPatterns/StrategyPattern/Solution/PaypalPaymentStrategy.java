package org.iamskrai.BehaviouralPatterns.StrategyPattern.Solution;

public class PaypalPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        // Process PayPal payment
        System.out.println("Processing PayPal payment of $" + amount);
    }

}
