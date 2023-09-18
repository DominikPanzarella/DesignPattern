package BehavioralPattern.Command.WizardGoblinExample;

public class Goblin extends Target
{
    public Goblin()
    {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    public void changeSize()
    {
        var newSize = getSize()==Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(newSize);
    }

    public void changeVisibility()
    {
        var newVisibility = getVisibility() == Visibility.INVISIBLE
                ? Visibility.VISIBLE : Visibility.INVISIBLE;
        setVisibility(newVisibility);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}
