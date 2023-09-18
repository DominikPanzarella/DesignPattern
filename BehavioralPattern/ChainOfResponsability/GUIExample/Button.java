package BehavioralPattern.ChainOfResponsability.GUIExample;

public class Button
    extends Widget
{

    public Button(Widget parent) {
        super(null);
        setHandler(parent,Topic.NO_HELP_TOPIC);
    }

    public Button(Widget parent, Topic topic)
    {
        super(parent,topic);
    }

    public void handleHelp()
    {
        if(hasHelp())
            System.out.println("Offering help on the button.");
        else
            super.handleHelp();
    }
}
