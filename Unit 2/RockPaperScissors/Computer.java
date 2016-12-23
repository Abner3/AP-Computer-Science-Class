//� A+ Computer Science  -  www.apluscompsci.com

//Computer class 

public class Computer
{
    //instance / member variables
    private String choice;

    public Computer()
    {
        this.randomSetChoice();     
    }

    public String getChoice()
    {
        return choice;
    }

    public void randomSetChoice()
    {
        int random = (int)(Math.random()*3);
        if (random == 0)
        {
            choice = "rock";
        }
        else if (random == 1)
        {
            choice = "paper";
        }
        else
        {
            choice = "scissors";
        }
        //use Math.random() to generate three random ints.
        //use an if-else if-else or switch case to set the instance variable, choice
    }   

    /*
    didIWin(Player p) will return the following values
    0 - both players have the same choice
    1 - the computer had the higher ranking choice
    -1 - the player had the higher ranking choice
     */ 
    public int didIWin(Player p)
    {
        if (this.getChoice().equals(p.getChoice()))
        {
            return 0;
        }

        else if (this.getChoice().equalsIgnoreCase("rock") && p.getChoice().equals("paper"))
        {
            return -1;
        }

        else if (this.getChoice().equalsIgnoreCase("paper") && p.getChoice().equals("scissors"))
        {
            return -1;
        }

        else if (this.getChoice().equalsIgnoreCase("scissors") && p.getChoice().equals("rock"))
        {
            return -1;
        }

        else if (this.getChoice().equalsIgnoreCase("rock") && p.getChoice().equals("scissors"))
        {
            return 1;
        }

        else if (this.getChoice().equalsIgnoreCase("paper") && p.getChoice().equals("rock"))
        {
            return 1;
        }

        else if (this.getChoice().equalsIgnoreCase("scissors") && p.getChoice().equals("paper"))
        {
            return 1;
        }
        
        else
            return 0;
    }

    public String toString()
    {
        return "Choice =" + choice;
    }          
}