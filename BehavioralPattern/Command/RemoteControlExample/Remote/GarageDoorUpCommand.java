package BehavioralPattern.Command.RemoteControlExample.Remote;

public class GarageDoorUpCommand
    implements Command
{
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
