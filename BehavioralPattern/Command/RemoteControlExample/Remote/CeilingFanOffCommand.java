package BehavioralPattern.Command.RemoteControlExample.Remote;

import java.rmi.ConnectIOException;

public class CeilingFanOffCommand
    implements Command
{
    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();;
    }
}
