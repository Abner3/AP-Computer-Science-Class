public abstract class Ticket
{
    private int serialNumber;

    public abstract double getPrice();
    
    public Ticket()
    {
        
    }
    
    public String toString()
    {
        return "" + serialNumber;
    }
    
    private static int getNextSerialNumber()
    {
        
    }
    
}