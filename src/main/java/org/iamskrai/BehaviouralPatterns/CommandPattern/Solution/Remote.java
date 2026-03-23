package org.iamskrai.BehaviouralPatterns.CommandPattern.Solution;

public class Remote {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
