package BehavioralPattern.ChainOfResponsability.EmailExample;

public class Request
{
    private RequestType requestType;
    private boolean handled;
    private int cod;
    private static int inc = 1;

    public Request(RequestType requestType)
    {
        this.requestType = requestType;
        handled = false;
        incCod();
    }

    public void incCod()
    {
        cod = inc;
        inc++;
    }

    public String gerRequestDescription(){ return this.requestType.toString(); }

    public RequestType getRequestType(){ return this.requestType; }

    public void markHandled(){ this.handled = true; }

    public boolean isHandled() { return handled; }

    @Override
    public String toString()
    {
        return requestType.toString()+","+cod;
    }
}
