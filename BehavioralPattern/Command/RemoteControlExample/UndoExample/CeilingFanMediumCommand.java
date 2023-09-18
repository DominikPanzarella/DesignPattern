package BehavioralPattern.Command.RemoteControlExample.UndoExample;

public class CeilingFanMediumCommand
    implements Command
{
    private CeilingFan ceilingFan;
    private Level prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getLevel();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        switch(prevSpeed)
        {
            case HIGH -> ceilingFan.high();
            case MEDIUM -> ceilingFan.medium();
            case LOW -> ceilingFan.low();
            case OFF -> ceilingFan.off();
        }
    }
}
