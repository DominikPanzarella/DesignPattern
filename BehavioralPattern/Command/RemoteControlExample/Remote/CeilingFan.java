package BehavioralPattern.Command.RemoteControlExample.Remote;

public class CeilingFan
{
    private String location = "";
    private Level level;

    public CeilingFan(String location)
    {
        this.location = location;
        level = Level.LOW;
    }

    public void high()
    {
        // turns the ceiling fan on to high
        level = Level.HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        // turns the ceiling fan on to medium
        level = Level.MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // turns the ceiling fan on to low
        level = Level.LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void on()
    {
        // turns the ceiling fan on - low level
        level = Level.LOW;
        System.out.println(location + " ceiling fan is on");
    }

    public void off()
    {
        // turns the ceiling fan off
        level = Level.OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed()
    {
        return level.getValue();
    }

}
