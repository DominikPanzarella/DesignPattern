package BehavioralPattern.Command.MenuExample;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MacroCommand extends Command
{
    private List<Command> cmds;

    public void MacroCommand()
    {
        cmds = new LinkedList<>();
    }

    public void add(Command aCommand)
    {
        cmds.add(aCommand);
    }
    public void remove(Command aCommand)
    {
        cmds.remove(aCommand);
    }


    @Override
    public void execute() {

        for (Command c : cmds) {
            c.execute();
        }
    }
}
