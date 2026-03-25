package org.iamskrai.BehaviouralPatterns.StatePattern.Solution;

public class YellowState implements State {

    @Override
    public void nextState(TrafficLightContext context) {
        System.out.println("Yellow Light to Red Light");
        context.setState(new RedState());
    }

}
