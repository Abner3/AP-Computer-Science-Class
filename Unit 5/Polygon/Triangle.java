public class Triangle extends Polygon
{
    private int base;
    private int height;
    public Triangle(int sideCount, int base, int height)
    {
        super(sideCount);
        this.base = base;
        this.height = height;
    }
    
    public double getArea()
    {
        return ((double) base*height)*1.5;
    }
    
    public String toString( )
    {
        return super.toString() + "\nBase: " + base + "\nHeight: " + height;
    }
}
