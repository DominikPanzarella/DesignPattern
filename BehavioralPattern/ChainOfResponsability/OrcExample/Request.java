package BehavioralPattern.ChainOfResponsability.OrcExample;

import java.util.Objects;

public class Request
{
    private final RequestType requestType;
    private boolean handled;

    public Request(final RequestType requestType)
    {
        this.requestType = Objects.requireNonNull(requestType);
        this.handled = false;
    }

    public String getRequestDescription() { return this.requestType.toString(); }

    public RequestType getRequestType() { return this.requestType; }

    public void markHandled() { this.handled = true; }


    public boolean isHandled() { return this.handled; }

    @Override public String toString() { return getRequestDescription(); }

}
