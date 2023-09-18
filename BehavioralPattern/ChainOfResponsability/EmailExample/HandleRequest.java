package BehavioralPattern.ChainOfResponsability.EmailExample;

public abstract class HandleRequest
{
    private HandleRequest successor;

    public HandleRequest()
    {
        successor = null;
    }

    public HandleRequest(HandleRequest successor)
    {
        this.successor = successor;
    }

    public void setSuccessor(HandleRequest successor)
    {
        this.successor = successor;
    }

    public HandleRequest getSuccessor(){ return successor; }

    abstract boolean canHandleRequest(Request request);

    abstract void handleRequest(Request request);

}
