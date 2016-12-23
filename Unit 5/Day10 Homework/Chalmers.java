public class Chalmers extends School
{
    private int maxStudents;
    private boolean happy;
    public Chalmers(int roomNum, int maxStudents, boolean happy)
    {
        super(roomNum);
        this.maxStudents = maxStudents;
        this.happy = happy;
    }

    public String getName()
    {
        return "Chalmers";
    }
    
    public String toString()
    {
        return super.toString() + "\nHappy" + happy + "\nMax Number of Students" + maxStudents; 
    }
}
