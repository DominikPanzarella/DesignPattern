package BehavioralPattern.ChainOfResponsability.EmailExample;

public class ComplaintHandler extends HandleRequest
{

    public ComplaintHandler(HandleRequest nh) {
        super(nh);
    }

    @Override
    boolean canHandleRequest(Request request) {
        return request.getRequestType()==RequestType.COMPLAINT_EMAIL;
    }

    @Override
    void handleRequest(Request request) {
        if(canHandleRequest(request))
            System.out.println(request.toString()+" handled by ComplaintHandler");
        else{
            if(getSuccessor()!=null)
                getSuccessor().handleRequest(request);
        }

    }
}
