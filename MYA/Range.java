public class Range implements NumberGroup
{
    private int min;
    private int max;
    public Range(int min, int max)
    {
        this.min=min;
        this.max=max;
    }
    
    public String toString()
    {
        return "min: " + min + ", max: "+ max;
    }
    
    public int getMin()
    {
        return min;
    }
    public int getMax()
    {
        return max;
    }
    
    public void setMax(int max)
    {
        this.max = max;
    }
    public void setMin(int min)
    {
        this.min = min;
    }
    
    public boolean contains(int x)
    {
        if(x>=min && x<=max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


