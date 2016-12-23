import java.util.*;

public class Kennel
{
    public static void main(String [] args){
        //Check list
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(new Dog("Dog"));
        petList.add(new Cat("Cat"));
        petList.add(new LoudDog("LoudDog"));
    
        /*public void allSpeak()
        {
            for (int counter = petList.length(); counter > 0; counter--)
            {
                return "" + petList.get(counter) + " " + petList.getName() + "\n";
            }
    
        }
        */
    }
}
