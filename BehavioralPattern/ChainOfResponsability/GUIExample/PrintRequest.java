package BehavioralPattern.ChainOfResponsability.GUIExample;

public class PrintRequest
    implements Request
{

    @Override
    public RequestType getKind() {
        return RequestType.PRINT;
    }
}
