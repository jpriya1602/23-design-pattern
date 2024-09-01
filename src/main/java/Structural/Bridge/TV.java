package Structural.Bridge;

public class TV implements Device{
    private static final int DEFAULT_VOLUME = 6;
    private int volume = DEFAULT_VOLUME;
    private boolean on = false;
    @Override
    public void turnOff() {
        if (on) {
            on = !on;
            System.out.println("turning off the  TV");
        }
    }

    @Override
    public void turnOn() {
        if (!on) {
            on = !on;
            System.out.println("turning on the TV");
        }
    }

    @Override
    public void setVolume(int level) {
        this.volume = level;
        System.out.println("Volume set to to "+ this.volume);
    }

    @Override
    public int currentVolume() {
        return volume;
    }

    @Override
    public boolean isPoweredOn() {
        return on;
    }
}
