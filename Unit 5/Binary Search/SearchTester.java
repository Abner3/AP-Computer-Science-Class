import java.util.Arrays;

public class SearchTester
{
    public static void main(String[] args)
    {
        int[] test1 = randomArray();
        int[] test2 = randomArray();
        Arrays.sort(test2);
        int target1 = ((int) (Math.random()*25)) + 1;
        int target2 = ((int) (Math.random()*25)) + 1;
        
        printArray(test1);
        System.out.println("\n Target number: " + target1);
        System.out.println(target1 + " found at index: " + Searching.seqSearch( test1, target1));
        
        printArray(test2);
        System.out.println("\n Target number: " + target2);
        System.out.println(target2 + " found at index: " + Searching.binSearch( test2, target2));
    }
    
    public static int[] randomArray()
    {
        int[] result = new int[25];
        for(int i = 0; i < 25; i++)
        {
            result[i] = ((int) (Math.random()*25)) + 1;
        }
        
        return result;
    }
    
    public static void printArray(int[] arr)
    {
        for(int num : arr)
        {
            System.out.print(num + ", ");
        }
    }
}
