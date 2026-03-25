package org.iamskrai.BehaviouralPatterns.StatePattern.Solution;

public class RedState implements State {

    @Override
    public void nextState(TrafficLightContext context) {
        System.out.println("Red Light to Green Light");
        context.setState(new GreenState());
    }

}
