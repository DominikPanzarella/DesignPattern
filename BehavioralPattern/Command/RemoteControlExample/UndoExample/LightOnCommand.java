package BehavioralPattern.Command.RemoteControlExample.UndoExample;

public class LightOnCommand
    implements Command
{
    private Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
