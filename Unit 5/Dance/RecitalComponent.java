public abstract class RecitalComponent
{
    private int length;
    
    public RecitalComponent(int length)
    {
        this.length = length;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public String toString()
    {
        return "\nLength: " + length;
    }
    
    public abstract String perform();
}