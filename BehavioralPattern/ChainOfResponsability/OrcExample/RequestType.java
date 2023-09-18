package BehavioralPattern.ChainOfResponsability.OrcExample;

public enum RequestType
{
    DEFEND_CASTLE("defend the castle!"),
    TORTURE_PRISONER("torture the prisoner!"),
    COLLECT_TAX("collect tax!");

    private final String description;

    RequestType(String description)
    {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return description;
    }
}
