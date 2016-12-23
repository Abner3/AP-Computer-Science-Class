public class Point
{
    private int x, y;
    
    public Point (int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point otherPoint)
    {
        double changeInX = this.x - otherPoint.getX();
        double changeInY = this.y - otherPoint.getY();
        return Math.sqrt(Math.pow(changeInX, 2)+Math.pow(changeInY, 2));
    }
    
    public double computeSlope(Point otherPoint)
    {
        double changeInX = this.x - otherPoint.getX();
        double changeInY = this.y - otherPoint.getY();
        return changeInY/changeInX;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public boolean equals(Point other)
    {
        if (this.x == other.x && this.y == other.y)
            return true;
        else
            return false;
    }
    
    public String toString()
    {
        return "X = " + x + "\nY = " + y;
    }
    
}
