public class BasketballPlayer
{
    private String name;
    private int jerseyNumber, fouls, totalPoints, assists;
    private double height, weight, fieldGoalPercent, GPA, BMI;
    enum Position {POINTGUARD, SHOOTINGGUARD, SMALLFORWARD, POWERCENTER, CENTER};
    Position position;
    String article2015 = "Cassius Stanley ’19 officially enrolled at Harvard-Westlake and practiced with the boys’ basketball Stanley confirmed this over twitter, tweeting the following: Stanley was also considering Sierra Canyon, Village Christian and Findlay Prep in Nevada, according to a story by the Los Angeles Times’ Eric Sondheimer. The hiring of newly appointed head coach David Rebibo played a big role in Stanley’s decision to enroll at Harvard-Westlake, Stanley told the Chronicle Thursday night. “I was already looking at Harvard-Westlake based on the academics, but once Coach Rebibo got the job I made up my mind this was the school I wanted to come to,” Stanley said. “I like his knowledge of the game and the intensity he brings to every practice and game.” The 6-foot-5 shooting guard from Encino quickly learned just how intense Rebibo is during his first practice with the team. “It was exciting getting to finally practice with the guys,” Stanley said. “It was an intense practice, so intense I actually threw up after it.” During the final days of May, Stanley participated in the Pangos All-American Camp, to which only the best nationally ranked high school basketball players are invited. Stanley was named MVP of the camp’s “Cream of the Crop” top 60 game. The camp has produced big names, as past attendees include NBA superstars James Harden, John Wall, Russell Westbrook and DeAndre Jordan. Two days later, Stanley appeared on Sportscenter’s top 10 plays. He came in at number 10 on the list for replicating Vince Carter’s “Cookie Jar” dunk. The YouTube video of the dunk, which can be seen below, has racked up over 300,000 views since its publishing on Tuesday. The video of the dunk began making the rounds on the internet, appearing on Bleacher Report and USA Today, among other media outlets. For fans getting excited over the tantalizing prospect of seeing similar dunks in the near future at Taper Athletic Pavilion, Stanley has some good news. “I’ll try to do something special every time on a fast break, especially when we play at home,” Stanley said. Among Stanley’s strengths are his athleticism, off-the-dribble shooting, slashing ability and ability to finish through contact, according to Future150.c0m. These abilities have drawn attention from NCAA Division I programs; Stanley received a scholarship offer from USC in eighth grade. The new Wolverine is expected to make his debut with the team this weekend at the Mater Dei summer tournament. Stanley’s personal goal for the upcoming season is to “live up to all the hype and expectations to the best of my abilities.” His goal for the team?";
    public BasketballPlayer()
    {
        name = "no name specified";
    }
    
    public BasketballPlayer(String name)
    {
        this.name = name;
    }
    
    public BasketballPlayer(String name, double height, double weight, int jerseyNumber, Position position, double fieldGoalPercent, double GPA)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.fieldGoalPercent = fieldGoalPercent;
        this.GPA = GPA;
    }
    //methods
    public boolean fouledOut()
    {
        if (fouls >= 5)
            return true;
        return false;
    }
    
    public double calculateBMI()
    {
        BMI = (weight*703)/Math.pow(height,2);
        return BMI;
    }
    
    public boolean eligibleToPay()
    {
        if (19<BMI && BMI<25 && GPA >= 2.9)
            return true;
        
        else
            return false;
    }
    
    public void scoreFreeThrow()
    {
        totalPoints++;
    }
    
    public void scoreBasket()
    {
        totalPoints += 2;
    }
    
    public void scoreFromDownTown()
    {
        scoreBasket();
    }
    
    public int numberMentions(String article)
    {
        String lastName = name.substring(name.indexOf(" ")+1);
        int count = 0;
        while (article.indexOf(lastName) >= 0)
        {
            count ++;
            article = article.substring(article.indexOf(lastName)+1);
        }
        return count;
    }
    
    public String triangleCheer()
    {
        String cheer = "";
        String lastName = name.substring(name.indexOf(" "));
        for (int counter = 0; counter <= lastName.length(); counter++)
        {
            cheer += lastName.substring(0,counter) + "\n"; //add "/n"
        }
        
        for (int counter = lastName.length()-1; counter > 0; counter--)
        {
            cheer += lastName.substring(0,counter) + "\n"; //add "/n"
        }
        
        return cheer;
    }
   
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setJerseyNumber(int num)
    {
        jerseyNumber = num;
    }
    
    public void setFouls(int num)
    {
        fouls = num;
    }
    
    public void setTotalPoints(int num)
    {
        totalPoints = num;
    }
    
    public void setAssists(int num)
    {
        assists = num;
    }
    
    public void setHeight(double num)
    {
        height = num;
    }
    
    public void setWeight(double num)
    {
        weight = num;
    }
    
    public void setFieldGoalPercent(double num)
    {
        fieldGoalPercent = num;
    }
    
    public void setGPA(double num)
    {
        GPA = num;
    }
    
    public void setPosition(Position position)
    {
        this.position = position;
    }
    //Name, Height, Weight, Jersey Number, Position, Field Goal Percent & GPA 
    //getters
    public String getName()
    {
        return name;
    }
    
    public int getJerseyNumber()
    {
        return jerseyNumber;
    }
    
    public int getFouls()
    {
        return fouls;
    }
    
    public int getTotalPoints()
    {
        return totalPoints;
    }
    
    public int getAssists()
    {
        return assists;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public double getfieldGoalPercent()
    {
        return fieldGoalPercent;
    }

    public double getGPA()
    {
        return GPA;
    }
    
    public Position getPosition()
    {
        return position;
    }
    
}