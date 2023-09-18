package BehavioralPattern.ChainOfResponsability.GUIExample;

public class Dialog
    extends Widget
{
    public Dialog(HelpHandler h, Topic t)
    {
        super(null);
        setHandler(h,t);
    }

    public void handleHelp()
    {
        if(hasHelp())
            System.out.println("Offering help on the dialog");
        else
            super.handleHelp();
    }
}
