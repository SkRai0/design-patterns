package org.iamskrai.BehaviouralPatterns.CommandPattern.Problem;

public class Session {

    public static void main(String[] args) {
        //Problem:
        //1. Remote is tightly coupled to TV. Remote methods directly call TV methods.
        //2. Adding new operations requires modifying Remote class, violating Open/Closed Principle.
        //3. It's hard to extend Remote with features like undo, redo, or queuing commands.

        TV tv = new TV();
        Remote remote = new Remote(tv);

        remote.pressPowerButton();
        remote.changeChannel(5);
        remote.setVolume(10);
        remote.pressOffButton();
    }

}
