class Dog
{

    //Attributes

    private int hungerLevel;
    private String furColor;
    private String tailColor;

    //Constructor
    public Dog (int aHungerLevel, String afurColor, String aTailColor)
    {
        hungerLevel = aHungerLevel;
        furColor = afurColor;
        tailColor = aTailColor;
    }
    
    //Behaviors
    public boolean checkTailColor(String newTailColor)
    {
        if (newTailColor.equalsIgnoreCase(tailColor))

            return(true);
        else
            return(false);
    }

    public int foodConsumption(int foodConsumption)
    {
        hungerLevel = hungerLevel + 1 - foodConsumption;
        return hungerLevel;
    }

    public boolean checkFurColor(String newColor)
    {
        if (newColor.equalsIgnoreCase(furColor))
        
            return(true);
        else
            return(false);
    }

    //Setter
    public void setHungerLevel(int aHungerLevel)
    {
        hungerLevel = aHungerLevel;
    }

    public void setFurColor(String afurColor)
    {
        furColor = afurColor;
    }

    public void setTailColor(String aTailColor)
    {
        tailColor = aTailColor;
    }
    
    //Getter
    public int getHungerLevel()
    {
        return hungerLevel;
    }
    
    public String getFurColor()
    {
        return furColor;
    }
    
    public String getTailColor()
    {
        return tailColor;
    }
    
    //String method
    public String toString()
    {
        return("Hunger level = " + hungerLevel + " Fur Color = " + furColor
        + " Tail Color " + tailColor);
    }
    
}

