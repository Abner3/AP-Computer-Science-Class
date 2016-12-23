class newDog
{
    public final int NUM_LEGS = 4;
    //Constant is final NUM_LEGS
    private int age, dogID;
    public String name, dogTag;
    enum Breed {GERMAN_SHEPHERD, PITBULL, BORDER_COLLIE};
    private Breed breed;
    private char dogIDCheck;
    
    //constructor
    public newDog (int age, String name, Breed breed, int dogID)
    {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.dogID = dogID;
        dogIDCheck = this.computeDogIDCheck();
        dogTag = this.createDogTag();
    }

    public newDog (int age, Breed breed)
    {
        this.age = age;
        this.breed = breed;
    }
    
    //methods
    
    public int convertToHumanYears()
    {
        if(breed  == Breed.BORDER_COLLIE)
        {
            return (int)13 + ((age-1) * 19/3);
        }
        else
        {
            return (int)13 + ((age-1) * 16/3);
        }
    }

    public double convertToHumanYearsExact()
    {
        if(breed == Breed.BORDER_COLLIE)
        {
            return  13 + ((age-1) * 19.0/3);
        }
        else
        {
            return 13 + ((age-1) * 16.0/3);
        }
    }

    public char computeDogIDCheck()
    {
        int num = dogID;
        int ones,tens,hundreds,sum;
        
        ones = num%10;
        tens = (num/10)%10;
        hundreds = (num/100)%10;
        sum = ones + tens + hundreds;
        return (char)(70+sum%10);
    }
    
    public String createDogTag()
    {
        String dogTag = "";
        return dogTag + dogID + dogIDCheck;
    }
    
    public static boolean checkDogTag(String dogTag)
    {
        int num = Integer.parseInt(dogTag.substring(0,3));
        int ones,tens,hundreds,sum;
        
        ones = num%10;
        tens = (num/10)%10;
        hundreds = (num/100)%10;
        sum = ones + tens + hundreds;
        char dogTagCheck = (char)(70+sum%10);
        
        if (dogTagCheck == dogTag.charAt(3))
            return true;
        else
            return false;
    }
    
    /*public int convertToHumanYearsRounded()
    {
        
    }
    
    public void testMethods()
    {
        convertToHumanYearsExact();
    }
    */
    
    //setter
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setBreed(Breed breed)
    {
        this.breed = breed;
    }
    
    public void setdogIDCheck(int dogID)
    {
        dogID = computeDogIDCheck();
    }
    
    //getter
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }

    public int getNumLegs()
    {
        return NUM_LEGS;
    }
    
    public Breed getBreed()
    {
        return breed;
    }
    
    public int getDogID()
    {
        return dogID;
    }
    
    //toString
    public String toString()
    {
        return("legs = " + NUM_LEGS + 
        "\nage = " + age + "\nname = " + name + "\n");
    }
}
