package BehavioralPattern.ChainOfResponsability.OrcExample;

public class OrcOfficer implements RequestHandler
{

    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.TORTURE_PRISONER;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.printf("%s handling request \"%s\"%n",name(),req);
    }

    @Override
    public String name() {
        return "Orc officer";
    }
}
