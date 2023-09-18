package BehavioralPattern.Command.MenuExample;

public class PastCommand extends Command
{
    private Document document;

    public PastCommand(Document document)
    {
        this.document = document;
    }

    @Override
    public void execute() {
        this.document.paste();
    }
}
