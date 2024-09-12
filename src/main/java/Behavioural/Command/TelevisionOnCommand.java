package Behavioural.Command;

public class TelevisionOnCommand implements Command{
    private Television television;

    public TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }

    @Override
    public void undo() {
        television.turnOff();
    }
}
