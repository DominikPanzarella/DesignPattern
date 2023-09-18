package BehavioralPattern.ChainOfResponsability.GUIExample;

public abstract class HelpHandler
{
    private HelpHandler successor;
    private Topic topic;

    public HelpHandler(HelpHandler successor,Topic topic)
    {
        this.successor = successor;
        this.topic = topic;
    }

    public HelpHandler()
    {
        this.successor = null;
        this.topic = Topic.NO_HELP_TOPIC;
    }

    public boolean hasHelp() { return topic != Topic.NO_HELP_TOPIC;}

    public void setHandler(HelpHandler theHandler, Topic theTopic)
    {
        this.successor = theHandler;
        this.topic = theTopic;
    }

    public void handleHelp()
    {
        if(successor != null)
            successor.handleHelp();
    }



}
