package org.iamskrai.BehaviouralPatterns.CommandPattern.Solution;

public class Session {

    public static void main(String[] args) {
        //Solution:
        //1. The client code can create command objects and set them to the invoker (Remote).
        //2. The invoker (Remote) can execute the command without knowing the details of the command or the receiver (TV).
        
        TV tv = new TV();
        Remote remote = new Remote();

        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);
        Command changeChannelCommand = new ChangeChannelCommand(tv, 5);
        Command setVolumeCommand = new SetVolumeCommand(tv, 10);

        remote.setCommand(turnOnCommand);
        remote.pressButton();

        remote.setCommand(turnOffCommand);
        remote.pressButton();

        remote.setCommand(changeChannelCommand);
        remote.pressButton();

        remote.setCommand(setVolumeCommand);
        remote.pressButton();

    }

}
