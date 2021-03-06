import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class AlphabetizeA
{

    //instance variables
    private ArrayList<String> list;

    //constructors
    
    public Alphabetize()
    {
        list = new ArrayList<String>();
    }

    //other methods
    
    /** adds word to list so that list remains alphabetized */
    public String add(String  word)
    {
        list.add(findInsertLocation(word), word);
        System.out.println("insert at: " + findInsertLocation(word) + " size: " + list.size());
        return word;
    }

    /** returns the location in list where word would go to keep the list alphabetized */
    private int findInsertLocation( String word )
    {
        int i = 0;
        for(i = 0; i < list.size(); i++){
            if(word.compareTo(list.get(i)) <= 0){
                break;
            }
        }
        
        return i;
    }

    /** removes word from list and keeps list alphabetized */
    public void remove(String word)
    {
        int num = list.indexOf(word);a
        System.out.println("removing " + list.get(num));
        list.remove(num);
    }

    /** returns a String containing all of the words in list */
    public String toString()
    {
        return "\nprinting the list :: " + list;
    }
    
    public int getSize()
    {
        return list.size();
    }
    //try to figure this method out
    /*
    private int findInsertLocation( String word )
    {
        int i = 0;
        for(i = 0; i < list.size(); i++){
            if(word.compareTo(list.get(i)) <= 0){
                break;
            }
        }
        
        return i;
    }
    */
}

    {
        list = new ArrayList<String>();
    }

    //other methods
    
    /** adds word to list so that list remains alphabetized */
    public String add(String  word)
    {
        list.add(findInsertLocation(word), word);
        System.out.println("insert at: " + findInsertLocation(word) + " size: " + list.size());
        return word;
    }

    /** returns the location in list where word would go to keep the list alphabetized */
    private int findInsertLocation( String word )
    {
        int i = 0;
        for(i = 0; i < list.size(); i++){
            if(word.compareTo(list.get(i)) <= 0){
                break;
            }
        }
        
        return i;
    }

    /** removes word from list and keeps list alphabetized */
    public void remove(String word)
    {
        int num = list.indexOf(word);a
        System.out.println("removing " + list.get(num));
        list.remove(num);
    }

    /** returns a String containing all of the words in list */
    public String toString()
    {
        return "\nprinting the list :: " + list;
    }
    
    public int getSize()
    {
        return list.size();
    }
    //try to figure this method out
    /*
    private int findInsertLocation( String word )
    {
        int i = 0;
        for(i = 0; i < list.size(); i++){
            if(word.compareTo(list.get(i)) <= 0){
                break;
            }
        }
        
        return i;
    }
    */
}
