public abstract class School
{
    private int roomNum;
    
    public School(int roomNum)
    {
        this.roomNum = roomNum;
    }
    
    public abstract String getName();
    
    public String toString()
    {
        return "\nRoom Number: " + roomNum;
    }
}