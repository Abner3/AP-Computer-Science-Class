public class Test
{
    public static void main (String [] args)
    {
        String butched, email = "bob@gmail.com";
        butched = email.substring(0,email.indexOf("@"));
        System.out.println(butched);
    }
}