public class Rectangle extends Polygon
{
    private int length = 0;
    private int width = 0;
    
    public Rectangle(int sideCount, int length, int width)
    {
        super(sideCount);
        this.length = length;
        this.width = width;
    }
    
    public double getArea()
    {
        return ((double)length*width);
    }
    
    public String toString()
    {
        return super.toString() + "\nLength: " + length + "\nWidth: " + width;
    }
}