package BehavioralPattern.ChainOfResponsability.GUIExample;


public class HelpRequest
        implements Request {
    public RequestType getKind()
    {
        return RequestType.HELP;
    }
}
