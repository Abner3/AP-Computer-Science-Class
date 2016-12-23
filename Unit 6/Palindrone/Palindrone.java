public class Palindrone
{
    private String name;
    
    public Palindrone(String word)
    {
        name = word;
    }
    
    public static boolean isPal(String name)
    {
        if (name.length() <= 1)
        {
            return true;
        }
        if (name.charAt(0)==name.charAt(name.length() - 1))
        {
            System.out.println(name);
            return isPal(name.substring(1,name.length()-1));
        }
        
        return false;
    }
    
}