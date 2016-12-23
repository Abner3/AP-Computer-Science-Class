public class Dog implements Petable
{
    private int tailWag;
    private String myName;
    
    // write two constructors, a default and one that takes 2 parameters
    public Dog(int tailWag, String myName)
    {
        this.tailWag = tailWag;
        this.myName = myName;
    }
    
    public Dog()
    {
        this(0, "Abner");
    }
    
    // write the methods required in the interface
    
    public void brushHair()
    {
        tailWag++;
    }
    
    public void bite(Object obj)
    {
        if (obj instanceof Cat)
        {
            ((Cat) obj).setIsPurring(false);
        }
    }
    
    public String getName()
    {
        return myName;
    }
    
    public void setName(String name)
    {
        myName = name;
    }
    
    public int getTailWag()
    {
        return tailWag;
    }
    
    public void setTailWag(int num)
    {
        tailWag = num;
    }
    
    public String toString()
    {
        return myName + " " + tailWag;
    }
}









