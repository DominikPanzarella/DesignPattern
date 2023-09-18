package BehavioralPattern.ChainOfResponsability.GUIExample;

public class ChainTest
{
    public static void main(String[] args)
    {

        Application app = new Application(Topic.APPLICATION_TOPIC);
        Dialog dialog = new Dialog(app,Topic.PRINT_TOPIC);
        Button button = new Button(dialog, Topic.PAPER_ORIENTATION_TOPIC);

        button.handleHelp();
    }
}
