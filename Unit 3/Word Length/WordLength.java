import static java.lang.System.*;

public class WordLength implements Comparable
{
    private String word;

    public WordLength( String str )
    {
        word = str;
    }

    public int compareTo( Object obj )
    {       
        //WordLength obj1 = (WordLength) obj;
        String str = ((WordLength)obj).word;
        if (word.length() > str.length())
        {
            return 1;
        }
        else if (word.length() == str.length())
        {
            return 0;
        }
        
        else
        {
            return -1;
        }
    }

    public String toString()
    {
        return word;
    }
}