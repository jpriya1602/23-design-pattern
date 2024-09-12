package Behavioural.Command;

public class FanOnCommand implements Command{
    private Fan fan;

    public FanOnCommand(Fan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.start();
    }

    @Override
    public void undo() {
        fan.stop();
    }
}
