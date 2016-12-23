import java.util.*;

public class RecitalManager
{
    public static void main (String[] args)
    {
        ArrayList<RecitalComponent> recitals = new ArrayList<RecitalComponent>();

        recitals.add(new Dance());
        recitals.add(new Monologue());
        recitals.add(new MusicalInterlude());

        //use foreach loop?
        for(RecitalComponent item : recitals)
        {
            System.out.println(item.toString() + item.perform());
        }
    }
}