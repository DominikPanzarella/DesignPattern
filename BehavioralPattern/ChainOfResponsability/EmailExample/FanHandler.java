package BehavioralPattern.ChainOfResponsability.EmailExample;

public class FanHandler extends HandleRequest
{

    public FanHandler(HandleRequest sh) {
        super(sh);
    }

    @Override
    boolean canHandleRequest(Request request) {
        return request.getRequestType()==RequestType.FAN_EMAIL;
    }

    @Override
    void handleRequest(Request request) {
        if(canHandleRequest(request))
            System.out.println(request.toString()+" handled by FanHandler");
        else{
            if(getSuccessor()!=null)
                getSuccessor().handleRequest(request);
        }

    }
}
