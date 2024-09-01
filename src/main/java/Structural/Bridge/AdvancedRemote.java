package Structural.Bridge;

public class AdvancedRemote implements RemoteControl{
    private Device device;
    public AdvancedRemote(Device device){
        this.device = device;
    }
    @Override
    public void power() {
        System.out.println("Pressing power button in remote");
        if (device.isPoweredOn()){
            device.turnOff();
        }
        else{
            device.turnOn();
        }
    }

    @Override
    public void volumeUp() {
        System.out.println("Pressing volume up  button in remote");
        device.setVolume(device.currentVolume()+1);
    }

    @Override
    public void volumeDown() {
        System.out.println("Pressing volume down  button in remote");
        device.setVolume(device.currentVolume()-1);
    }

    public void mute(){
        System.out.println("pressed mute button in the remote");
        device.setVolume(0);
    }
}
