package org.iamskrai.BehaviouralPatterns.StatePattern.Problem;

public class TrafficSignal {

    public static void main(String[] args) {
        //Problem:
        //1. State transitions are hardcoded with if-else in the same class.
        //2. Adding new states requires modifying the TrafficLight class (Open/Closed Principle violation).
        //3. As states and rules grow, the method becomes bloated and hard to understand.

        TrafficLight light = new TrafficLight();

        for (int i = 0; i < 6; i++) {
            light.next();
        }
    }

}
