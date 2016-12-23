public class Cat implements Petable
{
    private String name;
    private boolean isPurring;
    
    public Cat(String name, boolean isPurring)
    {
        this.name = name;
        this.isPurring = isPurring;
    }
    
    public boolean getIsPurring()
    {
        return isPurring;
    }
    
    public void setIsPurring(boolean isPurring)
    {
        this.isPurring = isPurring;
    }
    
    // write the methods required in the interface
    
    public void brushHair()
    {
        isPurring = true;
    }
    
    public void bite(Object obj)
    {
        if (obj instanceof Dog)
        {
            ((Dog) obj).setTailWag(0);
        }
    }
    
}
