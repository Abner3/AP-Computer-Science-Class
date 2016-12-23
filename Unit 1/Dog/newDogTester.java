public class newDogTester
{
    public static void main (String [] args)
    {
        newDog dog1 = new newDog(1, "Joe", newDog.Breed.GERMAN_SHEPHERD,168);
        newDog dog2 = new newDog(2, "Dylan", newDog.Breed.PITBULL, 125);
        newDog dog3 = new newDog(4, "Bobby", newDog.Breed.BORDER_COLLIE, 123);
        
        System.out.println("\nDog1\n" + dog1 + "\nDog2\n"
        + dog2 + "\nDog3\n" + dog3);
        
        System.out.println("\n" + dog1.convertToHumanYears());
        System.out.println(dog2.convertToHumanYears());
        System.out.println(dog3.convertToHumanYears());
        
        System.out.println("\n" + dog1.convertToHumanYearsExact());
        System.out.println(dog2.convertToHumanYearsExact());
        System.out.println(dog3.convertToHumanYearsExact());
        
        System.out.println("\nDog1\n" + dog1 + "\nDog2\n"
        + dog2 + "\nDog3\n" + dog3);
        
    }
}
