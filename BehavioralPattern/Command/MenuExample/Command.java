package BehavioralPattern.Command.MenuExample;

public abstract class Command
{
    public abstract void execute();

    protected Command()
    {
        System.out.println("Command.Command()");
    }
}
