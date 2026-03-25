package org.iamskrai.BehaviouralPatterns.StatePattern.Solution;

public class TrafficLightContext {

    private State currState;

    public TrafficLightContext() {
        this.currState = new RedState();
    }

    public void setState(State state) {
        this.currState = state;
    }

    public void next(){
        currState.nextState(this);
    }

}
