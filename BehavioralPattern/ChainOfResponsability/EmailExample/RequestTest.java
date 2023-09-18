package BehavioralPattern.ChainOfResponsability.EmailExample;

import javax.swing.text.StyleContext;

public class RequestTest
{
    public static void main(String[] args)
    {
        Request fanRequest = new Request(RequestType.NO_HANDLER);
        NewLocHandler nh = new NewLocHandler();
        ComplaintHandler ch = new ComplaintHandler(nh);
        SpamHandler sh = new SpamHandler(ch);

        FanHandler fh = new FanHandler(sh);
        fh.handleRequest(fanRequest);
    }
}
