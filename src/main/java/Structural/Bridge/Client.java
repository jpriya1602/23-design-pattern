package Structural.Bridge;

public class Client {

    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl advancedRemote = new AdvancedRemote(tv);
        advancedRemote.power();
        advancedRemote.volumeUp();
        advancedRemote.volumeDown();
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.power();
    }


}
