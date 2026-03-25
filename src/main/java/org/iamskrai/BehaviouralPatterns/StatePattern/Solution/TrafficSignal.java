package org.iamskrai.BehaviouralPatterns.StatePattern.Solution;

public class TrafficSignal {

    public static void main(String[] args) {
        
        TrafficLightContext trafficLight = new TrafficLightContext();

        for (int i = 0; i < 6; i++) {
            trafficLight.next();
        }

    }

}
