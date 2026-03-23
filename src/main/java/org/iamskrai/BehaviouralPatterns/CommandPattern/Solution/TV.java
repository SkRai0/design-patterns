package org.iamskrai.BehaviouralPatterns.CommandPattern.Solution;

public class TV {

    public void on() {
        System.out.println("TV is ON");
    }

    public void off() {
        System.out.println("TV is OFF");
    }

    public void setChannel(int channel) {
        System.out.println("TV channel is set to " + channel);
    }

    public void setVolume(int volume) {
        System.out.println("TV volume is set to " + volume);
    }

}
