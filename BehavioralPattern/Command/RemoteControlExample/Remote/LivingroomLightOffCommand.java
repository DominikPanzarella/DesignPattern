package BehavioralPattern.Command.RemoteControlExample.Remote;

public class LivingroomLightOffCommand
    implements Command
{
    private Light light;

    public LivingroomLightOffCommand(Light light)
    {
        this.light = light;
    }


    @Override
    public void execute() {
        light.off();
    }
}
