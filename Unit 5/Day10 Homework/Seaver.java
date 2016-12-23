public class Seaver extends School
{
    private boolean full;
    private String name;
    
    public Seaver(int roomNum, boolean full, String name)
    {
        super(roomNum);
        this.full = full;
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return super.toString() + "\nFull? " + full + "\nName: " + name;
    }
}