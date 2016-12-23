import java.util.*;

public class Dance extends RecitalComponent
{
    //length and name created
    private String choreographer, name;
    private ArrayList<String> dancers = new ArrayList();
    
    public Dance()
    {
        super(0);
        this.choreographer = "choreographer";
        this.name = "name";
        this.dancers.add("Dancer");
    }
    
    public Dance(int length, ArrayList<String> dancers, String choreographer)
    {
        super(length);
        this.choreographer = choreographer;
        this.name = name;
        this.dancers = dancers;
    }
    
    public String perform()
    {
        return "Dancing...";
    }
    
    public String toString()
    {
        return super.toString() + "\nChoreographer: " + choreographer + "\nName: " + name + "\nDancers: " +  dancers;
    }
}
