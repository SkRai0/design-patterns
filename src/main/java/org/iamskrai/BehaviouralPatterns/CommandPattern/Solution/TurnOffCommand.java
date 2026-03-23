package org.iamskrai.BehaviouralPatterns.CommandPattern.Solution;

public class TurnOffCommand implements Command {

    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

}
