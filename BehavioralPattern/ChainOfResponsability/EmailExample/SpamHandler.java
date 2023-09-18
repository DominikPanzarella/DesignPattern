package BehavioralPattern.ChainOfResponsability.EmailExample;

public class SpamHandler extends HandleRequest
{

    public SpamHandler(HandleRequest ch) {
        super(ch);
    }

    @Override
    boolean canHandleRequest(Request request) {
        return request.getRequestType()==RequestType.SPAM_HANDLER;
    }

    @Override
    void handleRequest(Request request) {
        if(canHandleRequest(request))
            System.out.println(request.toString()+" handled by SpamHandler");
        else{
            if(getSuccessor()!=null)
                getSuccessor().handleRequest(request);
        }
    }
}
