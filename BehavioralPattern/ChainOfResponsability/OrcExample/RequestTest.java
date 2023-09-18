package BehavioralPattern.ChainOfResponsability.OrcExample;

public class RequestTest
{

    public static void main(String[] args)
    {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER));
        king.makeRequest(new Request(RequestType.COLLECT_TAX));
    }
}
