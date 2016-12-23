public class PetTester
{
    public static void main(String[] args)
    {
        // create an array of 2 Petables, 1 Cat and 1 Dog
        
        Petable[] myPets = new Petable[2]; //= {new Dog(), new Cat("Abner", false)};
        
        Dog pet1 = new Dog();
        Cat pet2 = new Cat("Abner", false);
        
        myPets[0] = pet1;
        myPets[1] = pet2;
        
        // call the brushHair method for both Petables
        myPets[0].brushHair();
        myPets[1].brushHair();
        
        // call the getIsPurring method for the Cat class
        ((Cat)myPets[1]).getIsPurring();
    }
}
