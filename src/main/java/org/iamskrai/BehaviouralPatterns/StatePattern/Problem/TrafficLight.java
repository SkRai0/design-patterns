package org.iamskrai.BehaviouralPatterns.StatePattern.Problem;

public class TrafficLight {

    private String currentState;

    public TrafficLight() {
        this.currentState = "RED";
    }

    public void next() {
        if (currentState.equals("RED")) {
            System.out.println("Red Light to Green Light");
            currentState = "GREEN";
        } else if (currentState.equals("GREEN")) {
            System.out.println("Green Light to Yellow Light");
            currentState = "YELLOW";
        } else if (currentState.equals("YELLOW")) {
            System.out.println("Yellow Light to Red Light");
            currentState = "RED";
        }
    }

}
