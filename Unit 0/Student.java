class Student
{
    //Attributes - instance variables
    private String name;
    private int age;
    private double height;
    private int creditsNeededToGraduate;
    private boolean hasALicense;
    private int creditsEarned;
    //Enumerator
    enum ClassLevel {FRESHMAN, SOPHOMORE, JUNIOR, SENIOR};
    private ClassLevel gradeLevel;
    //Constant
    public final int CREDITS_NEEDED_TO_GRADUATE = 120;

    //Constructor
    public Student (String aName, int anAge, double aHeight, 
    int creditsNeeded , boolean canDrive, ClassLevel gLevel)
    {
        name = aName;
        age = anAge;
        height = aHeight;
        creditsNeededToGraduate = creditsNeeded;
        hasALicense = canDrive;
        gradeLevel = gLevel;
    }

    public Student(String name, ClassLevel gradeLevel)
    {   this.name = name;
        this.gradeLevel = gradeLevel;
    } 

    // Behaviors - Methods
    public void hasBirthday()
    {
        age++;
    }

    public String skipClass()
    {
        return name + " is in trouble!";
    }

    public void takeClass(int credits)
    {
        creditsNeededToGraduate = creditsNeededToGraduate - credits;
    }

    public ClassLevel getGradeLevel()
    {
        return gradeLevel;
    }
    //Setter
    public void setName(String newName)
    {
        name = newName;
    }

    public void setAge(int newAge)
    {
        age = newAge;
    }

    public void setHeight(int newHeight)
    {
        height = newHeight;
    }

    public void setCreditsNeededToGraduate(int newCreditsNeededToGraduate)
    {
        creditsNeededToGraduate = newCreditsNeededToGraduate;
    }

    //Getter
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public ClassLevel gradeLevel()
    {
        return gradeLevel;
    }

    public int getCreditsEarned()
    {
        return creditsEarned;
    }
    
    //toString
    public String toString()
    {
        return ("Name = " + name + " Age = " + age + " Height = " + height +
        " Credits needed to graduate " + creditsNeededToGraduate 
        + " Has a license " + hasALicense);
    }
}