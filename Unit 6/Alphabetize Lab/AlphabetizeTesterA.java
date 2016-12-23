import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.*;

public class AlphabetizeTesterA
{   
    public static void main(String args[]) 
    {
        /** Mimic the sample output on the directions for this lab
         */
        Alphabetize test = new Alphabetize();
        
        //System.out.println(test.add(""));
        System.out.println(test.getSize());

        System.out.println("\nadding " + test.add("alice"));
        System.out.println("\nadding " + test.add("tommy"));
        System.out.println("\nadding " + test.add("bobby"));
        System.out.println("\nadding " + test.add("annabell"));
        System.out.println("\nadding " + test.add("sallysue"));
        System.out.println("\nadding " + test.add("sallymue"));

        System.out.println(test.toString());

        System.out.println("\nremoving bobby ");
        test.remove("bobby");
        System.out.println(test.toString());

        System.out.println("\nremoving alice ");
        test.remove("alice");
        System.out.println(test.toString());

        System.out.println("\nadding "+ test.add("fred") + "\nadding " + test.add("xylophone"));
        System.out.println(test.toString());

        System.out.println("\nremoving fred ");
        test.remove("fred");
        System.out.println("\nremoving annabell ");
        test.remove("annabell");
        System.out.println("\nremoving sallysue ");
        test.remove("sallysue");
        System.out.println(test.toString());
    }
}
