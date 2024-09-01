package Structural.Bridge;

public interface Device {
     void turnOff();
     void turnOn();

     void setVolume(int level);

     int currentVolume();

     boolean isPoweredOn();
}
