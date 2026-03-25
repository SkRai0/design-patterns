package org.iamskrai.BehaviouralPatterns.StatePattern.Solution;

public class GreenState implements State {

    @Override
    public void nextState(TrafficLightContext context) {
        System.out.println("Green Light to Yellow Light");
        context.setState(new YellowState());
    }

}
