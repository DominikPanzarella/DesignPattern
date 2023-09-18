package BehavioralPattern.Command.RemoteControlExample.Remote;

public enum Level
{
    HIGH(3),
    MEDIUM(2),
    LOW(1),
    OFF(0);

    private int value;

    Level(int value)
    {
        this.value = value;
    }

    int getValue(){ return value; }

    public String toString()
    {
        return ""+value;
    }
}
