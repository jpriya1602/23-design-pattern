package Structural.Bridge;

public class BasicRemote implements RemoteControl{
    private Device device;
    public BasicRemote(Device device){
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
}
