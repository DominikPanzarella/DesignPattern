package BehavioralPattern.Command.RemoteControlExample.Remote;

public class GarageDoorDownCommand
    implements Command
{
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
