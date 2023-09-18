package BehavioralPattern.Command.RemoteControlExample.SimpleRemote;

public class GarageDoorOpenCommand
    implements Command
{
    public GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor)
    {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.up();
    }
}
