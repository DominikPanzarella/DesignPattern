package BehavioralPattern.ChainOfResponsability.GUIExample;

public abstract class Widget
extends HelpHandler
{
    private Widget parent;

    protected Widget(Widget parent)
    {
        super(parent,Topic.NO_HELP_TOPIC);
        this.parent = parent;
    }

    protected Widget(Widget w, Topic t)
    {
        super(w,t);
        parent = w;
    }
}
