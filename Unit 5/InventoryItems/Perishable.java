import java.util.Date;

public class Perishable extends InventoryItem
{
    private Date expiration;
    private static final double DISCOUNT = 0.1;
    
    public Perishable (Date entry, double price)
    {
        super(entry,price);
    }
    
    public Date getDate()
    {
        return getEntryDate();
    }
    
    public double getPrice()
    {
        if (expiration.compareTo(getEntryDate()))
        {
            return getbasePrice();
        }
        else
        {
            return getbasePrice()-DISCOUNT;
        }
        return getBasePrice();
    }
    
    public String toString()
    {
        return super.toString();
    }
}
