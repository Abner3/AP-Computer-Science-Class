import static java.lang.System.*;

public class Monster2
{
    private int myWeight;
    private int myHeight;
    private int myAge;

    //write a parameterless Constructor
    public Monster2()
    {
        this(0 ,0, 0); //use the constructor that takes 3 perameters and input 0
    }

    //write an initialization constructor with an int parameter ht
    public Monster2(int ht)
    {
        this(ht, 0, 0); //uses the 4th constructor
    }

    //write an initialization constructor with int parameters ht and wt
    public Monster2(int ht, int wt)
    {
        myHeight = ht;
        myWeight = wt;
        myAge = 0;
    }

    //write an initialization constructor with int parameters ht, wt, and age
    public Monster2(int ht, int wt, int age)
    {
        myHeight = ht;
        myWeight = wt;
        myAge = age;
    }

    //modifiers - write set methods for height, weight, and age
    public void setHeight(int ht)
    {
        myHeight = ht;
    }

    public void setWeight(int wt)
    {
        myWeight = wt;
    }

    public void setAge(int age)
    {
        myAge = age;
    }

    //accessors - write get methods for height, weight, and age
    public int getHeight()
    {
        return myHeight;
    }

    public int getWeight()
    {
        return myWeight;
    }

    public int getAge()
    {
        return myAge;
    }

    //creates a new copy of this Object
    public Monster2 clone()
    {
        return new Monster2(myHeight, myWeight, myAge);

    }

    public boolean equals( Monster2 other )
    {
        if (compareTo(other) >= 1 || compareTo(other) <= -1)
            return false;
        else
            return true;
    }
    //check my compareTo method
    public int compareTo( Monster2 other )
    {
        //height, weight, age
        if (other.myHeight > this.myHeight)
        {
            return -1;
        }
        
        else if (other.myHeight < this.myHeight)
        {
            return 1;
        }
        
        else 
        {
            if (other.getWeight() > this.getWeight())
            {
                return -1;
            }
            
            else if (other.getWeight() < this.getWeight())
            {
                return 1;
            }
            
            else
            {
                if (other.getAge() > this.getAge())
                {
                    return -1;
                }
                
                else if (other.getAge() < this.getAge())
                {
                    return 1;
                }
                
                else
                {
                    return 0;
                }
            }
        }
    }

    //write a toString() method
    
    public String toString()
    {
        return "\nHeight = " + myHeight + " Weight = " + myWeight + " Age = " + myAge;
    }
}
