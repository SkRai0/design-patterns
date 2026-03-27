package org.iamskrai.BehaviouralPatterns.CommandPattern.Problem;

public class Remote {

    private TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void pressPowerButton() {
        tv.on();
    }

    public void pressOffButton() {
        tv.off();
    }

    public void changeChannel(int channel) {
        tv.setChannel(channel);
    }

    public void setVolume(int volume) {
        tv.setVolume(volume);
    }

}
