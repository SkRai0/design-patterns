package org.iamskrai.BehaviouralPatterns.StrategyPattern.Solution;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        // Process credit card payment
        System.out.println("Processing credit card payment of $" + amount);
    }

}
