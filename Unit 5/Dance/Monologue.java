public class Monologue extends NonDance
{
    //length created
    private String speaker, topic;
    
    public Monologue()
    {
        super(0);
        this.speaker = "speaker";
        this.topic = "topic";
    }
    
    public Monologue(String speaker, String topic, int length)
    {
        super(length);
        this.speaker = speaker;
        this.topic = topic;
    }
    
    public String perform()
    {
        return "Monologue-ing...";
    }
    
    public String toString()
    {
        return super.toString() + "\nSpeaker: " + speaker + "\nTopic: " + topic;
    }
}