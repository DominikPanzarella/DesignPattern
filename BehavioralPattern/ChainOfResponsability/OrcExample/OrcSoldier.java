package BehavioralPattern.ChainOfResponsability.OrcExample;

public class OrcSoldier implements RequestHandler
{

    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.printf("%s handling request \"%s\"%n",name(),req);
    }

    @Override
    public String name() {
        return "Orc soldier";
    }
}
