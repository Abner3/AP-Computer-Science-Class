
public class NumberGroupTester
{
    public static void main(String[] args)
    {
        Range rhs = new Range(-3,2);
        int[] sizesOnRack1 = {3,7,9};
        Dresses pretty = new Dresses("Mini", sizesOnRack1);
        int[] sizesOnRack2 = {7, 11, 15};
        Dresses ugly = new Dresses("Maxi", sizesOnRack2);
        
        System.out.println(rhs);
        System.out.println(pretty);
        System.out.println(ugly);
        
        NumberGroup[] myNumGroups = {rhs, pretty, ugly};
        
        for(int k = 0; k < myNumGroups.length; k++)
        {
            System.out.println(myNumGroups[k].contains(11));
        }
    }
}



