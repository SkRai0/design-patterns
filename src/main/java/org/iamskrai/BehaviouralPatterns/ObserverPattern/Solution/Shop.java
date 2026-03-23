package org.iamskrai.BehaviouralPatterns.ObserverPattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void addNewProduct(String productName) {
        System.out.println("Adding new product: " + productName);
        notifyObservers(productName);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
