package BehavioralPattern.Command.WizardGoblinExample;

public enum Visibility
{
    VISIBLE("visible"),
    INVISIBLE("invisible");

    private final String currentStatus;

    Visibility(String currentStatus)
    {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString()
    {
        return currentStatus;
    }
}
