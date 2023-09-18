package BehavioralPattern.ChainOfResponsability.EmailExample;

public enum RequestType
{
    FAN_EMAIL("fan email"),
    COMPLAINT_EMAIL("complaint email"),
    SPAM_HANDLER("spam handler"),
    NEW_LOCATION_HANDLER("new location handler"),
    NO_HANDLER("no handler");

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
