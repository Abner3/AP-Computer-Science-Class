class Triangle
{
    private int side1;
    private int side2;
    private int side3;

    // Constructor
    public Triangle (int side1, int side2, int side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public boolean isValidTriangle()
    {
        if (side1+side2>side3 && side2 + side3>side1 && side3 + side1>side2)

            return(true);

        else
            return(false);
    }

    public int calculatePerimeter()
    {
        return side1 + side2 + side3;
    }

    public double calculateArea()     
    {   int semi = this.calculatePerimeter()/2;        
        return Math.sqrt(semi*(semi-side1)*(semi-side2)*(semi-side3));    
    }
    
    // Setters
    public void setSide1(int side1)
    {
        this.side1 = side1;
    }
    
    public void setSide2(int side2)
    {
        this.side2 = side2;
    }
    
    public void setSide3(int side3)
    {
        this.side3 = side3;
    }
    
    // Getter
    public int getSide1()
    {
        return side1;
    }
    
    public int getSide2()
    {
        return side2;
    }
    
    public int getSide3()
    {
        return side3;
    }
    
    //String
    public String toString()
    {
        return ("Triangle " + "side1 = " + side1 + " side2 = " + side2 + "side3 = " + side3);
    }
}
