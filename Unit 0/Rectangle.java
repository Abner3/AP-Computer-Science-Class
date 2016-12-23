public class Rectangle
{
    private int x, y;
    
    public Rectangle(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Rectangle(int side)
    {
        x = side;
        y = side;
    }
    
    public double calculatePerimeter()
    {
        return(x*2 + y*2);
    }
    
    public double calculateArea()
    {
        return((x*y));
    }
    
    public double calculateDiagonal()
    {
        return(Math.sqrt(x*x+y*y));
    }
    
    public void setBase(int x)
    {
        this.x = x;
    }
    
    public int getHeight()
    {
        return y;
    }
    
    public int getBase()
    {
        return x;
    }
    
    public boolean longerBase()
    {
        return x>y;
    }
    
    
    public String toString()
    {
        return("The length is " + x + "\nThe width is " + y);
    }
}