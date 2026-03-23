package org.iamskrai.BehaviouralPatterns.ObserverPattern.Solution;

public interface Subject {

    public void subscribe(Observer observer);

    public void unsubscribe(Observer observer);

    public void notifyObservers(String message);

}
