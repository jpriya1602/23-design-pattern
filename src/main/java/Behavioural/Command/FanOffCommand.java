package Behavioural.Command;

public class FanOffCommand implements Command{
    private Fan fan;

    public FanOffCommand(Fan fan)
    {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.stop();
    }

    @Override
    public void undo() {
        fan.start();
    }
}
