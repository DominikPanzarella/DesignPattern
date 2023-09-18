package BehavioralPattern.ChainOfResponsability.OrcExample;

public class OrcCommander implements RequestHandler{

    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.DEFEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.printf("%s handling request \"%s\"%n",name(),req);
    }

    @Override
    public String name() {
        return "Orc commander";
    }
}
