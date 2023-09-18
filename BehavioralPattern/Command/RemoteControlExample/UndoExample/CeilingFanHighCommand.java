package BehavioralPattern.Command.RemoteControlExample.UndoExample;



public class CeilingFanHighCommand
    implements Command
{
    CeilingFan ceilingFan;
    Level prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getLevel();
        ceilingFan.high();
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
