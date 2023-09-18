package BehavioralPattern.ChainOfResponsability.GUIExample;

public enum Topic
{
    NO_HELP_TOPIC(-1),
    PRINT_TOPIC(1),
    PAPER_ORIENTATION_TOPIC(2),
    APPLICATION_TOPIC(3);

    private final int topicNumber;

    Topic(int topicNumber)
    {
        this.topicNumber = topicNumber;
    }
}
