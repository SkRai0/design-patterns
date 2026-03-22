package org.iamskrai.BehaviouralPatterns.StrategyPattern.Solution;

public class BankTransferPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        // Process bank transfer payment
        System.out.println("Processing bank transfer payment of $" + amount);
    }

}
