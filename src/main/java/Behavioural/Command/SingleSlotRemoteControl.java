package Behavioural.Command;

public class SingleSlotRemoteControl {
    Command command;
    Command undoCommand;

    SingleSlotRemoteControl(){
        undoCommand = new NoCommand();
    }

    public void loadCommand(Command command){  // parametrize the objects
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        undoCommand = command;
    }

    public void pressUndoButton(){
        undoCommand.undo();
    }

    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        SingleSlotRemoteControl singleSlotRemoteControl = new SingleSlotRemoteControl();

        singleSlotRemoteControl.loadCommand(lightOnCommand);
        singleSlotRemoteControl.pressButton();
        singleSlotRemoteControl.pressUndoButton();

        singleSlotRemoteControl.loadCommand(lightOffCommand);
        singleSlotRemoteControl.pressButton();
        singleSlotRemoteControl.pressUndoButton();
    }
}
