package BehavioralPattern.ChainOfResponsability.EmailExample;

public class NewLocHandler extends HandleRequest
{
    @Override
    boolean canHandleRequest(Request request) {
        return request.getRequestType()==RequestType.NEW_LOCATION_HANDLER;
    }

    @Override
    void handleRequest(Request request) {
        if(canHandleRequest(request))
            System.out.println(request.toString()+" handled by NewLocHandler");
        else{
            if(getSuccessor()!=null)
                getSuccessor().handleRequest(request);
            else
                System.out.println(request.toString() + "can not be handled!");
        }

    }
}
