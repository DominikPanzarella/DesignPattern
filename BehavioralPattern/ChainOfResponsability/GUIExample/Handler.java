package BehavioralPattern.ChainOfResponsability.GUIExample;


public abstract class Handler
{
    public void handleRequest(Request theRequest) {
        switch (theRequest.getKind())
        {
            case HELP:
                handleHelp((HelpRequest) theRequest);
                break;
            case PRINT:
                handlePrint((PrintRequest) theRequest);
                break;
            default:
                break;
        }
    }

    private void handleHelp(HelpRequest theRequest)
    {
    }

    private void handlePrint(PrintRequest theRequest)
    {
    }

}
