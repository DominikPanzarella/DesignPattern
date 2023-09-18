package BehavioralPattern.ChainOfResponsability.GUIExample;

public class Application
    extends HelpHandler
{
    Application(Topic t)
    {
        setHandler(null, t);
    }

    public void handleHelp()
    {
        System.out.println("Show a list of help topics for the applications.");
    }
}
