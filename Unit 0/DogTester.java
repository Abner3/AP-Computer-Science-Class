public class DogTester
{
    public static void main (String [] args)
    {
        Dog dog1 = new Dog(10, "Blue", "Red");
        Dog dog2 = new Dog(15, "Red", "Yellow");
        
        int hungerLevel1 = dog1.getHungerLevel();
        int hungerLevel2 = dog2.getHungerLevel();
        
        System.out.println("Dog 1 hunger level = " + dog1.getHungerLevel() + 
        "\nfur color = " + dog1.getFurColor() + "\n Tail color = " + dog1.getTailColor());
        
        System.out.println("Dog 2 hunger level = " + dog2.getHungerLevel() + 
        "\nfur color = " + dog2.getFurColor() + "\n Tail color = " + dog2.getTailColor());
        
        System.out.println(" \nHow much food did you feed Dog1?");
        dog1.foodConsumption(5);
        
        System.out.println(" \nHow much food did you feed Dog2?");
        dog2.foodConsumption(8);
        
        System.out.println(" \nWhat is dog1's fur color?");
        dog1.checkFurColor("red");
        
        System.out.println(" \nWhat is dog2's fur color?");
        dog2.checkFurColor("blue");
        
        dog1.setTailColor("Blue");
        System.out.println(dog1.getTailColor());
        System.out.println(dog1);
        System.out.println(dog2);
    }
}