package BehavioralPattern.Command.RemoteControlExample.UndoExample;


public class CeilingFanLowCommand
    implements Command
{
    private CeilingFan ceilingFan;
    private Level prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getLevel();
        ceilingFan.low();
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
