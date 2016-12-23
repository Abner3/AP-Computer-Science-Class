class Parabola  // Blueprint for creating parabola objects 
{
    //Attributes - instance variables

    private int a;
    private int b;
    private int c;

    // constructor(s) - A special method called to instantiate an object     
    //(instantiate means to create)     
    // its job is to give the instance variables their initial values     
    // A costructor has no return type and has the same name as the class 
    public Parabola (int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a == 0)
        {
            a = 1;
        }
    }
    
    public Parabola (int a)
    {
        this.a = a;
        b = 0;
        c = 0;
    }

    //Behaviors - Methods
    // public, return type, name of method, (pass info) 
    public String opensUpOrDown()
    {
        if (a > 0) 
        {
            return "Up";
        }
        else
        {
            return "Down";
        }
    }

    public int computeXVertex()
    {
        //Create local vertex variable
        int vertex = -b/(2*a);
        return vertex;
    }

    public int computeDiscriminant()
    {
        return b*b - 4*a*c;
    }

    //Setters          
    public void setA(int aValue)    
    {         
        a = aValue;     
    }

    public void setB(int bValue)     
    {         
        b = bValue;
    }          

    public void setC(int cValue)     
    {        
        c = cValue;     
    } 

    //Getter for clients
    public int getAValue()
    {
        return a;
    }
    
    //String method- how to describe the variables
    public String toString()
    {
        return ("a = " + a + " b = " + b  + " c = " + c);
    }
    
}
