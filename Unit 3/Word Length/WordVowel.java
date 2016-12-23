import static java.lang.System.*;

public class WordVowel implements Comparable
{
    private String word;

    public WordVowel( String word )
    {
        this.word = word;
    }

    private int numVowels()
    {
        int vowels = 0;
        for (int count = word.length; count >= 0; count--)
        {
            if (word.charAt(count))
            {
                vowels++;
            }
        }
        
        return vowels;
    }

    public int compareTo(Object obj)
    {
        return (this.numVowels()==(WordVowel)(obj).numVowels());
    }

    public String toString()
    {
        return word;
    }
}