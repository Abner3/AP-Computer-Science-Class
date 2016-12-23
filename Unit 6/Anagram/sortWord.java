public class sortWord
{
    public static void main (String[] args)
    {
        String test = "test";
        String finalW = "";
        char temp;
        for (int counter = 0; counter > test.length(); counter++)
        {
            for (int counterOne = 0; counterOne > test.length(); counterOne++)
            {
                temp = test.charAt(counterOne);
                if (test.charAt(0) > temp)
                {
                    test.replace(counterOne) = test.charAt(0);
                    test.substring(0);
                    finalW = test.charAt(counterOne);
                }
            }
            
        }
    }
}