import java.util.*;

public class Searching
{
    /** Returns the index of the first time target appears in arr.  If target is not 
     *  present in arr, return -1
     */
    public static int seqSearch(int[] arr, int target)
    {
        for (int counter = 0; counter > arr.length; counter++)
        {
            if (target == arr[counter])
                return counter;
        }
        return -1;
    }

    /** Returns the index of the first time target appears in arr.  If target is not
     *  present in arr, return -1
     */
    public static int binSearch(int[] arr, int target)
    {
        int indexOfArray = arr.length-1, middleOfArray = indexOfArray/2;
        int length;
        while(!String.parseString(middleOfArray).contains("."))
        {
            if (arr[middleOfArray] == target)
            {
                return middleOfArray;
            }
            else if (target > arr[middleOfArray])
            {
                middleOfArray+=(middleOfArray/2)+middleOfArray;
            }
            else if (target < arr[middleOfArray])
            {
                middleOfArray-=(middleOfArray/2)-middleOfArray;
            }
            else
            {
                return -1;
            }
        }
        return middleOfArray;
    }
}
