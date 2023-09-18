package BehavioralPattern.Command.MenuExample;

public class ApplicationTest
{
    public static void main(String[] args)
    {
        MyClass receiver = new MyClass();
        SimpleCommand aCommand = new SimpleCommand<>(receiver);
        SimpleCommand anotherCommand = new SimpleCommand(new Receiver());

        aCommand.execute();
        anotherCommand.execute();
    }
}
