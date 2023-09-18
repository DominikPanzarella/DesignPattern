package BehavioralPattern.Command.WizardGoblinExample;

public abstract class Target
{
    private Size size;
    private Visibility visibility;

    /* Getter Methods */

    public Size getSize(){ return size; }

    public Visibility getVisibility(){ return visibility;}

    /* Setter Methods */

    public void setSize(Size size){ this.size = size; }

    public void setVisibility(Visibility visibility){ this.visibility = visibility;}
    public void printStatus()
    {
        System.out.printf("%s, [size=%s] [visibility=%s]%n",this,getSize(),getVisibility());
    }

    public abstract String toString();
}
