package BehavioralPattern.Command.RemoteControlExample.Remote;

import java.rmi.Remote;

public class RemoteControl
{
    private Command[] onCommands;
    private Command[] offCommands;
    private static final int MAX_COMMANDS = 7;

    public RemoteControl()
    {
        onCommands = new Command[MAX_COMMANDS];
        offCommands = new Command[MAX_COMMANDS];

        Command noCommand = new NoCommand();
        for(int i=0; i<MAX_COMMANDS; i++)
        {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand)
    {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot)
    {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
    }

    public String toString()
    {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for(int i=0; i<onCommands.length; i++)
        {
            stringBuff.append("[slot " + i + "]" + onCommands[i].getClass().getName()
                +"     " + offCommands[i].getClass().getName()+ "\n"
            );
        }
        return stringBuff.toString();
    }




}
