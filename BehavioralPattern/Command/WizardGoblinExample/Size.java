package BehavioralPattern.Command.WizardGoblinExample;

public enum Size
{

    SMALL("small"),
    NORMAL("normal");

    private final String theSize;


    Size(String aSize) { theSize = aSize; }

    @Override public String toString(){ return theSize; }
}
