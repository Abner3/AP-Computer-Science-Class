public class APLine
{
    //instance variables
    double a;
    double b;
    double c;
    
    //constructors
    public APLine(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
      
    //methods
    public double computeSlope()
    {
        return -a/b;
    }
    
    public boolean isOnLine(int x, int y)
    {
        if(a*x + b*y + c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /*public boolean isOnLine(Point point)
    {
        
    }*/
    
    //setters and getters
    public double getA()
    {
        return a;
    }
    
    public double getB()
    {
        return b;
    }
    
    public double getC()
    {
        return c;
    }
    
    public void setA(int a)
    {
        this.a = a;
    }
    
    public void setB(int b)
    {
        this.b = b;
    }
    
    public void setC(int c)
    {
        this.c = c;
    }
    
    //.equals and toString
    public boolean equals(APLine other)
    {
        
        
    }
    
    public String toString()
    {
        return "This line is: " + a +"x+" + b + "y+" + c + "= 0";
    }
    
}
