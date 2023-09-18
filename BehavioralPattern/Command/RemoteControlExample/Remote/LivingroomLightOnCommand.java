package BehavioralPattern.Command.RemoteControlExample.Remote;

public class LivingroomLightOnCommand
    implements Command
{
    private Light light;

    public LivingroomLightOnCommand(Light light)
    {
        this.light = light;
    }


    @Override
    public void execute() {
        light.on();
    }
}
