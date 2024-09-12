package Behavioural.Command;

public class TelevisionOffCommand implements Command{
    private Television television;

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }

    @Override
    public void undo() {
        television.turnOn();
    }
}
