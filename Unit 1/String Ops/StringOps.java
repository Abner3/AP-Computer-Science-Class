public class StringOps
{
    
    // Write a static method called awesomeness that takes a String called name as its formal parameter. 
    // This method returns a greeting of the form "I know name is awesome."
    public static String awesomeness(String name)
    {
        return "I know " + name + " is awesome.";
    }
    
    // Write a static method called nameLength that takes a String called name as its formal parameter. 
    // This method returns the length of name
    public static int nameLength(String name)
    {
        return name.length();
    }
    
    // Write a static method called indexFirstSpace that takes a String called name as its formal parameter. 
    // This method returns the position of the first space
    // precondition: name has at least one space
    public static int indexFirstSpace(String name)
    {
        return name.indexOf(" ");
    }
    
    // Write a static method called indexSecondSpace that takes a String called name as its formal parameter. 
    // This method returns the position of the second space
    // precondition: name has at least two spaces
    public static int indexSecondSpace(String name)
    {
        int index1 = StringOps.indexFirstSpace(name);
        String chopped = name.substring(index1+1);
        int index2 = StringOps.indexFirstSpace(chopped);
        return index1 + index2 +1;
    }
    
    // Write a static method called firstName that takes a String called name as its formal parameter. 
    // This method returns the first name. 
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // Hint: call a StringOps method you have already written
    public static String firstName(String name)
    {
        int index1 = StringOps.indexFirstSpace(name);
        return name.substring(0,index1);
    }
    
    // Write a static method called lastName that takes a String called name as its formal parameter. 
    // This method returns the last name. 
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // Hint: call a StringOps method(s) you have already written
    public static String lastName(String name)
    {
        int index1 = StringOps.indexSecondSpace(name);
        return name.substring(index1 +1);
    }
      
    // Write a static method called middleName that takes a String called name as its formal parameter. 
    // This method returns the middle name. 
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // Hint: call a StringOps method(s) you have already written
    
     public static String middleName(String name)
    {
        int index1 = StringOps.indexFirstSpace(name);
        int index2 = StringOps.indexSecondSpace(name);
        return name.substring(index1 +1,index2);
    }
    
    // Write a static method called lastFirstMidInitial that takes a String called name as its formal parameter. 
    // This method returns last name, first name, middle initial
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // postcondition: returns name in the form "Leonard, Kawhi, A"
    // Hint: call a StringOps method(s) you have already written
    public static String lastFirstMidInitial(String name)
    {
        return (StringOps.lastName(name) + ", " + StringOps.firstName(name) + ", " + StringOps.middleName(name).charAt(0));
    }
    
    // Write a static method called firstNamePigLatin that takes a String called name as its formal parameter. 
    // This method returns the first name in piglatin. 
    // precondition: name is of the form first name, middle name, last name. e.g. "Kawhi Anthony Leonard"
    // postcondition: returns name in the form "awhiKay"
    // Hint: call a StringOps method(s) you have already written     
    public static String firstNamePigLatin(String name)
    {
        String chopped = firstName(name);
        if (chopped.charAt(0) == 'A' || chopped.charAt(0) == 'E' || chopped.charAt(0) == 'I' || chopped.charAt(0) == 'O' || chopped.charAt(0) == 'U')
        {
            return chopped.substring(1) + "ay";
        }

        else
        {
            return chopped.substring(1,chopped.length()-2) + chopped.substring(0,1);
        }
    }
    
    
}