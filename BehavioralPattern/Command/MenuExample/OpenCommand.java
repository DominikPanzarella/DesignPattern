package BehavioralPattern.Command.MenuExample;

public class OpenCommand extends Command
{
    private Application application;
    private String respone;

    public OpenCommand(Application application)
    {
        this.application = application;
    }

    public String askUser()
    {
        return "SomeFileName";
    }

    @Override
    public void execute()
    {
        respone = askUser();
        if(respone != null)
        {
            Document doc = new Document(respone);
            application.add(doc);
            doc.open();
        }
    }
}
