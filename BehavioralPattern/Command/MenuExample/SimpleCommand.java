package BehavioralPattern.Command.MenuExample;

public class SimpleCommand<E>
{
    private E receiver;

    public SimpleCommand(E receiver)
    {
        this.receiver = receiver;
    }

    public void execute()
    {
        if(receiver!=null)
        {
            if (receiver.getClass().equals(MyClass.class))
                MyClass.class.cast(receiver).action();
            else if(receiver.getClass().equals(Receiver.class))
                Receiver.class.cast(receiver).action();


        }
    }
}
