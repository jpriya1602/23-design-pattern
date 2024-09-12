package Behavioural.Command;

public class MultipleSlotRemoteControl {
    private Command[] onCommands = new Command[3];
    private Command[] offCommands = new Command[3];
    private Command undoCommand;

    private void initializeCommand(){
        for(int i=0; i<3; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public MultipleSlotRemoteControl(){
        initializeCommand();
        undoCommand = new NoCommand();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void executeOnCommand(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void executeOffCommand(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoCommand(){
        undoCommand.undo();
    }

    public static void main(String[] args) {
        Light light = new Light();
        Television television = new Television();
        Fan fan = new Fan();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        FanOnCommand fanOnCommand = new FanOnCommand(fan);
        FanOffCommand fanOffCommand = new FanOffCommand(fan);

        TelevisionOnCommand televisionOnCommand = new TelevisionOnCommand(television);
        TelevisionOffCommand televisionOffCommand = new TelevisionOffCommand(television);

        MultipleSlotRemoteControl multipleSlotRemoteControl = new MultipleSlotRemoteControl();

        multipleSlotRemoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        multipleSlotRemoteControl.setCommand(1, televisionOnCommand, televisionOffCommand);
        multipleSlotRemoteControl.setCommand(2, fanOnCommand, fanOffCommand);

        multipleSlotRemoteControl.executeOnCommand(0);
        multipleSlotRemoteControl.executeOffCommand(0);

        multipleSlotRemoteControl.undoCommand();
    }
}
