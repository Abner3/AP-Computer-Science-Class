abstract public class Polygon
{
    private int sideCount;
    
    public Polygon(int sideCount)
    {
        this.sideCount = sideCount;
    }
    
    public abstract double getArea();
    
    public String toString()
    {
        return "Side Count: " + getSideCount();
    }
    
    public String getSideCount()
    {
        return "" + sideCount;
    }
}
